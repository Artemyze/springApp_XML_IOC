package sfu_spring.materials;

import java.util.Collection;
import java.util.Objects;

/**
 * Класс Leather представляет материал кожа.
 */
public class Leather implements Material {
    //Название кожанного материала.
    private String name;
    //Технологии создания данного типа кожи.
    private Collection<String> technologiesCreateLeather;
    //Стабильность материала кожи.
    private float stability;
    //Прочность кожи.
    private float toughness;

    /**
     * Конструктор по умолчанию.
     */
    private Leather() {
    }

    /**
     * Конструктор с параметрами.
     *
     * @param name                 имя кожи
     * @param technologiesCreateLeather технологии создания кожи
     * @param stability             устойчивость кожи
     * @param toughness             прочность кожи
     */
    private Leather(String name, Collection<String> technologiesCreateLeather, float stability, float toughness) {
        this.name = name;
        this.technologiesCreateLeather = technologiesCreateLeather;
        this.stability = stability;
        this.toughness = toughness;
    }

    /**
     * Метод для вывода свойств материала.
     */
    @Override
    public void echoPropertiesMaterial() {
        System.out.println("Class: \n" + this.getClass().getName());
        System.out.println("Name: \n" + name);
        System.out.println("Technologies: ");
        for (String s : technologiesCreateLeather) {
            System.out.println(s);
        }
    }

    /**
     * Метод для получения прочности.
     *
     * @return durability
     */
    @Override
    public float getDurability() {
        return stability * toughness;
    }

    /**
     * Метод для получения технологий создания кожи.
     *
     * @return technologiesCreateLeather технологии создания кожи
     */
    public Collection<String> getTechnologiesCreateLeather() {
        return technologiesCreateLeather;
    }

    /**
     * Метод для установки технологий создания кожи.
     *
     * @param technologiesCreateLeather технологии создания кожи
     */
    public void setTechnologiesCreateLeather(Collection<String> technologiesCreateLeather) {
        this.technologiesCreateLeather = technologiesCreateLeather;
    }

    /**
     * Метод для получения имени кожи.
     *
     * @return name название материала кожи
     */
    public String getName() {
        return name;
    }

    /**
     * Метод для установки имени кожи.
     *
     * @param name название материала кожи
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод для сравнения объектов.
     *
     * @param o объект для сравнения
     * @return результат сравнения
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leather leather = (Leather) o;
        return Objects.equals(name, leather.name) &&
                Objects.equals(technologiesCreateLeather, leather.technologiesCreateLeather);
    }

    /**
     * Метод для вычисления хэш-кода.
     *
     * @return int hash хэш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, technologiesCreateLeather);
    }

    /**
     * Метод для получения строкового представления объекта.
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "Leather{" +
                "name='" + name + '\'' +
                ",\ntechnologiesCreateLeather=\n" + technologiesCreateLeather +
                "\n}";
    }
}