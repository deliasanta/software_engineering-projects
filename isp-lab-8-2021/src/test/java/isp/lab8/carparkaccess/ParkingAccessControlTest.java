package isp.lab8.carparkaccess;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import junit.framework.TestCase;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ParkingAccessControlTest extends TestCase {
    public ParkingAccessControl pac;
    public List<Car> cars;
    public ArrayList<Car> currentCars;
    public Gson gson;
    public Reader reader;
    public void setUp(){
        try {
            pac = new ParkingAccessControl();
            // create Gson instance
            gson = new Gson();

            // create a reader
            reader = Files.newBufferedReader(Paths.get("HistoryParkingFolder.json"));

            // convert JSON array to list of users
            cars = new Gson().fromJson(reader, new TypeToken<List<Car>>() {}.getType());

            // print users
            cars.forEach(System.out::println);

            // close reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            pac = new ParkingAccessControl();
            // create Gson instance
            gson = new Gson();

            // create a reader
            reader = Files.newBufferedReader(Paths.get("CurrentParkingFolder.json"));

            // convert JSON array to list of users
            currentCars = new Gson().fromJson(reader, new TypeToken<List<Car>>() {}.getType());
            pac.setParkedCars(currentCars);
            // print users
            currentCars.forEach(System.out::println);

            // close reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void testCarExit(){
        assertNotSame(1,pac.carExit(currentCars.get(0).getPlateNumber()));
    }
    public void testViewAllPastEntriesForCar(){
        assertEquals(3007.0,cars.get(0).getTotalStay());
        assertEquals(6.007000000000001,cars.get(1).getTotalPrice());
    }

}
