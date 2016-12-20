package ru.sbt.bit.ood.hw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Григорий on 21.12.2016.
 */
public class Application {
    public static void main(String[] args) {


        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    }
}
