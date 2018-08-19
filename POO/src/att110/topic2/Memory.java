/**
 * Crie um programa que estoure a memória Heap do Java para que ocorra o erro :
 * java.lang.OutOfMemoryError: Java heap space
 */
package att110.topic2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Kelvin Vicente Costa
 * @ra 1110481713015
 */
public class Memory {

    int[] value = new int[1000000000];
    Memory next;

    public static void blowMemory() throws Exception {
        Memory blow = new Memory();
        Memory last = blow;

        while (true) {
            Memory temp = new Memory();
            blow.next = temp;
            last = temp;
            System.out.println(Runtime.getRuntime().freeMemory());
        }

    }
    
    public static void main(String[] args){
        try {
            blowMemory();
        } catch (Exception ex) {
            Logger.getLogger(Memory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
