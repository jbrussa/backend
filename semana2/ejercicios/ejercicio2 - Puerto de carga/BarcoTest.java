import java.beans.Transient;
import org.junit.jupiter.api.Test;

public class BarcoTest {
    
    @Test
    public void testCrearBarco() {
        // Arrange
        String cap = "Pepe Popeye";
        int matricula = 12345;
        int darsena = 1;
        double carga = 10;

        // Act
        Barco b = new Barco(matricula, darsena, cap, carga);

        //Assert
        assertNotNull(b);
        assertEquals(matricula, b.getCapitan());
        
    }
}
