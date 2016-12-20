package ru.sbt.bit.ood.hw1;

        import org.springframework.context.ApplicationContext;
        import org.springframework.context.ConfigurableApplicationContext;
        import org.springframework.context.annotation.AnnotationConfigApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;
        import org.springframework.context.support.StaticApplicationContext;

/**
 * Created by Григорий on 20.12.2016.
 */

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.getBean(TradeJobMain.class).run();

    }
}