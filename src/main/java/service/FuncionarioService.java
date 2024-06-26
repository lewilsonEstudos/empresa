package service;

import org.springframework.stereotype.Service;

import entity.Funcionario;
import entity.FuncionarioTerceirizado;


@Service
public class FuncionarioService {
	
	public static final int um = 1;
	public static final int cem = 100;
	
    public static void reajustarSalario(Funcionario funcionario, double percentual) {
        if (!(funcionario instanceof FuncionarioTerceirizado)) {
            double novoSalario = funcionario.getSalario() * ( um + percentual / cem);
            funcionario.setSalario(novoSalario);
        }
    }
}