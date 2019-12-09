package hackathon.totalvoice.schedulemanager.dto;

public class CustomerResponse {

    private String customerId;

    public CustomerResponse(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
