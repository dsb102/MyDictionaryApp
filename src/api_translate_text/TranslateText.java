package api_translate_text;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;

public class TranslateText {

//    String urlStr = "https://script.google.com/macros/s/AKfycbyR6dtFPbyWkRagdT1yn0HIoHdwGp6V3zUWsPwQwxM3xiN1sNdf-0kR-5xOGfj5xWbFoQ/exec";
    String urlStr = "https://script.google.com/macros/s/AKfycbyyKjByiI3ti-cPhcyxCmFEs_-GDkvbd-M_V0t1tnb0qcD4-A3M8Lqvebe6bcrm3Vt5/exec";
    public String translate(String text, Languages langto, Languages langfrom) throws MalformedURLException, UnsupportedEncodingException {
            APIConnector api = new APIConnector(urlStr);
            String query = getQuery(text, langto, langfrom);
            return (String) api.getJSONObject(query).get("text");
    }

    public String getQuery(String text, Languages langto, Languages langfrom ) throws UnsupportedEncodingException {
            String query  = "?q=" + URLEncoder.encode(text, "UTF-8")
                + "&target=" + langto.getCode()
                + "&source=" + langfrom.getCode();
            return query;
    }
}

class Main {
    public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException {
        TranslateText tmp = new TranslateText();
        System.out.println(tmp.translate("Em yêu tôi không?", Languages.English, Languages.Vietnamese));
    }
}
