import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DieTest {
Die test = new Die(6);
    @Test
    void dieOutPutTest(){
        test.roll();

    }
}
