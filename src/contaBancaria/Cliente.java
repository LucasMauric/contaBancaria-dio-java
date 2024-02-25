package contaBancaria;
import java.util.*;
public class Cliente {
	
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		Scanner valor = new Scanner(System.in);
		Scanner strValor = new Scanner(System.in);
		
		System.out.println("Seja bem vindo ao banco: Sua conta meu dinheiro!");
		System.out.println("Digite 1 para criar uma conta ou 0 para cancelar: ");
		int opc = valor.nextInt();
		try {
			if(opc == 1) {
					try {
						ContaBancaria novaConta = new ContaBancaria();
						
							
						System.out.println("Insira o seu nome completo:");
						String nomeCompleto = "";
						nomeCompleto+=strValor.nextLine();
						
						novaConta.setNomeCliente(nomeCompleto);
						
						
						System.out.println("Numero: ");
						int numero = valor.nextInt();
						novaConta.setNumeroDaConta(numero);
						
						System.out.println("Numero da agencia: ");
						String numeroAgencia = valor.next();
						novaConta.setAgencia(numeroAgencia);
						
						System.out.println("Saldo: ");
						double saldoBancario = valor.nextDouble();
						novaConta.setSaldo(saldoBancario);
						
						System.out.println("Cadastro realizado com sucesso!");
						System.out.println("Cliente: " + novaConta.getNomeCliente() );
						System.out.println("Numero da conta: " + novaConta.getNumeroDaConta() );
						System.out.println("Agencia: " + novaConta.getAgencia() );
						System.out.println("Saldo: " + novaConta.getSaldo() );
						
						System.out.println("Obrigado por confiar em nosso serviço!");
						
						
						
						
					}catch(Exception e ) {
						System.out.println(e);
					}
				
				valor.close();
				strValor.close();
			}else {
				System.out.println("Fim.");
				
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
