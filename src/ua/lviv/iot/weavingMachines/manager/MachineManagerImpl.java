package ua.lviv.iot.weavingMachines.manager;

import ua.lviv.iot.weavingMachines.models.MaterialType;
import ua.lviv.iot.weavingMachines.models.WeavingMachines;

import java.util.*;

public class MachineManagerImpl implements MachineManager {

    @Override
    public List<WeavingMachines> findByMaterial(List<WeavingMachines> weavingMachines, MaterialType materialType) {
        List<WeavingMachines> result = new LinkedList<>();
        weavingMachines.stream().
                filter(weavingMachines1 -> (weavingMachines1.
                getKindOfMaterial() == materialType)).
                forEach(weavingMachines1 -> result.add(weavingMachines1));
        return result;
    }

    @Override
    public List<WeavingMachines> findByWidth(List<WeavingMachines> weavingMachines, double width) {
        List<WeavingMachines> result = new LinkedList<>();
        weavingMachines.stream().
                filter(weavingMachines1 -> (weavingMachines1.
                        getWidth() == width)).
                forEach(weavingMachines1 -> result.add(weavingMachines1));
        return result;
    }

    @Override
    public List<WeavingMachines> sortByVolume(List<WeavingMachines> weavingMachines, boolean reverse) {
        if(reverse) {
            Collections.sort(weavingMachines, Comparator.comparing(WeavingMachines::getVolume));
        }
        else {
            Collections.sort(weavingMachines, Comparator.comparing(WeavingMachines::getVolume).reversed());
        }
        return weavingMachines;
    }

    @Override
    public List<WeavingMachines> sortByPower(List<WeavingMachines> weavingMachines, boolean reverse) {
        if(reverse) {
            Collections.sort(weavingMachines, Comparator.comparing(WeavingMachines::getPower));
        }
        else {
            Collections.sort(weavingMachines, Comparator.comparing(WeavingMachines::getPower).reversed());
        }
        return weavingMachines;
    }
}
