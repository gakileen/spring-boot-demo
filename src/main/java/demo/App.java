package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {

    public static void main( String[] args ){
        System.out.println("Hello begin");
        SpringApplication.run(App.class, args);
        System.out.println("Hello world");
    }
}
