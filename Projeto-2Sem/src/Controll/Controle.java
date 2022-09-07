/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import View.Cadastro;
import java.util.ArrayList;



/**
 *
 * @author Ana Julia
 */
public class Controle {
    private String nome;
    private int Preco;
    private String marca;
    private int codigo;
// Array 

     private  ArrayList<Cadastro> listaPr;

    public Controle() {
        listaPr = new ArrayList <>();
    }
   
    
 public ArrayList<Cadastro> buscar ()
    {
        
        return listaPr;
    }
    
    


//Metodos 
   
    public void CadastrarProduto(){
    
        String Produto;
        
        
        Produto pr = new Produto ();
        listaPr.add();
         buscar();
    
    
    }
        
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return Preco;
    }

    public void setPreco(int Preco) {
        this.Preco = Preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    
    
}
