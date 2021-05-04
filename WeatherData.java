public class WeatherData{

  private CondicoesAtuaisDisplay condicoesAtuaisDisplay;
  private PrevisoesDisplay previsoesDisplay;
  private EstatisticaDisplay estatisticaDisplay;
  

  public double getTemperatura(){
    return 0;
  }
  public double getUmidade(){
    return 0;
  }
  public double getPressao(){
    return 0;
  }
  public void alteracoesDetectadas (){
    condicoesAtuaisDisplay.atualizar(getTemperatura(), getUmidade(), getPressao());
    previsoesDisplay.atualizar(getTemperatura(), getUmidade(), getPressao());
    estatisticaDisplay.atualizar(getTemperatura(), getUmidade(),getPressao());
  }


}