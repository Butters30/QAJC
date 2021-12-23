package HomeWork9;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main9 {

    public static void main(String[] args){

}
    List<Course> uniqueCourse(List<Student> courseStream) {
        return courseStream.stream()
                .map(Student::getAllCourses)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    Map<String, Integer> curiosStudent(List<Student> collection) {

        return collection.stream()
                .limit(3)
                .collect(Collectors.toMap(Student::getName,
                        student -> student.getAllCourses().size()));
//        .sorted()
//        .collect(Collectors.groupingBy(Student::getAllCourses));
//         Comparator.reverseOrder()
    }

//    Stream<Course> studentStream(Stream<Student> courseStream){
//        return courseStream
////         .filter()
//         .map(Student::getAllCourses)
//         .flatMap(List::stream)
////                .map()
//         .distinct();}

    Map<List<Course>, List<Student>> groupWorkersByPosition(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getAllCourses));
    }

    interface Student {
        String getName();
        List<Course> getAllCourses();
    }
    interface Course {}
}
//package HomeWork9;
//
//public class Students {
//    static class Student {
//        enum Course {JAVA, JAVA_CORE, WEB_UI, PYTHON}
//
//        private String name;
//        private Course courseName;
//
//        public Student(String name, Course courseName) {
//            this.name = name;
//            this.courseName = courseName;
//        }
//    }
//}

//Main
//     List<Student> students = new ArrayList<>(Arrays.asList(
//        new Student("John", Student.Course.JAVA),
//        new Student("Jane", Student.Course.JAVA_CORE),
//        new Student("Harry ", Student.Course.JAVA_CORE),
//        new Student("Thomas   ", Student.Course.PYTHON),
//        new Student("William ", Student.Course.PYTHON),
//        new Student("Mia", Student.Course.WEB_UI),
//        new Student("Emily", Student.Course.JAVA_CORE),
//        new Student("Ethan", Student.Course.PYTHON),
//        new Student("Lily ", Student.Course.WEB_UI),
//        new Student("Jack", Student.Course.JAVA_CORE)
//        ));

//Stream<String> uniqCourses(Stream<Student> coursesStream) {
//    return coursesStream
//            .map(Student::getAllCourses)
//            .flatMap(List::stream)
//            .map(Course::getName)
//            .distinct();




