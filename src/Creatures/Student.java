package Creatures;

public class Student extends People {
    private Integer averageMark;
    public Student(String name, Integer age) {
        super(name, age);
    }

    public Student(String name, Integer age, Integer averageMark) {
        super(name, age);
        this.averageMark=averageMark;
    }
    public class GFD{
        public String name;
    }

    public Integer getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Integer averageMark) {
        this.averageMark = averageMark;
    }

    public boolean isSaccessful(){
        if(averageMark>=95){
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + ". AverageMark: " + this.getAverageMark();
    }

}
