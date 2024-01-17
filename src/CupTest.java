import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {
    @Test
    void getLiquidType(){
        Cup c = new Cup("Orange Juice",85.5);
        //assertEquals(Expected value, actual value), actual value comes from here we define in test class
        //Actual result : It is the result that you get after executing a test case.
        // Expected Result : The result that the test case should produce functionally according to the requirements.
        assertEquals("Orange Juice", c.getLiquidType());

    }
    @Test
    void getPercentageFull(){
        Cup c = new Cup("Orange Juice",85.5);
        assertEquals(85.5, c.getPercentFull(), 0.001);

    }

    @Test
    void setLiquidType() {
        Cup c = new Cup("Orange Juice",85.5);
        c.setLiquidType("Water");
        assertEquals("Water", c.getLiquidType());

    }
}