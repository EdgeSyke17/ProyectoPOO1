import java.text.NumberFormat;

public class Medicamento {
    String codigo;
    String descripcion;
    double precio;
    protected int unidades = 0;
    Medicamento(){}
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getFormattedPrecio(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(precio);
    }
}
