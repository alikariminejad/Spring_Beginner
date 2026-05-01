package com.in28minutes.mockito.mockito_demo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplTest {
    @Test
    void findTheGreatestFromAllData_basicScenario(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(34232, result);
    }
}

class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAllData(){
        return new int[]{1,2,5,3,16,6423,34232};
    }
}