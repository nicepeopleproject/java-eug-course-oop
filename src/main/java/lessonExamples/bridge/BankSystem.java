package lessonExamples.bridge;

public class BankSystem extends Program{
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("bank system development in progress");
        developer.writeCode();
    }
}
