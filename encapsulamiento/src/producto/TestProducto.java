package producto;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestProducto {

	@Test
	public void agregarStock() {
		System.out.println("/// Prueba agregar Stock ///");
		Producto celular = new Producto(01, "Iphone 13 Pro", 300000, 10);
		System.out.println(celular.toString());
		Producto laptop = new Producto(02, "Laptop lenovo", 250000, 20);
		System.out.println(laptop.toString());
		celular.setStock(celular.getStock() + 10);
		assertEquals(celular.getStock(), 20);
	}

	@Test
	public void errorPrecio() {
		System.out.println("/// Pasamos un precio erroneo ///");
		Producto celular = new Producto(01, "Iphone 13 Pro", 300000, 10);
		System.out.println(celular.toString());
		Producto laptop = new Producto(02, "Laptop lenovo", 250000, 20);
		System.out.println(laptop.toString());
		celular.setStock(celular.getStock() + 10);
		assertNotEquals(celular.getPrecioUnitario(), 201235);
	}

}
