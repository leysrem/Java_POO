package com.lms.tactfactory.classes_tp10.utils;

public class Conjugateur {
	
	public static String[] pronoms =  { "je ", "tu ", "il/elle/on ", "nous", "vous","ils/elles/ont" };
	public static String[] verbes =  {""};
	private static final String[] Terminaisons = {"e","es","e","ons","ez","ent"};
	
	public Conjugateur() {
	// TODO Auto-generated constructor stub
	}
	
	public static void conjugueAvecSaisi( String nbr1) {
		
		verbes[0] = nbr1;
		
		for(int j = 0; j < verbes.length; j++) {
			
			verbes[j] = verbes[j].substring(0, verbes[j].length() - 2);
			
			for ( int i = 0; i < Terminaisons.length; i++) {
					System.out.println(pronoms[i] + " " + verbes[j] + Terminaisons[i]); 
				}
		}
	}
}

	
