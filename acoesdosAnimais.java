package heranca;

public class acoesdosAnimais {
	
	public static void main(String[]args) 
	{
      Cachorro cachorro = new Cachorro();
      Cavalo cavalo = new Cavalo();
      preguica preguica = new preguica();
      
      
      cachorro.setAcao("Correr");
      cachorro.setNome("Duck");
      cachorro.setIdade(5);
      cachorro.setEmitirSom("latir");
      
      cavalo.setAcao("Correr");
      cavalo.setNome("Ana");
      cavalo.setIdade(7);
      cavalo.setEmitirSom("potoco");
      
      preguica.setAcao("Subir em arvore");
      preguica.setNome("l�o");
      preguica.setIdade(8);
      preguica.setEmitirSom("som de pregui�a");
      
      
      System.out.println("Nome do cachorro �: "+cachorro.getNome()+"\nIdade do cachorro: "+cachorro.getIdade()+"\nA a��o do cachorro �: "+cachorro.getAcao()+"\nO som do cachorro �: "+cachorro.getEmitirSom() );
      System.out.println("Nome do cavalo �: "+cavalo.getNome()+"\nA idade do cavalo �: "+cavalo.getIdade()+"\nA a��o do cavalo �: "+cavalo.getAcao()+"\nO som do cavalo �: "+cavalo.getEmitirSom());
      System.out.println("O nome da pregui�a �: "+preguica.getNome()+"\nA idade da pregui�a �: "+preguica.getIdade()+"\nA a��o da pregui�a �: "+preguica.getAcao()+"\nO som da pregui�a �: "+preguica.getEmitirSom());
 }
}