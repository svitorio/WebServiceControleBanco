/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jogada;

/**
 *
 * @author Aluno
 */
public class JogadaDAO {

    public JogadaDAO(){}
    public boolean inserir(Jogada jogada)
    {
        String sql = "INSERT INTO jogada(entrada,posicao,jogador,id_jogo) VALUES(?,?,?,?)";
        //String retorno = false;
        PreparedStatement pst = ConexaoJogo.getPreparedStatement(sql);
        //int novoId=-1;
        
        try {
            
            pst.setString(1, jogada.getEntrada());
            pst.setInt(2, jogada.getPosicao());
            pst.setBoolean(3, jogada.isVez());
            pst.setInt(4, jogada.getId_jogo());
           
            if(pst.executeUpdate()>0)
            {
                return true;
            }
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        return false;
    }

    public List<Jogada> listarjogada(int id_jogo) {
         String sql = "SELECT * FROM jogada WHERE id_jogo=?";
        List<Jogada> retorno = new ArrayList<Jogada>();
        
        PreparedStatement pst = ConexaoJogo.getPreparedStatement(sql);
        try {
           
            pst.setInt(1,id_jogo);
            ResultSet res = pst.executeQuery();
            
            while(res.next()) {
                Jogada item = new Jogada();
                item.setEntrada(res.getString("entrada"));
                item.setId_jogada(res.getInt("id_jogada"));
                item.setId_jogo(res.getInt("id_jogo"));
                item.setPosicao(res.getInt("posicao"));
                item.setVez(res.getBoolean("jogador"));
                retorno.add(item);
            }
                   
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
    }
}
