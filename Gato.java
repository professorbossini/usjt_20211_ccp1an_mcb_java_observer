public class Gato implements Observer{

  @Override
  public void update(int n) {
    for (int i = 0; i < n; i++){
      System.out.print("z");    
    }
     System.out.println ();
  }  
}
