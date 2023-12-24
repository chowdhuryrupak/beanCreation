package Beancreation;

import Config.Configuration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
    public static void main(String[] args) {
        BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("spring.xml"));
        A a1 = beanFactory.getBean("a", A.class);
        a1.sendsms("Hi all");

        ApplicationContext context=new AnnotationConfigApplicationContext(Configuration.class);

        A getA = context.getBean("getA", A.class);
        getA.sendsms("from configuration class");
    }
}
