import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        MegaBean megaBean = context.getBean(MegaBean.class);
        TestBean testBean = context.getBean(TestBean.class);

    }
}
