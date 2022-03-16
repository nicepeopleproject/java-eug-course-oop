package lessonExamples.adapter;

public class AdapterJavaToDatabase extends lessonExamples.adapter.JavaApplication implements lessonExamples.adapter.Database {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
