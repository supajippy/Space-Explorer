package Items;

import Vaisseau.Vaisseau;

public class Maxpointvie extends Items {
    public Maxpointvie() {
        this.nom="Potion Max De Vie";
    }

    public void utiliser (Vaisseau vaisseau){
        vaisseau.setPtvie(10);
        System.out.println( "Vous avez rempli tous vos points de vie");
    }
}
