/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Andrey Sancho
 */
public class inventory {
    String nombre;
    int precio;
    int statataque;
    int statdefensa;
    int statluck;
    int statspeed;
    int statsalud;
    public inventory(String nombre,int precio,int statataque,int statdefensa,int statluck, int statspeed, int statsalud){
        this.nombre = nombre;
        this.precio = precio;
        this.statataque = statataque;
        this.statdefensa = statdefensa;
        this.statluck = statluck;
        this.statsalud = statsalud;
        this.statspeed = statspeed;
    }
    public void imprimirinventario(){
        System.out.println("Item: " + nombre);
    }
    
    //public void crearInventorio(){
        //public static void main(String[] args){
        /*ArrayList<String> inventario = new ArrayList<String>( );
        inventario.add("Lampara");
        inventario.add("Latigo");
        inventario.add("Armadura");
        inventario.add("Medicina");
        inventario.add("Pocion de velocidad");
    
        System.out.println(inventario);
    
    }*/
        
}
