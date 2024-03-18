package sfu_spring.materials;

/**
 * Интерфейс Material (Материал) определяет контракт для всех классов, которые будут представлять различные материалы.
 * Этот интерфейс содержит два метода: echoPropertiesMaterial() и getDurability().
 */
public interface Material {
    /**
     * Метод echoPropertiesMaterial() должен выводить на консоль свойства конкретного материала.
     */
    void echoPropertiesMaterial();

    /**
     * Метод getDurability() должен возвращать прочность конкретного материала в виде числового значения с плавающей запятой.
     */
    float getDurability();
}
