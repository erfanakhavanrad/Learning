package com.timbuchalka.Abstraction.Interfaces;

/**
 * @author Erfan Akhavan Rad
 * @created 07/21/2023
 */
public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }


    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Power on method called.");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) System.out.println("Now ringing " + phoneNumber);
        else System.out.println("Mobile is off!");

    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("RINGING WITH MELODY");
        } else{ isRinging = false;
            System.out.println("Mobile is off or wrong number.");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

