package App.Emprestimo.DTO;


import App.Emprestimo.Model.Loan;
import java.util.List;

public class LoansResponse {
    private String customer;
    private List<Loan> loans;


    public LoansResponse(String customer, List<Loan> loans) {
        this.customer = customer;
        this.loans = loans;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }
}

