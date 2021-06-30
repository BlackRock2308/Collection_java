package com.mbayecn.models;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public class Consultation {
    private int numero_consulation;
    private String date_consul;
    private ArrayList<Medicament> medicaments;
    private Medecin medecin;
    private Patient patient;

    public Consultation(int numero_consulation, String date_consul, ArrayList<Medicament> medicaments, Medecin medecin, Patient patient) {
        this.numero_consulation = numero_consulation;
        this.date_consul = date_consul;
        this.medicaments = medicaments;
        this.medecin = medecin;
        this.patient = patient;
    }

    public Consultation(int numero_consulation, String date_consul, Medecin medecin, Patient patient) {
        this.numero_consulation = numero_consulation;
        this.date_consul = date_consul;
        this.medecin = medecin;
        this.patient = patient;
    }

    public int getNumero_consulation() {
        return numero_consulation;
    }

    public void setNumero_consulation(int numero_consulation) {
        this.numero_consulation = numero_consulation;
    }

    public String getDate_consul() {
        return date_consul;
    }

    public void setDate_consul(String date_consul) {
        this.date_consul = date_consul;
    }

    public ArrayList<Medicament> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(ArrayList<Medicament> medicaments) {
        this.medicaments = medicaments;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}

