package invoice.external;

import invoice.domain.Invoice;

/**
 * Created by bekas on 04/05/16.
 */
public class InvoiceRelatedEvent {

    private final InvoiceRelatedEventType eventType;
    private final Invoice invoice;

    public InvoiceRelatedEvent(InvoiceRelatedEventType eventType, Invoice invoice) {
        this.eventType = eventType;
        this.invoice = invoice;
    }
}
