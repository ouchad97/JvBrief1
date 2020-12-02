package Brief.ycd.java;
import java.util.Scanner;

public class Brief1 {
	 public static void main(String args[]) {
		 String Nom,Prenom;
		 int heurs;
		 double tarif,TarifExtra;
		 tarif=0;
		 TarifExtra = 0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Bienvenue");
		 System.out.println("Enter votre nom");
			Nom = sc.next();
		 System.out.println("Entrer votre prénom");
			Prenom = sc.next();
		 System.out.println("Bonjour " + Nom);
		 System.out.println("Enter le nombre d’heures travaillées");
			heurs = sc.nextInt();
			
			if(heurs>60){
				System.out.println("Le nombre d’heure par semaine ne doit pas dépasser 60 heures.");
			}
			else {
				
				System.out.println("Introduire le tarif en MAD par heure");
					tarif = sc.nextDouble();
					
				if(heurs>40){
						TarifExtra = tarif +( 0.5 * tarif);
						System.out.println(" Votre indemnisation est de " +TarifExtra +" MAD" );

						TarifExtra = TarifExtra * (heurs-40);
				}
					double salaire;
					salaire = ((tarif * 40)+(TarifExtra));
					System.out.println(" Votre salaire semaine est " +salaire +" MAD" );
			}
	 }
	 
	 
	 
	 
}
