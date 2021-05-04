public class Cachorro implements Observer{
  public void update (int n){
    for (int i = 0; i < n; i++){
      System.out.print ("au ");
    }
    System.out.println ();
  }
}
