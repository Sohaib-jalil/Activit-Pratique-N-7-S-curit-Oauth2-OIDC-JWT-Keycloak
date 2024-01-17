package ma.emsi.inventoryservice.web;

import ma.emsi.inventoryservice.entities.Product;
import ma.emsi.inventoryservice.repository.ProductRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
//    @PreAuthorize("hasAuthority('ADMIN')")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
