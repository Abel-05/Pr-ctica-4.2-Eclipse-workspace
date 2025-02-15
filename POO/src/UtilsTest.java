import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilsTest {

	@Test
	public void testbuscarInt() {
		int[] lista = {4,6,8,7,5,1,1,2,8,9,0,4,7,3};
		int num = 8;
		int posicion = Utils.buscarInt(lista, num);
		assertEquals(2,posicion);
		
	}
	
	@Test
	public void testTipoTriangulo() {
        double a = 2;
        double b = 2;
        double c = 2;
        String resultado = Utils.TipoTriangulo(a, b, c);
        assertEquals("EQUILATERO", resultado);
	}
	@Test
    public void testmasFrecuenteInt() {
		int[] todosIguales = {7, 7, 7};
        int masFrecuente = Utils.masFrecuenteInt(todosIguales);
        assertEquals(7, masFrecuente);
	}
	

}
