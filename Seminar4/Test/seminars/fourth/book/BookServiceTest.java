package seminars.fourth.book;


import org.junit.jupiter.api.Test;
import seminars.fourth.message.MessageService;
import seminars.fourth.message.NotificationService;


import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    public void testBookingService() {
        MessageService mockMessageService = mock(MessageService.class);

        NotificationService notificationService = new NotificationService(mockMessageService);

        notificationService.sendNotification("Привет", "Анна");

        verify(mockMessageService, times(1)).sendMessage("Привет", "Анна");
    }
}