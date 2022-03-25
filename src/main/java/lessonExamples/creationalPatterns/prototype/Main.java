package lessonExamples.creationalPatterns.prototype;

public class Main {
    /*
    Цель определить вид создаваемых объектов с помощью экземпляра - прототипа и создавать новые объекты, копируя этот прототип

    Используется для создания копий заданного объекта.

    Примеры:
    - классы, экземпляры которых необходимо создать определяется во время выполнения програмымы
    - для избежания построения иерархии классов, фабрик или параллельных иерархий
    - экзелпяры класса могут находиться в одном из немногих возможных состояний
     */
    public static void main(String[] args) {
        Project master = new Project(1, "Super project", "import ...");
        System.out.println(master);
// не самый удачный способ из-за приведения типов
        Project branch = (Project) master.copy();
        System.out.println(branch);
        //  лучше способ
        ProjectFactory projectFactory = new ProjectFactory(master);
        Project branch2 = projectFactory.cloneProject();
        System.out.println(branch2);

    }
}
