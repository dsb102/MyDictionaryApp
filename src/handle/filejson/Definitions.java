package handle.filejson;

import java.util.ArrayList;
import java.util.List;


public class Definitions {
    private String definition = "";
    private String example = "";
    private List<String> synonyms = new ArrayList<>();
    private List<String> antonyms = new ArrayList<>();

    public Definitions(String definition, String example, List<String> synonyms, List<String> antonyms) {
        this.definition = definition;
        this.example = example;
        this.synonyms = synonyms;
        this.antonyms = antonyms;
    }

    public List<String> getSynonyms() {
        return synonyms;
    }
    public List<String> getAntonyms() {
        return antonyms;
    }
    public String getDefinition() {
        return definition;
    }
    public String getExample() {
        return example;
    }
}
