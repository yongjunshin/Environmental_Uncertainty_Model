package util;

import javafx.util.Pair;
import smarthome.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
    public static ArrayList<Pair<String, String>> readConfiguration(String configFile){
        ArrayList<Pair<String, String>> configs =  new ArrayList<Pair<String, String>>();

        try{
            File file = new File(configFile);
            FileReader filereader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";
            while((line = bufReader.readLine()) != null){
                String[] parts = line.split(":");
                configs.add(new Pair<String, String>(parts[0], parts[1]));
            }
            bufReader.close();
        }catch(IOException e){
            System.out.println(e);
        }

        //return a dictionary
        return configs;
    }

    public static String getValueFromConfigDictionary(ArrayList<Pair<String, String>> configs, String keyword){
        for(Pair<String, String> p : configs){
            if(p.getKey().equals(keyword))
                return p.getValue();
        }
        return null;
    }

    public static ArrayList<Double> stringToDoubleList(String dataListStr){
        ArrayList<Double> dataList = new ArrayList<Double>();
        dataListStr = dataListStr.replace("[", "");
        dataListStr = dataListStr.replace("]", "");
        String[] trend_array = dataListStr.split(",");
        for(String trend_value_string: trend_array){
            dataList.add(Double.parseDouble(trend_value_string));
        }
        return dataList;
    }
}
