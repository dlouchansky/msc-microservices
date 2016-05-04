package company.domain;

/**
 * Created by bekas on 04/05/16.
 */
public enum StatPeriod {

    DAY(1),
    WEEK(2),
    MONTH(3);

    private Integer id;

    StatPeriod(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
