package quiz;

interface Animal {
	void Eat();
	void Sleep();
	
}

interface Pet {
	void play();
}

class LandAnimal {
	void run() {
		System.out.println("육지 동물은 뛸 수 있습니다.");
	}
}

class MarineAnimal {
	void swim() {
		System.out.println("해양동물은 헤엄칠 수 있습니다.");
	}
}

class Dog extends LandAnimal implements Animal {

	@Override
	public void Eat() {
		System.out.println("개는 사료를 먹습니다.");
		
	}

	@Override
	public void Sleep() {
		System.out.println("개는 잠을 잡니다.");
		
	}
	
}

class GoldFish extends MarineAnimal implements Animal {

	@Override
	public void Eat() {
		System.out.println("금붕어는 플랑크톤을 먹습니다.");
	}

	@Override
	public void Sleep() {
		System.out.println("금붕어는 잠을 잡니다.");
	}
	
}

class Tiger extends LandAnimal implements Animal {

	@Override
	public void Eat() {
		System.out.println("호랑이는 고기를 먹습니다. ");
	}

	@Override
	public void Sleep() {
		System.out.println("호랑이는 잠을 잡니다.");
	}
	
}

class Shark extends MarineAnimal implements Animal {

	@Override
	public void Eat() {
		System.out.println("상어는 물고기를 먹습니다.");
	}

	@Override
	public void Sleep() {
		System.out.println("상어는 잠을 잡니다.");
	}
	
}

 class Quiz3_240318_PM {

	public static void main(String[] args) {
		Dog dog = new Dog ();
		GoldFish goldFish = new GoldFish();
		Tiger tiger = new Tiger();
		Shark shark = new Shark();
		dog.run();
		dog.Sleep();
		goldFish.Sleep();
		goldFish.swim();
		goldFish.Eat();
		tiger.Sleep();
		shark.Eat();
	}

}
