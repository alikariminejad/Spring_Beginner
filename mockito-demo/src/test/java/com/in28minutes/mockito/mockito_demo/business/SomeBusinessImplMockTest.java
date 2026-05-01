package com.in28minutes.mockito.mockito_demo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    void findTheGreatestFromAllData_basicScenario(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,5,3,16,6423,34232});
        assertEquals(34232, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_oneValue(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{16});
        assertEquals(16, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_noValue(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
    }
}