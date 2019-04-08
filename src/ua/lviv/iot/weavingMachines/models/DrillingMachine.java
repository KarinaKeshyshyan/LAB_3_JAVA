package ua.lviv.iot.weavingMachines.models;

public class DrillingMachine extends WeavingMachines {
    private ClassificationType classification;
    private double diameter;
    private double sortie;

    public DrillingMachine() {
    }

    public DrillingMachine(double width, MaterialType kindOfMaterial, double power, ClassificationType classification, double diameter, double sortie) {
        super(width, kindOfMaterial, power);
        this.classification = classification;
        this.diameter = diameter;
        this.sortie = sortie;
    }

    public ClassificationType getClassification() {
        return classification;
    }

    public void setClassification(ClassificationType classification) {
        this.classification = classification;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getSortie() {
        return sortie;
    }

    public void setSortie(double sortie) {
        this.sortie = sortie;
    }
}
