package lessonExamples.proxy;

public class ProxyProject implements lessonExamples.proxy.Project {
    private String url;
    private lessonExamples.proxy.RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null){
            realProject = new lessonExamples.proxy.RealProject(url);
        }
        realProject.run();
    }
}
