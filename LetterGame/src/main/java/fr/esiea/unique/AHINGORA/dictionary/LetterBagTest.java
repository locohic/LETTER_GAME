package fr.esiea.unique.ahingora.nadeswaran.letterbag;

import org.junit.*;

public class LetterBagTest {
	private LetterBag letterr;
	
	@Before
	public void doBefore(){
		letterr = new LetterBag();
	}
	
	@Test
	public void testMain() {
		final char Lb;
		char result = LetterBag.LetterRandom();
		equals(result);
	}

}