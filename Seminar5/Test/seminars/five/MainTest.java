package seminars.five;

import org.junit.jupiter.api.Test;
import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;
import seminars.five.order.OrderService;
import seminars.five.order.PaymentService;
import seminars.five.user.UserRepository;
import seminars.five.user.UserService;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    //5.1.
    @Test
    public void checkSizeArr() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        int[] num = randomNumberModule.generateRandomNumbers(10);

        assertEquals(10, num.length);
    }

    @Test
    public void checkMaxNumInArr() {
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        int[] num = {1, 10, 4, 8, 11};

        assertEquals(11, maxNumberModule.findMaxNumber(num));
    }

    @Test
    public void checkMaxValueInGeneratedArr() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        int[] num = randomNumberModule.generateRandomNumbers(5);
        int maxVal = maxNumberModule.findMaxNumber(num);

        Arrays.sort(num);

        assertEquals(num[num.length - 1] , maxVal);
    }

    //5.2.
    @Test
    public void testUserRepository() {
        UserRepository userRepository = new UserRepository();
        Random random = new Random();
        int id = random.nextInt(20);
        String user = userRepository.getUserById(id);

        assertEquals("User " + id, user);
    }
    @Test
    public void testUserService() {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        Random random = new Random();
        int id = random.nextInt(20);
        String name = userService.getUserName(id);

        assertEquals("User " + id, name);
    }

    //5.3.
    @Test
    public void testOrderService() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        assertTrue(orderService.placeOrder("1", 10.0));
    }
}