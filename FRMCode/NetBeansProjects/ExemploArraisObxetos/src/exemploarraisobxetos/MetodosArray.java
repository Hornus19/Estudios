/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraisobxetos;

import javax.swing.JOptionPane;

/**
 *
 * @author femio23
 */
public class MetodosArray {
    public void amosar(Persoa[]lp){
        //bucle for forage
    for(Persoa ele:lp)
            System.out.println(ele);
    }
    public Persoa[]creararray(){
        int elem;
        elem=Integer.parseInt(JOptionPane.showInputDialog("De cantos elementos constará o array?"));
        Persoa[]persoas=new Persoa[elem];
        String nome,dni;
        for(int i=0;i<persoas.length;i++){
            nome=JOptionPane.showInputDialog("Nome?");
            dni=JOptionPane.showInputDialog("DNI?");
        persoas[i]=new Persoa(nome,dni);
        }
        return persoas;
    }
    public Persoa buscar(Persoa[]lip, String dNi){
        int i=0;
        Persoa p1=new Persoa();
        for(Persoa dni:lip){ 
        if(lip[i].dni.equals(dNi)){
        p1=lip[i];
        }
        i++;
        }
         return p1;
        }
}
