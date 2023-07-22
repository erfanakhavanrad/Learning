package com.timbuchalka.List.AutoBoxingAndOnboxingChallenge;

import java.util.ArrayList;

/**
 * 7/22/23
 *
 * @author Erfan Akhavan
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

//-1:58 autoboxing challenge
    public boolean newCustomer(String custoemrName, double initialAmount){}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
