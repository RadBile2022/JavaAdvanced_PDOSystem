package models;

import entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private List<Customer> customerList = new ArrayList<>();

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
