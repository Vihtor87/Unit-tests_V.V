package seminars.fourth.database;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class DataProcessorTest {

    @Test
    void checkDataSql() {
        Database mockDatabase = mock(Database.class);
        when(mockDatabase.query(anyString())).thenReturn(Arrays.asList("fakeData1", "fakeData2", "fakeData1"));

        DataProcessor dataProcessor = new DataProcessor(mockDatabase);

        List<String> resList = dataProcessor.processData("SELECT * FROM table");

        assertEquals(3, resList.size());
    }

}