package isp.lab6.exercise2;

import isp.lab6.exercise1.SensorReading;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class EquipmentController {

    /**
     * Add new equipment to the list of equipments
     *
     * @param equipment - equipment to be added
     */
    private List<Equipment> equipmentList=new ArrayList<Equipment>();
    public void addEquipment(final Equipment equipment) {
        equipmentList.add(equipment);

    }

    /**
     * Get current list of equipments
     *
     * @return list of equipments
     */
    public List<Equipment> getEquipments() {
        return equipmentList;
    }

    /**
     * Get number of equipments
     *
     * @return number of equipments
     */
    public int getNumberOfEquipments() {
        return equipmentList.size();
    }

    /**
     * Group equipments by owner
     *
     * @return a dictionary where the key is the owner and value is represented by list of equipments he owns
     */
    public Map<String, List<Equipment>> getEquipmentsGroupedByOwner() {
        Map<String,List<Equipment>> map = new HashMap<String,List<Equipment>>();
        for (Equipment i: equipmentList) {
            String owners = i.getOwner();

            List<Equipment> list = map.get(owners);

            if (list == null) {
                list = new ArrayList<Equipment>();
                map.put(owners,list);
            }

            list.add(i);
        }
        return map;
    }

    /**
     * Remove a particular equipment from equipments list by serial number
     * @param serialNumber - unique serial number
     * @return deleted equipment instance or null if not found
     */
    public Equipment removeEquipmentBySerialNumber(final String serialNumber) {
        for(Equipment i:equipmentList)
            if(serialNumber.equals(i.getSerialNumber())) {
                equipmentList.remove(i);
                return i;
            }
        return null;
    }

}
