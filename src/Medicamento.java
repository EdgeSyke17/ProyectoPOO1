import java.text.NumberFormat;

public class Medicamento {
    String codigo;
    String descripcion;
    String vencimiento;
    String prescripcion;
    double precio;
    protected int unidad = 0;
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
    public String getPrescripcion() {
        return prescripcion;
    }
    public void setPrescripcion(String prescripcion) {
        this.prescripcion = prescripcion;
    }
    public String getVencimiento() {
        return vencimiento;
    }
    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
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
    public int getUnidad(){
        return unidad;
    }
}
