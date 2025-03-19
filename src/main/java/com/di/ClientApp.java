package com.di;
import com.di.beans.InjectingList;
import com.di.beans.InjectingMap;
import com.di.beans.InjectingProperties;
import com.di.beans.InjectingSet;
import com.di.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student list1 = (Student) context.getBean("student");
        InjectingList list2 = (InjectingList) context.getBean("list");
        InjectingSet set = (InjectingSet) context.getBean("set");
        InjectingMap map = (InjectingMap) context.getBean("map");
        InjectingProperties props = (InjectingProperties) context.getBean("props");

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(set);
        System.out.println(map);
        System.out.println(props);
    }
}
