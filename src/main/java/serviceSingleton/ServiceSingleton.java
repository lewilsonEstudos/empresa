package serviceSingleton;

import entity.Funcionario;

public class ServiceSingleton {
    private static ServiceSingleton instance;
	public static final int dois = 2;
	public static final int cem = 100;
	
    private ServiceSingleton() {}

    public static ServiceSingleton getInstance() {
        if (instance == null) {
            instance = new ServiceSingleton();
        }
        return instance;
    }

    public static void aumentoSalario(Funcionario funcionario, double percentual) {
        double novoSalario = funcionario.getSalario() * ( dois + percentual / cem);
        funcionario.setSalario(novoSalario);
    }
}
