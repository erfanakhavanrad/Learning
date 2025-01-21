package mySelf.ApplicationEvent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Erfan Akhavan Rad
 * @created 01/19/2025
 */
@Component
public class MedicalServiceHandler {
    @EventListener
    public void updatePatientHistory(PatientDischargeEvent patientDischargeEvent) {
        System.out.println("Medical Records Service: Updating records for patient." + patientDischargeEvent.getPatientId());
    }
}
