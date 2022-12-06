package com.example.carsecutity;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    //Metdodo de conexão

    public static Connection conectar() {
        // Objeto de conexão
        Connection conn = null;
        try {
        // adicionar política para criação de thread
            StrictMode.ThreadPolicy politica;
            politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        // Verificar se Driver de Conexão esta importado
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        // Configurar conexão
         conn = DriverManager.getConnection("jdbc:sqlserver://carsecurity.database.windows.net:1433;database=carsecurity;" +
                 "user=CloudSA4ee8f67d@carsecurity;password=Del!2298;" +
                 "encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        }catch (SQLException e){
            e.getMessage();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
