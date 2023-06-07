package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConectaBanco {

    public Statement stm;
    public ResultSet rs;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String caminhojdbc1 = "jdbc:mysql://";
    private String caminhojdbc2 = ":3306/";
    private String servidormysql = "localhost";
    private String bancodadosmysql = "boardstop";
    private String usuariomysql = "root";
    private String senhamysql = "jogodeahri123";
    public Connection conn;
    private String nomeCaminhoFinal;

    public void conexao() {
        System.out.println("servidormysql --> " + servidormysql);
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(caminhojdbc1 + servidormysql + caminhojdbc2 + bancodadosmysql, usuariomysql, senhamysql);
            System.out.println("Conectado");
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!\n Erro:" + ex.getMessage());
        }

    }

    public void executaSQL(String sql) {
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de ExecutaSQL!\n Erro:" + ex.getMessage());
        }

    }

    public void desconecta() {
        try {
            conn.close();
            //JOptionPane.showMessageDialog(null,"Desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão!\n Erro:" + ex.getMessage());
        }
    }
}
