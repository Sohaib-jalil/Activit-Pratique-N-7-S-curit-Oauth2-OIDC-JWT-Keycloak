package ma.emsi.inventoryservice;

import ma.emsi.inventoryservice.entities.Product;
import ma.emsi.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Ordinateur").price(12000).quantity(10).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Souris").price(500).quantity(20).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Clavier").price(1000).quantity(30).build());
        };
    }
}
