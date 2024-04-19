/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;
public class Game {
    public static void main(String[] args) {
     
Player j1 = new Player("Pequeno Ghesa", 100, 100, 100,100);
j1.setComida(1);
j1.mostrar();
j1.cacar();
j1.dormir(5);
j1.comer(1);

    }
}
