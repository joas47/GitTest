import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getAgeTest() {
        Main main = new Main("Mars", 10);
        assertEquals(10, main.getAge());
    }

    @Test
    void getNameTest() {
        Main main = new Main("Mars", 10);
        assertEquals("Mars", main.getName());
    }
}