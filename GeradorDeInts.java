import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class GeradorDeInts implements Subject{

  private List <Observer> observers = new ArrayList<>();
  private int intAtual;
  @Override
  public void registrarObservador(Observer o) {
    observers.add(o);
  }

  @Override
  public void removerObservador(Observer o) {
    observers.remove(o);
  }

  @Override
  public void notificarObservadores() {
    for (Observer o: observers){
      o.update(intAtual);  
    }
  }

  public void iniciar(){
    Random gerador = new Random();
    while (true){
      try{
        int op;
    do{
      op = Integer.parseInt(JOptionPane.showInputDialog(
        "1-Gato\n2-Cachorro\n0-Sair-\n3-Fechar o programa"
      ));
      switch (op){
        case 1:
          this.registrarObservador(new Gato());
          break;
        case 2:
          this.registrarObservador(new Cachorro());
          break;
        case 0:
          JOptionPane.showMessageDialog(null, "Beleza, vamos começar");
         break;
        case 3:
          return;
        default:
          JOptionPane.showMessageDialog(null, "Opção inválida");
          break;
      }
    }while (op != 0);
        intAtual = gerador.nextInt(10) + 1;
        notificarObservadores();
        Thread.sleep(5000);
      }
      catch (InterruptedException e){

      }
    }
  }
  
}
