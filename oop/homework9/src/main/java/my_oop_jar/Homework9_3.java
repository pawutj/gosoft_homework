package my_oop_jar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.ArrayList;

public class Homework9_3 {

    public static String getField(String s, String field) {
        String rx = String.format("(%s:)([\\w]+)", field);
        Pattern p = Pattern.compile(rx);
        Matcher matcher = p.matcher(s);
        if (matcher.find()) {
            // System.out.println(matcher.group(2));
            return matcher.group(2);
        }
        return "";
    }

    public static void main(String[] args) {
        String[] rawData = { "id:1001 firstname:Luke lastname:Skywalker salary:10000 type:frontend",
                "id:1002 firstname:Tony lastname:Stark salary:20000 type:backend",
                "id:1003 firstname:Somchai lastname:Jaidee salary:30000 type:fullstack",
                "id:1004 firstname:MonkeyD lastname:Luffee salary:40000 type:fullstack" };
        ArrayList<Programmer> employees = new ArrayList<Programmer>();
        for (int i = 0; i < rawData.length; i++) {
            Programmer t = new Programmer(getField(rawData[i], "id"), getField(rawData[i], "firstname"),
                    getField(rawData[i], "lastname"), Integer.parseInt(getField(rawData[i], "salary")),
                    getField(rawData[i], "type"));
            employees.add(t);
        }

        for (int i = 0; i < employees.size(); i++)
            System.out.println(employees.get(i));

    }
}
