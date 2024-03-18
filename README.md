# Проект springApp_XML_IOC

### Введение

springApp_XML_IOC - проект Java, описанный в pom.xml файле, представляет собой консольное приложение, которое демонстрирует использование фреймворка Spring и концепций dependency injection (внедрение зависимостей) для создания объектов и управления их зависимостями.

В проекте определены следующие классы:

- `Briefcase`: класс, представляющий сумку, которая может быть изготовлена из разных материалов, таких как ткань или кожа.
- `Cloth` и `Leather`: классы, представляющие разные материалы, из которых может быть изготовлена портфель.
- `TestBriefcases`: класс, содержащий main метод, в котором создаются бины через контекст Spring и вызываются их методы.

В файле applicationContent.xml определены бины и их зависимости. Spring будет управлять жизненным циклом этих бинов и внедрять зависимости в них.

### **Практическая работа 2.**

#### Spring, внедрение зависимостей. Способ 1

***Цель работы:*** 

Ознакомиться с механизмом внедрения зависимостей в *Spring*.

***Общая постановка задачи:***

Необходимо создать приложение, в котором будут объявлены *Spring*-конфигурации при помощи *xml*-конструкций 

В каждом варианте есть сущность (класс), необходимо создать интерфейс (самостоятельно на усмотрение студента) и классы, его имплементирующие. Объекты классов, имплементирующих данный интерфейс, будут передаваться в качестве зависимостей. Выполнить связывание и получить объекты из контекста. Продемонстрировать результаты в простейшем консольном приложении. 

Необходимо:

1. Реализовать внедрение простых значений через конструктор
2. Реализовать внедрение зависимости по ссылке через конструктор
3. Интерфейс должен содержать как минимум один метод
4. Классы, имплементирующие интерфейс, должны содержать как минимум одно поле (у разных классов - разные)
5. Зависимый класс должен содержать метод, который на основе вызова метода у зависимости выводил бы некоторое сообщение в консоль (Например для класса Автомобиля, в который внедряются Двигатели. Они могут выдавать свою мощность, а автомобиль может выводить сообщение, с какой скоростью он может двигаться).
6. Реализовать внедрение простых значений из внешнего файла через *setter*

***Вариант практической работы:***

17. Портфель

***

### **Как собрать проект с помощью Maven**

**Чтобы собрать проект с помощью Maven, необходимо выполнить следующие шаги:**

1. Установить Maven на свой компьютер, если он еще не установлен. Иструкция как установить этот сборщик находится на официальном сайте: 

   https://maven.apache.org/install.html

2. Открыть командную строку или терминал и перейти в каталог, где расположен файл pom.xml. Пример для терминала Windows: 

   ***`С:\>cd С:\workspace\myProject`***

   где myProject - папка, где хранится pom.xml файл

3. Выполнить следующую команду, чтобы собрать проект в виде исполняемого файла JAR:

   ***`mvn clean package`***

   Maven при каждом запуске этой команды будет удалять файлы, созданные при предыдущих сборках; устанавливать все зависимости, нужные для работы программы: проведет все зарегистрированные тесты. 

   Так же по умолчанию(с предустановленными заранее настройками от автора проекта), maven создаст скомпилированный jar файл со всеми упакованными зависимостями в каталог 

   ***ПУТЬ\_ДО\_ТЕКУЩЕГО\_ПРОЕКТА/target/***

   с именем  **sfu_kis_practice_2-jar-with-dependencies.jar**. Все зависимости, которые использовались указаны в корневом каталоге проекта в pom.xml. 

4. После успешной сборки можно запустить программу, выполнив следующую команду:

   ***`java -jar target/sfu_kis_practice_2-jar-with-dependencies.jar`***

5. Для запуска тестов необходимо выполнить следующую команду:

   ***`mvn test`***
