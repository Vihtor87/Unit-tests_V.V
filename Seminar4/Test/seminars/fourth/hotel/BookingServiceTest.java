package seminars.fourth.hotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookingServiceTest {
    @Test
    public void testBookingService() {
        HotelService mockHotelService = mock(HotelService.class);
        when(mockHotelService.isRoomAvailable(anyInt())).thenAnswer(i -> (Integer) i.getArgument(0) % 2 == 0);

        BookingService bookingService = new BookingService(mockHotelService);

        assertTrue(bookingService.bookRoom(2));
        assertFalse(bookingService.bookRoom(3));

        verify(mockHotelService, times(2)).isRoomAvailable(anyInt());
    }
}