package createCustomClass;

import createCustomClass.courseData.Course;
import createCustomClass.courseData.CourseDataProvider;

import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        Predicate<Course> reviewScoreLessThan95 = course -> course.getReviewScore() < 95;

        //Group courses by category
        //The getCourseData() has a few categories

        System.out.println(CourseDataProvider.getCourseData()
                .stream()
                .collect(Collectors.groupingBy(Course::getCategory)));
//---- Output
        //{
// Language =[Course{name='Java', category='Language', reviewScore=91, noOfStudents=20000}, Course{name='Python', category='Language', reviewScore=91, noOfStudents=20000}],
// Cloud =[Course{name='AWS', category='Cloud', reviewScore=91, noOfStudents=14000}, Course{name='Docker', category='Cloud', reviewScore=92, noOfStudents=21000}, Course{name='Kubernetes', category='Cloud', reviewScore=91, noOfStudents=20000}],
// FullStack =[Course{name='FullStack', category='FullStack', reviewScore=92, noOfStudents=21000}],
// Microservices =[Course{name='API', category='Microservices', reviewScore=97, noOfStudents=21000}, Course{name='MicroServices', category='Microservices', reviewScore=96, noOfStudents=25000}],
// Framework =[Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000}, Course{name='Spring Boot', category='Framework', reviewScore=95, noOfStudents=18000}, Course{name='Android', category='Framework', reviewScore=99, noOfStudents=26000}]
// }
        //Collectors.counting() ---> If we just want the courses are present under each category
        System.out.println("=================");
        System.out.println(CourseDataProvider.getCourseData()
                .stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
        //output ---> {Language=2, Cloud=3, FullStack=1, Microservices=2, Framework=3}

        //Collectors.maxBy ---> from each group get the max review score
        System.out.println("=================");
        System.out.println(CourseDataProvider.getCourseData()
                .stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));

        //------------ Get all the courses as a list by Group
        System.out.println("=================");
        System.out.println(CourseDataProvider.getCourseData()
                .stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.mapping(Course::getName, Collectors.toList()))));
    //{Language=[Java, Python], Cloud=[AWS, Docker, Kubernetes], FullStack=[FullStack], Microservices=[API, MicroServices], Framework=[Spring, Spring Boot, Android]}


    }
}
//{Language=Optional[Course{name='Java', category='Language', reviewScore=91, noOfStudents=20000}],
// Cloud=Optional[Course{name='Docker', category='Cloud', reviewScore=92, noOfStudents=21000}],
// FullStack=Optional[Course{name='FullStack', category='FullStack', reviewScore=92, noOfStudents=21000}],
// Microservices=Optional[Course{name='API', category='Microservices', reviewScore=97, noOfStudents=21000}],
// Framework=Optional[Course{name='Android', category='Framework', reviewScore=99, noOfStudents=26000}]}