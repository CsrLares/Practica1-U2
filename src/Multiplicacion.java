
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cesar
 */
public class Multiplicacion {
    
public static void main(String ar[]){
    int a=Integer.parseInt(showInputDialog("Numero de la tabla"));
    String cad="",cad2="";
    multiplicacion(0,a,10,0,cad,cad2);
}

    public static String multiplicacion(int total,int a, int b, int c,String cad,String cad2){
       if(a==0){
            showMessageDialog(null,"Cualquier valor multiplicado por 0 es 0");
       }else{
           if(c<10){
                total=total+a;
                c++;
                cad=a+"x"+c+"="+total;
                cad2=cad2+cad+"\n";
                showMessageDialog(null,cad2);
                multiplicacion(total,a,b,c,cad,cad2); 
           }
       }
    return null;   
    }
}
 