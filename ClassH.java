package com.task1;

public class ClassH 
{
void meth1(int a, int b, int c)
{
	System.out.println("Addition:"+(a+b+c));
	new ClassH().meth2(100,1);
}
void meth2(int a, int b)
{
	System.out.println("Substraction:"+(a-b));
}
ClassH()
{
	System.out.println("Division:"+(10/2));
}
ClassH(int a)
{
	System.out.println("Division:"+(a*10));
}
public static void main(String[] args) 
{
	new ClassH(10).meth1(1, 2, 3);
}
}