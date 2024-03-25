import java.io.Serializable;

public class vehiculo implements Serializable{
    private String matricula;
    private String modelo;
    private String marca;
    private Double tamanyoDeposito;

    public vehiculo(String matricula,String modelo,String marca,Double tamanyoDeposito){
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.tamanyoDeposito = tamanyoDeposito;
    }



    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Double gettamanyoDeposito() {
        return tamanyoDeposito;
    }
    public void settamanyoDeposito(Double tamanyoDeposito) {
        this.tamanyoDeposito = tamanyoDeposito;
    }

    
}