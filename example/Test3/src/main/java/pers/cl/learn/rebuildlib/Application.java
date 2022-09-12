package pers.cl.learn.rebuildlib;

import com.cl.bases.utils.Utils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

/**
 * @Author l
 * @Date 2022/9/12 10:46
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        String dateString = Utils.SDF1.format(new Date());
        System.out.println(dateString);
    }
}
