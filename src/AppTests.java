import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTests {

    @Test
    public void testTaxSuccess(){
        var result = App.taxCalculate(1000);

        assertEquals(250000, result);
    }

    @Test  
    public void testTaxFailed(){
        assertThrows(IllegalArgumentException.class, () -> {
            App.taxCalculate(0);
        });
    }




}
