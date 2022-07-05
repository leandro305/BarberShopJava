/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

/**
 *
 * @author bigolho16
 */
public interface IHelper {
    
    /**
     * Obrigatóriamente a classe que extenter desta interface vai ter que usar estes dois metodos definidos como 'abstract'
     * O retorno de 'Object' aqui (na interface) é por padrão, na hora que der o Override lá pode-se alterar o retorno para outro Objeto 
     * @return Object
     */
    public abstract Object obterModelo();
    /*
     * @return void
    */
    public abstract void limparTela();
    
}
