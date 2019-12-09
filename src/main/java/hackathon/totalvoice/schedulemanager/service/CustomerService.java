package hackathon.totalvoice.schedulemanager.service;

import hackathon.totalvoice.schedulemanager.dto.CustomerResponse;
import hackathon.totalvoice.schedulemanager.model.Customer;
import hackathon.totalvoice.schedulemanager.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerResponse createCustomer(Customer customer){
        String id = customerRepository.save(customer).getId();
        return new CustomerResponse(id);
    }
}
