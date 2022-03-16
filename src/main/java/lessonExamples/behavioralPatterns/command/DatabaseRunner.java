package lessonExamples.behavioralPatterns.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
          new InsertCommand(database),
          new UpdateCommand(database),
          new DeleteCommand(database),
          new SelectCommand(database)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
