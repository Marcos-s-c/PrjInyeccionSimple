package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import testbean.MySpringWriterBeanWithDependency;


public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
        BeanFactory factory = context;
        testbean.MySpringWriterBeanWithDependency test = (testbean.MySpringWriterBeanWithDependency) factory.getBean("MySpringWriterBeanWithDependency");
        test.run();
    }
}