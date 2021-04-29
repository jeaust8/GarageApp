package nl.joostvaartsen.GarageApp;

import nl.joostvaartsen.GarageApp.customer.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class GarageAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarageAppApplication.class, args);
	}

	@GetMapping
	public List<Customer> hello() {
		return List.of(new Customer(
				1L,
				"Henk",
				"Janssen",
				"henk@janssen.mail.nl",
				
				LocalDate.of(2000, Month.JANUARY, 5),
				21);
	}

}
