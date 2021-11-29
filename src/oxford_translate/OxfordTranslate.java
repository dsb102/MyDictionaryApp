package oxford_translate;

import handle.filejson.APIResponse;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;

public class OxfordTranslate {
    final static String urlString = "https://api.dictionaryapi.dev/api/v2/entries/";
    public static List<APIResponse> getInfoWord(String wordSearch) {
        StringBuilder data = new StringBuilder("");
        try {
            String language = "en";

            URL url = new URL(urlString + language + "/" + wordSearch.trim().toLowerCase());

            HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();

            if (urlConnection.getResponseCode() == 200) {
                InputStream is = urlConnection.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));

                String line = "";
                line = br.readLine();
                while (line != null) {
                    data.append(line);
                    line = br.readLine();
                }
                
                br.close();

                JSONHandle jsonHandle = new JSONHandle();
                List<APIResponse> apiResponses = jsonHandle.handleData(data.toString());
                return apiResponses;

            } else {
                System.out.println("Internet Connection error");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getInfoWord("word"));
    }
}
