//Create a student class
//create 5 students objects and store it in a proper datastucture
//find the average marks of he students

public class Ex06 {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        int[] m1 = {86, 90, 74};
        int[] m2 = {78, 78, 80};
        int[] m3 = {86, 84, 34};
        int[] m4 = {100, 97, 88};
        int[] m5 = {54, 99, 74};

        Student s1 = new Student("Prathibhani", m1);
        Student s2 = new Student("Ilmi", m2);
        Student s3 = new Student("Sushmitha", m3);
        Student s4 = new Student("Bhanuka", m4);
        Student s5 = new Student("Praneeth", m5);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        for (Student s : students) {
            System.out.println("Name: " + s.getName());
            s.getAverage();
            System.out.println("-----------------------");
        }

    }
}
