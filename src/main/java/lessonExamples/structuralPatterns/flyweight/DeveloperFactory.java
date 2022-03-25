package lessonExamples.structuralPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String speciality) {
        Developer developer = developers.get(speciality);
        if (developer == null) {
            switch (speciality) {
                case "java":
                    System.out.println("Hiring java developer");
                    developer = new JavaDeveloper();
                    break;
                case "cpp":
                    System.out.println("Hiring cpp developer");
                    developer = new CppDeveloper();
                    break;
            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
