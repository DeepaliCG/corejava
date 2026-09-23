package MultipleInheritance;

public class Cub implements Lion,Lioness{

	void play()
	{
		System.out.println("Cub is playing");
	}

	@Override
	public void hunt() {
		System.out.println("Lioness is hunting");
	}

	@Override
	public void roar() {
		System.out.println("Lion is roaring");
		
	}
}
