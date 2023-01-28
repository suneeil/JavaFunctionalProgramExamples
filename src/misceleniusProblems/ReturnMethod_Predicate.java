package misceleniusProblems;

import createCustomClass.courseData.Course;

import java.util.function.Predicate;

/**
 * Return Predicate As Function is called HigherOrder function
 */
public class ReturnMethod_Predicate {

    public static void main(String[] args) {

        Predicate<Course> scoreGreaterThan95 = getCoursePredicate(95);
        Predicate<Course> scoreGreaterThan90 = getCoursePredicate(90);

    }

    private static Predicate<Course> getCoursePredicate(int cutOfReviewScore) {
        return course -> course.getReviewScore() > cutOfReviewScore;
    }
}
