import java.util.*;

public class Calendar {
  private Map<String, String> holydays = new HashMap<String, String>();

  public Calendar() {
    this.initialize2023Calendar();
  }

  public void addHolyday(String date, String holyday) {
    holydays.put(date, holyday);
  }

  private void initialize2023Calendar() {
    this.addHolyday("01/01/2023", "Confraternização mundial");
    this.addHolyday("21/02/2023", "Carnaval");
    this.addHolyday("17/04/2023", "Páscoa");
    this.addHolyday("21/04/2023", "Tiradentes");
    this.addHolyday("01/05/2023", "Dia do trabalho");
    this.addHolyday("08/06/2023", "Corpus Christi");
    this.addHolyday("07/09/2023", "Independência do Brasil");
    this.addHolyday("12/10/2023", "Nossa Senhora Aparecida");
    this.addHolyday("02/11/2023", "Finados");
    this.addHolyday("15/11/2023", "Proclamação da República");
    this.addHolyday("25/12/2023", "Natal");

  }

  public String getHolyday(String date) {
    String holyday = holydays.get(date);
    if (holyday == null)
      return "There is no holyday on this date!";
    return holyday;
  }

  public List<String> getAllHolydays() {
    return (List<String>) holydays.values();
  }
}
