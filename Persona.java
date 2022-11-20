public class Persona {
    private String Nombre;
    private boolean Barato;
    private boolean TiempoCompleto;
    private String Tipo;
    private boolean Amistoso;
    private boolean Colaborador;
    private boolean Experiencia;
    private boolean Creatividad;
    public Personal(String Nombre, boolean Barato, boolean TiempoCompleto, String Tipo, boolean Amistoso, boolean Colaboradores,boolean Experiencia,boolean Creatividad) {
        this.Nombre = Nombre;
        this.Barato = Barato;
        this.TiempoCompleto = TiempoCompleto;
        this.Tipo = Tipo;
        this.Amistoso = Amistoso;
        this.Colaborador = !Colaborador;
        this.Experiencia=Experiencia;
        this.Creatividad=Creatividad;
    }
    public String getNombre() {
        return this.Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public boolean isBarato() {
        return this.Barato;
    }
    public boolean getBarato() {
        return this.Barato;
    }
    public void setBarato(boolean Barato) {
        this.barato = Barato;
    }
    public boolean isTiempoCompleto() {
        return this.TiempoCompleto;
    }
    public boolean getTiempoCompleto() {
        return this.TiempoCompleto;
    }
    public void setTiempoCompleto(boolean TiempoCompleto) {
        this.TiempoCompleto = TiempoCompleto;
    }
    public String getTipo() {
        return this.Tipo;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    public boolean isAmistoso() {
        return this.Amistoso;
    }
    public boolean getAmistoso() {
        return this.Amistoso;
    }
    public void setAmistoso(boolean Amistoso) {
        this.Amistoso = Amistoso;
    }
    public boolean isColaborador() {
        return this.Colaborador;
    }
    public boolean getColaborador() {
        return this.Colaboradores;
    }
    public void setColaborador(boolean Colaborador) {
        this.Colaborador = Colaborador;
    }
    public boolean isExperiencia() {
        return this.Experiencia;
    }
    public boolean getExperiencia() {
        return this.Experiencia;
    }
    public void setExperiencia(boolean Experiencia) {
        this.Experiencia = experiencia;
    }
    public boolean isCreatividad() {
        return this.Creatividad;
    }
    public boolean getCreatividad() {
        return this.Creatividad;
    }
    public void setCreatividad(boolean Creatividad) {
        this.Creatividad = Creatividad;
    }
    @Override
    public String toString() {
        return "{" +
            " Nombre='" + getNombre() + "'" +
            ", Barato='" + isBarato() + "'" +
            ", TiempoCompleto='" + isTiempoCompleto() + "'" +
            ", Tipo='" + getTipo() + "'" +
            ", Amistoso='" + isAmistoso() + "'" +
            ", Colaborador='" + isColaborador() + "'" +
            "}";
    }
}