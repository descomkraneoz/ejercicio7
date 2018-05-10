import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

public class MainTest {

    @Test
    public void cadenaVacia1() {
        assertTrue(Main.captureItemsBetweenDashes("").isEmpty());
    }

    @Test
    public void cadenaVacia2() {
        assertTrue(Main.captureItemsBetweenDashes("-").isEmpty());
    }

    @Test
    public void cadenaVacia3() {
        assertTrue(Main.captureItemsBetweenDashes("--").isEmpty());
    }

    @Test
    public void cadenaLongitud1() {
        String input = "-1-";
        assertFalse(Main.captureItemsBetweenDashes(input).isEmpty());
        assertEquals(1, Main.captureItemsBetweenDashes(input).size());
        assertEquals("1", Main.captureItemsBetweenDashes(input).get(0));
    }

    @Test
    public void siguienteCadenaLongitud1() {
        String input = "-1--";
        assertFalse(Main.captureItemsBetweenDashes(input).isEmpty());
        assertEquals(1, Main.captureItemsBetweenDashes(input).size());
        assertEquals("1", Main.captureItemsBetweenDashes(input).get(0));
    }

    @Test
    public void cadenaLongitud2() {
        String input = "--2-";
        assertFalse(Main.captureItemsBetweenDashes(input).isEmpty());
        assertEquals(1, Main.captureItemsBetweenDashes(input).size());
        assertEquals("2", Main.captureItemsBetweenDashes(input).get(0));
    }

    @Test
    public void cadenaMultiple1() {
        String input = "1-aaa-3";
        assertFalse(Main.captureItemsBetweenDashes(input).isEmpty());
        assertEquals(1, Main.captureItemsBetweenDashes(input).size());
        assertEquals("2", Main.captureItemsBetweenDashes(input).get(0));
        assertEquals("aaa", Main.captureItemsBetweenDashes(input).get(1));
    }

    @Test
    public void cadenaMultiple2() {
        String input = "-1-aaa-3-";
        assertFalse(Main.captureItemsBetweenDashes(input).isEmpty());
        assertEquals(2, Main.captureItemsBetweenDashes(input).size());
        assertEquals("1", Main.captureItemsBetweenDashes(input).get(0));
        assertEquals("aaa", Main.captureItemsBetweenDashes(input).get(1));
    }
}
