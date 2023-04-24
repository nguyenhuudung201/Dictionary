package com.class2;

public class Dictionary {
    private String word, meaning;
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public String getMeaning() {
        return meaning;
    }
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
    public void display() {
        System.out.println("The Meaning "+meaning);
    }
}
