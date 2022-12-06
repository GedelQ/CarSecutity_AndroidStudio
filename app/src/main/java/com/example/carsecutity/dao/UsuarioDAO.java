package com.example.carsecutity.dao;

import com.example.carsecutity.Conexao;
import com.example.carsecutity.model.Usuario;

import java.sql.Connection;

public class UsuarioDAO {

    public Usuario selecionaUsuario(String usuario, String senha) {
        Connection conn = Conexao.conectar();

        return null;
    }
}
