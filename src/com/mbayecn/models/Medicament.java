package com.mbayecn.models;

import java.util.ArrayList;

public class Medicament {
    private String code_medicament;
    private String libelle;
    private ArrayList<Consultation> consultations;

    public Medicament(String code_medicament, String libelle, ArrayList<Consultation> consultations) {
        this.code_medicament = code_medicament;
        this.libelle = libelle;
        this.consultations = consultations;
    }
    public Medicament(String code_medicament, String libelle) {
        this.code_medicament = code_medicament;
        this.libelle = libelle;

    }

    public String getCode_medicament() {
        return code_medicament;
    }

    public void setCode_medicament(String code_medicament) {
        this.code_medicament = code_medicament;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public ArrayList<Consultation> getConsultations() {
        return consultations;
    }

    public void addConsultation(Consultation consultation){
        this.consultations.add(consultation);
    }
}
