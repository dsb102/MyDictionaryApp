package handle.filejson;

/**
 *
 * @author Dũng Sobin
 */
public class Phonetics {
    private String text = "";
    private String audio = "";

    public Phonetics(String text, String audio) {
        this.text = text;
        this.audio = audio;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
}
