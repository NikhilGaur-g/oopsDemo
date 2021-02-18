package com.valuemomentum.training.oracle;
class Hello {
static String m(float i) {return "float"; }
static String m(double i) {return "double"; }

public static void main (String[] args) {
int a1 = 1; long b1 = 2;
System.out.print(m(a1)+","+ m(b1));
}
}