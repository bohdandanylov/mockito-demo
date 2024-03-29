package business;

import learnspringboot.mockito.mockitodemo.business.DataService;
import learnspringboot.mockito.mockitodemo.business.SomeBusinessImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplMockTest {

    @Test
    void findTheGreatestFromAllData_basicScenario(){

        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 15, 5});
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        assertEquals(25, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_oneValue(){

        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{35});
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        assertEquals(35, businessImpl.findTheGreatestFromAllData());
    }
}
