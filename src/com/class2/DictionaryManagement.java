package com.class2;

import java.util.HashMap;

public class DictionaryManagement {
    HashMap<String,Dictionary> mapDictionary;
    DictionaryManagement() {
        mapDictionary= new HashMap<>();
    }
    DictionaryManagement(HashMap<String, Dictionary> map) {
        this.mapDictionary=map;
    }
    public boolean addWord(Dictionary dictionary) throws Exception {
        if (mapDictionary == null)
            throw new Exception("Database doesn't exist");
        if (dictionary == null)
            throw new Exception("Data doesn't exist");
        if (mapDictionary.containsKey(dictionary.getWord()))
            throw new Exception("Word  " + dictionary.getWord()
                    + " is duplicate");
       mapDictionary.put(dictionary.getWord(), dictionary);
        return true;
    }
    public HashMap<String, Dictionary> searchWord(String input) throws Exception {
        if (mapDictionary == null) {
            throw new Exception("Database doesn't exist");
        }
        HashMap<String, Dictionary> result = new HashMap<String, Dictionary>();
        for (Dictionary element : mapDictionary.values()) {
            if (input == null) {
                if (element.getWord() == null || element.getMeaning() == null) {
                    result.put(element.getWord(), element);
                }
            } else {
                if (element.getWord() != null
                        && element.getWord().contains(input)) {
                    result.put(element.getWord(), element);
                }
                if (element.getMeaning() != null
                        && element.getMeaning().contains(input)) {
                    result.put(element.getWord(), element);
                }
            }
        }
        return result;
    }
    public boolean deleteDoctor(Dictionary dictionary) throws Exception {
        if (mapDictionary == null) {
            throw new Exception("Database doesn't exist");
        }
        if (dictionary == null)
            throw new Exception("Data doesn't exist");
        if (!mapDictionary.containsKey(dictionary.getWord())) {
            throw new Exception("Word doesn't exist");
        }
        mapDictionary.remove(dictionary.getWord());
        return true;
    }
}
