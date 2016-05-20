Feature: It is able to retrieve Invoice records stored in the database
  Scenario: Check attributes of a single Invoice record (request by ID)
    Given should wait at most 1 s until status code 200
    When the client performs GET request on /invoice/1860
    Then status code is 200
    And response contains property "id" with value "1860"
    And response contains property "name" with value "Rekins-5"
    And response contains property "createdDate" of type "long"
    And response does not contain property "updatedDate"