import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoOneTest {
    @Test
    public void testFactor() {
        assertEquals(true, SkillDemoOne.isFactorOf(4, 2));   // this test will pass
    }
}
