/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_progra2_franklin_garcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Franklin Garcia
 */
public class adminHadas implements Serializable {

    private static final long SerialVersionUID = 222L;

    private ArrayList<hadas> lista_hadas = new ArrayList();

    private File archivo = null;

    public adminHadas(String path) {

        archivo = new File(path);

    }

    public ArrayList<hadas> getLista_Hadas() {

        return lista_hadas;

    }

    public void setLista_Hadas(ArrayList<hadas> lista_hadas) {

        this.lista_hadas = lista_hadas;

    }

    public File getArchivo() {

        return archivo;

    }

    public void setArchivo(File archivo) {

        this.archivo = archivo;

    }

    public void setGuerrero(hadas a) {

        lista_hadas.add(a);

    }

    //
    public void cargarArchivo() {

        try {

            lista_hadas = new ArrayList();

            hadas temp;

            if (archivo.exists()) {

                FileInputStream entrada = new FileInputStream(archivo);

                ObjectInputStream objeto = new ObjectInputStream(entrada);

                try {

                    while ((temp = (hadas) objeto.readObject()) != null) {

                        lista_hadas.add(temp);

                    }

                } catch (EOFException e) {

                    //encontro el final del archivo
                }

                objeto.close();

                entrada.close();

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public void escribirArchivo() {

        FileOutputStream fw = null;

        ObjectOutputStream bw = null;

        try {

            fw = new FileOutputStream(archivo);

            bw = new ObjectOutputStream(fw);

            for (hadas t : lista_hadas) {

                bw.writeObject(t);

            }

            bw.flush();

        } catch (Exception ex) {

        } finally {

            try {

                bw.close();

                fw.close();

            } catch (Exception e) {

            }

        }

    }
}
