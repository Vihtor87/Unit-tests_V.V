package seminars.fourth.book;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TestBookService {

    @Test
    public void checkFindBookById() {
        BookRepository mockBookRepository = mock(BookRepository.class);
        BookService fakeBookService = new BookService(mockBookRepository);

        String id = "1";
        Book fakeBook = new Book(id, "FakeBook1", "FakeAuthor1");
        when(mockBookRepository.findById(id)).thenReturn(fakeBook);
        Book res = fakeBookService.findBookById(id);

        verify(mockBookRepository).findById(id);
        assertEquals(fakeBook, res);
    }

    @Test
    public void checkFindAllBook() {
        BookRepository mockBookRepository = mock(BookRepository.class);
        BookService BookService = new BookService(mockBookRepository);

        List<Book> fakeBooks = Arrays.asList(
                new Book("1", "FakeBook1", "FakeAuthor1"),
                new Book("2", "FakeBook2", "FakeAuthor2"),
                new Book("3", "FakeBook3", "FakeAuthor3"));
        when(mockBookRepository.findAll()).thenReturn(fakeBooks);

        List<Book> res = BookService.findAllBooks();

        verify(mockBookRepository).findAll();
        assertEquals(fakeBooks, res);
    }
}
