package sfu_spring.materials;

import java.util.Collection;
import java.util.Objects;

public class Leather implements Material {
    private String name;
    private Collection<String> technologiesCreateLeather;
    private float stability, toughness;

    private Leather() {
    }

    private Leather(String name, Collection<String> technologiesCreateLeather, float stability, float toughness) {
        this.name = name;
        this.technologiesCreateLeather = technologiesCreateLeather;
        this.stability = stability;
        this.toughness = toughness;
    }

    @Override
    public void echoPropertiesMaterial() {
        System.out.println("Class: \n" + this.getClass().getName());
        System.out.println("Name: \n" + name);
        System.out.println("Technologies: ");
        for (String s : technologiesCreateLeather) {
            System.out.println(s);
        }
    }

    @Override
    public float getDurability() {
        return stability * toughness;
    }

    public Collection<String> getTechnologiesCreateLeather() {
        return technologiesCreateLeather;
    }

    public void setTechnologiesCreateLeather(Collection<String> technologiesCreateLeather) {
        this.technologiesCreateLeather = technologiesCreateLeather;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leather leather = (Leather) o;
        return Objects.equals(name, leather.name) && 
                Objects.equals(technologiesCreateLeather, leather.technologiesCreateLeather);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, technologiesCreateLeather);
    }

    @Override
    public String toString() {
        return "Leather{" +
                "name='" + name + '\'' +
                ",\ntechnologiesCreateLeather=\n" + technologiesCreateLeather +
                "\n}";
    }
}
