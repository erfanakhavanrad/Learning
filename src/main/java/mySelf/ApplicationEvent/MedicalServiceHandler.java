package mySelf.ApplicationEvent;

import org.springframework.stereotype.Component;

/**
 * @author Erfan Akhavan Rad
 * @created 01/19/2025
 */
@Component
public class MedicalServiceHandler {
    public void updatePatientHistory() {
        System.out.println("Medical Records Service: Updating records for patient.");
    }
}
