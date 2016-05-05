var restify = require('restify');

module.exports = {
    invoiceService: restify.createJsonClient({
        url: 'http://localhost:80',
        version: '*'
    }),

    companyService: restify.createJsonClient({
        url: 'http://localhost:80',
        version: '*'
    }),

    userService: restify.createJsonClient({
        url: 'http://localhost:80',
        version: '*'
    }),

    authService: restify.createJsonClient({
        url: 'http://localhost:80',
        version: '*'
    }),

    documentService: restify.createJsonClient({
        url: 'http://localhost:80',
        version: '*'
    })
};