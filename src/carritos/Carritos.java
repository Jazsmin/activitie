/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carritos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author UTBIS
 */
public class Carritos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<carritos2> List = new ArrayList<>();
        boolean flag=true;
        do{
            int oper = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu"
                                                                         +"1. Lista de autos "
                                                                         +"2. Agregar auto "
                                                                         +"3. Vender auto "
                                                                         +"4. Precio "
                                                                         +"0. Salir "));
            switch (oper){
                case 1:
                    if(List.size()>0){
                        for (int i=0; i < List.size(); i++){
                            System.out.println(List.get(i).getModelo());
                            System.out.println(List.get(i).getColor());
                            System.out.println(List.get(i).getID());
                            System.out.println(List.get(i).getPrecio());
                        }//end of for
                    }//end of if
                    else{
                        System.out.println("no hay carros... agrege uno con la opcion 2");
                    }//end of else
                    break;
                case 2:
                    String a = JOptionPane.showInputDialog("Modelo de carro: ");
                    String b = JOptionPane.showInputDialog("Color");
                    String c = JOptionPane.showInputDialog("ID=Placas");
                    int d = Integer.parseInt(JOptionPane.showInputDialog("Precio de carro"));
                    List.add(new carritos2 (a, b, c, d));
                    break;
                case 3:
                    int l = Integer.parseInt(JOptionPane.showInputDialog("Se verá el auto a vender"));
                    int po = Integer.parseInt(JOptionPane.showInputDialog("Desea vender auto?" 
                            +"1. si" 
                            +"2. no"));
                    if (po==1){
                        List.remove(l);
                        System.out.println("Vendido");
                    }//end of if
                    else{
            }//end of else
                    break;
                case 4:
                    int q = Integer.parseInt(JOptionPane.showInputDialog("Ver auto a vender"));
                    for (int i=0; i < List.size(); i++){
                        System.out.println(List.get(q).getPrecio());
                    }//end of for
                    break;
                case 0:
                    System.exit(0);
                    break;
        }//end of switch
    }//end of do
        while (flag);
    
}//end of main
}//end of class carritos
