package createCustomClass;

import createCustomClass.courseData.Course;
import createCustomClass.courseData.CourseDataProvider;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Sum_Avg_count_Example {
    public static void main(String[] args) {

        Predicate<Course> reviewScoreLessThan95 = course -> course.getReviewScore() < 95;
        // sum() ---> to use sum() we need to Use mapToInt because sum is of type primitiv
        // Get the total number of students of all courses having review score less than 95
        System.out.println(CourseDataProvider.getCourseData()
                .stream()
                .filter(reviewScoreLessThan95)
                .mapToInt(Course::getNoOfStudents) //to use sum() we need to Use mapToInt because sum is of type primitive
                .sum()
        );
        System.out.println("==============");
        //  Get all the numbers less than 20 and find the total of the result
        List<Integer> integerList = List.of(10, 20, 30, 10, 50, 10, 60, 10);
        Predicate<Integer> numLessThan20 = num -> num < 20;
        System.out.println(integerList.stream().filter(numLessThan20).mapToInt(Integer::intValue).sum());

        // average() --> to use average() we need to Use mapToInt because sum is of type primitive
        System.out.println(CourseDataProvider.getCourseData()
                .stream()
                .filter(reviewScoreLessThan95)
                .mapToInt(Course::getNoOfStudents) //to use average() we need to Use mapToInt because sum is of type primitive
                .average());   // and average() returns OptionalDouble

        System.out.println(integerList.stream().filter(numLessThan20).mapToInt(Integer::intValue).average());

        System.out.println("==============");
        //count() ===
        System.out.println(CourseDataProvider.getCourseData()
                .stream()
                .filter(reviewScoreLessThan95)
                .map(Course::getNoOfStudents)
                .count());
        System.out.println(integerList.stream().filter(numLessThan20).count());

        //-------- max()
        System.out.println("===========");
        System.out.println(CourseDataProvider.getCourseData()
                .stream()
                .filter(reviewScoreLessThan95)
                .mapToInt(Course::getNoOfStudents)
                .max());

        System.out.println("===========");
        //---- max() gives the last value
        List<Integer> integerList1 = List.of(10, 20, 30, 10, 50, 10, 60, 10, 11, 12, 19);
        System.out.println(integerList1.stream()
                .filter(numLessThan20)
                .max(Integer::max));

        System.out.println(integerList1.stream()
                .filter(numLessThan20)
                .mapToInt(Integer::intValue)
                .max());

        //---- max()
        System.out.println(integerList1.stream()
                .filter(numLessThan20)
                .min(Integer::max));

        System.out.println(integerList1.stream()
                .filter(numLessThan20)
                .mapToInt(Integer::intValue)
                .min());

    }
}
//[Course{name='AWS', category='Cloud', reviewScore=91, noOfStudents=14000},
// Course{name='FullStack', category='FullStack', reviewScore=92, noOfStudents=21000},
// Course{name='Docker', category='Cloud', reviewScore=92, noOfStudents=21000},
// Course{name='Kubernetes', category='Cloud', reviewScore=91, noOfStudents=20000}]