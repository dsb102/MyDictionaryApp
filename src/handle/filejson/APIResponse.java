
package handle.filejson;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dũng Sobin
 */
public class APIResponse {
    private String word = "";
    private String phonetic = "";
    private String origin = "";
    private List<Phonetics> phonetics = new ArrayList<>();
    private List<Meanings> meanings = new ArrayList<>();

    public APIResponse() {
    }
  
    
    public APIResponse(String word, String phonetic, String origin, List<Phonetics> phonetics, List<Meanings> meanings) {
        this.word = word;
        this.phonetic = phonetic;
        this.origin = origin;
        this.phonetic = phonetic;
        this.meanings = meanings;
    }

    public String getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<Phonetics> getPhonetics() {
        return phonetics;
    }

    public void setPhonetics(List<Phonetics> phonetics) {
        this.phonetics = phonetics;
    }

    public List<Meanings> getMeanings() {
        return meanings;
    }

    public void setMeanings(List<Meanings> meanings) {
        this.meanings = meanings;
    }
    
    private String formatMeanings() {
        String m = "";
        if (meanings != null) {
            for (Meanings meaning : meanings) {
                m += "\n            -Part Of Speech: " + meaning.getPartOfSpeech();

                for (Definitions definition : meaning.getDefinitions()) {
                    m += (definition.getDefinition().equals("") ? "":"\n            -Definition: " + definition.getDefinition());
                    m += (definition.getExample().equals("") ? "" : "\n            -Example: " + definition.getExample());
                    m += (definition.getSynonyms().isEmpty() ? "" : "\n            -Synonyms: ");
                    for (String synonym : definition.getSynonyms()) {
                        m += "\n                   " + synonym;
                    }
                    if (!definition.getSynonyms().isEmpty())
                        m.substring(0, m.length() - 2);
                    m += (definition.getAntonyms().isEmpty() ? "" : "\n            -Antonyms: ");
                    for (String antonym : definition.getAntonyms()) {
                        m += "\n                   " + antonym;
                    }
                    m += "\n";
                }
            }
        }
        return m;
    }

    @Override
    public String toString() {
        return "***\n    *Word: " + word 
                + "\n    *Phonetic: " + phonetic 
                + "\n    *Origin: " + origin
                + "\n    *Meanings: " + formatMeanings() +  "\n";
    }
    
    
    
}
