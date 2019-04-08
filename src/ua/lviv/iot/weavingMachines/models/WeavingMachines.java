package ua.lviv.iot.weavingMachines.models;

public abstract class WeavingMachines {

    private double width;
    private MaterialType kindOfMaterial;
    private double power;
    private double volume;

    public WeavingMachines() {
    }

    public WeavingMachines(double width, MaterialType kindOfMaterial, double power) {
        this.width = width;
        this.kindOfMaterial = kindOfMaterial;
        this.power = power;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public MaterialType getKindOfMaterial() {
        return kindOfMaterial;
    }

    public void setKindOfMaterial(MaterialType kindOfMaterial) {
        this.kindOfMaterial = kindOfMaterial;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
