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
public class Jogada {
    
    int id_jogada;
    int id_jogo;
    int posicao;
    String entrada;
    boolean vez;

    public int getId_jogo() {
        return id_jogo;
    }

    public void setId_jogo(int id_jogo) {
        this.id_jogo = id_jogo;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public boolean isVez() {
        return vez;
    }

    public void setVez(boolean vez) {
        this.vez = vez;
    }
    
    public int getId_jogada() {
        return id_jogada;
    }

    public void setId_jogada(int id_jogada) {
        this.id_jogada = id_jogada;
    }
    
}
