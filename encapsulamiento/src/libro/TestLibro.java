package libro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestLibro {

	@Test
	public void libroStock() {
		Libro biblia = new Libro(123, "Biblia", 142, 5500);
		biblia.setStock(biblia.getStock() + 10);
		assertEquals(biblia.getStock(), 152);
		assertNotEquals(biblia.getStock(), 151);
	}

}
