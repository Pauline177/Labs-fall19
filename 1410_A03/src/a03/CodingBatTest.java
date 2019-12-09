package a03;

import static org.junit.Assert.*;

import org.junit.Test;

public class CodingBatTest {

	/**
	 * 
	 */
	@Test
	public void testZipZap1() {
		CodingBat tester = new CodingBat();
		assertEquals("Result", "zpXzp", tester.zipZap("zipXzap"));
	}
	
	@Test
	public void testZipZap2() {
		CodingBat tester = new CodingBat();
		assertEquals("Result", "zpzp", tester.zipZap("zopzop"));
	}
	
	@Test
	public void testZipZap3() {
		CodingBat tester = new CodingBat();
		assertEquals("Result", "zzzpzp", tester.zipZap("zzzopzop"));
	}
	
	@Test
	public void testZipZap4() {
		CodingBat tester = new CodingBat();
		assertEquals("Result", "zibzp", tester.zipZap("zibzp"));
	}
	
	@Test
	public void testZipZap5() {
		CodingBat tester = new CodingBat();
		assertEquals("Result", "zp", tester.zipZap("zip"));
	}
	
	@Test
	public void testZipZap6() {
		CodingBat tester = new CodingBat();
		assertEquals("Result", "zi", tester.zipZap("zi"));
	}
	
	@Test
	public void testZipZap7() {
		CodingBat tester = new CodingBat();
		assertEquals("Result", "z", tester.zipZap("z"));
	}

	@Test
	public void testZipZap8() {
		CodingBat tester = new CodingBat();
		assertEquals("Result", "", tester.zipZap(""));
	}
	
	@Test
	public void testZipZap9() {
		CodingBat tester = new CodingBat();
		assertEquals("Result", "zp", tester.zipZap("zzp"));
	}
	@Test
	public void testZipZap10() {
		CodingBat tester = new CodingBat();
		assertEquals("Result", "abcppp", tester.zipZap("abcppp"));
	}
	@Test
	public void testZipZap11() {
		CodingBat tester = new CodingBat();
		assertEquals("Result", "azbcppp", tester.zipZap("azbcppp"));
	}
	@Test
	public void testZipZap12() {
		CodingBat tester = new CodingBat();
		assertEquals("Result", "azbcpzp", tester.zipZap("azbcpzp"));
	}
}

