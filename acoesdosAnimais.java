package heranca;

public class acoesdosAnimais {
	
	public static void main(String[]args) {
		
		Cachorro Cachorro = new Cachorro();
		Cavalo  Cavalo = new Cavalo ();
		preguica preguica = new preguica ();
		
		Cachorro.setAcao("correr");
		Cachorro.setNome("Duck");
		Cachorro.setIdade(5);
		
		Cavalo.setAcao("correr");
		Cavalo.setNome("Ana");
		Cavalo.setIdade(7);
		
		preguica.setAcao("subir em arvores");
		preguica.setNome("Leo");
		preguica.setIdade(8);
		
		System.out.println("Nome do cachorro:" +Cachorro.getNome()+"\nidade do Cachorro:" +Cachorro.getIdade()+"\nacao do Cachorro �: " +Cachorro.getAcao());
		System.out.println("Nome do Cavalo:" +Cavalo.getNome()+ "\nidade do Cavalo �:" +Cavalo.getIdade()+ "\nacao do Cavalo �:" +Cavalo.getAcao());
		System.out.println("Nome da preguica:" +preguica.getNome()+ "\nidade da preguica �:" +preguica.getIdade()+" \nacao da preguica �: " +preguica.getAcao());
	   
	}
}
