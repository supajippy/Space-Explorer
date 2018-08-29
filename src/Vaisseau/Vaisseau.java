package Vaisseau;
import Planetes.*;
import Items.*;

import java.net.SocketPermission;
import java.util.ArrayList;
import java.util.Stack;

public class Vaisseau {
    public int carburant,ptvie;
    public ArrayList<Items> inventaire=new ArrayList<>(2);
    private Stack<String> trajet=new Stack<>();

    public Stack<String> getTrajet() {
        return trajet;
    }



    public ArrayList<Items> getInventaire() {
        return inventaire;
    }

    public void setInventaire(ArrayList<Items> inventaire) {
        this.inventaire = inventaire;
    }

    public int getCarburant() {
        return carburant;
    }

    public void setCarburant(int carburant) {
        this.carburant = carburant;
    }

    public int getPtvie() {
        return ptvie;
    }

    public void setPtvie(int ptvie) {
        this.ptvie = ptvie;
    }

    public Vaisseau() {
        this.carburant = 10;
        this.ptvie = 10;
        inventaire.add(new FullFuel());

    }
    public void trajetemprunté(Stack<String> trajet){

        System.out.println("Terre");
        Stack<String> finalle=new Stack<>();
        for(int i=0;i<trajet.size();i++){
            finalle.push(trajet.pop());
        }
        for(int i=0;i<trajet.size();i++){
            System.out.println(finalle.pop());
        }
        System.out.println( "C'est le trajet que vous avez effectué");
    }
    public void trajetannulé(Stack<String> trajet, Vaisseau vaisseau){
        if(trajet.size()>0)
        {
        trajet.pop();
        vaisseau.setCarburant(vaisseau.getCarburant()+1);
        }
        else
            System.out.println("Impossible, aucun trajet");
    }
    public void afficherÉtat(Vaisseau vaisseau){
        System.out.println("Carburant : "+vaisseau.getCarburant()+"\nVie : "+vaisseau.getPtvie());
    }
}
