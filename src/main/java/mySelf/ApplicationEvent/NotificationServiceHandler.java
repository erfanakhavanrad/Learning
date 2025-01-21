package mySelf.ApplicationEvent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Erfan Akhavan Rad
 * @created 01/18/2025
 */
@Component
public class NotificationServiceHandler {

    @EventListener
    public void notifyPatients(PatientDischargeEvent patientDischargeEvent) {
        System.out.println("Notification Service: Sending discharge notification for patient: " + patientDischargeEvent.getPatientName());
    }
}
