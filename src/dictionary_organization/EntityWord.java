/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary_organization;

import java.util.StringTokenizer;

/**
 *
 * @author Dũng Sobin
 */
public class EntityWord {
    private String word;
    private String phonetic;
    private String means;

    public EntityWord() {
    }

    public EntityWord(String word, String phonetic, String means) {
        this.word = word;
        this.phonetic = phonetic;
        this.means = means;
    }

    public String getWord() {
        return word;
    }

    public String getPhonetic() {
        return phonetic;
    }

    public String getMeans() {
        return means;
    }

    @Override
    public String toString() {
        String str = "\tWord: " + word + "\n\tPhonetic: " + phonetic;
        for (int i = 0; i < means.length(); i++) {
            char c = means.charAt(i);
            if (isDelimiter(c))
                str += "\n\t" + c;
            else 
                str += c;
                
        }
        return str;
    }
    private boolean isDelimiter(char c) {
        return c == '*' || c == '-' || c == '=' || c == '\n' || c == '+' || c == '!';
    }
    
    
    
    
    
}
