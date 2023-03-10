package main;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import testbean.MySpringWriterBeanWithDependency;
import writer.JsonSerializer;
import writer.Serializer;
import writer.XmlSerializer;

import java.util.HashMap;


public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("METAINF/beans.xml");
        BeanFactory factory = context;
        MySpringWriterBeanWithDependency test = (MySpringWriterBeanWithDependency) factory.getBean("MySpringWriterBeanWithDependency");
        test.run();
    }
}