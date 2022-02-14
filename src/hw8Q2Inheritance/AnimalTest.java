package hw8Q2Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
        Animal animal = new Animal();
		animal.animalInfo();// parents class

		System.out.println("/n...................../n");
        Mammal mammal = new Mammal();
		mammal.mammalInfo();/*This is single inheritance mammal(child class) example:here animal is parents class so mammal(child class)can inherit animal as a(parents class)*/
		mammal.animalInfo();

		System.out.println("/n....................\n");Dog dog = new Dog();
		dog.dogInfo();/*This is multilevel inheritance dog (child class) example:here           animal is parents class so mammal and dog(child class)so they can inherit animal as a(parent class*/
		dog.mammalInfo();
		dog.animalInfo();

		System.out.println("/n.....................\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();/*This is Hierarchical inheritance bulldog (child class) example:here animal is parents class so bulldog, dog and mammal (child class) so they can inherit animal as a (parent class)*/
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		System.out.println("/n.....................\n");
        Reptile reptile = new Reptile();
		reptile.reptileInfo();/*This is single inheritance reptile (child class) example:here animal is parents class so reptile (child class)can inherit animal as a(parents class)*/
		reptile.animalInfo();

		System.out.println("/n.....................\n");
		Snake snake = new Snake();
		snake.snakeInfo();/*This is multilevel inheritance snake (child class) example:here animal is parents class so snake and reptile (child class)so they can inherit animal as a(parent class*/
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("/n......................\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();/*This is Hierarchical inheritance cobra (child class) example:here animal is parents class so cobra,snake and reptile (child class) so they can inherit animal as a (parent class)*/
        cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

		System.out.println("/n.......................\n");
        Birds birds = new Birds();
		birds.birdsInfo();/*This is single inheritance birds(child class) example:here
		animal is parents class so birds(child class)can inherit animal as a(parents class)*/birds.animalInfo();

		System.out.println("/n.......................\n");
        Robin robin = new Robin();
		robin.robinInfo();/*This is multilevel inheritance robin (child class) example:here animal is parents class so robin and birds (child class)so they can inherit animal as a(parent class*/
		robin.birdsInfo();
		robin.animalInfo();
}
}