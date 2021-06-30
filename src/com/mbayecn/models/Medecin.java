package com.mbayecn.models;


import java.util.ArrayList;

public class Medecin {

    private int matricule;
    private String nom;
    private ArrayList<Consultation> consultations;

    public Medecin(int matricule, String nom, ArrayList<Consultation> consultations) {
        this.matricule = matricule;
        this.nom = nom;
        this.consultations = consultations;
    }

    public Medecin(int matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Consultation> getConsultations() {
        return consultations;
    }

    public void addConsultation(Consultation consultation) {
        this.consultations.add(consultation);
    }
}
