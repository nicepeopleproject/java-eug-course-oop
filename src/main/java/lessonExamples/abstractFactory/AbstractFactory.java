package lessonExamples.abstractFactory;


public class AbstractFactory {
    /**
     * Абстрактная фабрика в том смысле, что создает не что-то конкретноеъ
     * Создание интерфейса, для создания множества взаимосвязанных или взаиомозависимых объектв
     * без жесткой привязки к конкретным классам
     * <p>
     * Для создания множества взаиомосвязанных объектов.
     * <p>
     * система не должна зависеть от метода создания, компоновки и представления входящих в нее объектов
     * входящие взаимосвязанные объекты должны использоваться вместе
     * система должна конфигурирова2ться одни из множества объектов из которых она состоит
     * нужно предоставить множество объектов раскрывая, только их интерфейсы, но не реализацию
     */
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        System.out.println("Create bank system.");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}

interface Tester {
    void testCode();
}

interface ProjectManager {
    void manageProject();
}

interface ProjectTeamFactory {
    Developer getDeveloper();

    ProjectManager getProjectManager();

    Tester getTester();
}

class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester test banking code.");
    }
}

class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages project.");
    }
}

class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }
}

class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code.");
    }
}

class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests code.");
    }
}

class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebSite PM manages project");
    }
}

class WebsiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }
}

class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("write java code");
    }
}