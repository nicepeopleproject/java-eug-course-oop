package myExample.proxy;

public class Client {
    public static void main(String[] args) {
        myExample.proxy.MoleculeStandardizer moleculeStandardizer = new myExample.proxy.ProxyFastMoleculeStandardizer("C:/data");
        moleculeStandardizer.standardize(new myExample.proxy.Molecule());
    }
}
