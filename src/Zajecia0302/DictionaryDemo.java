package Zajecia0302;

import java.util.Dictionary;
import java.util.HashMap;

public class DictionaryDemo {
    public static void main(String[] args) {


        HashMap<String, String> szyfrCezara = new HashMap<>();
        szyfrCezara.put("A", "D");
        szyfrCezara.put("B", "E");
        szyfrCezara.put("C", "F");
        szyfrCezara.put("D", "G");
        szyfrCezara.put("E", "H");
        szyfrCezara.put("F", "I");

        System.out.println(szyfrCezara.get("A"));

//        HashMap <Integer, String> szyfrCezara = new HashMap<>();
//        szyfrCezara.put(0,"A");
//        szyfrCezara.put(1,"B");
//        szyfrCezara.put(2,"C");
//        szyfrCezara.put(3,"D");
//        szyfrCezara.put(4,"E");
//        szyfrCezara.put(5,"F");
//
//        System.out.println(szyfrCezara.get(0+3));


    }
}
//       HashMap<Integer,String> dzieci = new HashMap<>();
//
//       int test = 5;
//       String testValue = "55555";
//
//       dzieci.put(1, "Kowalski");
//       dzieci.put(2, "ZZZZZ");
//       dzieci.put(test, testValue);
//
//       String ele = dzieci.get(1);
//        for (Integer key : dzieci.keySet()){
//            System.out.println(dzieci.get(key));
//
//        }
//    }
//}
