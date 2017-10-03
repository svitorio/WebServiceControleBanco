/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jogada;
import modelo.Jogo;

/**
 *
 * @author Aluno
 */
public class JogoDAO {
     
     public JogoDAO()
    {
    }
    
    public int inserir(Jogo jogo)
    {
        String sql = "INSERT INTO jogo(nome_criador,nome_participante) VALUES(?,?)";
        int retorno = -1;
        PreparedStatement pst = ConexaoJogo.getPreparedStatement(sql);
        try {
            pst.setString(1, jogo.getNomecriador());
            pst.setString(2, "null");
            if(pst.executeUpdate()>0)
            {
                //retorno = true;
            }
             ResultSet resultSet = pst.executeQuery("SELECT LAST_INSERT_ID()");
            if (resultSet.next()) {
                retorno = resultSet.getInt("LAST_INSERT_ID()");
            }
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
           // retorno = false;
        }
        
        return retorno;
    }

    public Boolean update(String nome, int id_jogo) {
        String sql = "UPDATE jogo set nome_participante=? where id_jogo=?";
        Boolean retorno = false;
        PreparedStatement pst = ConexaoJogo.getPreparedStatement(sql);
        try {
          
            pst.setString(1, nome);
            pst.setInt(2, id_jogo);
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    }
     public Boolean updatevencedor(String nome, int id_jogo) {
        String sql = "UPDATE jogo set nome_vencedor=? where id_jogo=?";
        Boolean retorno = false;
        PreparedStatement pst = ConexaoJogo.getPreparedStatement(sql);
        try {
          
            pst.setString(1, nome);
            pst.setInt(2, id_jogo);
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    }

    public List<Jogo> listarjogo(int id_jogo) {
        String sql = "SELECT * FROM jogo WHERE id_jogo=?";
        List<Jogo> retorno = new ArrayList<Jogo>();
        
        PreparedStatement pst = ConexaoJogo.getPreparedStatement(sql);
        try {
           
            pst.setInt(1,id_jogo);
            ResultSet res = pst.executeQuery();
            
            while(res.next()) {
                Jogo item = new Jogo();
                item.setId_jogo(res.getInt("id_jogo"));
                item.setNomecriador(res.getString("nome_criador"));
                item.setNomeparticipante(res.getString("nome_participante"));
                item.setVencedor(res.getString("nome_vencedor"));
                retorno.add(item);
            }
                   
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
    }
}
