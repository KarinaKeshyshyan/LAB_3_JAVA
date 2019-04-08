package ua.lviv.iot.weavingMachines.models;

public class LatheMachine extends WeavingMachines {
    private ProcessingType processing;

    public LatheMachine() {
    }

    public LatheMachine(double width, MaterialType kindOfMaterial, double power, ProcessingType processing) {
        super(width, kindOfMaterial, power);
        this.processing = processing;
    }

    public ProcessingType getProcessing() {
        return processing;
    }

    public void setProcessing(ProcessingType processing) {
        this.processing = processing;
    }
}
