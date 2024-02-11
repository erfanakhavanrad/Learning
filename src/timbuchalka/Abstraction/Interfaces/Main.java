package timbuchalka.Abstraction.Interfaces;

import com.timbuchalka.Abstraction.Interfaces.DeskPhone;
import com.timbuchalka.Abstraction.Interfaces.ITelephone;
import com.timbuchalka.Abstraction.Interfaces.MobilePhone;

/**
 * @author Erfan Akhavan Rad
 * @created 07/21/2023
 */
public class Main {
    public static void main(String[] args) {
        ITelephone erfanPhone;
        erfanPhone = new DeskPhone(123456);
        erfanPhone.powerOn();
        erfanPhone.callPhone(123456);
        erfanPhone.answer();

        System.out.println();
        System.out.println();
        System.out.println();

        erfanPhone = new MobilePhone(23456);
        erfanPhone.powerOn();
        erfanPhone.callPhone(23456);
        erfanPhone.answer();

    }
}
