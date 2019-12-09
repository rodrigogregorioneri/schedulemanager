package hackathon.totalvoice.schedulemanager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Company {

    @Id
    @JsonIgnore
    private String id;

    private String TradingName;

    private int registeredNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTradingName() {
        return TradingName;
    }

    public void setTradingName(String tradingName) {
        TradingName = tradingName;
    }

    public int getRegisteredNumber() {
        return registeredNumber;
    }

    public void setRegisteredNumber(int registeredNumber) {
        this.registeredNumber = registeredNumber;
    }
}
