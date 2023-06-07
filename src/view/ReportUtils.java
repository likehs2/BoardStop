/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author lucas
 */
public class ReportUtils {
     public Statement stm;
    public ResultSet rs;
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String caminhojdbc1 = "jdbc:mysql://";
    private static String caminhojdbc2 = ":3306/";
    private static String servidormysql = "localhost";
    private static String bancodadosmysql = "boardstop";
    private static String usuariomysql = "root";
    private static String senhamysql = "jogodeahri123";
    public  static Connection conn;
    private static String nomeCaminhoFinal;
     public static void openReport(
        String titulo,
        InputStream inputStream,
        Map parametros,
        Connection conexao ) throws JRException{
        
        JasperPrint print = JasperFillManager.fillReport(
                inputStream, parametros, conexao);
        
        viewReportFrame(titulo, print);
    }
    
    public static void openReport(
            String titulo,
            InputStream inputStream,
            Map parametros,
            JRDataSource dataSource) throws JRException{
        
        JasperPrint print = JasperFillManager.fillReport(
                inputStream, parametros, dataSource);
        
        viewReportFrame(titulo, print);
    }
    
    private static void viewReportFrame(String titulo, JasperPrint print){
        
        JRViewer viewer = new JRViewer (print);
        
        JFrame frameRelatorio = new JFrame (titulo);
        
        frameRelatorio.add(viewer, BorderLayout.CENTER);
        
        frameRelatorio.setSize(500,500);
        
        frameRelatorio.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        frameRelatorio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        frameRelatorio.setVisible(true);
    }
        public static void conexao() {
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
