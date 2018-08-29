import Planetes.Cairk;
import Vaisseau.Vaisseau;

import java.util.Scanner;

//J'ai eu de la misère à faire imprimer mon trajet, je ne comprends pas ce que je fais de mal.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans Space Explorer");
        Vaisseau j1 = new Vaisseau();
        boolean continuer = true;
        Cairk plt = new Cairk();
        while (continuer == true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Que voulez-vous faire?\n1-Examiner le vaisseau\n2-Explorer une planete" +
                    "\n3-Utiliser un objet dans l'inventaire\n4-Annuler son dernier déplacement");
            int choix = sc.nextInt();

            switch (choix) {
                case 1:
                    j1.afficherÉtat(j1);
                    break;
                case 2:
                    plt.explorer(j1);

                    break;
                case 3:
                    if (j1.getInventaire().isEmpty()) {
                        System.out.println("Impossible, inventaire vide");
                    } else {
                        System.out.println("Utilisez la position affichée pour choisir votre item");
                        for (int i = 0; i < j1.getInventaire().size(); i++) {
                            j1.getInventaire().get(i).getNom();
                            System.out.print("Position " + i);
                        }
                        int choixitem = sc.nextInt();
                        try {
                            j1.getInventaire().get(choixitem);
                            j1.getInventaire().get(choixitem).utiliser(j1);
                            j1.getInventaire().remove(choixitem);
                        } catch (Exception io) {
                            System.out.println("Mauvaise saisie");
                        }
                        ;
                    }
                    break;
                case 4:
                    j1.trajetannulé(j1.getTrajet(), j1);
                    break;

            }
            if (j1.getPtvie() <= 0 || j1.getCarburant() <= 0) {
                j1.trajetemprunté(j1.getTrajet());
                continuer = false;
            }
        }
    }
}
