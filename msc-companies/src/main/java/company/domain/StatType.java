package company.domain;

/**
 * Created by bekas on 04/05/16.
 */
public enum StatType {

    UNPAID(1),
    INCOME(2);

    private Integer id;

    StatType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
