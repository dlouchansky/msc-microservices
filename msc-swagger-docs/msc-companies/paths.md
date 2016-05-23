## Paths
### links
```
GET /actuator
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ResourceSupport|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* hal-json-mvc-endpoint

### links
```
PUT /actuator
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ResourceSupport|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* hal-json-mvc-endpoint

### links
```
DELETE /actuator
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ResourceSupport|
|401|Unauthorized|No Content|
|204|No Content|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* hal-json-mvc-endpoint

### links
```
POST /actuator
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ResourceSupport|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* hal-json-mvc-endpoint

### links
```
PATCH /actuator
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ResourceSupport|
|401|Unauthorized|No Content|
|204|No Content|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* hal-json-mvc-endpoint

### links
```
GET /actuator.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ResourceSupport|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* hal-json-mvc-endpoint

### links
```
PUT /actuator.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ResourceSupport|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* hal-json-mvc-endpoint

### links
```
DELETE /actuator.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ResourceSupport|
|401|Unauthorized|No Content|
|204|No Content|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* hal-json-mvc-endpoint

### links
```
POST /actuator.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ResourceSupport|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* hal-json-mvc-endpoint

### links
```
PATCH /actuator.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ResourceSupport|
|401|Unauthorized|No Content|
|204|No Content|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* hal-json-mvc-endpoint

### invoke
```
GET /archaius
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### invoke
```
GET /archaius.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### invoke
```
GET /autoconfig
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### invoke
```
GET /autoconfig.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### invoke
```
GET /beans
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### invoke
```
GET /beans.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### getCompanies
```
GET /companies/{companyIds}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|companyIds|companyIds|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Company array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* company-controller-v-1

### getCompaniesWithStats
```
GET /companies/{companyIds}/stats
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|companyIds|companyIds|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Company array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* company-controller-v-1

### getCompany
```
GET /company/{companyId}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|companyId|companyId|true|integer (int64)||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Company|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* company-controller-v-1

### invoke
```
GET /configprops
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### invoke
```
GET /configprops.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### createCompany
```
PUT /createCompany
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|company|company|true|Company||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|No Content|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* company-controller-v-1

### invoke
```
GET /dump
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### invoke
```
GET /dump.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### editCompany
```
POST /editCompany
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|company|company|true|Company||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|No Content|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* company-controller-v-1

### invoke
```
GET /env
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* environment-mvc-endpoint

### value
```
POST /env
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|params|params|true|ref||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* environment-manager-mvc-endpoint

### invoke
```
GET /env.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* environment-mvc-endpoint

### reset
```
POST /env/reset
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* environment-manager-mvc-endpoint

### value
```
GET /env/{name}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|name|name|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* environment-mvc-endpoint

### error
```
GET /error
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* basic-error-controller

### error
```
PUT /error
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* basic-error-controller

### error
```
DELETE /error
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|204|No Content|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* basic-error-controller

### error
```
POST /error
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* basic-error-controller

### error
```
PATCH /error
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|204|No Content|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* basic-error-controller

### invoke
```
GET /health
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|principal|principal|false|Principal||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* health-mvc-endpoint

### invoke
```
PUT /health
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|principal|principal|false|Principal||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* health-mvc-endpoint

### invoke
```
DELETE /health
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|principal|principal|false|Principal||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|204|No Content|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* health-mvc-endpoint

### invoke
```
POST /health
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|principal|principal|false|Principal||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* health-mvc-endpoint

### invoke
```
PATCH /health
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|principal|principal|false|Principal||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|204|No Content|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* health-mvc-endpoint

### invoke
```
GET /health.json
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|principal|principal|false|Principal||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* health-mvc-endpoint

### invoke
```
PUT /health.json
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|principal|principal|false|Principal||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* health-mvc-endpoint

### invoke
```
DELETE /health.json
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|principal|principal|false|Principal||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|204|No Content|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* health-mvc-endpoint

### invoke
```
POST /health.json
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|principal|principal|false|Principal||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* health-mvc-endpoint

### invoke
```
PATCH /health.json
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|principal|principal|false|Principal||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|204|No Content|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* health-mvc-endpoint

### handle
```
GET /hystrix.stream/**
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ModelAndView|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* hystrix-stream-endpoint

### handle
```
PUT /hystrix.stream/**
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ModelAndView|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* hystrix-stream-endpoint

### handle
```
DELETE /hystrix.stream/**
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ModelAndView|
|401|Unauthorized|No Content|
|204|No Content|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* hystrix-stream-endpoint

### handle
```
POST /hystrix.stream/**
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ModelAndView|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* hystrix-stream-endpoint

### handle
```
PATCH /hystrix.stream/**
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ModelAndView|
|401|Unauthorized|No Content|
|204|No Content|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* hystrix-stream-endpoint

### testHystrix
```
GET /hystrixTest/{requestCount}/{delayInMsec}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|requestCount|requestCount|true|integer (int64)||
|PathParameter|delayInMsec|delayInMsec|true|integer (int64)||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|integer (int64)|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* company-controller-v-1

### invoke
```
GET /info
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### invoke
```
GET /info.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### invoke
```
GET /mappings
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### invoke
```
GET /mappings.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### invoke
```
GET /metrics
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* metrics-mvc-endpoint

### invoke
```
GET /metrics.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* metrics-mvc-endpoint

### value
```
GET /metrics/{name}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|name|name|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* metrics-mvc-endpoint

### invoke
```
POST /pause
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* generic-postable-mvc-endpoint

### invoke
```
POST /pause.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* generic-postable-mvc-endpoint

### invoke
```
POST /refresh
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* generic-postable-mvc-endpoint

### invoke
```
POST /refresh.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* generic-postable-mvc-endpoint

### invoke
```
POST /restart
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* restart-mvc-endpoint

### invoke
```
POST /restart.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* restart-mvc-endpoint

### invoke
```
POST /resume
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* generic-postable-mvc-endpoint

### invoke
```
POST /resume.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* generic-postable-mvc-endpoint

### invoke
```
GET /trace
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### invoke
```
GET /trace.json
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|object|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* application/json

#### Tags

* endpoint-mvc-adapter

### getCompanies
```
GET /v1/companies/{companyIds}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|companyIds|companyIds|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Company array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* company-controller-v-1

### getCompaniesWithStats
```
GET /v1/companies/{companyIds}/stats
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|companyIds|companyIds|true|string||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Company array|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* company-controller-v-1

### getCompany
```
GET /v1/company/{companyId}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|companyId|companyId|true|integer (int64)||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|Company|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* company-controller-v-1

### createCompany
```
PUT /v1/createCompany
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|company|company|true|Company||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|No Content|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* company-controller-v-1

### editCompany
```
POST /v1/editCompany
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|BodyParameter|company|company|true|Company||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|No Content|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* company-controller-v-1

### testHystrix
```
GET /v1/hystrixTest/{requestCount}/{delayInMsec}
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|PathParameter|requestCount|requestCount|true|integer (int64)||
|PathParameter|delayInMsec|delayInMsec|true|integer (int64)||


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|integer (int64)|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* company-controller-v-1

