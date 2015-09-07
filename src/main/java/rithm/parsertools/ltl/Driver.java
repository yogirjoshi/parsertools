package rithm.parsertools.ltl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.luaj.vm2.ast.Stat.Return;


class Student {
    private String name;
    private int age;
    private String className;
    public Student(String name,String className,int age){
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
public class Driver {
    public static void main(String[] args) {
    	final int len1 = Integer.parseInt(args[0]), len2 = Integer.parseInt(args[1]);
    	ArrayList<ArrayList<Student>> masterList = new ArrayList<ArrayList<Student>>();
        List<Student> list1 = new ArrayList<Student>();
        List<Student> list2 = new ArrayList<Student>();
        for(int j = 0; j < len2; j++){
        	ArrayList<Student> currList = new ArrayList<>();
	        for(int i = 0 ; i < len1; i++){
	        	currList.add(new Student("A"+i, (i%2 == 0)?"A":"B", 50));
	        }
	        masterList.add(currList);
        }    
        long beg, end;
        beg = System.nanoTime();
//        int array1[] = new int[14000000];
//        int array2[] = new int[14000000];
//        Random randomGenerator = new Random();
//        for(int i = 0; i < 14000000;i++){
//        	array1[i] = randomGenerator.nextInt(14000000);
//        	array2[i] = array1[i];
//        }
//        boolean ver = false;
//        for(int i = 0; i < 14000000;i++)
//        {
//        	ver = ver || (i > 0)? array1[i] < array1[i-1]:false;
//        }
//        System.out.println(ver);
//        end = System.nanoTime();
//        System.out.println(end-beg);
//
//        beg = System.nanoTime();
//        Arrays.parallelSort(array2);
        
//        masterList.stream().
//        forEach((lst) -> 
//        	{
//        		int sum = 0;
//        		for(int k =0; k < len1;k++) 
//        			sum = sum + lst.get(k).getAge();
//        		sum = sum / len1;
////                System.out.println(sum);
//        	});
    	int sum = 0;
        for(int i = 0; i < len2; i++){
        	for(int j =0 ; j< len1;j++){
        		sum =  (sum > 1000)? sum-1000:sum + masterList.get(i).get(j).getAge();
        	}
        }
        end = System.nanoTime();
        System.out.println(end-beg);
        System.out.println(sum);
    }
} 