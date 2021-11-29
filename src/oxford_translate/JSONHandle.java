package oxford_translate;

import handle.filejson.APIResponse;
import handle.filejson.Definitions;
import handle.filejson.Meanings;
import handle.filejson.Phonetics;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

class JSONHandle {

    public List<APIResponse> handleData(String data) {
        try {
            // array là JSONArray trả về
            JSONArray array = new JSONArray(data);
            List<APIResponse> apiResponses = new ArrayList<>();
            for (int j = 0; j < array.length(); j++) {
                List<Meanings> meanings = new ArrayList<>();
                List<Phonetics> phonetics = new ArrayList<>();
                APIResponse apiRepsponse = new APIResponse();
                JSONObject json = array.getJSONObject(j);
                String word = "";
                // get Word
                if (json.has("word")) {
                    word = json.getString("word");
                }
                // get Phonetic
                String phonetic = "";
                if (json.has("phonetic")) {
                    phonetic = json.getString("phonetic");
                }
                // set Word and Phonetic
                apiRepsponse.setWord(word);
                apiRepsponse.setPhonetic(phonetic);
                // get Phonetics
                if (json.has("phonetics")) {
                    JSONArray arrPhonetics = json.getJSONArray("phonetics");
                    for (Object arrPhonetic : arrPhonetics) {
                        String text = "";
                        if (((JSONObject) arrPhonetic).has("text")) {
                            text = ((JSONObject) arrPhonetic).getString("text");
                        }

                        String audio = "";
                        if (((JSONObject) arrPhonetic).has("audio")) {
                            audio = ((JSONObject) arrPhonetic).getString("audio");
                        }
                        phonetics.add(new Phonetics(text, audio));
                    }
                }
                // set Phonetics
                apiRepsponse.setPhonetics(phonetics);
                String origin = "";
                // get origin
                if (json.has("origin")) {
                    origin = json.getString("origin");
                }
                // set origin
                apiRepsponse.setOrigin(origin);
                // get info meanings
                if (json.has("meanings")) {

                    JSONArray arrMeanings = json.getJSONArray("meanings");
                    for (Object arrMeaning : arrMeanings) {
                        JSONObject objMeanings = (JSONObject) arrMeaning;
                        String partOfSpeech = "";
                        if (objMeanings.has("partOfSpeech")) {
                            partOfSpeech = objMeanings.getString("partOfSpeech");
                        }
                        List<Definitions> definitions = new ArrayList<>();
                        if (objMeanings.has("definitions")) {
                            JSONArray arrDefinitions = objMeanings.getJSONArray("definitions");
                            for (Object arrDefinition : arrDefinitions) {
                                JSONObject objDefinitions = (JSONObject) arrDefinition;

                                List<String> synonyms = new ArrayList<>();
                                if (objDefinitions.has("synonyms")) {
                                    JSONArray arrSynonyms = objDefinitions.getJSONArray("synonyms");
                                    for (int k = 0; k < arrSynonyms.length(); k++) {
                                        synonyms.add(arrSynonyms.getString(k));
                                    }
                                }

                                List<String> antonyms = new ArrayList<>();
                                if (objDefinitions.has("antonyms")) {
                                    JSONArray arrAntonyms = objDefinitions.getJSONArray("antonyms");
                                    for (int k = 0; k < arrAntonyms.length(); k++) {
                                        antonyms.add(arrAntonyms.getString(k));
                                    }
                                }
                                String example = "";
                                if (objDefinitions.has("example")) {
                                    example = objDefinitions.getString("example");
                                }
                                String definition = "";
                                if (objDefinitions.has("definition")) {
                                    definition = objDefinitions.getString("definition");
                                }
                                definitions.add(new Definitions(definition, example, synonyms, antonyms));
                            }
                        }
                        meanings.add(new Meanings(partOfSpeech, definitions));
                    }
                    apiRepsponse.setMeanings(meanings);
                }
                apiResponses.add(apiRepsponse);
            }
            return apiResponses;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
