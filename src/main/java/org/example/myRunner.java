package org.example;

public class myRunner {
    public static void main(String[] args) {
        //initialize the class with Integer data
        DemoClass dobj = new DemoClass();
        dobj.genericsMethod(25);//passing int
        dobj.genericsMethod("Per Scholas");//passing String
        dobj.genericsMethod(2563.5);//passing float
        dobj.genericsMethod('H');//passing Char
    }
}
