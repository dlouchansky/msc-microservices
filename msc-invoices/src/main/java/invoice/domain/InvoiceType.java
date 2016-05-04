package invoice.domain;

/**
 * Created by bekas on 04/05/16.
 */
public enum InvoiceType {

    PERIODIC(1),
    SINGLE(2);


    private Integer id;

    InvoiceType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
