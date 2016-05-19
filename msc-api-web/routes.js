var async = require('async');
var config = require('./config');
var cache = require('express-redis-cache')({
  host: config.redisHost, port: config.redisPort, expire: config.redisExpirationSeconds
});

var responseType = {'Content-Type': 'application/json; charset=utf-8'};
module.exports = {
    invoices: {
        get: function (req, res, next) {
            console.log(req.params);
            var companyId = parseInt(req.params.id);
            config.invoiceService.get('invoices/' + companyId + "?startDate=" + req.params.startDate + "&endDate=" + req.params.endDate, function (err, serviceRequest, serviceResponse, obj) {
                res.writeHead(200, responseType);
                res.write(serviceResponse);
                return next();
            });
        }
    },
    invoice: {
        get: function (req, res, next) {
            console.log(req.params);
            var invoiceId = parseInt(req.params.id);
            res.writeHead(200, responseType);
            res.end(JSON.stringify(invoiceId));
            return next();
        },
        edit: function (req, res, next) {
            console.log(req.params);
            var invoiceId = parseInt(req.params.id);
            res.writeHead(200, responseType);
            res.end(JSON.stringify(invoiceId));
            return next();
        },
        create: function (req, res, next) {}
    },
    company: {
        get: function (req, res, next) {
            console.log(req.params);
            var companyId = parseInt(req.params.id);
            res.writeHead(200, responseType);
            res.end(JSON.stringify(companyId));
            return next();
        },
        edit: function (req, res, next) {
            console.log(req.params);
            var companyId = parseInt(req.params.id);
            res.writeHead(200, responseType);
            res.end(JSON.stringify(companyId));
            return next();
        },
        create: function (req, res, next) {}
    },
    user: {
        get: function (req, res, next) {
            console.log(req.params);
            var userId = parseInt(req.params.id);
            res.writeHead(200, responseType);
            res.end(JSON.stringify(userId));
            return next();
        },
        edit: function (req, res, next) {
            console.log(req.params);
            var userId = parseInt(req.params.id);
            res.writeHead(200, responseType);
            res.end(JSON.stringify(userId));
            return next();
        },
        create: function (req, res, next) {
            console.log(req.params);
            return next();
        },
        login: function (req, res, next) {
            console.log(req.params);
            return next();
        }
    },
    dashboard: {
        get: function (req, res, next) {
            cache.get('dashboard', function (error, entries) {
              if (error) {
                cache.add('dashboard', JSON.stringify({cache: "ok"}), {type: 'json'}, function (error, added) {
                  if (error) {
                    res.send({
                      cache: "not available, not saved"
                    });
                  } else {
                    res.send({
                      cache: "saved"
                    });
                  }
                  return next();
                });
              } else {
                res.send({
                  hello: "ok",
                  requestParams: req.params,
                });
                return next();
              }
            });
        }
    }
};

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
