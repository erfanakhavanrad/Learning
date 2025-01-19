package mySelf.ApplicationEvent;

import lombok.Data;

/**
 * @author Erfan Akhavan Rad
 * @created 01/19/2025
 */
@Data
public class PatientDischargeRequest {
    private String patientId;
    private String patientName;
}
