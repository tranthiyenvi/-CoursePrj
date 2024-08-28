package edu.iuh.fit.exer2;

public class TestCourse {
    public static void main(String[] args) {
        CourseList courseList = new CourseList(10);

        initData(courseList);

        System.out.printf("%-10s%-30s%10s%-20s\n", "id", "title", "credit", "department");
        Course[] temp = courseList.getCourses();
        for (Course course : temp) {
            if (course != null) {
                System.out.println(course);
            }
        }
    }

    private static void initData(CourseList courseList) {
        Course c1 = new Course("CS101", "Java Programming", 3, "CS");
        Course c2 = new Course("CS102", "C#", 3, "CS");
        Course c3 = new Course("CS103", "Python", 3, "CS");

        courseList.addCourse(c1);
        courseList.addCourse(c2);
        courseList.addCourse(c3);
    }
}


