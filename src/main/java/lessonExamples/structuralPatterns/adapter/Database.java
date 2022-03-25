package lessonExamples.structuralPatterns.adapter;

public interface Database {
    public void insert();

    public void update();

    public void select();

    public void delete();
}
