
package api_translate_text;

import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class TranslateTextLimit {
    // TODO: If you have your own Premium account credentials, put them down here:
  private static final String CLIENT_ID = "FREE_TRIAL_ACCOUNT";
  private static final String CLIENT_SECRET = "PUBLIC_SECRET";
  private static final String ENDPOINT = "http://api.whatsmate.net/v1/translation/translate";

  public static void main(String[] args) throws Exception {
    // TODO: Specify your translation requirements here:
    String fromLang = "en";
    String toLang = "vi";
    String text = "   Let's   have some fun!   You are so beautiful???????       ";

    TranslateTextLimit.translate(fromLang, toLang, text);
  }

  /**
   * Sends out a WhatsApp message via WhatsMate WA Gateway.
   */
  public static void translate(String fromLanguage, String toLanguage, String text) throws Exception {
    // TODO: Should have used a 3rd party library to make a JSON string from an object
//    String jsonPayload = new StringBuilder().append("{").append("\"fromLang\":\"").append(fromLanguage).append("\",")
//      .append("\"toLang\":\"").append(toLanguage).append("\",").append("\"text\":\"").append(text)
//      .append("\"").append("}").toString();
    String jsonPayload = "{\"fromLang\":\"" + fromLanguage + "\",\"toLang\":\"" + toLanguage + "\",\"text\":\""
        + text + "\"}";
    URL url = new URL(ENDPOINT);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setDoOutput(true);
    conn.setRequestMethod("POST");
    conn.setRequestProperty("X-WM-CLIENT-ID", CLIENT_ID);
    conn.setRequestProperty("X-WM-CLIENT-SECRET", CLIENT_SECRET);
    conn.setRequestProperty("Content-Type", "application/json");
    // ghi vào file
    OutputStream os = conn.getOutputStream();
    os.write(jsonPayload.getBytes());
    os.flush();
    os.close();

    int statusCode = conn.getResponseCode();
    BufferedReader br = new BufferedReader(
            new InputStreamReader(
        (statusCode == 200) ? conn.getInputStream() : conn.getErrorStream()
      ));
    String output;
    while ((output = br.readLine()) != null) {
        System.out.println(output);
    }
    conn.disconnect();
  }
}
