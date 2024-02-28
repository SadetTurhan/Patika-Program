package dev.patika.ecommerce.dto.response.supplier;

public class SupplierResponse {
    private int id;
    private String companyName;

    public SupplierResponse() {
    }

    public SupplierResponse(int id, String companyName) {
        this.id = id;
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
