package rithm.parsertools.ltl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.luaj.vm2.ast.Stat.Return;


class Student1 {
    private String name;
    private int age;
    private String className;
    public Student1(String name,String className,int age){
        this.name=name;
        this.age=age;
        this.className = className;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getClassName() {
        return className;
    }
} 
public class Driver2 {
    public static void main(String[] args) {
    	final int len1 = Integer.parseInt(args[0]), len2 = Integer.parseInt(args[1]);
    	ArrayList<ArrayList<Student1>> masterList = new ArrayList<ArrayList<Student1>>();
        List<Student1> list1 = new ArrayList<Student1>();
        List<Student1> list2 = new ArrayList<Student1>();
        for(int j = 0; j < len2; j++){
        	ArrayList<Student1> currList = new ArrayList<>();
	        for(int i = 0 ; i < len1; i++){
	        	currList.add(new Student1("A"+i, (i%2 == 0)?"A":"B", 50));
	        }
	        masterList.add(currList);
        }    
        long beg, end;
        beg = System.nanoTime();
        masterList.stream().parallel().
        forEach((lst) -> 
        	{
        		int sum = 0;
        		for(int k =0; k < len1;k++) 
        			sum = sum + lst.get(k).getAge();
        		sum = sum / len1;
        	});
        end = System.nanoTime();
        System.out.println(end-beg);
    }
} 