import java.io.*;
import java.util.*;
class SGPA
{
 public static void main(String args[])
 {
  String subjects[]={"English","Mathematics","BED","Python","DataStructures"};
  double cr[]={2,4,2,3,3};
  Scanner s = new Scanner(System.in);
  int i;
  char grade[]=new char[20];
  for(i=0;i<subjects.length;i++)
  {
   System.out.print("Enter grade of "+subjects[i]+":");
   grade[i]=s.next().charAt(0);
  }
  int gp[]=new int[20];
  for(i=0;i<subjects.length;i++)
  {
   switch(grade[i])
   {
    case 'O':
             gp[i]=10;
             break;
    case 'A':
             gp[i]=9;
             break;
    case 'B':
             gp[i]=8;
             break;
    case 'C':
             gp[i]=7;
             break;
    case 'D':
             gp[i]=6;
             break;
    case 'E':
             gp[i]=5;
             break;
    case 'F':
             gp[i]=0;
             System.out.println("You are failed");
             System.exit(0);
    default:
             System.out.println("Enter correct grade:");
             i--;
             System.exit(0);
   }
  }
 double sum=0,SGPA;
 for(i=0;i<subjects.length;i++)
 {
  sum=sum+gp[i]*cr[i];
 }
 SGPA=sum/14;
 System.out.println("SGPA of a student : "+SGPA);
}
}
    
    
    
    
  
    
  