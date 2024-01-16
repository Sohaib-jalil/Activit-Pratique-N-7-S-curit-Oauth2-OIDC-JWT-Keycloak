package ma.emsi.customerfrontthymleafapp;

import ma.emsi.customerfrontthymleafapp.entities.Customer;
import ma.emsi.customerfrontthymleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(Customer.builder().name("Anas").email("Anas@gmail.com").build());
            customerRepository.save(Customer.builder().name("Iman").email("Iman@gmail.com").build());
            customerRepository.save(Customer.builder().name("Mohamed").email("Mohamed@gmail.com").build());
        };
    }
}
