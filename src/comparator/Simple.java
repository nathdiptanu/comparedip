package comparator;

import java.util.*;  
import java.io.*;  
  
class Simple{  
public static void main(String args[]){  
  
ArrayList al=new ArrayList();  
al.add(new Student("amy",100));  
al.add(new Student("david",100));  
al.add(new Student("heraldo",50)); 
al.add(new Student("aakansha",75));
al.add(new Student("aleksa",150));
  
  
System.out.println("sorting by age...");  
  
Collections.sort(al,new AgeComparator());  
Iterator itr2=al.iterator();  
while(itr2.hasNext()){  
Student st=(Student)itr2.next();  

System.out.println(st.name+" "+st.age);  
}  
  
  
}  
}  