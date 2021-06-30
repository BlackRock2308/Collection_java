package com.mbayecn.models;

import java.util.ArrayList;

public class Patient {
    private int numero_secu_soc;
    private String nom;
    private ArrayList<Consultation> consultations;

    public Patient(int numero_secu_soc, String nom, ArrayList<Consultation> consultations) {
        this.numero_secu_soc = numero_secu_soc;
        this.nom = nom;
        this.consultations = consultations;
    }



    public Patient(int numero_secu_soc, String nom) {
        this.numero_secu_soc = numero_secu_soc;
        this.nom = nom;
    }

    public int getNumero_secu_soc() {
        return numero_secu_soc;
    }

    public void setNumero_secu_soc(int numero_secu_soc) {
        this.numero_secu_soc = numero_secu_soc;
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

    public void setConsultations(ArrayList<Consultation> consultations) {
        this.consultations = consultations;
    }
}
