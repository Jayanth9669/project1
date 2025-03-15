package com.jayanth.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Empl{
    int id;
    String name;
    int age;
    public Empl(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getNameLength() {
        return this.name.length();
    }
}
public class hii {
    public static void main(String[] args) {
        List<Empl> employees = new ArrayList<>();
        employees.add(new Empl(101, "John", 25));
        employees.add(new Empl(102, "Robert", 28));
        employees.add(new Empl(103, "Alicia", 23));
        employees.add(new Empl(104, "Mark", 30));
        employees.add(new Empl(105, "Jennifer", 29));
        List<Integer> filteredNames = employees.stream().filter(emp -> emp.getNameLength() > 4).map(emp -> emp.getNameLength()).sorted().collect(Collectors.toList());
      
        		
        
        filteredNames.forEach(System.out::println);
    }
}
