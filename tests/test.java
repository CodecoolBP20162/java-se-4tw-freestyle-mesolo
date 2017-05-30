import com.codecool.freestyle.mesolo.Car;
import com.codecool.freestyle.mesolo.Vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Simple test class
 * @author Bence Gál
 */
public class test {

    /**
     * Tests if setCar() works and getters returns values as expected
     */
    @Test
    public void checkSetCarAndGetters(){
        Car car1 = new Car();
        car1.setCar("car1ModelName", "car1BodyStyle", 1,2,3,4,5,6);
        assertEquals(car1.getModelName(), "car1ModelName");
        assertEquals(car1.getBodyStyle(), "car1BodyStyle");
        assertEquals(car1.getNumOfDoors(), 1);
        assertEquals(car1.getLengthMeter(), 2);
        assertEquals(car1.getHorsePower(), 3);
        assertEquals(car1.getLastTimeServiced(), 4);
        assertEquals(car1.getNumOfAvailable(), 5);
        assertEquals(car1.getStatus(), 6);
    }
}
