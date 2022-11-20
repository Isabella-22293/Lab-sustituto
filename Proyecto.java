import java.util.ArrayList;
public class Proyecto {
    private String Nombre;
    private String Tipo;
    private Boolean Barato;
    ArrayList<Individuo> Individuo=new ArrayList<Individuo>();
    public Proyecto(String Nombre, String tipo) {
        this.Nombre=Nombre;
        this.Tipo=Tipo;
    }
    public String averiguar(){
        String Trabajador="";
        if(this.Tipo.equalsIgnoreCase("1")){
            Trabajador="Ingeniero-Practicante";
        }else if(this.Tipo.equalsIgnoreCase("2")){
            Trabajador="Practicante-Administrador";
        }else if(this.Tipo.equalsIgnoreCase("3")){
            Trabajador="ingeniero-Administrador";
        }else if(this.Tipo.equalsIgnoreCase("4")){
            Trabajador="Practicante-Administrador";
        }
        return Trabajador;
    }
    public void Individuo(Individuo i1,Individuo i2){
            Individuo.add(i1);
            Individuo.add(i2);   
    }
    public String getNombre() {
        return this.Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getTipo() {
        return this.Tipo;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    public Boolean isBarato() {
        return this.Barato;
    }
    public Boolean getBarato() {
        return this.Barato;
    }
    public void setBarato(Boolean Barato) {
        this.Barato = Barato;
    }
    @Override
    public String toString() {
        return "{" +
            " Nombre='" + getNombre() + "'" +
            ", Tipo='" + getTipo() + "'" +
            ", Barato='" + isBarato() + "'" +
            "}";
    }
}