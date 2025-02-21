package App.Emprestimo.Model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private Integer age;
    private String cpf;
    private String name;
    private Double income;
    private String location;
    private List<Loan> loans = new ArrayList<>();

    public Customer() {}

    public Customer(Integer age, String cpf, String name, Double income, String location) {
        this.age = age;
        this.cpf = cpf;
        this.name = name;
        this.income = income;
        this.location = location;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void AddList(Loan loan){
        loans.add(loan);
    }


}
