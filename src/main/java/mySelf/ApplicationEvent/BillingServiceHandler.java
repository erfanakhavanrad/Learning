package mySelf.ApplicationEvent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Erfan Akhavan Rad
 * @created 01/19/2025
 */
@Component
public class BillingServiceHandler {

    @EventListener
    public void processBill(PatientDischargeEvent patientDischargeEvent) {
        System.out.println("Billing Service: Finalizing bill for patient" + patientDischargeEvent.getPatientId());
    }

}
