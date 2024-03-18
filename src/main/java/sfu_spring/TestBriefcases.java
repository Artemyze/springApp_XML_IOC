package sfu_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBriefcases {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContent.xml");
        Briefcase briefcaseCloth = context.getBean("briefcaseClothBean", Briefcase.class);
        briefcaseCloth.getMaterial().echoPropertiesMaterial();
        System.out.println("Cloth briefcase durability is " + briefcaseCloth.durability());
        System.out.println("-------------------------------------------------");
        Briefcase briefcaseLeather = context.getBean("briefcaseLeatherBean", Briefcase.class);
        briefcaseLeather.getMaterial().echoPropertiesMaterial();
        System.out.println("Leather briefcase durability is " + briefcaseLeather.durability());
    }
}
