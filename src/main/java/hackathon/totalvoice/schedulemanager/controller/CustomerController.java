package hackathon.totalvoice.schedulemanager.controller;

import hackathon.totalvoice.schedulemanager.dto.CustomerResponse;
import hackathon.totalvoice.schedulemanager.model.Customer;
import hackathon.totalvoice.schedulemanager.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public CustomerResponse createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

    @GetMapping
    public Customer listCustomer(){
        return new Customer();
    }

}
