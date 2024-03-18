package sfu_spring;

import sfu_spring.materials.Material;

import java.util.Objects;

public class Briefcase {
    private Material material;
    Briefcase(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    public float durability() {
        return this.material.getDurability();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Briefcase briefcase = (Briefcase) o;
        return Objects.equals(material, briefcase.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
