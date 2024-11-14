package Jobsheet12;

import java.io.IOException;

public class EfekThrow {
    public static void main(String[] args) { 
        SuatuKelas obj = new SuatuKelas(); 
        obj.methodA(); 
        try { 
            obj.methodB(); 
        } catch (IOException e) { 
        } 
    } 
}