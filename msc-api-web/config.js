var restify = require('restify');

module.exports = {
    invoiceService: restify.createJsonClient({
        url: 'http://' + process.env.STATS_SERVICE_ADDRESS +'/',
        version: '*'
    }),

    companyService: restify.createJsonClient({
        url: 'http://' + process.env.COMPANY_SERVICE_ADDRESS +'/',
        version: '*'
    }),

    userService: restify.createJsonClient({
        url: 'http://' + process.env.USER_SERVICE_ADDRESS +'/',
        version: '*'
    }),

    authService: restify.createJsonClient({
        url: 'http://' + process.env.AUTH_SERVICE_ADDRESS +'/',
        version: '*'
    }),

    documentService: restify.createJsonClient({
        url: 'http://' + process.env.DOCUMENT_SERVICE_ADDRESS +'/',
        version: '*'
    }),

    portToListen: process.env.SERVICE_PORT,
    redisHost: process.env.REDIS_HOST,
    redisPort: process.env.REDIS_PORT,
    redisExpirationSeconds: process.env.REDIS_EXPIRE_SEC
};
