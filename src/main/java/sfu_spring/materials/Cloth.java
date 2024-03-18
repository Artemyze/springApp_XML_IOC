package sfu_spring.materials;
import java.util.Objects;

public class Cloth implements Material {
    private String name;
    private String fiberContent;
    private float durability;

    public Cloth(){}
    public Cloth(String name, String fiberContent, float durability) {
        this.name = name;
        this.fiberContent = fiberContent;
        this.durability = durability;
    }

    @Override
    public void echoPropertiesMaterial() {
        System.out.println("Class: \n" + this.getClass().getName());
        System.out.println("Name: \n" + name);
        System.out.println("Fiber's content: \n" + fiberContent);

    }

    @Override
    public float getDurability() {
        return durability;
    }

    public void setDurability(float durability) {
        this.durability = durability;
    }

    public String getFiberContent() {
        return fiberContent;
    }

    public void setFiberContent(String fiberContent) {
        this.fiberContent = fiberContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cloth cloth = (Cloth) o;
        return Objects.equals(name, cloth.name) && Objects.equals(fiberContent, cloth.fiberContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fiberContent);
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "name='" + name + '\'' +
                ", fiberContent='" + fiberContent + '\'' +
                '}';
    }
}
