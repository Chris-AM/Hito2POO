package modelo;

public class Persona {

    int codigo;
    String nombre;
    String apellido;
    String sexo;
    int edad;
    
    public Persona(){
        
    }
    
    public Persona(int codigo, String nombre, String apellido, String sexo,
    int edad){
        this.codigo = codigo;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
    }
    
    public Persona(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void comer(String comida){
        System.out.println("Estoy comiendo: " + comida);
    }
    
}
