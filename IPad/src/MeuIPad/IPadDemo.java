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
public class IPadDemo {
    public static void main(String args[]) {
        Device aparelho1 = new Device();
        IPad IPad1 = new IPad();
        IPadAir MeuIPadAir = new IPadAir();
        IPadMini MeuIPadMini = new IPadMini();
        
        MeuIPadAir.ligar();
        MeuIPadAir.setModelo("MD791BR/A");
        MeuIPadAir.setCodigoBarras(885909679);
        MeuIPadAir.setCor("Cinza Espacial");
        MeuIPadAir.setMesesGarantia(12);
        MeuIPadAir.setPesoLiq(469);
        MeuIPadAir.setTipoTela("Tela Convencional");
        Usuario usuario1 = new Usuario("Joao",123456);
        MeuIPadAir.setUsuarioIpad(usuario1);
        MeuIPadAir.tocarTela(2,3);
        
        MeuIPadMini.ligar();
        MeuIPadMini.setModelo("MD537BZ/A");
        MeuIPadMini.setCodigoBarras(885909634);
        MeuIPadMini.setCor("Branco");
        MeuIPadMini.setMesesGarantia(12);
        MeuIPadMini.setPesoLiq(308);
        MeuIPadMini.setTipoTela("Tela de Retina");
        Usuario usuario2 = new Usuario("Pedro",142356);
        MeuIPadMini.setUsuarioIpad(usuario2);
        MeuIPadMini.tocarTela(2,3);
        
        IPad.imprimeMensagem();
        MeuIPadAir.imprime();
        System.out.println();
        IPad.imprimeMensagem();
        MeuIPadMini.imprime();
        System.out.println();
        IPad1.imprime();
        System.out.println();
        aparelho1.imprime();
        System.out.println();
        
    }
    
}
