package Items;

import Vaisseau.Vaisseau;

public class FullFuel  extends Items {

    public FullFuel() {this.nom="FullFuel";
    }

    public void utiliser (Vaisseau vaisseau){
            vaisseau.setCarburant(5);
        System.out.println( "Vous avez rempli votre vaisseau de carburant");
    }
}
