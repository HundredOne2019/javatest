package com.hundred;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileIO3 {
    public static void main(String[] args) {
        File file = new File("aaa");
        String[] list = file.list();
        Map<String,Integer> map = new HashMap();
        for(String fileStr:list){
            String[] split = fileStr.split("\\.");
            String s = split[split.length - 1];
            //寻找map里面是否有此后缀名的键，没有则创建
            if(map.get(s)==null){
                map.put(s,0);
            }
            //判断此文件在map里面是那个键值对
            Integer count = map.get(s);
            //如果是计数+1
            map.put(s,++count);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
