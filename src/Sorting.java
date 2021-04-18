import Creatures.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Sorting{
    public static TreeSet reverse(TreeSet<Student> set){
        Comparator<Student> comparator = (p1,p2)-> p1.getAverageMark()-p2.getAverageMark();
        TreeSet<Student> studentsSet = new TreeSet<>(comparator.reversed());
        for(Student student: set){
            studentsSet.add(student);
        }
        return studentsSet;
    }

    public static TreeSet thenCompare(TreeSet<Student> set){
        Comparator<Student> comparatorMark = (p1,p2)-> p1.getAverageMark()-p2.getAverageMark();
        Comparator<Student> comparatorAge = (p1,p2)-> p1.getAge()-p2.getAge();
        comparatorMark.thenComparing(comparatorAge);
        TreeSet<Student> studentsSet = new TreeSet<>(comparatorMark);
        for(Student student: set){
            studentsSet.add(student);
        }
        return studentsSet;
    }

    public static Student[] thenCompare(Student[] list){
        Comparator<Student> comparatorMark = (p1,p2)-> p1.getAverageMark()-p2.getAverageMark();
        Comparator<Student> comparatorAge = (p1,p2)-> p1.getAge()-p2.getAge();
        comparatorMark.thenComparing(comparatorAge);
        Arrays.sort(list,comparatorMark);
        return list;
    }

    public static TreeSet nullFirst(TreeSet<Student> set){
        Comparator<Student> comparator = (p1,p2)-> p1.getAverageMark()-p2.getAverageMark();
        TreeSet<Student> studentsSet = new TreeSet<>(Comparator.nullsFirst(comparator));
        for(Student student: set){
            studentsSet.add(student);
        }
        studentsSet.add(null);
        return studentsSet;
    }

    public static Student[] nullFirst(Student[] list){
        Comparator<Student> comparator = (p1,p2)-> p1.getAverageMark()-p2.getAverageMark();
        comparator = Comparator.nullsFirst(comparator);
        Student[] outList = new Student[5];
        for (int i =0;i<list.length;i++){
            outList[i]=list[i];
        }
        Arrays.sort(outList,comparator);
        return outList;
    }
}
