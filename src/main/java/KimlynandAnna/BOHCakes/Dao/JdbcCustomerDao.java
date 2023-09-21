package KimlynandAnna.BOHCakes.Dao;

import KimlynandAnna.BOHCakes.Models.Customer;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class JdbcCustomerDao implements CustomerDao{

    private final JdbcTemplate jdbcTemplate;


    public JdbcCustomerDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

   public List<Customer> getCustomer(){
        List<Customer> customers = new ArrayList<>();
        String customerSql = "Select * FROM customer;" ;
        try{
            SqlRowSet results = jdbcTemplate.queryForRowSet(customerSql);
            while (results.next()) {
                Customer customer = mapRowToCustomer(results);
                customer.add(customer);
            }
        } catch (CannotGetJdbcConnectionException e) {
            System.out.println(e.getMessage());
        }
        return customers;
   }

    private Customer mapRowToCustomer(SqlRowSet rowSet) {
        Customer customer = new Customer();
        customer.setCustomerId(rowSet.getInt("customer_id"));
        customer.setName(rowSet.getString("name"));
        customer.setPhoneNumber(rowSet.getString("phone_number"));
        customer.setAddress(rowSet.getString("address"));
        customer.setCity(rowSet.getString("city"));
        customer.setZipCode(rowSet.getString("zipcode"));
        return customer;
    }
}
