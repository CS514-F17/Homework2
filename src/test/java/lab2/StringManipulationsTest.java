package lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringManipulationsTest {

	@Test
	public void testCountChars1() {		
		assertEquals("countChars fails with test: (\"hello\", \'l\')", 2, (new StringManipulations().countChars("hello", 'l')));		
	}

	@Test
	public void testCountChars2() {		
		assertEquals("countChars fails with test: (\"hello\", \'o\')", 1, (new StringManipulations().countChars("hello", 'o')));		
	}

	@Test
	public void testCountChars3() {		
		assertEquals("countChars fails with test: (\"hello\", \'h\')", 1, (new StringManipulations().countChars("hello", 'h')));		
	}

	@Test
	public void testCountChars4() {		
		assertEquals("countChars fails with test: (\"hello\", \'z\')", 0, (new StringManipulations().countChars("hello", 'z')));		
	}

	@Test
	public void testCountChars5() {		
		assertEquals("countChars fails with test: (\"hello\", \'E\')", 0, (new StringManipulations().countChars("hello", 'E')));		
	}

	@Test
	public void testReverse1() {		
		assertEquals("reverse fails with test: (\"hello\")", "olleh", (new StringManipulations().reverse("hello")));		
	}

	@Test
	public void testReverse2() {		
		assertEquals("reverse fails with test: (\"The dog barked!\")", "!dekrab god ehT", (new StringManipulations().reverse("The dog barked!")));		
	}
	
	@Test
	public void testLongestWord1() {		
		assertEquals("longestWord fails with test: (\"hello\")", 5, (new StringManipulations().longestWord("hello")));		
	}

	@Test
	public void testLongestWord2() {		
		assertEquals("longestWord fails with test: (\"The dog barked!\")", 7, (new StringManipulations().longestWord("The dog barked!")));		
	}

	@Test
	public void testshiftLeft1() {		
		assertEquals("shiftLeft fails with test: (\"Winter is coming!\", 2)", "nter is coming!Wi", (new StringManipulations().shiftLeft("Winter is coming!", 2)));		
	}
	
	@Test
	public void testshiftLeft2() {		
		assertEquals("shiftLeft fails with test: (\"Lannister\", 15)", null, (new StringManipulations().shiftLeft("Lannister", 15)));		
	}

	@Test
	public void testshiftLeft3() {		
		assertEquals("shiftLeft fails with test: (\"Cersei\", 6)", "Cersei", (new StringManipulations().shiftLeft("Cersei", 6)));		
	}
	
	@Test
	public void testrepeater1() {		
		assertEquals("repeater fails with test: (\"Sansa\")", "SSSSS", (new StringManipulations().repeater("Sansa")));		
	}

	@Test
	public void testrepeater2() {		
		assertEquals("repeater fails with test: (\"Winter is coming!\")", "WWWWWW ii ccccccc", (new StringManipulations().repeater("Winter is coming!")));		
	}

	@Test
	public void testrepeater3() {		
		assertEquals("repeater fails with test: (\"Stop\twhat's that sound?\")", "SSSS	wwwwww tttt ssssss", (new StringManipulations().repeater("Stop\twhat's that sound?")));		
	}
	
	@Test
	public void testremoveDuplicates1() {		
		assertEquals("removeDuplicates fails with test: (\"Sansa\")", "Sans", (new StringManipulations().removeDuplicates("Sansa")));		
	}

	@Test
	public void testremoveDuplicates2() {		
		assertEquals("removeDuplicates fails with test: (\"Winter is coming!\")", "Winter scomg!", (new StringManipulations().removeDuplicates("Winter is coming!")));		
	}

}

