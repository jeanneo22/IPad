/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MeuIPad;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Jeanne
 */
public class Usuario {
    private String nome;
    private int senha;

    public Usuario(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario() {
        this.nome = "";
        this.senha = 000000;
    }
    
    public Usuario(Usuario usuarioOriginal) {
        this.nome = usuarioOriginal.nome;
        this.senha = usuarioOriginal.senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(int senha) {
        this.senha = (senha%100000>= 1)?senha:000000;
    }

    public String getNome() {
        return nome;
    }

    public int getSenha() {
        return senha;
    }
    
    public void cadastraUsuario() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nome = null;
        System.out.println("Usuario:");
        try {
            nome = br.readLine();
            setNome(nome);
        } catch (IOException ioe) {
            System.out.println("Erro ao ler nome de usuario");
            System.exit(1);
        }
        int senha;
        Scanner lerSenha = new Scanner(System.in);
        System.out.println("Senha:");
        senha = lerSenha.nextInt();
        setSenha(senha);
    }
    
    @Override
    public String toString() {
        String s = "Nome: "+nome+" Senha: "+senha;
        return s;
    }
}
