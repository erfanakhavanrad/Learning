package mySelf.ApplicationEvent;

import org.springframework.stereotype.Component;

/**
 * @author Erfan Akhavan Rad
 * @created 01/18/2025
 */
@Component
public class NotificationServiceHandler {
    public void notifyPatients() {
        System.out.println("Notification Service: Sending discharge notification for patients.");
    }
}
