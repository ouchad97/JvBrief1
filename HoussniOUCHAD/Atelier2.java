package test.uc.hello;
import java.io.*;
import java.util.Scanner;

public class HelloWord {
	
	
	
	
	public static void Show(String nom, String prenom, int age) {
		String affichage="Bonjour " + nom +" "+ prenom + ", tu as " + age + "ans";
		System.out.print(affichage);
    }
	
	public static void Genre(String genre , int age ) {
		if(genre=="Femme"){
			System.out.print("Vous êtes une femme");
		}
		if(genre=="Homme") {
			System.out.print("Vous êtes un homme"); 
			
		}

		if(age<=18) {
			System.out.print(" vous êtes mineur");
		}
		else {
			System.out.print(" vous êtes majeur");
			}
	}
	
	
	
	
	
	
	
	
	
	/*     
	public static void Menu() {
		System.out.println("C votre menu :");
		System.out.println("1 -Calculer la factorielle");
		System.out.println("2 -Calculer la somme");
	}
	
	public static void Facturielle(int n) {
		int i,f=1;
		if(n<0) {
			System.out.print("Nombre doit etre positive");
		}else {
			 for(i=1;i<=n;i++){
                 f= f * i; 
                 }
			    System.out.println("Factorielle de "+n+" est: "+f);
		}
	}
	
	public static void Somme(int n) {
		int i,res=0;
		if(n<0) {
			System.out.print("Nombre doit etre positive");
		}else {
			 for(i=1;i<=n;i++){
                 res= res + i; 
                 }
			    System.out.println("La somme des n premiers nombres  "+n+" est: "+res);
		}
	}
	*/
	public static void main(String args[]) {
		
		/*Menu();
		int nbrFact;
		int NombreChoisi;
		Scanner sc = new Scanner(System.in);
		NombreChoisi= sc.nextInt();
		if(NombreChoisi==1) {
			System.out.println("Entrer un nombre pour calculer la factorielle");
			nbrFact=sc.nextInt();
			Facturielle(nbrFact);
		}
		
		int nbrSm;
		if(NombreChoisi==2) {
			System.out.println("Entrer un nombre pour calculer la somme");
			nbrSm=sc.nextInt();
			Somme(nbrSm);
		}
		*/
		
		

		
		//1
		/*
		String Nom, Prenom,genre;
		int Age;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer votre nom");
		Nom = sc.next();
		System.out.println("Entrer votre prenom");
		Prenom = sc.next();
		System.out.println("Entrer votre genre");
		genre = sc.next();
		System.out.println("Entrer votre Age");
		Age = sc.nextInt();
		Show(Nom,Prenom,Age);
		Genre(genre,Age);
		*/
		
		
		
		
		
		
		//2
		int i=1;
		for ( i=1;i<=10;i++) {
			System.out.print(i+", ");
			}
		
		
		/*
		 * Facturielle
		 * int n,f,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un nombre");
		n = sc.nextInt();
		i=1;
		f=1;
			while (i<=n){
         			 f=f*i;
         			 i=i+1; }
          System.out.println("Faturielle est  "+f);*/
		
		
		
		/*int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un nombre");
		x = sc.nextInt();
		switch(x){
			case 0: case 2: case 4: case 6: case 8: System.out.println("nombre pair"); break;
			case 1: case 3: case 5: case 7: case 9: System.out.println("nombre impair"); break;
			default : System.out.println("en dehors de l’intervalle 0:9");
		}*/
		
	
		

		
	}

	
} 
