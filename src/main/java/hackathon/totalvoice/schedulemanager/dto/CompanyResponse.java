package hackathon.totalvoice.schedulemanager.dto;

public class CompanyResponse {
    private String companyId;


    public CompanyResponse(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
