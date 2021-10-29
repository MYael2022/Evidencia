public class doctor {
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono,edad,IDcedula;
public doctor(String nombre2, String apellido2, int edad2, String direccion2, int telefono2, int iDcedula2 )
    {
        nombre= " ";
        apellido= " ";
        direccion= " ";
        telefono= 0;
        edad= 0;
        IDcedula=0;
    }
    public doctor(String n,String a, String di, int t, int ed,int idc)
    {
        nombre= n;
        apellido= a;
        direccion= di;
        telefono= t;
        edad= ed;
        IDcedula=idc;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIDcedula() {
        return this.IDcedula;
    }

    public void setIDcedula(int IDcedula) {
        this.IDcedula = IDcedula;
    }

}
