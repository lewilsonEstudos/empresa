package com.example.empresa;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.builderFuncionario.FuncionarioBuilder;

import entity.Funcionario;
import enums.NivelProfissional;
import enums.Setor;
import service.FuncionarioService;
import serviceSingleton.ServiceSingleton;

@SpringBootApplication
public class EmpresaApplicationRun {

	public static void main(String[] args) {
			
		Funcionario funcionario = new FuncionarioBuilder()
			    .setNome("Lewilson Freire")
			    .setTelefones(Arrays.asList("123654123"))
			    .setEndereco("Casa, 16")
			    .setSalario(2000)
			    .setSetor(Setor.DESENVOLVIMENTO_DE_SOFTWARE)
			    .setCargo(NivelProfissional.JUNIOR)
			    .build();
		
		
		 Funcionario funcionario2 = new Funcionario(
		            "Lewilson tTeste",
		            Arrays.asList("998877441"),
		            "Avenida São Joao",
		            7000,
		            Setor.ANALISTA_QA,
		            NivelProfissional.PLENO
		        );
		
		 
	        Funcionario funcionario3 = new Funcionario(
	                "LEWILSON S FREIRE",
	                Arrays.asList("147852369"),
	                ", 10",
	                10000,
	                Setor.GERENTE_DE_SEVICOS,
	                NivelProfissional.SENIOR
	            );
	        
			 Funcionario funcionario4 = new Funcionario(
			            "Laura Martins",
			            Arrays.asList("998877441"),
			            "Avenida São Joao",
			            17000,
			            Setor.SUPORTE_TECNICO,
			            NivelProfissional.ESTAGIARIO
			        );
	
	        FuncionarioService.reajustarSalario(funcionario, 0.30);
	        ServiceSingleton.aumentoSalario(funcionario2, 0.50);
	        FuncionarioService.reajustarSalario(funcionario3, 1.00);
	        FuncionarioService.reajustarSalario(funcionario4, 5.00);
	        

	        System.out.println("salario: " + funcionario.getSalario());
	        System.out.println("salario2: " + funcionario2.getSalario());
	        System.out.println("salario3: " + funcionario3.getSalario());
	        System.out.println("salario4: " + funcionario.getSalario());
	        
	        
	}

}
