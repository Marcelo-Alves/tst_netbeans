import java.util.ArrayList;
import java.util.List;

public class MeuNote{  
      
     public static void main(String[] args){
      List<String> nomes = new ArrayList<>();
      nomes.add("Marcelo");
      nomes.add("Rosana");
      nomes.add("Fabio");
      nomes.add("Michelle");
      for (String nome : nomes) {
        System.out.println(nome);
      }
    }
}