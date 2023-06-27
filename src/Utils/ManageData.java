/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import classes.Cliente;
import classes.Filme;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author maxwell
 */
public class ManageData {

    /*
        Classe para facilitar o uso de arquivos
        e simular um banco de dados simples
    */

    
    public ManageData() {
    }

    public static void SaveClientes(ArrayList<Cliente> clientes) {
        ClearFile(Constants.CLIENTE_LIST_FILE_PATH);
        for (var c : clientes) {
            WriteData(Constants.CLIENTE_LIST_FILE_PATH,
                    c.toString(), true);
        }
    }

    public static void SaveFilmes(ArrayList<Filme> filmes) {
        ClearFile(Constants.FILMES_LIST_FILE_PATH);
        for (var f : filmes) {
            WriteData(Constants.FILMES_LIST_FILE_PATH,
                    f.toString(), true);
        }
    }

    public static ArrayList<Cliente> GetClientes() {
        var data = new ArrayList<Cliente>();

        try {
            File file = new File(Constants.CLIENTE_LIST_FILE_PATH);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {

                var info = line.split("\\$");

                var cliente = new Cliente(
                        Integer.parseInt(info[0]),
                        info[1],
                        info[2],
                        info[3],
                        info[4],
                        info[5],
                        Boolean.parseBoolean(info[6]),
                        Boolean.parseBoolean(info[7])
                );
                data.add(cliente);

            }
            br.close();
            fr.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return data;
    }

    public static ArrayList<Filme> GetFilmes() {
        var data = new ArrayList<Filme>();

        try {
            File file = new File(Constants.FILMES_LIST_FILE_PATH);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {

                var info = line.split("\\$");

                var filme = new Filme(
                        Integer.parseInt(info[0]),
                        info[1],
                        info[2],
                        info[3],
                        Integer.parseInt(info[4]),
                        Long.parseLong(info[5]),
                        Float.parseFloat(info[6]),
                        info[7]
                );

                data.add(filme);
            }

            br.close();
            fr.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return data;
    }

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

    public static void ClearFile(String filePath) {
        File file = new File(filePath);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, false);
            fr.write("");
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

}
