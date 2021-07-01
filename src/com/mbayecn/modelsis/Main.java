package com.mbayecn.modelsis;

import com.mbayecn.models.Consultation;
import com.mbayecn.models.Medecin;
import com.mbayecn.models.Medicament;
import com.mbayecn.models.Patient;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    Patient p1 = new Patient(0021, "Mamadou Ndiaye");
    Patient p2 = new Patient(0022, "Omar Sahaba");
    Patient p3 = new Patient(0023, "Amar Diallo");



    Medecin m1 = new Medecin(1, "Docteur DIOUF");
    Medecin m2 = new Medecin(2, "Docteur FAYE");
    Medecin m3 = new Medecin(3, "Docteur SARR");

        // Liste de tous les médecins
        ArrayList<Medecin> medecins = new ArrayList<>();
        medecins.add(m1);
        medecins.add(m2);
        medecins.add(m3);

    Medicament medoc1 = new Medicament("aa21","maux de tete");
    Medicament medoc2 = new Medicament("aa22","mal de gorge");
    Medicament medoc3 = new Medicament("aa23","maux de ventre");
    Medicament medoc4 = new Medicament("aa24","contre les courbature");
    Medicament medoc5 = new Medicament("aa25","mal de dent");
    Medicament medoc6 = new Medicament("aa26","contre les vaumissement");

        // create an arraylist for consult1
        ArrayList<Medicament> medicaments_consul1 = new ArrayList<>();

        medicaments_consul1.add(medoc1);
        medicaments_consul1.add(medoc2);
        medicaments_consul1.add(medoc3);

        // create an arraylist for consult2
        ArrayList<Medicament> medicaments_consul2 = new ArrayList<>();

        medicaments_consul2.add(medoc4);
        medicaments_consul2.add(medoc1);

        // create an arraylist for consult3
        ArrayList<Medicament> medicaments_consul3 = new ArrayList<>();

        medicaments_consul3.add(medoc5);
        medicaments_consul3.add(medoc3);

        // create an arraylist for consult3
        ArrayList<Medicament> medicaments_consul4 = new ArrayList<>();

        medicaments_consul4.add(medoc6);




    Consultation consul1 = new Consultation(1001,"29-06-21",medicaments_consul1,m1,p1);
    Consultation consul2 = new Consultation(1002,"29-06-21",medicaments_consul2,m2,p2);
    Consultation consul3 = new Consultation(1003,"30-06-21",medicaments_consul3,m2,p3);
    Consultation consul4 = new Consultation(1004,"30-06-21",medicaments_consul4,m3,p1);

    // Liste de toutes les consultations
    ArrayList<Consultation> consultations = new ArrayList<>();

    consultations.add(consul1);
    consultations.add(consul2);
    consultations.add(consul3);
    consultations.add(consul4);
    // fin de la liste de toutes les consultations

     // liste des consultations du patient p1

        System.out.println("");
        System.out.println("--------------1°) Tableau des consultation du patient-----------");
        System.out.println("");
        System.out.println("   patient    | numéro de consulation | date de consultation");
        System.out.println("----------------------------------------------------------------");

        ArrayList<Consultation> consulpatientp1 = new ArrayList<>();

    for(Consultation c : consultations){
        if (c.getPatient() == p1)
            consulpatientp1.add(c);
    }

      // affichage de la liste
    for (Consultation c : consulpatientp1){
        System.out.println("  "+ c.getPatient().getNom() + "   |  " + c.getNumero_consulation() + "          |        " + c.getDate_consul() );
    }


        //Liste des patients consultés à une date donnée
        System.out.println("");
        System.out.println("--------------2°) Patients consultés à une date données-----------");
        System.out.println("");
        System.out.println("|       Date      |      Nom du patient     |");
        System.out.println("------------------------------------------------------------");

        ArrayList<Consultation> listPatientDate = new ArrayList<>();

        for(Consultation c : consultations ){
            if (c.getDate_consul() == "30-06-21")
                listPatientDate.add(c);
        }

        // affichage de la liste
        for (Consultation c : listPatientDate){
            System.out.println("       "+ c.getDate_consul()+ "  |         " + c.getPatient().getNom());
        }

        // pour une consultation, afficher son medecin et son patient
        System.out.println("");
        System.out.println("--------------3°) Pour chaque consultation, le patient et le médecin-----------");
        System.out.println("");
        System.out.println("|   Num consultation      |      Nom du patient     |   Nom du médecin ");
        System.out.println("------------------------------------------------------------------------");
        for(Consultation c : consultations ){
            System.out.println("        " + c.getNumero_consulation() + "          |       " + c.getPatient().getNom() +
                    "           | " + c.getMedecin().getNom());
        }

        System.out.println("");
        System.out.println("------------4°) Liste des consultations effectuées pour un médecin donné -----------");
        System.out.println("");
        System.out.println("   Nom du médecin     |      Numéro de consulation     |   Date de consultation    ");
        System.out.println("------------------------------------------------------------------------------------");


        ArrayList<Consultation> consul_medecin_1 = new ArrayList<>();

        // affichage de la liste des consultations pour un médecin donné
        for (Consultation c : consultations){
            if (c.getMedecin() == m2){
                consul_medecin_1.add(c);
            }
        }

        for(Consultation c : consul_medecin_1){
            System.out.println("        "+ c.getMedecin().getNom()  +"      |      "+c.getNumero_consulation() + "               | " + c.getDate_consul());
        }

        System.out.println("");
        System.out.println("------------5°) Liste des patients consultés pour un médecin donné ---------------");
        System.out.println("");
        System.out.println("   Nom du Patient    |      Nom du médecin     |   Date de consultation    | Numéro décurité Sociale");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        for(Consultation c : consul_medecin_1){
            System.out.println("       "+c.getPatient().getNom() +"       | "+ c.getMedecin().getNom() +"        |   " +c.getDate_consul() +
                    "            |      "+ c.getPatient().getNumero_secu_soc());
        }


        System.out.println("");
        System.out.println("--------------6°) Liste des médecins qui ont consultés un patient donné-----------");
        System.out.println("");
        System.out.println("       Nom du patient      |      Nom du médecin     ");
        System.out.println("-----------------------------------------------------");

        ArrayList<Consultation> consulmedecinin_m = new ArrayList<>();

        for(Consultation c : consultations){
            if (c.getPatient() == p2 )
                consulmedecinin_m.add(c);
        }
        for (Consultation c : consulmedecinin_m){
            System.out.println("        " +c.getMedecin().getNom()  +"      |      "+ c.getPatient().getNom());
        }

        System.out.println("");
        System.out.println("--------------7°) Liste des médecins qui ont effectués une consulation à une date donnée-----------");
        System.out.println("");
        System.out.println("       Date            |      Nom du médecin     ");
        System.out.println("--------------------------------------------------");;

        ArrayList<Consultation> consulmedecin_date = new ArrayList<>();

        for(Consultation c : consultations){
            if (c.getDate_consul() == "30-06-21" )
                consulmedecin_date.add(c);
        }
        for (Consultation c : consulmedecin_date){
            System.out.println("       "+c.getDate_consul() + "        | "+ c.getMedecin().getNom());
        }

        System.out.println("");
        System.out.println("/* 8° )Le nombre total de consultations */");
        int compteur = 0;

        for(Consultation c : consultations){
            compteur += 1;
        }
        System.out.println("Le nombre de consultations total est ==> " + compteur);

        System.out.println("");
        System.out.println("----------9°) Liste des médicaments prescrits lors d'une consulation donnée-----");
        System.out.println("");
        System.out.println("Numéro de consultation    |      code médicament       | libelé du médicament");
        System.out.println("------------------------------------------------------------------------------");

        ArrayList<Consultation> medicamentConsultation = new ArrayList<>();
        for(Consultation c : consultations){
            if (c.getNumero_consulation() == 1001){
                medicamentConsultation.add(c);
            }
        }
//        for (Consultation c : medicamentConsultation){
//            System.out.println("Le médicament numéro: "+ medicaments_consul1 + "a été prescrit lors de la consultation numéro "
//            + c.getNumero_consulation());
//        }
        System.out.println("    " + consul1.getNumero_consulation() +"  ");
        medicaments_consul1.forEach((e) -> {
            System.out.println( "                               "+ e.getCode_medicament() +
                    "                         "+ e.getLibelle() );
        });

        System.out.println("");
        System.out.println("----------10°) Liste des médicaments prescrits par un médecin à un patient et à une date donnée ---");
        System.out.println("");
        System.out.println("   Nom du Patient    |      Nom du médecin     |   Date de consultation    | Medicements prescrits");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        ArrayList<Consultation> medoc_date = new ArrayList<>();

        for(Consultation c : consultations){
            if (c.getDate_consul() == "30-06-21" && c.getPatient() == p1){
                medoc_date.add(c);
            }
        }
        for (Consultation c : medoc_date){
            c.getMedicaments().forEach((e) -> {
                System.out.println("        "+ c.getPatient().getNom()+"    |  "+c.getMedecin().getNom()+"    |     "+ c.getDate_consul()+"           |       " +e.getCode_medicament());
            });
        }

        System.out.println("");
        System.out.println("----------11°) Liste des médicaments prescrits par un médecin à un patient-----");
        System.out.println("");
        System.out.println("   Nom du Patient    |      Nom du médecin        | Medicements prescrits");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        for(Consultation c : consultations){
            if (c.getPatient() == p2 && c.getMedecin() == m1){
                medoc_date.add(c);
            }
        }
        for (Consultation c : medoc_date){
            c.getMedicaments().forEach((e) -> {
                System.out.println("        "+ c.getPatient().getNom()+"    |  "+c.getMedecin().getNom()+"    |     "+"      |       " +e.getCode_medicament());
            });
        }

        System.out.println("");
        System.out.println("----------12°) Liste des médicaments prescrits par au moins un médecin-----");
        System.out.println("");
        System.out.println("       Nom du médecin        |  Medicements prescrits");
        System.out.println("--------------------------------------------------------------------------");

        ArrayList<Consultation> list_medoc = new ArrayList<>();
        for(Consultation c : consultations){
            for (Consultation c1 : consultations){
                if (c.getMedicaments() == c1.getMedicaments()){
                    list_medoc.add(c);
                }
            }
        }
        for (Consultation c : list_medoc){
            c.getMedicaments().forEach((e) -> {
                System.out.println("        "+ c.getMedecin().getNom()+"                  |  "+e.getCode_medicament());
            });
        }

        System.out.println("");
        System.out.println("----------13°) Nombre total de médicaments pour chaque consultation-----");
        System.out.println("");
        System.out.println("       Numéro de consulation     |  Nombre de médicaments");
        System.out.println("-------------------------------------------------------------------------------");

        /*
        1. Pour connaitre le nombre de médicaments que l'on a dans chaque consultation, on peut créer une
        variable de classe dans la classe Consultations qui sera initialée à 0 et qui sera incrémentée lorsqu'on va ajouter
        une nouvelle collection de médicaments dans notre consultation. On pourra utiliser un setter pour modifier la variable.

        */
    }



}
