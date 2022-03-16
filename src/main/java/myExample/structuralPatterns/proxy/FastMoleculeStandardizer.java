package myExample.proxy;

public class FastMoleculeStandardizer implements myExample.proxy.MoleculeStandardizer {
    private String resourcesPath;

    public FastMoleculeStandardizer(String resourcesPath) {
        this.resourcesPath = resourcesPath;
        loadResources();
    }

    public void loadResources() {
        System.out.println("Resources are loading...");
    }


    @Override
    public void standardize(myExample.proxy.Molecule molecule) {
        System.out.println("Standardizing molecule");
    }
}
