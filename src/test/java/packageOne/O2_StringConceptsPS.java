package packageOne;

import java.lang.constant.Constable;

public class O2_StringConceptsPS {
    public static void main(String[] args) {
        String s="Hello W";
        System.out.println(s);
        System.out.println(s.length());
        //
        String new_s="";
        String s1="    ";
        System.out.println(new_s.isEmpty());
        System.out.println(s1.isBlank());
        String uctolc="HI hello";
        System.out.println(uctolc.toLowerCase());
        System.out.println(uctolc.startsWith("Hi"));
        System.out.println(uctolc.startsWith(uctolc));
        System.out.println("contains " +uctolc.contains("hello"));
        System.out.println(uctolc.toUpperCase().contains("HELLO"));
        System.out.println(uctolc.replace("HI","BYE"));
        System.out.println("character position "+ uctolc.charAt(1));
        System.out.println(uctolc.substring(2));
        System.out.println(uctolc.substring(1,6));
        System.out.println("repeat "+uctolc.repeat(3));
        System.out.println(uctolc.indexOf("I"));

        //printsASCII value
       String  s11="New";
        String s22="new";
        System.out.println(s11.compareTo(s22));
        String trims="     remove start";
        String trime="remove end       ";
        System.out.println(trims.stripLeading());
        System.out.println(trime.stripTrailing());
        System.out.println("print ascii value of 1st character" + s11.codePointAt(0));
        String firstOccurence="progress is good, keep progress";
        System.out.println("replace first occurence "+firstOccurence.replaceFirst("progress","regularity"));
        Constable fixed="fixed";
        System.out.println(fixed);
        String para= """ 
                many many sentences in one go and 
                today is a  good day
                """;
        System.out.println("para "+para);
        System.out.println(para.regionMatches(5,"many",0,4));



    }
}
