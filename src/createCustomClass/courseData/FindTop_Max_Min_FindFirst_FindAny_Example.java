package createCustomClass.courseData;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindTop_Max_Min_FindFirst_FindAny_Example {

    public static void main(String[] args) {
        Comparator<Course> descendingOrderByReviewScore = Comparator.comparing(Course::getReviewScore).reversed();
        System.out.println(CourseDataProvider.getCourseData().stream().sorted(descendingOrderByReviewScore).collect(Collectors.toList()));
        System.out.println("=================");
        //max --> Returns the last element in the list
        System.out.println(CourseDataProvider
                .getCourseData()
                .stream()
                .max(descendingOrderByReviewScore));
        System.out.println("=================");
        System.out.println(List.of(0, 1, 2, 3, 4, 5, 8, 2).stream().max(Comparator.naturalOrder()));

        //min --> Return first element in the list
        System.out.println("=================");
        System.out.println(CourseDataProvider
                .getCourseData()
                .stream()
                .min(descendingOrderByReviewScore));
        System.out.println("=================");
        System.out.println(List.of(0, 1, 2, 3, 4, 5, 8, 2).stream().min(Comparator.reverseOrder()));
        System.out.println("=================");
        //Optional --> does not give null pointer exception and with we can return some default value using orElse

        Predicate<Course> coursePredicate = course -> course.getReviewScore() < 20;
        System.out.println(CourseDataProvider.getCourseData()
                .stream()
                .filter(coursePredicate)
                .min(descendingOrderByReviewScore)
                .orElse(new Course("none", "none", 0, 0))
        );
        System.out.println("=================");
        //findFirst --> Pick first element that matches our criteria
        Predicate<Course> reviewScoreLessThan90 = course -> course.getReviewScore() < 95;
        System.out.println(CourseDataProvider.getCourseData()
                .stream().collect(Collectors.toList()));
        System.out.println(CourseDataProvider.getCourseData()
                .stream()
                .filter(reviewScoreLessThan90)
                .findFirst());
        //findAny --> Pick any one element that matches our criteria
        System.out.println(CourseDataProvider.getCourseData()
                .stream()
                .filter(reviewScoreLessThan90)
                .findAny());
    }
}
