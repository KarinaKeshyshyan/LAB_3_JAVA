package ua.lviv.iot.weavingMachines.manager;

import ua.lviv.iot.weavingMachines.models.MaterialType;
import ua.lviv.iot.weavingMachines.models.WeavingMachines;

import java.util.LinkedList;
import java.util.List;

public interface MachineManager {
    List<WeavingMachines> weavingMachines = new LinkedList<>();

    List<WeavingMachines> findByMaterial(List<WeavingMachines> weavingMachines, MaterialType materialType);
    List<WeavingMachines> findByWidth (List<WeavingMachines> weavingMachines, double width);
    List<WeavingMachines> sortByVolume (List<WeavingMachines> weavingMachines, boolean reverse);
    List<WeavingMachines> sortByPower (List<WeavingMachines> weavingMachines, boolean reverse);
}
