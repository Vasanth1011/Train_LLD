public class Passenger {
  static int id=1;
  String name;
  int age;
  String berthPreference;
  int Passengerid;
  String alloted;
  int number;

  public Passenger(String name,int age, String berthPreferance)
  {
    this.name=name;
    this.age=age;
    this.berthPreference=berthPreferance;
    this.Passengerid=id++;
    alloted="";
    number=-1;
  }
}