/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.io.*;
import java.util.Scanner;


/**
 *
 * @author Arismendys Marte
 */
public class ListaEstudiantes {
        public static void main(String[] args) throws FileNotFoundException, IOException  
    {
        Nodo n;
        Lista l = new Lista();
        String contenido;
        String [] texto = null;
        
        File archivo = new File ("C:/archivo.txt");
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        StringBuilder stringBuilder = new StringBuilder();
        
        try {
            String linea;
            String ls = System.getProperty("line.separator");
            while ((linea = br.readLine()) != null) {
                stringBuilder.append(linea);
                stringBuilder.append(ls);
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            br.close();
            contenido = stringBuilder.toString();
            
            texto = contenido.split(",");
            int Mat = 0, contador = 0; 
            for(int i=0,a=0;i<texto.length; i+=4)
                {
                    n = new Nodo();
                    Estudiante est= new Estudiante(Integer.parseInt(texto[i].trim()),texto[i+1],texto[i+2],texto[i+3]);
                    n.setData((Object)est);
                    if(i==0){
                        l.AgregarPrimero(n);
                    }else{
                        for(int e = 0 ; e < l.size() ; e++)
                        {
                            Mat = ((Estudiante)(l.get(e)).getData()).getMatricula();
                            if(Integer.toString(Mat).equals(texto[i])){
                                contador++;
                            }
                        }
                        if (contador == 0){
                            l.Insertar(n);
                            contador = 0;
                        }else{
                            contador = 0;
                        }
                    }
                }
            System.out.println("Listado de estudiantes:");
            Estudiante est2;
            for(int c=0;c<l.size();c++){
                est2 = ((Estudiante)(l.get(c)).getData());
                System.out.print("\033[31m"+est2.getMatricula()+" \033[32m"+est2.getNombre()+" "+est2.getApellido()+" "+est2.getCarrera()+"\n");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
