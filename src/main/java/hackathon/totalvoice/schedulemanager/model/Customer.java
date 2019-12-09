package hackathon.totalvoice.schedulemanager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document
public class Customer {

    @Id
    @JsonIgnore
    private String id;
    private String name;
    private String phone;


}
