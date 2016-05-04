package invoice.api; /**
 * Created by bekas on 03/05/16.
 */

import invoice.domain.Invoice;
import invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping({"/v1", "/"})
public class InvoiceControllerV1 {

    @Autowired
    InvoiceService invoiceService;

    @RequestMapping(path = "/createInvoice", method = RequestMethod.PUT)
    public ResponseEntity<Void> createInvoice(@RequestBody Invoice invoice,
                                              UriComponentsBuilder ucBuilder) {
        invoiceService.create(invoice);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/invoice/{id}").buildAndExpand(invoice.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(path = "/editInvoice", method = RequestMethod.POST)
    public ResponseEntity<Void> editInvoice(@RequestBody Invoice invoice,
                                            UriComponentsBuilder ucBuilder) {
        invoiceService.edit(invoice);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/invoice/{id}").buildAndExpand(invoice.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(path = "/invoice/{invoiceId}", method = RequestMethod.GET)
    public Invoice getInvoice(@PathVariable(value = "invoiceId") Long invoiceId) {
        return invoiceService.get(invoiceId);
    }

    @RequestMapping(path = "/invoiceWithCompanies/{invoiceId}", method = RequestMethod.GET)
    public Invoice getInvoiceWithCompanies(@PathVariable(value = "invoiceId") Long invoiceId) {
        return invoiceService.getWithCompanies(invoiceId);
    }

    @RequestMapping(path = "/invoices/{companyId}", method = RequestMethod.GET)
    public List<Invoice> getInvoice(@PathVariable(value = "companyId") Long companyId,
                                    @RequestParam(value = "limit", defaultValue = "20") Long limit,
                                    @RequestParam(value = "from", defaultValue = "0") Long from,
                                    @RequestParam(value = "order", defaultValue = "1") Long order,
                                    @RequestParam(value = "startDate", defaultValue = "1") Date startDate,
                                    @RequestParam(value = "endDate", defaultValue = "1") Date endDate
    ) {
        return invoiceService.getList(companyId, limit, from, order, startDate, endDate);
    }


    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public String handleException(Exception e) {
        return "some error happened" + e;
    }
}
