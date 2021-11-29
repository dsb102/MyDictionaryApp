
package dictionaryVA;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Dictionary dic = new Dictionary();
        dic.loadWordFromFile();
        
        System.out.println(dic.searchWord("ngu"));
    
    }
}
