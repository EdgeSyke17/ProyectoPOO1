public class farmaceutico extends persona {
    protected int contadorF = 0;
    private int nLicencia;

    public farmaceutico(String usuario, String password, String nombre, int nLicencia) {
        super(usuario, password, nombre);
        this.nLicencia=nLicencia;
        contadorF++;
    }
    private static void vender(){

    }
}
