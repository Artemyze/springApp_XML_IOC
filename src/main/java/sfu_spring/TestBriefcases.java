package sfu_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBriefcases {
    public static void main(String[] args) {
        // Создаем контекст приложения, который будет использоваться для получения экземпляров классов
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContent.xml");
        // Получаем экземпляр класса Briefcase с именем "briefcaseClothBean" из контекста приложения
        Briefcase briefcaseCloth = context.getBean("briefcaseClothBean", Briefcase.class);
        // Выводим свойства материала портфеля из ткани
        briefcaseCloth.getMaterial().echoPropertiesMaterial();
        // Выводим прочность портфеля из ткани
        System.out.println("Cloth briefcase durability is " + briefcaseCloth.durability());
        System.out.println("-------------------------------------------------");
        // Получаем экземпляр класса Briefcase с именем "briefcaseLeatherBean" из контекста приложения
        Briefcase briefcaseLeather = context.getBean("briefcaseLeatherBean", Briefcase.class);
        // Выводим свойства материала портфеля из кожи
        briefcaseLeather.getMaterial().echoPropertiesMaterial();
        // Выводим прочность портфеля из кожи
        System.out.println("Leather briefcase durability is " + briefcaseLeather.durability());
        // Закрываем контекст приложения
        context.close();
    }
}
