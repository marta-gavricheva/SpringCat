import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        boolean beanSet = bean == bean1;
        System.out.println(beanSet);
        boolean catSet = catBean1 == catBean2;
        System.out.println(catSet);
    }

}