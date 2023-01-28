package createCustomClass;


import createCustomClass.courseData.Course;
import createCustomClass.courseData.CourseDataProvider;

import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AllMatch_NoneMatch_AnyMatch_Example {
    public static void main(String[] args) {
        Predicate<Course> scoreGreaterThan95 = course -> course.getReviewScore() > 95;
        Predicate<Course> scoreGreaterThan90 = course -> course.getReviewScore() > 90;
        Predicate<Course> scoreLessThan90 = course -> course.getReviewScore() < 90;

        System.out.println(CourseDataProvider.getCourseData().stream().allMatch(scoreGreaterThan90));
        //NoneMatch
        System.out.println(CourseDataProvider.getCourseData().stream().noneMatch(scoreLessThan90));
        //AnyMatch
        System.out.println(CourseDataProvider.getCourseData().stream().anyMatch(scoreLessThan90));
        System.out.println(CourseDataProvider.getCourseData().stream().anyMatch(scoreGreaterThan95));
        System.out.println("==============================");
        //Comparator
        Comparator<Course> comparingNoOfStudentsIncreasing = Comparator.comparing(Course::getNoOfStudents);
        Comparator<Course> comparingNoOfStudentsDecreasing = Comparator.comparing(Course::getNoOfStudents).reversed();

        System.out.println(CourseDataProvider.getCourseData().stream().sorted(comparingNoOfStudentsIncreasing)
                .collect(Collectors.toList()));
        System.out.println(CourseDataProvider.getCourseData().stream().sorted(comparingNoOfStudentsDecreasing)
                .collect(Collectors.toList()));

        System.out.println("==============================");

        //Print scores which has highest number of students with highest number of reviews
        Comparator<Course> comparingByNoOfStudentsAndNoOfReviews = Comparator
                .comparingInt(Course::getNoOfStudents)  //Since it getNoOfStudents return int which is premietive to avoid autoBoxing we can
                .thenComparingInt(Course::getReviewScore)    //use comparingInt and thenComparingInt
                .reversed();
        System.out.println(CourseDataProvider.getCourseData().stream().sorted(comparingByNoOfStudentsAndNoOfReviews)
                .collect(Collectors.toList()));

    }
}
