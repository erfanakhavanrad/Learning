package com.timbuchalka.List.AutoBoxingAndOnboxingChallenge;

import java.util.ArrayList;

/**
 * 7/22/23
 *
 * @author Erfan Akhavan
 */
public class Bank {

    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank() {
    }

    public Bank(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public void addBranch(Branch branch) {
        if (doesNotExits(branch))
            branches.add(branch);
        else System.out.println("Con");
    }

    private boolean doesNotExits(Branch branch) {
        int position = branches.indexOf(branch);
        if (position >= 0)
            return true;
        return false;
    }

    private int findPosition(Branch branch) {
        int position = branches.indexOf(branch);
        return position;
    }

    public void addCustomerToBranch(Customer customer, Branch branch) {
//        ArrayList<Customer> customers = new ArrayList<>();
//        customers.add(customer);
        final int position = findPosition(branch);
        if (position >= 0) {
            branches.get(position).addCustomer(customer);
        } else{
            System.out.println("Branch doesn't exists.");
        }


    }


}
