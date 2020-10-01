package challenges.utilities2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MultiBracketValidationTest {
    @Test
    public void testMultiBracketValidation() {
        MultiBracketValidation valid = new MultiBracketValidation();
        assertTrue(valid.multiBracketValidation("{}"));
        assertTrue(valid.multiBracketValidation("{}()[]"));
        assertTrue(valid.multiBracketValidation("()[[Extra Characters]]"));
        assertTrue(valid.multiBracketValidation("(){}[[]]"));
        assertTrue(valid.multiBracketValidation("{}{Code}[Fellows](())"));
        assertTrue(valid.multiBracketValidation(""));
        assertFalse(valid.multiBracketValidation("[({}]"));
        assertFalse(valid.multiBracketValidation("(]("));
        assertFalse(valid.multiBracketValidation("{(})"));
    }
}
