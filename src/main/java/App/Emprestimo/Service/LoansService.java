package App.Emprestimo.Service;

import App.Emprestimo.Model.Customer;
import App.Emprestimo.Model.Loan;
import org.springframework.stereotype.Service;

@Service
public class LoansService {

    public void customerLoans(Customer customer){

        if(customer.getIncome() <= 3000.00 
                || customer.getIncome() < 5000.00 && customer.getAge() < 30 && customer.getLocation().equals("SP"))
        {
               Loan loan = new Loan();
               loan.setType("PERSONAL");
               loan.setInterest_rate(4);
               customer.AddList(loan);
        } if (customer.getIncome() >=5000.00) {
                Loan loan = new Loan();
                loan.setType("CONSIGNMENT");
                loan.setInterest_rate(2);
               customer.AddList(loan);

        } if (customer.getIncome() <= 3000.00
                || customer.getIncome() < 5000.00 && customer.getAge() < 30 && customer.getLocation().equals("SP")){

                Loan loan = new Loan();
                loan.setType("GUARANTEED");
                loan.setInterest_rate(3);
                customer.AddList(loan);

        }
    }
}
