package com.timbuchalka.List.AutoBoxingAndOnboxingChallenge;

import java.util.List;

/**
 * 7/22/23
 *
 * @author Erfan Akhavan
 */
public class Main {

    private static Bank bank;

    public static void main(String[] args) {

        createBank();


    }

    private static Bank createBank() {
        return bank = new Bank();
    }
    private static List<Branch> addBranchToBank() {

    }

}
