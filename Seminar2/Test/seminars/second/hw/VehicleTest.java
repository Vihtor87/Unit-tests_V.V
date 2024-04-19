package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setup() {
        car = new Car("Audi", "E-tron", 2023);
        motorcycle = new Motorcycle("Harley", "SportsterS", 2023);
    }

    @Test
    void isInstanceCar() {
        assertThat(car instanceof Vehicle);
    }

    @Test
    void isInstanceMoto() {
        assertThat(motorcycle instanceof Vehicle);
    }

    @Test
    void checkCountWheelsForCar() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void checkCountWheelsForMoto() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void checkSpeedCarInDrive() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void checkSpeedMotoInDrive() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void checkSpeedCarInPark() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void checkSpeedMotoInPark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}