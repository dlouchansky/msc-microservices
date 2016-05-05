'use strict';

var restify = require('restify');
var routes = require('routes');

// Server
var server = restify.createServer({
    name: 'myapp',
    version: '1.0.0'
});

server.use(restify.acceptParser(server.acceptable));
server.use(restify.queryParser());
server.use(restify.bodyParser());

server.get('/dashboard', routes.dashboard.get);

server.get('/invoice/:id', routes.invoice.get);
server.get('/invoices', routes.invoices.get);
server.post('/invoice/:id/edit', routes.invoice.edit);
server.put('/invoice', routes.invoice.create);

server.get('/company/:id', routes.company.get);
server.post('/company/:id/edit', routes.company.edit);
server.put('/company', routes.company.create);

server.get('/user/:id', routes.user.get);
server.post('/user/:id/edit', routes.user.edit);
server.put('/user', routes.user.create);
server.post('/login', routes.user.login);

server.listen(80, function () {
    console.log('%s listening at %s', server.name, server.url);
});