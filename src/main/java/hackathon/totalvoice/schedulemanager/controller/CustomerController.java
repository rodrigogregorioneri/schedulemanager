package hackathon.totalvoice.schedulemanager.controller;

import hackathon.totalvoice.schedulemanager.model.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/customer")
public class CustomerController {

    @PostMapping
    public Customer createCustomer(@RequestBody Customer profissional){
        return new Customer();
    }

    @GetMapping
    public Customer listCustomer(){
        return new Customer();
    }

}
