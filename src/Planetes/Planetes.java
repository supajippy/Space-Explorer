package Planetes;

import Items.Items;
import Vaisseau.Vaisseau;

import java.util.ArrayList;
import Planetes.*;


public abstract class Planetes {

   protected ArrayList<Items> listeobjets = new ArrayList<>();
    protected String nom;
    protected Items itemtrouvé;
    protected int random;
    protected int distance;
    public String getNom() {
      return nom;
   }
   protected ArrayList<Planetes> planetes=new ArrayList<Planetes>(5);
   protected Planetes explorée;

   public void explorer(Vaisseau vaisseau) {

       planetes.add(new Cairk());
       planetes.add(new Pelwqpoek());
       planetes.add(new ORWekw());
       planetes.add(new GDOUA());
       planetes.add(new Paldf());
       random=(int)(Math.random()*5);
       System.out.println(random);
       explorée= planetes.get(random);
       itemtrouvé=explorée.itemtrouvé;


      vaisseau.getTrajet().push(explorée.getNom());
      System.out.println("Vous visitez la planète " + explorée.getNom() + " cela vous coute " + explorée.distance + " " +
              "unités de carburant");

      vaisseau.setCarburant(vaisseau.getCarburant() - explorée.distance);
      vaisseau.getInventaire().add(this.itemtrouvé);
      System.out.println("Vous avez trouvé : ");
      itemtrouvé.getNom();

      if (vaisseau.getCarburant() <= 0) {
         System.out.println("Votre carburant est à zéro!!!");
      }
      if (random == 4) {
         System.out.println("Les pirates intergalactiques vous ont attaqué!");

         if (vaisseau.getPtvie() > 1) {
            vaisseau.setPtvie((int) vaisseau.getPtvie() / 2);
            System.out.println("Ils vous ont enlevé la moitié de votre vie!");
         } else {
            for (int i = 0; i < 2; i++) {
               vaisseau.getInventaire().clear();
            }
            System.out.println("Ils ont eu pitié de vous et vous ont laissé partir par contre, ils vous ont volé vos objets");

         }
      }
      System.out.println("Exploration terminée");

   }


}