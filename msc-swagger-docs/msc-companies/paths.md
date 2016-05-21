## Paths
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

### errorHtml
```
GET /error
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

* text/html

#### Tags

* basic-error-controller

### errorHtml
```
PUT /error
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

* text/html

#### Tags

* basic-error-controller

### errorHtml
```
DELETE /error
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

* text/html

#### Tags

* basic-error-controller

### errorHtml
```
POST /error
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

* text/html

#### Tags

* basic-error-controller

### errorHtml
```
PATCH /error
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

* text/html

#### Tags

* basic-error-controller

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

