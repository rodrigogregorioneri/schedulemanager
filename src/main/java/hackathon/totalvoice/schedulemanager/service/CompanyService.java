package hackathon.totalvoice.schedulemanager.service;

import hackathon.totalvoice.schedulemanager.dto.CompanyResponse;
import hackathon.totalvoice.schedulemanager.model.Company;
import hackathon.totalvoice.schedulemanager.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyResponse createCompany(Company company){
        String id = companyRepository.save(company).getId();
        return new CompanyResponse(id);
    }


}
