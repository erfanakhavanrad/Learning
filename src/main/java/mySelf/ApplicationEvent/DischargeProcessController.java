package mySelf.ApplicationEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Erfan Akhavan Rad
 * @created 01/19/2025
 */
@RestController
@RequestMapping("/discharge/api")
public class DischargeProcessController {
    @Autowired
    private PatientDischargeService patientDischargeService;

    @PostMapping("/process")
    public String dischargePatient(@RequestBody PatientDischargeRequest request) {
        return patientDischargeService.dischargePatient(request.getPatientId(), request.getPatientName());
    }

}
