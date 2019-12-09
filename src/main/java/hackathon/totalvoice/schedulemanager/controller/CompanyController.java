package hackathon.totalvoice.schedulemanager.controller;

import hackathon.totalvoice.schedulemanager.dto.CompanyResponse;
import hackathon.totalvoice.schedulemanager.model.Company;
import hackathon.totalvoice.schedulemanager.model.Customer;
import hackathon.totalvoice.schedulemanager.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public CompanyResponse createCustomer(@RequestBody Company company){
        return companyService.createCompany(company);
    }
}
