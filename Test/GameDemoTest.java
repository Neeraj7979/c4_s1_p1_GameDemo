import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameDemoTest {
    GameDemo g1;


    @BeforeEach
    void setUp() {
        g1=new GameDemo();
    }

    @AfterEach
    void tearDown() {
        g1=null;
    }

    @Test
    void divideByNumber() {
        int expected=0;
        int actual= Integer.parseInt(g1.divideByNumber(10,0));
        assertEquals(expected,actual);
    }@Test
    void divideByNumberPass() {
        int expected=2;
        int actual= Integer.parseInt(g1.divideByNumber(10,5));
        assertEquals(expected,actual);
    }
}