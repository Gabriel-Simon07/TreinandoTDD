package be.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {

	@Test
	public void testAssertFalse() {
		Assert.assertFalse(false);
	}
	
	@Test
	public void testAssertTrue() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void testAssertEquals() {
		Assert.assertEquals(2, 2);
	}
	
	@Test
	public void testAssertEqualsWithDelta() {
		Assert.assertEquals(2.2, 2.2, 0.1);
	}
	
	@Test
	public void testAssertEqualsWithPI() {
		Assert.assertEquals(Math.PI, 3.14, 0.01);
	}

	@Test
	public void testAssertEqualsWithObjects() {
		int i = 5;
		Integer i2 = 5;
		Assert.assertEquals(Integer.valueOf(i), i2);
	}

	@Test
	public void testAssertEqualsWithString() {
		Assert.assertEquals("Object", "Object");
	}
	
	@Test
	public void testAssertNotEquals() {
		Assert.assertNotEquals("Object", "objects");
	}
	
	@Test
	public void testAssertEqualsWithIgnoreCase() {
		Assert.assertTrue("Object".equalsIgnoreCase("object"));
	}
	
	@Test
	public void testAssertEqualsWithStartWith() {
		Assert.assertTrue("Object".startsWith("O"));
	}

	@Test
	public void testEqualsUsers() {
		
		Usuario usuario1 = new Usuario("Nando");
		Usuario usuario2 = new Usuario("Nando");
		
		Assert.assertEquals(usuario1, usuario2);
	}
	
	@Test
	public void testEqualsUsersInstanceSame() {
		
		Usuario usuario1 = new Usuario("Nando");
		Usuario usuario2 = new Usuario("Nando1");
		
		Assert.assertSame(usuario2, usuario2);
	}
	
	@Test
	public void testEqualsUserIsNull(){
		
		Usuario usuario1 = new Usuario("Nando1");
		Usuario usuario2 = null;
		Assert.assertTrue(usuario2 == null);
		Assert.assertNull(usuario2);		
	}

	@Test
	public void testEqualsUsersInstanceNotSame() {
		
		Usuario usuario1 = new Usuario("Nando");
		Usuario usuario2 = new Usuario("Nando1");
		
		Assert.assertNotSame(usuario2, usuario1);
	}
	
	@Test
	public void testEqualsUserIsNotNull(){
		
		Usuario usuario1 = new Usuario("Nando1");
		Assert.assertNotNull(usuario1);		
	}
	
}
