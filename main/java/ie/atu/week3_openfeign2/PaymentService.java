package ie.atu.week3_openfeign2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {
    private List<Payment> paymentList = new ArrayList<>();

    public List<Payment> getAllPayments() {
        return paymentList;
    }

    public Payment processPayment(Payment payment) {
        paymentList.add(payment);
        return payment;
    }
}
