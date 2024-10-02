package ie.atu.week3_openfeign2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "product-service", url = "http://localhost:8080")
public interface ProductClient {
    @GetMapping("/products/getDetails")
    List<Payment.Product> getAllProducts();
}
