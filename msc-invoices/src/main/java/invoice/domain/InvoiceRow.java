package invoice.domain;

/**
 * Created by bekas on 04/05/16.
 */
public class InvoiceRow {

    private final Long id;
    private final String name;
    private final Integer quantity;
    private final Integer pricePerOne;

    public InvoiceRow(Long id, String name, Integer quantity, Integer pricePerOne) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.pricePerOne = pricePerOne;
    }

    public InvoiceRow(Integer pricePerOne, String name, Long id) {
        this.pricePerOne = pricePerOne;
        this.name = name;
        this.id = id;
        this.quantity = 1;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getPricePerOne() {
        return pricePerOne;
    }
}
