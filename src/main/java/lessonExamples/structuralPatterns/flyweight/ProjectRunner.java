package lessonExamples.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        //клиент
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developerList = new ArrayList<>();
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("java"));
        developerList.add(developerFactory.getDeveloperBySpecialty("cpp"));
        developerList.add(developerFactory.getDeveloperBySpecialty("cpp"));
        developerList.add(developerFactory.getDeveloperBySpecialty("cpp"));
        developerList.add(developerFactory.getDeveloperBySpecialty("cpp"));
        developerList.add(developerFactory.getDeveloperBySpecialty("cpp"));
        developerList.add(developerFactory.getDeveloperBySpecialty("cpp"));
        developerList.add(developerFactory.getDeveloperBySpecialty("cpp"));
        developerList.add(developerFactory.getDeveloperBySpecialty("cpp"));
        developerList.forEach(Developer::writeCode);
    }
}
