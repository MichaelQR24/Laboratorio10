
package laboratorio09;

public class Smartphone implements Camara,Reproductordemusica,NavegadordeInternet{
    private String marca;
    private String modelo;
    
    public Smartphone(String marca,String modelo){
    this.marca=marca;
    this.modelo=modelo;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
 public void grabarvideo() {
       System.out.println("Grabar Video");
    }

    @Override
    public void tomarfoto() {
        System.out.println("Tomar Foto");
    }

    @Override
    public void reproducir() {
        System.out.println("Reproducir Musica");
    }

    @Override
    public void detener() {
        System.out.println("detener Musica");
    }

    @Override
    public void buscar() {
        System.out.println("Buscar Musica");
    }

    @Override
    public void actualizar() {
       System.out.println("Actualizar Musica");
    }   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Smartphone miSmartphone = new Smartphone("Xiaomi", "Poco X3 PRO");
    miSmartphone.grabarvideo();
    miSmartphone.tomarfoto();
    miSmartphone.reproducir();
    miSmartphone.detener();
    miSmartphone.buscar();
    miSmartphone.actualizar();
    }
}
