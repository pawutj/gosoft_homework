package my_oop_jar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.ArrayList;

public class Homework9_4 {

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
        String[] rawData = { "id:1001 firstname:Luke lastname:Skywalker salary:10000 type:frontend role:Programmer",
                "id:1002 firstname:Tony lastname:Stark salary:20000 type:tshirt role:CEO",
                "id:1003 firstname:Somchai lastname:Jaidee salary:30000 type:fullstack role:Programmer",
                "id:1004 firstname:MonkeyD lastname:Luffee salary:40000 type:maid role:OfficeCleaner" };

        ArrayList<Employee> employees = new ArrayList<Employee>();
        for (int i = 0; i < rawData.length; i++) {
            if (getField(rawData[i], "role").equals("Programmer")) {

                Programmer t = new Programmer(getField(rawData[i], "id"), getField(rawData[i], "firstname"),
                        getField(rawData[i], "lastname"), Integer.parseInt(getField(rawData[i], "salary")),
                        getField(rawData[i], "type"));

                employees.add(t);
            }

            if (getField(rawData[i], "role").equals("OfficeCleaner")) {
                OfficeCleaner t = new OfficeCleaner(getField(rawData[i], "id"), getField(rawData[i], "firstname"),
                        getField(rawData[i], "lastname"), Integer.parseInt(getField(rawData[i], "salary")),
                        getField(rawData[i], "type"));
                employees.add(t);
            }

            if (getField(rawData[i], "role").equals("CEO")) {
                CEO t = new CEO(getField(rawData[i], "id"), getField(rawData[i], "firstname"),
                        getField(rawData[i], "lastname"), Integer.parseInt(getField(rawData[i], "salary")),
                        getField(rawData[i], "type"));
                employees.add(t);
            }

        }

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getClass() == Programmer.class) {
                Programmer e = (Programmer) employees.get(i);
                System.out.printf("ID:%s fname:%s lname:%s salary:%d type:%s\n", e.id, e.firstname, e.lastname,
                        e.getSalary(), e.type);
                e.work();
            }

            if (employees.get(i).getClass() == OfficeCleaner.class) {
                OfficeCleaner e = (OfficeCleaner) employees.get(i);
                System.out.printf("ID:%s fname:%s lname:%s salary:%d type:%s\n", e.id, e.firstname, e.lastname,
                        e.getSalary(), e.type);
                e.work();
            }

            if (employees.get(i).getClass() == CEO.class) {
                CEO e = (CEO) employees.get(i);
                System.out.printf("ID:%s fname:%s lname:%s salary:%d type:%s\n", e.id, e.firstname, e.lastname,
                        e.getSalary(), e.type);
                Employee _e = new Employee("Employee", "Employee", 123);
                e.work(_e);
            }

        }

    }
}
