package mySelf.ApplicationEvent;

import org.springframework.stereotype.Component;

/**
 * @author Erfan Akhavan Rad
 * @created 01/19/2025
 */
@Component
public class BillingServiceHandler {
    public void processBill(){
        System.out.println("Billing Service: Finalizing bill for patient");

    }
}
