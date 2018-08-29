package Items;

import Vaisseau.Vaisseau;

public class PotionVie extends Items {

    public PotionVie() {
        this.nom="Potion De Vie";
    }

    public void utiliser (Vaisseau vaisseau){
        if(vaisseau.getPtvie()<10&&vaisseau.getPtvie()>=7)
        {vaisseau.setPtvie(10);
            System.out.println( "Vous avez rempli tous vos points de vie avec la petite potion!");}
        else
        {vaisseau.setPtvie(vaisseau.getPtvie()+3);
            System.out.println(";Vous avez monté vos points de vie de 3 points!");}

    }
}
