/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Utils;

/**
 *
 * @author maxwell
 */
public class Constants {
    
    /*
    Classe para guardar as constantes do programa
    */
    
    private Constants() {} // não quero que instanciem essa classe
    
    public static final String CLIENTE_LIST_FILE_PATH = "src/database/Clientes.txt";
    
    public static final String FILMES_LIST_FILE_PATH = "src/database/Filmes.txt";
    
    public static final String CURRENT_USER_FILE_PATH = "src/database/CurrentUser.txt";
    
    public static final String REGEX_CPF = "[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}";
    
    public static final String REGEX_EMAIL = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#"
            + "$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
    
    public static final String REGEX_DATE = "^(0[1-9]|[12][0-9]|[3][01])/(0[1-9]|1[012])/\\d{4}$";
    
    public static final float TICKET_PRICE = 30.0f; 
    
    
}
