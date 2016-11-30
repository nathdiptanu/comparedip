package comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class AgeComparator implements Comparator{  
public int compare(Object o1,Object o2){  
Student s1=(Student)o1;  
Student s2=(Student)o2;  
  
if(s1.age==s2.age)  
return  s1.name.compareTo(s2.name);  
else if(s1.age<s2.age)  
return 1;  
else  
return -1;  
	
}

}  