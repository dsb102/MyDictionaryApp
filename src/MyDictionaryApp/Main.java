package MyDictionaryApp;

import java.io.FileNotFoundException;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        MenuTab appDictionary = new MenuTab();
        appDictionary.setVisible(true);
        appDictionary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
