import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getAgeTest() {
        Person test = new Person("Mars", 10);
        assertEquals(10, test.getAge());
    }

    @Test
    void getNameTest() {
        Person test = new Person("Mars", 10);
        assertEquals("Mars", test.getName());
    }
}