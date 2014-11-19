/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MeuIPad;

/**
 *
 * @author Jeanne
 */
public class Device {
    protected String modelo;
    protected int codigoBarras;
    protected float pesoLiq; // Peso liq em gramas
    protected boolean ligado;

    public Device(String modelo, int codigoBarras, float pesoLiq) {
        setModelo(modelo);
        setCodigoBarras(codigoBarras);
        setPesoLiq(pesoLiq);
        this.ligado = false;
    }

    public Device() {
        this.modelo = "";
        this.codigoBarras = 0;
        this.pesoLiq = 0.00F;
        this.ligado = false;
    }

    public Device(Device aparelhoOriginal) {
        this.modelo = aparelhoOriginal.modelo;
        this.codigoBarras = aparelhoOriginal.codigoBarras;
        this.pesoLiq = aparelhoOriginal.pesoLiq;
        this.ligado = aparelhoOriginal.ligado;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = (codigoBarras>=0)?codigoBarras:0;
    }

    public void setPesoLiq(float pesoLiq) {
        this.pesoLiq = (pesoLiq>=0)?pesoLiq:0.00F;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public float getPesoLiq() {
        return pesoLiq;
    }
    
    public void ligar() {
        this.ligado = true;
    }
    
    public void desligar() {
        this.ligado = false;
    }
    
    public boolean isLigado() {
        return(this.ligado);
    }
    
    public void imprime() {
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Codigo de Barras: "+this.codigoBarras);
        System.out.println("Peso Liquido: "+this.pesoLiq+ " g");
        if(isLigado()) System.out.println("Esta ligado");
        else System.out.println("Desligado");
    }
    public static void isIPad(Device aparelho) {
        if(aparelho instanceof IPad)
            System.out.println("E um IPad");
        else System.out.println("Nao e um IPad");
    }
}
