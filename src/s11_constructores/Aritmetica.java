/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11_constructores;

/**
 *
 * @author Jordi
 */
public class Aritmetica {
    
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor Vacio
    Aritmetica(){}
    
    //Constructor con 2 argumentos
    Aritmetica (int arg1, int arg2){
        a=arg1;
        b=arg2;
    }
    
    //Este metodo toma nuevos valores
    int sumar(int a, int b){
        return a+b;
    }
    
    //Este metodo toma los atributos de la clase
    int sumar(){
        return a+b;
    }
}
