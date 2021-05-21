import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class Tests {
    @Test
    public void testSolution() throws Exception {

        Method method;
        try {
            method = Task.class.getDeclaredMethod("main", String[].class);
        } catch(NoSuchMethodException e) {
            Assert.fail();
            return;
        }

        String[] params = {"a"};
        Object[] par = {params};

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        method.invoke(new Task(), par);
        baos.flush();
        baos.close();
        String result = new String(baos.toByteArray()).trim();
        Assert.assertTrue(Pattern.compile("[Aa]hoj\\s+[Ss]v[ěe]te\\!?").matcher(result).matches());
    }
}
