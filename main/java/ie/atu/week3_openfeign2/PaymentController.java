package ie.atu.week3_openfeign2;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;
    private ProductClient productClient;
    @Autowired
    public PaymentController(PaymentService paymentService, ProductClient productClient) {
        this.paymentService = paymentService;
        this.productClient = productClient;
    }

    @GetMapping("/getDetails")
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @PostMapping("/process")
    public Payment makePayment(@Valid @RequestBody Payment payment) {
        // Use the Feign client to fetch products
        List<Payment.Product> products = productClient.getAllProducts();
        // Implement your payment logic based on fetched products

        return paymentService.processPayment(payment);
    }
}
