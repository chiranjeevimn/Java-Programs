//package mypack;
import java.util.Scanner;
class Marksheet
{
private String usn;
private String sname;
protected char grade;
protected double m1,m2,m3;
public double total;

// Default constructor
public Marksheet()
{
//usn="1BY22MC999";
//sname="BMSITIAN";
//grade='A';
//m1=m2=m3=101;
//total=303;
}

//Parameter constructor
public Marksheet(String usn,String sname, char grade,double m1,double m2,double m3,double total)
{
this.usn=usn;
this.sname=sname;
this.grade=grade;
this.m1=m1;
this.m2=m2;
this.m3=m3;
this.total=total;
}

//Getter and setter method 
public String getUSN()
{
	return this.usn;
}

public void setUSN(String usn)
{
	this.usn=usn;
}

//Getter and setter method 
public String getSNAME()
{
	return this.sname;
}

public void setSNAME(String usn)
{
	this.sname=sname;
}

//Method
public void display()
{
System.out.println("USN:"+usn);
System.out.println("NAME:"+sname);
System.out.println("GRADE:"+grade);
System.out.println("M1:"+m1);
System.out.println("M2:"+m2);
System.out.println("M1:"+m3);
System.out.println("TOTAL:"+total);
System.out.println("\n");
}
//Method overloading
public void display(char msg)
{
System.out.println("Grade of the student:"+msg);
}
}

class Mark
{
public static void main(String args[])
{
Marksheet arjun = new Marksheet();
System.out.println("\nDEFAULT CONSTRUCTOR CALLED");
arjun.display();
System.out.println("\nPARAMETERIZED CONSTRUCTOR CALLED");
Marksheet rambha = new Marksheet("1BY23MC001","AI Rambha",'w',1,4,3,8);
rambha.display();
System.out.println("\n");
Marksheet sophia = new Marksheet();
//sophia.usn="1BY22MC002";
sophia.setUSN("1BY22MC002");
sophia.setSNAME("SOPHIA ROBO");
sophia.grade='B';
sophia.m1=sophia.m2=sophia.m3=90;
sophia.total=sophia.m1+sophia.m2+sophia.m3;
sophia.display();
sophia.display('s');
}

}