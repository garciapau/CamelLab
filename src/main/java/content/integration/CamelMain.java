package content.integration;

import content.integration.dashboard.Hawtio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.camel.spring.Main;

public class CamelMain {
    // Use the Hawtio camel plugin instead of this main class
    public static void main(String[] args) throws Exception {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        Hawtio bean = (Hawtio) context.getBean("hawtio");
        bean.startDashboard();

        Main main = new Main();
        main.setApplicationContextUri("META-INF/spring/camel-context.xml");
        main.enableHangupSupport();
        main.start();

    }
}