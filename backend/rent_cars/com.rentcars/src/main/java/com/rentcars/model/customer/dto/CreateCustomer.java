package com.rentcars.model.customer.dto;

import com.rentcars.model.customer.Customer;

public class CreateCustomer {

    private String name;
    private String telephone;
    private String email;
    private String password;
    private String cpf;

    public CreateCustomer(Customer entity) {
        this.name = entity.getName();
        this.telephone = entity.getTelephone();
        this.email = entity.getEmail();
        this.password = entity.getPassword();
        this.cpf = entity.getTelephone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
