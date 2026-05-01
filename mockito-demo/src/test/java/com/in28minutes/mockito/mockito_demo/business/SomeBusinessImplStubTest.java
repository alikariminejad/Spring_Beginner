package com.in28minutes.mockito.mockito_demo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplStubTest {
    @Test
    void findTheGreatestFromAllData_basicScenario(){
        DataService dataServiceStub = new DataServiceStub1();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(34232, result);
    }

    @Test
    void findTheGreatestFromAllData_withOneValue(){
        DataService dataServiceStub = new DataServiceStub2();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(6423, result);
    }
}

class DataServiceStub1 implements DataService{

    @Override
    public int[] retrieveAllData(){
        return new int[]{1,2,5,3,16,6423,34232};
    }
}

class DataServiceStub2 implements DataService{

    @Override
    public int[] retrieveAllData(){
        return new int[]{1,2,5,3,16,6423};
    }
}