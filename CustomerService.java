package nl.joost.GarageApplication.Customer;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class CustomerService {
    public List<Customer> getCustomers(){
    return List.of(
        new Customer(
                        1L,
                                "Mariam",
                                "mariam.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
            )
        );
    }
}
