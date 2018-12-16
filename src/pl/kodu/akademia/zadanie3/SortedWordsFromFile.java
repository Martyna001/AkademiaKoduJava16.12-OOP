package pl.kodu.akademia.zadanie3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedWordsFromFile {
    private String fileName;
    public String readedText;

    public SortedWordsFromFile(String fileName) {
        this.fileName = fileName;
        this.readedText = readFile();

    }

    private String readFile() {
        String textFromFile = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(this.fileName));
            StringBuilder sb = new StringBuilder();

            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                if (line.equals(""))
                    sb.append(" ");
                line = br.readLine();
            }
            textFromFile = sb.toString();
            textFromFile = textFromFile.replaceAll("[^a-zA-Z0-9\\ż\\ź\\ś\\ć\\ń\\ą\\ę\\ó\\ł\\ ]", "");
            textFromFile = textFromFile.toLowerCase();


        } catch (Exception e) {
            e.printStackTrace();

        }
        return textFromFile;

    }

    public String[] getWords() {
        String[] wordsArray =this.readedText.split(" ");
        Arrays.sort(wordsArray);
        return wordsArray;
    }
    public Map<String, Integer> getWordsCount(){
        Map<String, Integer> wordsMap=new TreeMap<>();
        for (String word : this.getWords()){
            if(wordsMap.get(word)==null)
            wordsMap.put(word, 1);
            else
                wordsMap.put(word, wordsMap.get(word)+1);

        }
        return wordsMap;
    }
}
