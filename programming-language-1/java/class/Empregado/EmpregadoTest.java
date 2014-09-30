public class EmpregadoTest {

	@Test
	public void testaAumento1() {
		Empregado e = new Empregado("Mara", "diretoria", 10000);
		e.aumentaSalario(10);
		assertEquals(11000, e.getSalario(), 00001);
	}

	@Test
	public void testaAumento2() {
		Empregado e = new Empregado("Joao", "tecnico");
		e.aumentaSalario(15);
		assertTrue(e.getSalario() == 1150);
	}
}