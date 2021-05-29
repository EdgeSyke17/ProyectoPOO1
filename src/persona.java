public class persona {
    private String usuario;
    private String password;
    private String nombre;
    public persona(String usuario, String password, String nombre) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
    }
    persona usr = new persona(usuario, password, nombre);
}