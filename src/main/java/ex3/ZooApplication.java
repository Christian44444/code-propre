package ex3;


public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		Animal a1 = new Animal("Gazelle", Type.MAMMIFERE, Comportement.HERBIVORE);
		Animal a2 = new Animal("Zèbre", Type.MAMMIFERE, Comportement.HERBIVORE);
		Animal a3 = new Animal("Lion", Type.MAMMIFERE, Comportement.HERBIVORE);
		Animal a4 = new Animal("Panthère", Type.MAMMIFERE, Comportement.CARNIVORE);
		Animal a5 = new Animal("Requin blanc", Type.POISSON, Comportement.HERBIVORE);
		Animal a6 = new Animal("Truite dorée", Type.POISSON, Comportement.HERBIVORE);
		Animal a7 = new Animal("Boa constrictor", Type.SERPENT, Comportement.CARNIVORE);
		Animal a8 = new Animal("Python", Type.SERPENT, Comportement.CARNIVORE);
		
		zoo.addAnimal(a1);
		zoo.addAnimal(a2);
		zoo.addAnimal(a3);
		zoo.addAnimal(a4);
		zoo.addAnimal(a5);
		zoo.addAnimal(a6);
		zoo.addAnimal(a7);
		zoo.addAnimal(a8);
		
	}

}
