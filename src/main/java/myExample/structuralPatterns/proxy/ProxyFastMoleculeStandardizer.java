package myExample.proxy;

public class ProxyFastMoleculeStandardizer implements myExample.proxy.MoleculeStandardizer {
    private myExample.proxy.FastMoleculeStandardizer fastMoleculeStandardizer;
    private String resourcesPath;

    public ProxyFastMoleculeStandardizer(String resourcesPath) {
        this.resourcesPath = resourcesPath;
    }


    @Override
    public void standardize(myExample.proxy.Molecule molecule) {
        if (fastMoleculeStandardizer == null) {
            fastMoleculeStandardizer = new myExample.proxy.FastMoleculeStandardizer(resourcesPath);
        }
        fastMoleculeStandardizer.standardize(molecule);
    }
}
