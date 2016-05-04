package invoice.domain;

/**
 * Created by bekas on 04/05/16.
 */
public enum InvoicePeriod {
    WEEK(1),
    MONTH(2);

    private Integer id;

    InvoicePeriod(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

}
