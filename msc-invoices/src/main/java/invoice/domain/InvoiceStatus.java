package invoice.domain;

/**
 * Created by bekas on 04/05/16.
 */
public enum InvoiceStatus {

    UNPAID(1),
    PAID(2),
    DELETED(3),
    PERIODIC(4);


    private Integer id;

    InvoiceStatus(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

}
