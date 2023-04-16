package org.example;

public class Main {
    public static void main(String[] args) {
        CHMInterner<String> chmInterner = new CHMInterner<>();
        System.out.println(chmInterner.intern("Hello"));
        System.out.println(chmInterner.intern("Hello"));
        System.out.println(chmInterner.intern("World!"));
        System.out.println(chmInterner.internSize());
    }
}