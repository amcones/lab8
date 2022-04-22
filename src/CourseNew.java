public class CourseNew {
    private Student[] student=new Student[2];
    private String cname;
    private int num=0;
    public CourseNew(String cname){
        this.cname=cname;
    }
    public void addStudent(Student stu)
    {
        if(contains(stu))return;
        if(num+1==student.length)increaseSize();
        student[num++]=stu;
    }
    private void increaseSize()
    {
        Student[] temp=new Student[student.length*2];
        System.arraycopy(student,0,temp,0,num);
        student=temp;
    }
    public Student[] getStudents()
    {
        return student;
    }
    public int getNumberOfStudents()
    {
        return num;
    }
    public boolean contains(Student s)
    {
        for (Student i:student) {
            if(i==null)break;
            if(i.getName().equals(s.getName()))return true;
        }
        return false;
    }
    public int containsId(Student s)
    {
        for(int i=0;i<student.length;i++){
            if(student[i].getName().equals(s.getName()))return i;
        }
        return -1;
    }
    public void dropStudent(Student s){
        for(int i=containsId(s);i<num-1;i++){
            student[i]=student[i+1];
        }
        num--;
    }
    public void clear()
    {
        student=new Student[2];
        num=0;
    }
}
class Student{
    private final String name;
    public Student(String sname){
        this.name=sname;
    }

    public String getName() {
        return name;
    }

}
class CourseMain {
        public static void main(String[] args) {
            CourseNew course1 = new CourseNew("Data Structures");
            CourseNew course2 = new CourseNew("Database Systems");
            Student s1= new Student("Peter Jones");
            Student s2 = new Student("Brian Smith");
            Student s3 = new Student("Anne Kennedy");
            Student s4 = new Student("Susan Kennedy");
            Student s5 = new Student("Kim Johnson");
            Student s6 = new Student("Peter Jones");
            Student s7 = new Student("Steve Smith");

            course1.addStudent(s1);
            course1.addStudent(s2);
            course1.addStudent(s3);
            course1.addStudent(s4);
            course1.addStudent(s5);
//s6.name equals s1.name
            course1.addStudent(s6);
            course1.addStudent(s7);

            course2.addStudent(s6);
            course2.addStudent(s7);

            System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
            Student[] students = course1.getStudents();
            for (int i = 0; i < course1.getNumberOfStudents(); i++)
                System.out.print(students[i].getName() + ", ");

            System.out.println();
            System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
            System.out.println();

            course1.dropStudent(s6);
            System.out.println("Number of students in course1: "+ course1.getNumberOfStudents());
            students = course1.getStudents();
            for (int i = 0; i < course1.getNumberOfStudents(); i++)
                System.out.print(students[i].getName() + ", ");
            course1.clear();
            System.out.println("\nNumber of students in course1: "+ course1.getNumberOfStudents());
        }}

