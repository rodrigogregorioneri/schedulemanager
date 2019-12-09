package hackathon.totalvoice.schedulemanager.repository;

import hackathon.totalvoice.schedulemanager.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository  extends MongoRepository<Company, String> {
}
