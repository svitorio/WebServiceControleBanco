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

/**
 *
 * @author Aluno
 */
public class EventoDAO {
    /*
    public EventoDAO() {
    
    }
    public boolean inserir(Eventos evento)
    {
        String sql = "INSERT INTO evento(nome,data_do_evento,idusuario,descricao,tipo,destaque) VALUES(?,?,?,?,?,?)";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql,"myneevents4");
        try {
            pst.setString(1, evento.getNome());
            pst.setInt(2, evento.getData());
            pst.setInt(3, evento.getUsuario());
            pst.setString(4, evento.getDescricao());
            pst.setString(5, evento.getTipo());
            pst.setBoolean(6, evento.isDestaque());
            
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    }
     public List<Eventos> listar()
    {
         String sql = "SELECT * FROM evento";
        List<Eventos> retorno = new ArrayList<Eventos>();
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql,"aa");
        try {
           
            
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
                Eventos item = new Eventos();
                item.setNome(res.getString("nome"));
                item.setUsuario(res.getInt("idusuario"));
                item.setData(res.getInt("data_do_evento"));
                item.setDescricao(res.getString("descricao"));
                item.setTipo(res.getString("tipo"));
                item.setDestaque(res.getBoolean("destaque"));

                retorno.add(item);
            }
               
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
    
    
    }
    */
}
