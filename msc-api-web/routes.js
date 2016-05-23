var async = require('async');
var config = require('./config');
var cache = require('express-redis-cache')({
    host: config.redisHost, port: config.redisPort
});
var logger = require('intel');
var idGenerator = require('shortid');
var restify = require('restify');

var responseType = {'Content-Type': 'application/json; charset=utf-8'};
var requestCount = 0;
var hystrixError = false;
module.exports = {
    invoices: {
        get: function (req, res, next) {
            var reqId = idGenerator.generate();
            var sessionId = req.params.sessionId;
            var fullReqId = reqId + sessionId;
            logger.debug(req.params);
            logger.debug("requestId: " + fullReqId);
            var companyId = parseInt(req.params.id);
            var startDate = req.params.startDate;
            var endDate = req.params.endDate;

            config.invoiceService.get('invoices/' + companyId + "?startDate=" + startDate + "&endDate=" + endDate, function (err, serviceRequest, serviceResponse, obj) {
                res.writeHead(200, responseType);
                res.write(serviceResponse);
                res.write(JSON.stringify({configuration: config}));
                return next();
            });
        }
    },
    invoice: {
        get: function (req, res, next) {
            var reqId = idGenerator.generate();
            logger.debug(req.params);
            var invoiceId = parseInt(req.params.id);
            res.writeHead(200, responseType);
            res.end(JSON.stringify(invoiceId));
            return next();
        },
        edit: function (req, res, next) {
            var reqId = idGenerator.generate();
            logger.debug(req.params);
            var invoiceId = parseInt(req.params.id);
            res.writeHead(200, responseType);
            res.end(JSON.stringify(invoiceId));
            return next();
        },
        create: function (req, res, next) {
            if (requestCount >= 5) {
                requestCount = 0;
                res.send({"id": "444"});
                return next();
            } else {
                requestCount++;
                return next(new restify.InternalServerError("Hystrix text"));
            }
        }
    },
    company: {
        get: function (req, res, next) {
            var reqId = idGenerator.generate();
            logger.debug('company get');
            logger.debug(req.params);
            var companyId = parseInt(req.params.id);

            config.companyService.get('company/' + companyId, function (err, serviceRequest, serviceResponse, obj) {
                if (err) {
                    logger.error("error on get company");
                    logger.error(error);
                }

                res.writeHead(200, responseType);
                res.write(serviceResponse);
                return next();
            });
        },
        edit: function (req, res, next) {
            var reqId = idGenerator.generate();
            logger.debug('company edit');
            logger.debug(req.params);
            var companyId = parseInt(req.params.id);
            res.writeHead(200, responseType);
            res.end(JSON.stringify(companyId));
            return next();
        },
        create: function (req, res, next) {
        }
    },
    user: {
        get: function (req, res, next) {
            var reqId = idGenerator.generate();
            logger.debug('user get');
            logger.debug(req.params);
            var userId = parseInt(req.params.id);
            res.writeHead(200, responseType);
            res.end(JSON.stringify(userId));
            return next();
        },
        edit: function (req, res, next) {
            var reqId = idGenerator.generate();
            logger.debug('user edit');
            logger.debug(req.params);
            var userId = parseInt(req.params.id);
            res.writeHead(200, responseType);
            res.end(JSON.stringify(userId));
            return next();
        },
        create: function (req, res, next) {
            var reqId = idGenerator.generate();
            logger.debug('user create');
            logger.debug(req.params);
            return next();
        },
        login: function (req, res, next) {
            var reqId = idGenerator.generate();
            logger.debug('user login');
            logger.debug(req.params);
            return next();
        }
    },
    hystrix: function (req, res, next) {
        requestCount++;
        if (!hystrixError) {
            console.log((new Date().toUTCString()) + " hystrix ok: " + requestCount);
            res.send("ok");
            return next();
        } else {
            console.log((new Date().toUTCString()) + " hystrix not ok: " + requestCount);
            return next(new restify.InternalServerError("Hystrix text"));
        }
    },

    setError: function (req, res, next) {
        if (hystrixError) hystrixError = false;
        else hystrixError = true;
        requestCount = 0;
        res.send(hystrixError);
        return next();
    },

    dashboard: {
        get: function (req, res, next) {
            var reqId = idGenerator.generate();
            logger.debug('dashboard get');
            logger.debug(req.params);
            cache.get('dashboard2', function (error, entries) {
                logger.debug("errorOnGet:" + error);
                if (error || !entries || !entries.length) {

                    cache.add('dashboard2', JSON.stringify({cache: "ok"}), {
                        type: 'json',
                        expire: config.redisExpirationSeconds
                    }, function (error, added) {
                        logger.debug("errorOnAdd:" + error);
                        logger.debug("added:" + added);
                        if (error) {
                            res.send({hello: "not saved"});
                        } else {
                            res.send({hello: "saved"});
                        }
                        return next();
                    });

                } else {

                    res.send({hello: "ok", entryLength: entries.length});
                    return next();
                }
            });
        }
    }
};


// var companyId = req.params.id;
// cache.get('company-' + companyId, function (error, entries) {
//   // pieprasam datus no Redisa pēc atslēgas "dashboard"
//   if (error || !entries || !entries.length) { // ja Redis kešatmiņā nekā nav
//     // pieprasam datus no vajadzīgā mikroservisa
//     ccompanyService.get('company/' + companyId, function (err, serviceRequest, serviceResponse, obj) {
//       if (err) { // ja Company mikroserviss neatbildēja, sūtam kļūdu lietotājam
//         res.writeHead(500, responseType);
//         res.write(serviceResponse);
//         return next();
//       } else {
//         // ja viss ok, saglabājam redisā saņemtus datus, glabāsim tos 60 sekundes
//         cache.add('company-' + companyId, JSON.stringify(serviceResponse), {type: 'json', expire: 60 }, function (error, added) {
//           res.send(serviceResponse);
//           return next();
//         });
//       }
//
//     });
//   } else { // ja redis kešatmiņā ir saglabāti dati
//     res.send(entries[0].body); // sūtam saglabātus datus
//     return next();
//   }
// });

// Client
//
//
//client.post('/user', { name: "John Doe" }, function (err, req, res, obj) {
//    if(err) console.log("An error ocurred:", err);
//    else console.log('POST    /user   returned: %j', obj);
//
//    client.get('/user/0', function (err, req, res, obj) {
//        if(err) console.log("An error ocurred:", err);
//        else console.log('GET     /user/0 returned: %j', obj);
//
//        client.put('/user/0', { country: "USA" }, function (err, req, res, obj) {
//            if(err) console.log("An error ocurred:", err);
//            else console.log('PUT     /user/0 returned: %j', obj);
//
//            client.del('/user/0', function (err, req, res, obj) {
//                if(err) console.log("An error ocurred:", err);
//                else console.log('DELETE  /user/0 returned: %j', obj);
//
//                client.get('/', function (err, req, res, obj) {
//                    if(err) console.log("An error ocurred:", err);
//                    else console.log('GET     /       returned: %j', obj);
//                });
//            });
//        });
//    });
//});
