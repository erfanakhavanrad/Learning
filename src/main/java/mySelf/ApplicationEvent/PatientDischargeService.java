package mySelf.ApplicationEvent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * @author Erfan Akhavan Rad
 * @created 01/19/2025
 */
@Service
@Slf4j
public class PatientDischargeService {

//    @Autowired
//    private BillingServiceHandler billingServiceHandler;
//
//    @Autowired
//    private HouseKeepingServiceHandler houseKeepingServiceHandler;
//
//    @Autowired
//    private MedicalServiceHandler medicalServiceHandler;
//
//    @Autowired
//    private NotificationServiceHandler notificationServiceHandler;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public String dischargePatient(String patientId, String patientName) {
        log.info("Patient discharge process initiated {} ", patientName);

        // Publish and event instead of all these.
//        billingServiceHandler.processBill();
//        medicalServiceHandler.updatePatientHistory();
//        houseKeepingServiceHandler.cleanAndAssign();
//        notificationServiceHandler.notifyPatients();
        applicationEventPublisher.publishEvent(new PatientDischargeEvent(this, patientId, patientName));

        log.info("Patient discharge process completed {} ", patientName);
        return "Patient " + patientName + " With ID " + patientId + " has been discharged";
    }
}
