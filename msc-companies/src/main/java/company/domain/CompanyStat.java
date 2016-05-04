package company.domain;

import java.util.Date;

/**
 * Created by bekas on 04/05/16.
 */
public class CompanyStat {

    private Long statId;
    private Date date;
    private Integer value;
    private StatType type;

    public Long getStatId() {
        return statId;
    }

    public void setStatId(Long statId) {
        this.statId = statId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public StatType getType() {
        return type;
    }

    public void setType(StatType type) {
        this.type = type;
    }

    public CompanyStat(Long statId, Date date, Integer value, StatType type) {

        this.statId = statId;
        this.date = date;
        this.value = value;
        this.type = type;
    }
}
