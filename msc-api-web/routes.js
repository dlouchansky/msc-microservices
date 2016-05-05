var async = require('async');
var config = require('config');


var responseType = {'Content-Type': 'application/json; charset=utf-8'};
module.exports = {
    invoices: {
        get: function (req, res, next) {
            console.log(req.params);
            return next();
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
            console.log(req.params);
            return next();
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




