public class ArraySimpleTest {
    
    @Test
    public void ArraySimpleConDiezElementos() {
        // Arrange

        //Act
        ArraySimple array = new ArraySimple();

        //Assert
        assertNotNull(array);
        assertEquals(10, array.size());
    }

    public void ArraySimpleAgregoUnObjeto() {
        // Arrange
        ArraySimple vector = new ArraySimple();
        Barco b = new Barco(12345, 1, "Pepe Popeye", 10);

        //Act
        vector.append(b);

        //Assert
        Object item = vector.get(0);

        assertNotNull(item); // se creo el item
        assertNull(vector.get(posicion)); // no tenga duplicados
        assertInstanceOf(Barco.class, ((Barco)item).getClass()); // que el objeto es de la clase Barco ESTA MAL PERO EL PROFE NO SABE CUAL ES
        assertEquals(((Barco) item).getMatricula(), 1234); // que el objeto es el mismo que agregué
    }

    public void ArraySimleThrowExceptionWhenPositionNotExists() {
        // Arrange
        ArraySimple vector = new ArraySimple(2);
        Barco b = new Barco(12345, 1, "Pepe Popeye", 10);

        //Act
        vector.append(b);

        //Assert
        assertThrows(IllegalArgumentException.class, () -> {
            vector.set(new Barco(67890, 2, "Capitan Ahab", 20), 11);
        });
    }
}
