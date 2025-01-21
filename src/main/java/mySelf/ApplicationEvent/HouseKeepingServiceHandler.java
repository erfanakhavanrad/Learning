package mySelf.ApplicationEvent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Erfan Akhavan Rad
 * @created 01/19/2025
 */
@Component
public class HouseKeepingServiceHandler {

    @EventListener
    public void cleanAndAssign(PatientDischargeEvent patientDischargeEvent) {
        System.out.println("Housekeeping Service: Preparing room for next patient after discharge." + patientDischargeEvent.getPatientId());
    }

}
