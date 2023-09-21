package KimlynandAnna.BOHCakes.Contoller;

import KimlynandAnna.BOHCakes.Dao.CustomerDao;
import KimlynandAnna.BOHCakes.Models.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private CustomerDao customerDao;

    public CustomerController (CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Customer> getCustomer() {

        return  customerDao.getCustomer();
    }
}
