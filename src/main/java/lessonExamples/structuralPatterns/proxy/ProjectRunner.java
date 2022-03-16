package lessonExamples.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        lessonExamples.proxy.Project project = new lessonExamples.proxy.ProxyProject("https://www.gihub.com/lalala/realProject");

        project.run();
    }
}
