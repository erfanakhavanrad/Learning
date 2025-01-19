package mySelf.ApplicationEvent;

import org.springframework.stereotype.Component;

/**
 * @author Erfan Akhavan Rad
 * @created 01/19/2025
 */
@Component
public class HouseKeepingServiceHandler {
    public void cleanAndAssign(){
        System.out.println("Housekeeping Service: Preparing room for next patient after discharge.");
    }
}
