import Creatures.People;
import Creatures.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Student daddy = new Student("Daddy",45);
        Student john = new Student("John",20);
        Student vasya = new Student("Vasya",25);
        Student.GFD gfd = new Student("s",2).new GFD();
        vasya.setAverageMark(90);
        john.setAverageMark(98);
        daddy.setAverageMark(100);
        Student[] students = {john,vasya,daddy};
        Comparator<Student> comparator = (p1,p2)->p1.getAverageMark()- p2.getAverageMark();
        TreeSet<Student> studentsSet = new TreeSet<>(comparator);
        Arrays.sort(students,comparator);
        studentsSet.add(daddy);
        studentsSet.add(vasya);
        studentsSet.add(john);

        out(studentsSet,students,"FirstSort");

        Arrays.sort(students,comparator.reversed());
        studentsSet=Sorting.reverse(studentsSet);
        System.out.println("\n");

        out(studentsSet,students,"Reversed");


        students=Sorting.thenCompare(students);
        studentsSet=Sorting.thenCompare(studentsSet);
        System.out.println("\n");

        out(studentsSet,students,"ThenCompare");

        students=Sorting.nullFirst(students);
        studentsSet=Sorting.nullFirst(studentsSet);
        System.out.println("\n");

        out(studentsSet,students,"NullsFirst");
    }

    public static void printList(Student[] students){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for(Student student:students){
            sb.append(student);
            sb.append(", ");
        }
        sb.delete(sb.length()-2,sb.length());
        sb.append("]");
        System.out.println(sb);
    }

    public static void out(TreeSet set, Student[] list, String label){
        System.out.println(label);
        System.out.println("<----------------------->");
        printList(list);
        System.out.println(set);
        System.out.println("<----------------------->");
    }
}
