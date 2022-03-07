package spring.uz.util;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import spring.uz.repository.user.UserRepository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RequiredArgsConstructor
@Service
public class NotificationUtils {
    private final JavaMailSender javaMailSender;
    private final UserRepository userRepository;
    private final SimpleDateFormat simpleDateFormat;

    @Value("${mail.from}")
    private String fromEmail;


//    @Scheduled(cron = "*/10 * * * * *")
    public void sendNotificationToUserEmail(){
        System.out.println(true);
        List<String> list = List.of(
                "boburerkinov002@gmail.com",
                "habibovazizbek02@gmail.com",
                "bek9mur@gmail.com",
                "botirbek18022000@mail.ru",
                "murodjon.mukhammadaaliev@gmail.com",
                "muzaxursanov@gmail.com",
                "zoyirovj@mail.ru",
                "abdunasimovilhom234@gmail.com",
                "mmshirinkulova@gmail.com"
        );

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < list.size(); i++) {
            int finalI = i;
            executorService.execute(()->{
                    SimpleMailMessage simpleMessage = new SimpleMailMessage();
                    simpleMessage.setFrom(fromEmail);
                    simpleMessage.setTo(list.get(finalI));
                    simpleMessage.setSubject("HELLO B2 bilan Mazgi table qanday ulanadi VAQT: " + simpleDateFormat.format(new Date()));
                    simpleMessage.setText("oneToMany bolib ulanadi " + Thread.currentThread().getName());
                    javaMailSender.send(simpleMessage);
            });
        }
        executorService.shutdown();
    }

}
