package createCustomClass;

import createCustomClass.courseData.Course;
import createCustomClass.courseData.CourseDataProvider;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Skip_Limit_TakeWhile_dropWhile_Examples {
    public static void main(String[] args) {


        Comparator<Course> comparingNoOfStudentsDecreasing = Comparator.comparing(Course::getNoOfStudents).reversed();

        //================ Limit Example ================
        System.out.println(CourseDataProvider
                .getCourseData()
                .stream()
                .sorted(comparingNoOfStudentsDecreasing)
                .limit(2)           //Limit Example
                .collect(Collectors.toList()));

        System.out.println("=============== =============== ===============");
        //================ Skip top 6 results Example ================
        System.out.println(CourseDataProvider
                .getCourseData()
                .stream()
                .sorted(comparingNoOfStudentsDecreasing)
                .skip(6)           //Skip Example
                .collect(Collectors.toList()));

        System.out.println("=============== =============== ===============");

        //================ Skip top 3 results and limit only 5 Example ================
        System.out.println(CourseDataProvider
                .getCourseData()
                .stream()
                .sorted(comparingNoOfStudentsDecreasing)
                .skip(6)           //Skip Example
                .limit(4)           //Limit
                .collect(Collectors.toList()));

        System.out.println("=============== =============== ===============");

        //================ takeWhile --> List all elements until we meet a specific criteria Example ================
        // say we have a list 1, 2, 3, 4, 5, 6, 7, 8, 9 and we will have to get elements list until meet 6
        //Then our list will be 1, 2, 3, 4, 5
        System.out.println(CourseDataProvider
                .getCourseData());
        System.out.println("----------");
        System.out.println(CourseDataProvider
                .getCourseData()
                .stream()
                .sorted(comparingNoOfStudentsDecreasing)
                .takeWhile(course -> course.getReviewScore()>=95)
                .collect(Collectors.toList()));

        System.out.println("=============== =============== ===============");

        //================ dropWhile --> List all elements until we meet a specific criteria Example ================
        // say we have a list 1, 2, 3, 4, 5, 6, 7, 8, 9 and we will have to drop all elements list until meet 6
        //Then our list will be 7, 8, 9 as output
        System.out.println(CourseDataProvider
                .getCourseData()
                .stream()
                .sorted(comparingNoOfStudentsDecreasing)
                .dropWhile(course -> course.getReviewScore()>=95)
                .collect(Collectors.toList()));
    }
}