/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcolatricetest;

/**
 *
 * @author Studente
 */
public class Utente 
{
    private String nome;
    private int eta;

    public Utente(String nome, int eta) {
        this.nome = nome;
        setEta(eta);
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
        if (this.eta<0)
            this.eta=0;
    }

    @Override
    public String toString() {
        return "Utente{" + "nome=" + nome + ", eta=" + eta + '}';
    }
    
    
}
