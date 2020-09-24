/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoweka;

/**
 *
 * @author gusta
 */
public class ProjetoWeka {

    /**
     * @param args the command line arguments
     */
    public static String caminhoDados;

    public static void main(String[] args) throws
            Exception {
// salve o arquivo íris.arff na mesma pasta do
//projeto
        caminhoDados = "iris.arff";
        testeWeka exemplo = new testeWeka(caminhoDados);
        exemplo.leDados();
        exemplo.imprimeDados();
        
        exemplo.arvoreDeDecisaoJ48();
        exemplo.InstanceBased();
    }

}
