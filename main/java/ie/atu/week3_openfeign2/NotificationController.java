package ie.atu.week3_openfeign2;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/details")
@RestController
public class NotificationController {
    @PostMapping("/confirm-details")
    public String someDetails(@RequestBody  Product product){
        return "Received details for id " + product.getId() + " with the name " + product.getName();
    }


}
