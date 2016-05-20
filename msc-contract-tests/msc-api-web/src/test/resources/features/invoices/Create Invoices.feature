Feature: It is able to create Invoice records and add to the the database

  Scenario: Should create another Invoice object
#   Please note that in json request body attribute
#   id, createdDate, updatedDate values should be ignored and overwritten by the backend.
    Given request body from file invoices/requests/newInvoice.json
    And content type is "application/json"

    When the client performs PUT request on /createInvoice
    Then status code is 201
    And header Location contains "http://localhost:8080/invoice/"
    And let variable "invoiceURL" equal to header "Location" value

    And should wait at most 3 s with interval 1 s until property "number" equal to "Rekins-5"
    When the client performs GET request on {(invoiceURL)}
    Then status code is 200
    And response contains property "id" with value other than "2000"
    And response contains property "number" with value "Rekins-5"
    And response contains property "templateId" with value "3"
    And response contains property "createdDate" of type "long"
