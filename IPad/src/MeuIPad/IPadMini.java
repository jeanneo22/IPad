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
public class IPadMini extends IPad{
    private static final float tamanhoTela = 7.9F; // tamanho da tela em polegadas
    private static String funcionalidades[] = {"EDGE","GPRS","WAP","CameraFilmadora","Bluetooth","Calendario","Calculadora","GPS"}; // funcionalidades do IPadMini
    private static int i = 0;

    public IPadMini(String modelo, int codigoBarras, float pesoLiq, String cor, String tipoTela, int mesesGarantia, Ponto coordenadasTela, Usuario usuarioIpad, float tamanhoTela) {
        super(modelo, codigoBarras, pesoLiq, cor, tipoTela, mesesGarantia, coordenadasTela, usuarioIpad);
    }
    
    public IPadMini() {
        super();
    }
    
    public IPadMini(IPadMini iPadMiniOriginal) {
        super(iPadMiniOriginal);
    }
    
    public static void setFuncionalidade(String funcionalidade) {
        IPadMini.funcionalidades[i] = funcionalidade;
        i++;
    }
    
    public static String getFuncionalidade(int i) {
        return IPadMini.funcionalidades[i];
    }
    public float getTamanhoTela() {
        return tamanhoTela;
    }
    
    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Tamanho da Tela: "+IPadMini.tamanhoTela);
        System.out.println("Funcionalidades:");
        System.out.println(Arrays.toString(IPadMini.funcionalidades));
    } 
}
