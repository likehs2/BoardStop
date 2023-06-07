/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import sun.misc.BASE64Encoder;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

/**
 *
 * @author Lucas Moraes Camacho
 */
public class AtualizaSistema {
    
    public void baixar() throws IOException{
        //URL url = new URL("https://www.cds-software.com.br/img/home/casosdesucesso/logo-promotos.png");
        URL url = new URL("ftp://192.168.181.172/Versao.txt");
        File file = new File("E:\\Sistemas\\update\\Versao.txt");

        InputStream is = url.openStream();
        FileOutputStream fos = new FileOutputStream(file);

        int bytes = 0;

        while ((bytes = is.read()) != -1) {
            fos.write(bytes);
        }

        is.close();

        fos.close();
    }
    
    public void data(){
        File arquivo = new File("G:\\PROJETOS\\BoardStop\\dist\\BoardStop.jar");
        DateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");   
        String dataExecutavel = formatData.format(new Date(arquivo.lastModified()));
        System.out.println("O valor é "+dataExecutavel);
        
    }
           
    public void lerTxt(){
        try{
			
			String nome;
			//nome = JOptionPane.showInputDialog(null,"Entre com o nome do arquivo");
                        //nome ="E:\\Sistemas\\Versao.txt";
                        //nome = "https://dc547.4shared.com/download/fVUPqSD9iq/Versao.txt?tsid=20191221-132948-529bb47d&sbsr=f00b2312bb7fa9a8b03172c75bd3f47ca2f&bip=MTc3LjEwNS4xNjkuMjA1&lgfp=30";
			nome ="ftp://192.168.181.172/Versao.txt";
                        
			BufferedReader br = new BufferedReader(new FileReader(nome));
			while(br.ready()){
				String linha = br.readLine();
				System.out.println(linha);
			}
			br.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
    }
    
    
    public void teste2()  {
        String usuario="administrator";
        String senha = "Jesus2025";
        
        try {
            FTPClient f = new FTPClient();
            f.connect("192.168.181.172");
            boolean login = f.login(usuario, senha);
            
            //f.login(usuario, senha); 
        } catch (IOException ex) {
            Logger.getLogger(AtualizaSistema.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //FTPFile[] files = f.listFiles("dll");
    }
    
    
    
    
    
    
    
    
    
    
    
    public void dataFtp(){
        File arquivo = new File("https://dc560.4shared.com/download/PAwPhvzlea/BoardStop.jar?tsid=20191215-222358-6d0d04c&sbsr=cd999aaa6d6fa1a1cc851d9586983e1ca2e&bip=MTc3LjEwNS4xNjkuMjA1&lgfp=30");
        DateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");   
        String dataFtp = formatData.format(new Date(arquivo.lastModified()));
        System.out.println("O valor é "+dataFtp);
        
    }
    
    public void testeo(){
        File arquivo = new File("G:\\PROJETOS\\BoardStop\\dist\\BoardStop.jar");
        DateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");   
        String dataExecutavel = formatData.format(new Date(arquivo.lastModified()));
        System.out.println("A data do executavel é "+dataExecutavel);
        
        File arquivo2 = new File("https://dc560.4shared.com/download/PAwPhvzlea/BoardStop.jar?tsid=20191215-222358-6d0d04c&sbsr=cd999aaa6d6fa1a1cc851d9586983e1ca2e&bip=MTc3LjEwNS4xNjkuMjA1&lgfp=30");
        DateFormat formatData2 = new SimpleDateFormat("dd/MM/yyyy");   
        String dataFtp = formatData2.format(new Date(arquivo2.lastModified()));
        System.out.println("A da ftp é "+dataFtp);
        
        try{            
                        
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date1 = sdf.parse(dataExecutavel);
            Date date2 = sdf.parse(dataFtp);

            System.out.println(sdf.format(date1));
            System.out.println(sdf.format(date2));
        	
            if(date1.compareTo(date2)>0){
        	System.out.println("Date1 is after Date2");
                JOptionPane.showMessageDialog(null, "Date1 ainda vai acontecer Date2");
            }
            
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        
    }
    
    
    
    
}
