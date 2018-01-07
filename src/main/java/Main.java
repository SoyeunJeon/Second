import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CoT on 10/12/17.
 */
public class Main {
    public static void main(String[] args){

        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();

        configApplicationContext.register(AppConfig.class);

        configApplicationContext.refresh();

        // can make above 3 lines in one
        // AnnotationConfigApplicationContext configApplicationContext = new AnnotationCongifApplicationContext(AppConfig.class);

//        HelloManager helloManager = configApplicationContext.getBean(HelloManager.class);
//        helloManager.greet();
//
//        GoodByeManager goodByeManager = configApplicationContext.getBean(GoodByeManager.class);
//        goodByeManager.greet();

        GreetingApp app = configApplicationContext.getBean(GreetingApp.class);
        app.meeting();

        StudentManager memory = configApplicationContext.getBean(StudentManagerInMemory.class);
        memory.getAllStudents();
    }
}
