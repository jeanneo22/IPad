/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MeuIPad;

import java.util.Arrays;

/**
 *
 * @author Jeanne
 */
public class IPadAir extends IPad{ 
    private static final float tamanhoTela = 9.7F; // tamanho da tela em polegadas
    private static String funcionalidades[] = {"EDGE","GPRS","WAP","CameraFilmadora","MP3","Bluetooth","Calendario","Calculadora","GPS"}; // funcionalidades do IPAdAir
    private static int i = 0;

    public IPadAir(String modelo, int codigoBarras, float pesoLiq, String cor, String tipoTela, int mesesGarantia, Ponto coordenadasTela, Usuario usuarioIpad, float tamanhoTela) {
        super(modelo, codigoBarras, pesoLiq, cor, tipoTela, mesesGarantia, coordenadasTela, usuarioIpad);
    }
    
    public IPadAir() {
        super();
    }
    
    public IPadAir(IPadAir iPadAirOriginal) {
        super(iPadAirOriginal);
    }

    public static void setFuncionalidade(String funcionalidade) {
        IPadAir.funcionalidades[i] = funcionalidade;
        i++;
    }
    
    public static String getFuncionalidade(int i) {
        return IPadAir.funcionalidades[i];
    }

    public float getTamanhoTela() {
        return tamanhoTela;
    }
    
    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Tamanho da Tela: "+IPadAir.tamanhoTela);
        System.out.println("Funcionalidades:");
        System.out.println(Arrays.toString(IPadAir.funcionalidades));
    } 
    
}
