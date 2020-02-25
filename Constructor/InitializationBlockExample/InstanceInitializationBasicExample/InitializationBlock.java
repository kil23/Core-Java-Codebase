import java.io.*;
import java.lang.*;

class InitializationBlock{
    {
        // Instance Initialization Block
        System.out.println("This is the Instance Initialization Block...");
    }

    InitializationBlock(){
        System.out.println("This is the Constructor...");
    }

    public void method(){
        System.out.println("This is method...");
    }

    public static void main(String args[]){
        InitializationBlock i = new InitializationBlock();
        i.method();
    }
}

/*
OUTPUT :

This is the Instance Initialization Block...
This is the Constructor...
This is method...

 */