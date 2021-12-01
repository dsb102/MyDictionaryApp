package dictionaryVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;



public class Dictionary {
    public Map<String, String> Dic = new HashMap<>();

    public Dictionary() {}
    
    public void addWord(String word, String means) {Dic.put(word, means);}
    
    public String searchWord(String word) {return Dic.get(word);}
    
    public boolean containWord(String word) {return Dic.containsKey(word.toLowerCase());}
    
    public void modifyWord(String word, String means) {Dic.replace(word, means);}
    
    public void deleteWord(String word) {Dic.remove(word);}
    
    public void loadWordFromFile() throws FileNotFoundException {
        Scanner in = new Scanner(new File("vietanhtest.txt"));
        String tmp = in.nextLine();
        while (in.hasNextLine()) {
            String word = tmp.trim();
            if (word.charAt(0) == '@') word = word.substring(1);
            String meaning = "";
            while (in.hasNextLine()) {
                tmp = in.nextLine();
                if (tmp.contains("@")) {
                    Dic.put(word, meaning);
                    break;
                }
                meaning += tmp + '\n';
            }
        }
    }
    
    public List<String> findWordContain(String word) {
        word = word.toLowerCase();
        List<String> list = new ArrayList<>();
        int cnt = 0; // số từ gợi ý
        for (String string : Dic.keySet()) {
            if (string.contains(word)) {
                list.add(string);
                if (cnt++ > 100) break; // giới hạn từ gợi ý
            }
        }
        return list;
    }
    
    public void importWordFromDicToFile() throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new File("vietanhtest.txt"));
        String line = "";
        for (String str : Dic.keySet()) {
            line = "@" + str + "\n" + Dic.get(str);
            out.println(line);
        }
        out.close();
    }
    
}
