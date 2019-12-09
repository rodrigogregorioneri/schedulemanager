package hackathon.totalvoice.schedulemanager.repository;

import hackathon.totalvoice.schedulemanager.model.Company;
import hackathon.totalvoice.schedulemanager.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
