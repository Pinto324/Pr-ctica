
package Utilidades;


public enum Tokens {
    DECIMAL("","Decimal"),
    ID("","ID"),
    ENTERO("","Entero"),
    SIMBOLO("","Simbolo"),
    ERROR("","Error");
    private String Contenido;
    private String Clasificacion;

    private Tokens(String Contenido, String Clasificacion) {
        this.Contenido = Contenido;
        this.Clasificacion = Clasificacion;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }
    
}
