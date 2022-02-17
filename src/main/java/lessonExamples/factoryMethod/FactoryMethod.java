package lessonExamples.factoryMethod;

public class FactoryMethod {
    /**
     * Шаблон: Фабрика
     * <p>
     * Цель: Делегирования создания объектов другому классу, удобно использоватьс когда заранее не известно экземпляр какого класса нужно бдует создать.
     * <p>
     * Пример использования:
     * когда заранее не знаем экземпляр какого класса нужно создать
     * когда нужно чтобы созданный объект имел свойства конкретного класса
     */
    public static void main(String[] args) {
        Program.run();

    }
}


class Program {
    public static void run() {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("python");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("python")) {
            return new PythonDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown.");
        }
    }
}

interface Developer {
    void writeCode();
}

class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code.");
    }
}

class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes cpp code");
    }
}

class PythonDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Python developer writes python code.");
    }
}

interface DeveloperFactory {
    Developer createDeveloper();
}


class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}

class CppDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}

class PythonDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}