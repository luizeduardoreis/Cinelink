/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author maxwell
 */
public class ManageData {
    
    public ManageData() {}
    
    public static void WriteData(String filePath, String data, boolean append) {
        File file = new File(filePath);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, append);
            fr.write(data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static String FindCliente(String cpf, String senha) {
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(
                Constants.CLIENTE_LIST_FILE_PATH));
        } catch(IOException e) {
            e.printStackTrace();
        }
        
        String selectedClienteAsString = null;
        try {
            String line = reader.readLine();
            while (line != null) {
                String[] data = line.split("\\s+");
                if(data[2].equals(cpf) && data[4].equals(senha)) {
                    selectedClienteAsString = line;
                }
                line = reader.readLine();
            }
            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
        
        return selectedClienteAsString;
    }
    
    public static void SetCurrentUser(String ClienteAsString) {
        WriteData(Constants.CURRENT_USER_FILE_PATH, ClienteAsString, false);
    }
    
}
