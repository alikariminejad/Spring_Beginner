package test.com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import com.in28minutes.junit.MyMath;
import org.junit.jupiter.api.Test;

class MyMathTest {

    private MyMath math = new MyMath();

    @Test
    void calculateSum_ZeroLengthArray() {
        assertEquals(0, math.calculateSum(new int[]{}));
    }

    @Test
    void calculateSum_ThreeMemberArray1() {
        assertEquals(6, math.calculateSum(new int[]{1, 2, 3}));
    }
}