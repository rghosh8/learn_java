//package org.example;//package org.example;

public class Demo extends Object {

    public static void main(String[] args) {
        
        System.out.println("Hello world," + " rajat!");
        int x = 5;
        System.out.println(x);
        x = x + 1;
        x += 1;
        x++;
        System.out.println(x);
        for (int i = 0; i < args.length ; i++) {
            System.out.println(args[i]);
        }
        System.out.println(System.out);
        Demo d0 = null;
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = d1;
        //examples of method overloading
        System.out.println(d0);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println();
        System.out.println(Math.PI);
        System.out.println((float)Math.PI);
        System.out.println((int)Math.PI);
        System.out.println(true);
        System.out.println('x');
    }
    //example of a method overriding
    public String toString(){
        return "Hello, World! I am an instance of " + super.toString();
    }

}