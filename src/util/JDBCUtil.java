/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * A simple data source for getting database connections.
 */
public class JDBCUtil {

    private static String url;
    private static String username;
    private static String password;
    private static String driver;
    private static final String path = System.getProperty("user.dir");
    private static final File config_file = new File(path, "configuracaobd.properties");

    /**
     * Initializes the data source.
     *
     * @param fileName the name of the property file that contains the database
     * driver, URL, username, and password
     */
    public static void init(File fileName) {
       try {
            Properties props = new Properties();
            FileInputStream in = new FileInputStream(fileName);
            props.load(in);
            driver = props.getProperty("jdbc.driver");
            url = props.getProperty("jdbc.url");
            username = props.getProperty("jdbc.username");
            if (username == null) {
                username = "";
            }
            password = props.getProperty("jdbc.password");
            if (password == null) {
                password = "";
            }
            if (driver != null) {
                Class.forName(driver);
            }
        } catch (ClassNotFoundException | IOException erro) {
            System.out.println("Erro ao criar conexao com BD. " + erro);
        }
    }

    /**
     * Initializes the data source.
     *
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void init() {
        try {
            Properties props = new Properties();
            FileInputStream in = new FileInputStream(config_file);
            props.load(in);
            driver = props.getProperty("jdbc.driver");
            url = props.getProperty("jdbc.url");
            username = props.getProperty("jdbc.username");
            if (username == null) {
                username = "";
            }
            password = props.getProperty("jdbc.password");
            if (password == null) {
                password = "";
            }
            if (driver != null) {
                Class.forName(driver);
            }
        } catch (ClassNotFoundException | IOException erro) {
            System.out.println("Erro ao criar conexao com BD. " + erro);
        }
    }

    /**
     * Gets a connection to the database.
     *
     * @return the database connection
     */
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException erro) {
            System.out.println("Erro ao criar conexao com BD. " + erro);
            return null;
        }
    }

    public static boolean MovProximo(ResultSet rsdados) {
        try {
            if (rsdados != null) {
                if (!rsdados.isLast()) {
                    rsdados.next();
                    return true;
                }
            }
        } catch (SQLException erro) {
            System.out.println(erro);
            return false;
        }
        return false;
    }

    public static boolean MovAnterior(ResultSet rsdados) {
        try {
            if (rsdados != null) {
                if (!rsdados.isFirst()) {
                    rsdados.previous();
                    return true;
                }
            }
        } catch (SQLException erro) {
            System.out.println(erro);
            return false;
        }
        return false;
    }

    public static boolean MovUltimo(ResultSet rsdados) {
        try {
            if (rsdados != null) {
                if (!rsdados.isLast()) {
                    rsdados.last();
                    return true;
                }
            }
        } catch (SQLException erro) {
            System.out.println(erro);
            return false;
        }
        return false;
    }

    public static boolean MovPrimeiro(ResultSet rsdados) {
        try {
            if (rsdados != null) {
                if (!rsdados.isFirst()) {
                    rsdados.first();
                    return true;
                }
            }
        } catch (SQLException erro) {
            System.out.println(erro);
            return false;
        }
        return false;
    }
}