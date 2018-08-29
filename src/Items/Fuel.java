package Items;

import Vaisseau.Vaisseau;

public class Fuel extends Items{

    public Fuel() {this.nom="Fuel";
    }



    public void utiliser (Vaisseau vaisseau){
        if(vaisseau.getCarburant()<5)
        {vaisseau.setCarburant(vaisseau.getCarburant()+1);
            System.out.println("Carburant +1 grâce au Fuel!");}
        else
            System.out.println("Vous avez versé tout le carburant par terre car le vaisseau était déjà plein!!!");
    }
}
