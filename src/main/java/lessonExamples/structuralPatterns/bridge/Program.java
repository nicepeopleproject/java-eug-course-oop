package lessonExamples.bridge;

public abstract class Program {
    protected lessonExamples.bridge.Developer developer;

    protected Program(lessonExamples.bridge.Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
