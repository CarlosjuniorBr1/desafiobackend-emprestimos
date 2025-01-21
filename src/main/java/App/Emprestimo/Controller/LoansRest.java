package App.Emprestimo.Controller;

import App.Emprestimo.DTO.LoansResponse;
import App.Emprestimo.Model.Customer;
import App.Emprestimo.Service.LoansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class LoansRest {

    private final LoansService loansService;

    @Autowired
   public  LoansRest(LoansService loansService){
        this.loansService = loansService;
    }


    @PostMapping("/customer-loans")
     public ResponseEntity<LoansResponse> getCustomerLoans(@RequestBody Customer customer){
        loansService.customerLoans(customer);

        LoansResponse response = new LoansResponse(customer.getName(), customer.getLoans());
        return ResponseEntity.ok(response);
    }
}
