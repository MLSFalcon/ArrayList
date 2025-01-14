import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> notes = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println("Choisir une option");
            System.out.println("1 : entrer une note");
            System.out.println("2 : Voir une note a une position exacte");
            System.out.println("3 : Afficher la liste");
            System.out.println("4 : remplacer une note");
            System.out.println("5 : Supprimer une note");
            System.out.println("6 : Stop");
            String reponse = sc.nextLine();
            switch (reponse) {
                case "1":
                    System.out.println("Entrer une note");
                    double note = sc.nextDouble();
                    notes.add(note);
                    sc.skip("\n");
                    break;
                case "2":
                    System.out.println("entrer la position");
                    int position = sc.nextInt();
                    if (position >= 0 && position <= notes.size()) {
                        System.out.println("note à la position " + position + ": " + notes.get(position));
                    } else {
                        System.out.println("Position invalide");
                    }
                    sc.skip("\n");
                    break;
                case "3":
                    for (double i:notes){
                        System.out.println(i);
                    }
                    break;
                case "4":
                    System.out.println("Saisir la position à remplacer");
                    position = sc.nextInt();
                    sc.nextLine();
                    if (position >= 0 && position <= notes.size()) {
                        System.out.println("Saisir la note");
                        double nouveau = sc.nextDouble();
                        notes.set(position, nouveau);
                        sc.skip("\n");
                    } else {
                        System.out.println("Position invalide");
                    }
                    break;
                case "5":
                    System.out.println("choisir la proposition a supprimer");
                    position = sc.nextInt();
                    notes.remove(position);
                    sc.skip("\n");
                    break;
                case "6":
                    exit = false;
                    break;
                default:
                    System.out.println("erreur");
                    exit = false;
                    break;
            }
        }
    }
}