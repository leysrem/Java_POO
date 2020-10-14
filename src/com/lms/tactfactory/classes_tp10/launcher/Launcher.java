package com.lms.tactfactory.classes_tp10.launcher;

import java.util.Scanner;

import com.lms.tactfactory.classes_tp10.utils.Conjugateur;

public class Launcher {
	public static void main(String[] args) {
		
		Conjugateur myConjugateur = new Conjugateur();
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Veuillez saisir un premier entier : ");
		String nbr1 = sc.nextLine();
		
		myConjugateur.conjugueAvecSaisi(nbr1);
	}
}
