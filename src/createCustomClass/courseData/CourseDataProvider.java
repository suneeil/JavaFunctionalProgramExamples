package createCustomClass.courseData;

import java.util.List;

public class CourseDataProvider {

    public static List<Course> getCourseData() {
        return List.of(
                new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("API", "Microservices", 97, 21000),
                new Course("MicroServices", "Microservices", 96, 25000),
                new Course("AWS", "Cloud", 91, 14000),
                new Course("FullStack", "FullStack", 92, 21000),
                new Course("Android", "Framework", 99, 26000),
                new Course("Docker", "Cloud", 92, 21000),
                new Course("Kubernetes", "Cloud", 91, 20000),
                new Course("Java", "Language", 91, 20000),
                new Course("Python", "Language", 91, 20000)

        );
    }
}
