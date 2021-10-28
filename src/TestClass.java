import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestClass {
    @Test
    public void testId1() {
        assertEquals("VO_SO_NGHIEM", new FirstDegreeEquation(0, 0).status());
    }

    @Test
    public void testId2() {
        assertEquals("VO_NGHIEM", new FirstDegreeEquation(0, 1).status());
    }

    @Test
    public void testId3() {
        assertEquals("VO_NGHIEM", new FirstDegreeEquation(0, -1).status());
    }

    @Test
    public void testId4() {
        assertEquals("MOT_NGHIEM_BANG_0", new FirstDegreeEquation(10, 0).status());
    }

    @Test
    public void testId5() {
        assertEquals("MOT_NGHIEM_AM", new FirstDegreeEquation(10, 10).status());
    }

    @Test
    public void testId6() {
        assertEquals("MOT_NGHIEM_DUONG", new FirstDegreeEquation(10, -10).status());
    }

    @Test
    public void testId7() {
        assertEquals("MOT_NGHIEM_BANG_0", new FirstDegreeEquation(-10, 0).status());
    }

    @Test
    public void testId8() {
        assertEquals("MOT_NGHIEM_DUONG", new FirstDegreeEquation(-10, 10).status());
    }

    @Test
    public void testId9() {
        assertEquals("MOT_NGHIEM_AM", new FirstDegreeEquation(-10, -10).status());
    }


}
