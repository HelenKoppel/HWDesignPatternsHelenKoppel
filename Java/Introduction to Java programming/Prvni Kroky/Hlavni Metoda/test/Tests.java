import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void testSolution() throws Exception {
        try {
            Task.class.getDeclaredMethod("main", String[].class);
        } catch(NoSuchMethodException e) {
            Assert.fail();
        }
    }
}
