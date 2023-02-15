
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Mari (48) 99618-5728
 */
public class Aula5HashMapDominio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String,Double> alunosMedia = new HashMap<String,Double>();
        alunosMedia.put("Rafael", new Double(7.5));
        alunosMedia.put("Joao", new Double (8.5));
        alunosMedia.put("Maria", new Double (5.0));
        System.out.println("Media: "+alunosMedia.get("Maria"));
        
    }
    
}
