package com.hundred;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class FileIO3 {
    public static void main(String[] args) {
        File file = new File("aaa");
        Map<String,Integer> map = new HashMap<>();
        Map map1 = countMap(map, file);
        System.out.println(map1);
    }
    public static Map countMap(Map<String,Integer> map , File file){
        File[] files = file.listFiles();
        for(File sonfile:files){
            if(sonfile.isFile()){
                String name = sonfile.getName();
                String[] split = name.split("\\.");
                String s = split[split.length - 1];
                if(!map.containsKey(s)){
                    map.put(s,0);
                }
                Integer integer = map.get(s);
                integer++;
                map.put(s,integer);
            }else{
                countMap(map,sonfile);
            }
        }
        return map;
    }
}
