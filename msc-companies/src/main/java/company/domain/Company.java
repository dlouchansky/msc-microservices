package company.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bekas on 04/05/16.
 */

public class Company {

    private Long id;
    private String name;
    private String address;
    private String email;
    private Integer vatNumber;
    private Map<Company, Integer> clientDiscounts;
    private Map<StatType, List<CompanyStat>> companyStats = new HashMap<StatType, List<CompanyStat>>();

    public List<CompanyStat> getCompanyStats(StatType statType) {
        return companyStats.get(statType);
    }

    public void setCompanyStats(StatType statType, List<CompanyStat> companyStats) {
        this.companyStats.put(statType, companyStats);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(Integer vatNumber) {
        this.vatNumber = vatNumber;
    }

    public Map<Company, Integer> getClientDiscounts() {
        return clientDiscounts;
    }

    public void setClientDiscounts(Map<Company, Integer> clientDiscounts) {
        this.clientDiscounts = clientDiscounts;
    }

    public Company(Long id, String name, String address, String email, Integer vatNumber, Map<Company, Integer> clientDiscounts) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.vatNumber = vatNumber;
        this.clientDiscounts = clientDiscounts;
    }
}
