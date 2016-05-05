package mailqueue.domain;

/**
 * Created by bekas on 05/05/16.
 */
public enum InvoicePeriod {
    NONE(0),
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