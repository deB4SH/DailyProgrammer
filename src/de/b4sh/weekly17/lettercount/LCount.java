package de.b4sh.weekly17.lettercount;

/*
 * Task: http://www.reddit.com/r/dailyprogrammer/comments/2mkh5g/weekly_17_mini_challenges/cm51y55
 */

import java.util.HashMap;

public class LCount {

    public static String getLetterCount(String text){

        HashMap<String,Integer> map = generateMap();

        int[] chars = new int[30];
        for(int i = 0; i < 30; i++){
            chars[i] = 0;
        }

        for(int i = 0; i < text.length()-1; i++){

            try{
                String key = text.toLowerCase().charAt(i)+"";
                int value = map.get(key);
                chars[value] += 1;
            }
            catch (Exception e){

            }

        }

        //render string
        String renderString = "Values:";
        for(String e: map.keySet()){
            renderString = renderString + " | " + e + ":" + chars[map.get(e)];
        }

        System.out.println(renderString);

        return "";
    }

    private static HashMap<String,Integer> generateMap(){

        HashMap<String,Integer> map = new HashMap<String, Integer>();

        map.put("a",0);
        map.put("b",1);
        map.put("c",2);
        map.put("d",3);
        map.put("e",4);
        map.put("f",5);
        map.put("g",6);
        map.put("h",7);
        map.put("i",8);
        map.put("j",9);
        map.put("k",10);
        map.put("l",11);
        map.put("m",12);
        map.put("n",13);
        map.put("o",14);
        map.put("p",15);
        map.put("q",16);
        map.put("r",17);
        map.put("s",18);
        map.put("t",19);
        map.put("u",20);
        map.put("v",21);
        map.put("w",22);
        map.put("x",23);
        map.put("y",24);
        map.put("z",25);
        //german well known keys
        map.put("ö",26);
        map.put("ä",27);
        map.put("ü",28);
        map.put("ß",29);

        return map;
    }

}
