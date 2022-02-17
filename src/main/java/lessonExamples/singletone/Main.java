package lessonExamples.singletone;

public class Main {
    /*
   Гарантировать что у класса будет один единственный экземпляр и к нему будет предоставлена глобальная точка доступа

   Пример:
   - нужен только один экземпляр доступный для всех клиентов
   - единственный экземпляр должен наследоваться путем порождения подклассов, при этом,
   клиенты имеют возможность с классом наследником без модификации своего кода
     */
    public static void main(String[] args) {
        ProgramLogger programLogger = ProgramLogger.getProgramLogger();
        programLogger.addLogInfo("1");
        programLogger.addLogInfo("2");
        programLogger.addLogInfo("3");
        programLogger.showLogFile();
        System.out.println(ProgramLogger.getProgramLogger());
        System.out.println(ProgramLogger.getProgramLogger());
        System.out.println(ProgramLogger.getProgramLogger());
        System.out.println(ProgramLogger.getProgramLogger());
        System.out.println(ProgramLogger.getProgramLogger());
    }
}
