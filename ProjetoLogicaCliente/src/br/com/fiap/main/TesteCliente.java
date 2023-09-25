package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteCliente {

	public static void main(String[] args) {

		//Instanciar objetos
		
		Cliente objCliente = new Cliente ();
		Colaborador objColaborador = new Colaborador ();
		Endereco objEndereco = new Endereco ();
		
		//Entradas
		//Cliente
		
		objCliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
		
		//Endereco
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Informe o endeço"));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero")));
		 						// integer - int // double-double
		objCliente.setEndereco(objEndereco); //linkar com classe e endereco
		
		//Colaborador
		objColaborador.setNome(JOptionPane.showInputDialog("Digite o nome"));
		objColaborador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do colaborador")));
		
		//Saida
		System.out.println("Informações Cliente" + 
		"\nNome: " + objCliente.getNome() + 
		"\nIdade: " + objCliente.getIdade() +
		"\n\nInformacoes Endereco" +
		"\nLogradouro: " + objCliente.getEndereco().getLogradouro() + //Linkar com a classe cliente
		"\nNumero: " + objCliente.getEndereco().getNumero() +
		"\n\nInformações do Colaborador" +
		objColaborador.getTudo());
		
		System.out.println("\n\nTaxa: \n" + 
		objColaborador.pagaTaxa());
	
	}






	}


