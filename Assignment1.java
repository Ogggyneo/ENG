class Course{
    private int id;
    private String name;
    private int lectureHours;
    private int practiceHours;
    
    public Course(int id, String name, int lectureHours, int practiceHours){
        this.id = id;
        this.name = name;
        this.lectureHours = lectureHours;
        this.practiceHours = practiceHours;
    }
}

class Student {
    private int studentId;
    private String studentName;
    private final int maxCourses = 6;
    private int currentCourses;

    public Student(int studentId, String studentName, int currentCourses){
        this.studentName = studentName;
        this.studentId = studentId;
        this.currentCourses = currentCourses;
    }

    public boolean canTakeMoreCourses(){
        return currentCourses < maxCourses;
    } 

    @Override
    public String toString(){
        return "Student ID: " + studentId + " , " + "Name: " + studentName 
        + " , " + "Courses: " + currentCourses;
    } 

}


public class Assignment1 {
    public static void main(String[] args) {
        Student minh = new Student(230166, "Minh", 5);
        System.out.println(minh);
        if(minh.canTakeMoreCourses()){
            System.out.println("Minh can take more courses");
        } else {
            System.out.println("Minh can not take more courses");
        }
    
    }

}