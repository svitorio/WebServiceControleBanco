/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Aluno
 */
public class Jogo {
    int id_jogo;
    String nomecriador;
    String nomeparticipante;
    String vencedor;

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

    public String getNomecriador() {
        return nomecriador;
    }

    public void setNomecriador(String nomecriador) {
        this.nomecriador = nomecriador;
    }

    public String getNomeparticipante() {
        return nomeparticipante;
    }

    public void setNomeparticipante(String nomeparticipante) {
        this.nomeparticipante = nomeparticipante;
    }
    public int getId_jogo() {
        return id_jogo;
    }

    public void setId_jogo(int id_jogo) {
        this.id_jogo = id_jogo;
    }
}
