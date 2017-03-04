package fr.esiea.unique.ahingora.nadeswaran.letterpot;

import java.util.*;

import fr.esiea.unique.ahingora.nadeswaran.letterbag.LetterBag;

public class LetterPot extends LetterBag {
	
	public static ArrayList<String> pot = new ArrayList<String>();
	static String l;
	
	public static void Pot() {
		pot.add(l);
		System.out.println(pot);
	}
	public void setLettre(String lettre){
	LetterPot.l = lettre;	
	}
	 public static void main (String[] args){
		 for(int i=0; i<10; i++){
			LetterPot C = new LetterPot();
			String le = Character.toString(LetterBag.LetterRandom());
			C.setLettre(le);

		 }
		 LetterPot.Pot();
	 }
		
	}