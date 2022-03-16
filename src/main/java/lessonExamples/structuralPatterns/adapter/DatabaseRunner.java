package lessonExamples.structuralPatterns.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        lessonExamples.adapter.Database database = new lessonExamples.adapter.AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.delete();

    }
}
