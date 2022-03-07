package spring.uz.util;

import org.springframework.stereotype.Component;
import spring.uz.exception.FileCustomException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

@Component
public class FileUtils {
    private static String IMAGE_PATH = "./src/main/resources/static/images";

    public static String addImage(
            String fileContent,
            byte content[]
    ) throws FileNotFoundException {
        try {
            System.out.println(fileContent);
            File file = new File(IMAGE_PATH);
            file.mkdirs();
            String imageUrl = UUID.randomUUID() + ".png";
            File file1 = new File(file, imageUrl);
            file1.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file1);
            fileOutputStream.write(content);
            fileOutputStream.close();
            return "http://127.0.0.1:3399/images/" + imageUrl;
        } catch (IOException e) {
            throw new FileCustomException("file yaratishda muammo");
        }
    }

}
