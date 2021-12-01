package dictionary_organization;


public class EntityWord {
    private String word;
    private String phonetic;
    private String means;

    public EntityWord() {}

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

    private boolean isDelimiter(char c) {
        return c == '*' || c == '-' || c == '=' || c == '\n' || c == '+' || c == '!';
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
}
