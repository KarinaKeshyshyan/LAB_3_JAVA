package ua.lviv.iot.weavingMachines.models;

public class LoomMachine extends WeavingMachines {
    private ManufacturingType manufacturing;
    private double width;

    public LoomMachine() {
    }

    public LoomMachine(double width, MaterialType kindOfMaterial, double power, ManufacturingType manufacturing, double width1) {
        super(width, kindOfMaterial, power);
        this.manufacturing = manufacturing;
        this.width = width1;
    }

    public ManufacturingType getManufacturing() {
        return manufacturing;
    }

    public void setManufacturing(ManufacturingType manufacturing) {
        this.manufacturing = manufacturing;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
