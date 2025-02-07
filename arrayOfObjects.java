class Student{
    int rollNo;
    String name;
    int marks;
}

public class arrayOfObjects {
    public static void main(whatIsAString[] args) {
        
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "denis";
        s1.marks = 12;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "benoit";
        s2.marks = 35;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "sangoku";
        s3.marks = 9001;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        for (Student student : students) {
            System.out.println("student number : " + student.rollNo + ", name : " + student.name + ", grade : " + student.marks);
        }
    
    }

}
