import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat cat1 = applicationContext.getBean("catBean", Cat.class);
        Cat cat2 = applicationContext.getBean("catBean", Cat.class);

        System.out.println("Равны ли ссылки на двух кошек? -" + (cat1 == cat2));

        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);

        System.out.println("Равны ли ссылки на два HelloWorld? -" + (bean == bean2));




    }
}