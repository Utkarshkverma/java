import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [ age= " + age + ", name= " + name + "]";
    }
}

public class comparator {

    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10) {
                    return 1;
                }
                return -1;
            }
        };

        List<Integer> list = new ArrayList<Integer>();
        list.add(43);
        list.add(31);
        list.add(72);
        list.add(29);
        Collections.sort(list, comparator);

        System.out.println(list);

        List<String> list1 = new ArrayList<String>();
        list1.add("Hii");
        list1.add("Hello");
        list1.add("How");
        list1.add("Are");
        list1.add("You");

        Comparator<String> com_string = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                }
                return 1;
            }
        };

        Collections.sort(list1, com_string);
        System.out.println(list1);

        List<Student> student = new ArrayList<Student>();
        Student s1 = new Student(22, "Utkarsh");
        Student s2 = new Student(22, "Rishab");
        Student s3 = new Student(25, "Akash");
        Student s4 = new Student(24, "Rahul");
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);

        Collections.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.age != s2.age) {
                    return Integer.compare(s2.age, s1.age);
                } else {
                    return s1.name.compareTo(s2.name);
                }
            }
        });

        System.out.println(student);

        int[] numbers = { 15, 51, 29, 60, 37 };
        IntWrapper[] wrapped = new IntWrapper[numbers.length];
        for (int i = 0; i<wrapped.length;i++) {
            wrapped[i] = new IntWrapper(numbers[i]);
        }
        
        Arrays.sort(wrapped);
        
        for(int i = 0;i<wrapped.length;i++){
            System.out.print(wrapped[i].val+" ");
        }
    }
}


class IntWrapper implements Comparable<IntWrapper>
{

    int val;
    public  IntWrapper(int v) { val = v;}

    @Override
    public int compareTo(IntWrapper o) {
        // TODO Auto-generated method stub
        return Integer.compare(this.val%10, o.val%10);
    }
    
}


/*
Comparable is a single-method interface, while Comparator is a multi-method interface.
Comparable is implemented by the class itself, while Comparator is implemented as a separate object.
Comparable uses the compareTo method, while Comparator uses the compare method.
 */