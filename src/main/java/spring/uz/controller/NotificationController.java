package spring.uz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.uz.util.NotificationUtils;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/notification")
public class NotificationController {

    private final NotificationUtils notificationUtils;

    @GetMapping("/send")
    public void sendNotification(){
        notificationUtils.sendNotificationToUserEmail();
    }
}
