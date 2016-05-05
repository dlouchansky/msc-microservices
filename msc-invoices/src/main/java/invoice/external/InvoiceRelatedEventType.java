package invoice.external;

/**
 * Created by bekas on 04/05/16.
 */
public enum InvoiceRelatedEventType {

    CREATED(1),
    UPDATED(2),
    PAID(3),
    UNPAID(4);

    private Integer id;

    InvoiceRelatedEventType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

}
