package exercicio1;
import java.util.ArrayList;

/**
 *
 * @author charllistonadrianni
 */
public class Exercicio1 {


    public static void main(String[] args) {
      
       int multiplica = 0;
       int [] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
       ArrayList alterados = new ArrayList();

       for (int i=0; i < 20; i++) {
           if ((lista[i] % 2 == 0) || (lista[i] % 5 == 0)) {
           multiplica = lista[i] * 2;
           alterados.add(multiplica);
           }
       }
       while(!alterados.isEmpty()){
            System.out.print(alterados.remove(0) + " ");
        } 
    }   
}