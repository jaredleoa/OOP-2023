package ie.tudublin;

public class Cat {
    
  int numLives;
  

  public void setnumLives(int numLives)
  {
      this.numLives = numLives;
  }

  //constructor
  public Cat()
  {
    numLives = 9;
  }

  public Cat(String name)
  {
      
  }

  public void kill()
  {
    while(numLives > 0)
    {
        numLives = numLives -1;
        System.out.println("Ouch!");
    }
    if(numLives == 0)
    {
        System.out.println("Dead");
    }
  }


}
