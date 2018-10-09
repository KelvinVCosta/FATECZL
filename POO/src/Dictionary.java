
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author 670543
 */
public class Dictionary {
    HashMap<String, String> dicionario = new HashMap<>();
    
    public void insertWord(String chave, String definicao){
        dicionario.put(chave, definicao);
    }
    
    public String returnWord(String chave){
        return dicionario.get(chave);
    }
    
    public void searcher(){
        Scanner scan = new Scanner(System.in);
        String chave = scan.next();
        String response = returnWord(chave);
        if (response.isEmpty() || null == response){
            System.out.println("Insira uma definição para a chave " + chave + " :");
            String value = scan.next();
            insertWord(chave, value);
        } else {
            System.out.println(response);
        }
    }

}
