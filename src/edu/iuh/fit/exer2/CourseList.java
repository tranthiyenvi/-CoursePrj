package edu.iuh.fit.exer2;

public class CourseList {
    private Course[] courses;
    private int count = 0;

    // Constructor với tên đúng
    public CourseList(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Length of the array must be greater than 0");
        courses = new Course[n];
    }

    public boolean addCourse(Course course) {

        if (course == null)
            return false;


        if (isExists(course))
            return false;

        // Kiểm tra xem mảng đã đầy chưa
        if (count == courses.length)
            return false;

        courses[count++] = course;
        return true;
    }


    private boolean isExists(Course course) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equals(course.getId()))
                return true;
        }
        return false;
    }

    public Course[] getCourses() {
        return courses;
    }
}
