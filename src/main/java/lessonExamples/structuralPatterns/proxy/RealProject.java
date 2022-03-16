package lessonExamples.proxy;

public class RealProject implements lessonExamples.proxy.Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.printf("Loading project from %s\n", url);
    }

    @Override
    public void run() {
        System.out.printf("Running project... %s\n", url);
    }
}
