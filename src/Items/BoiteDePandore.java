package Items;

import Vaisseau.Vaisseau;

public class BoiteDePandore extends Items {

    public BoiteDePandore() {
        this.nom="Boite De Pandore";
    }

    public void utiliser (Vaisseau vaisseau){
        int pandore =(int)(Math.random() * (10) + 1 );

        switch (pandore){
            case 1 :
            case 2: if(vaisseau.getCarburant()<5)
            vaisseau.setCarburant(vaisseau.getCarburant()+1);
                System.out.println("Vous avez utilisé un bidon d'essence dans la boîte de Pandore");

            case 3 :
            case 4 : vaisseau.setCarburant(5);
                System.out.println(" Vous avez utilisé un plein de carburant!");


            case 5:
            case 6: if(vaisseau.getPtvie()<10&&vaisseau.getPtvie()>=7)
                vaisseau.setPtvie(10);
            else
                vaisseau.setPtvie(vaisseau.getPtvie()+3);
                System.out.println("Vous avez utilisé une petite potion de vie!");

            case 7:
            case 8: vaisseau.setPtvie(10);
                System.out.println("Vous avez utilisé une potion de vie maximale!");

            case 9 : if(vaisseau.getCarburant()<5)
                vaisseau.setCarburant(vaisseau.getCarburant()+1);
                if(vaisseau.getCarburant()<5)
                {vaisseau.setCarburant(vaisseau.getCarburant()+1);}
                if(vaisseau.getPtvie()<10&&vaisseau.getPtvie()>=7)
                    vaisseau.setPtvie(10);
                else
                    vaisseau.setPtvie(vaisseau.getPtvie()+3);
                System.out.println("Vous avez utilisé à la fois un bidon d'essence ET une petite potion de vie ");

            case 10:vaisseau.setCarburant(Math.round(vaisseau.getCarburant()/2));
                    vaisseau.setPtvie(Math.round(vaisseau.getPtvie()/2));
                System.out.println("Vous avez pris le risque....et perdu. Carburant et points de vie réduits de moitié");
        }
        System.out.println("Félicitations, vous avez eu le courage d'utiliser la boite");
    }
}
