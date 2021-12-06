public class Hewan {
    public static void main(String[] args) {
      Kucing tom = new Kucing("tom", 2, "Milk");
      Sapi otis = new Sapi("otis", 1000, "Milk");
      domba shaun = new domba("shaum", 50, "wool");
  
      System.out.println(tom.sound());
      System.out.println(otis.sound());
      System.out.println(shaun.sound());
    }
  }
  
  class Kucing {
    protected String name;
    protected String value;
    protected int weight;

    Kucing(String name, int weight, String value) {
      this.name = name;
    }
    public String value() {
      return this.value;
    }
  
    public String sound() {
      return "meoooowww";
    }
  
  }
  
  class Sapi extends Kucing {
    Sapi(String name, int weight, String value) {
      super(name, weight, value);
    }
  
    @Override
    public String sound() {
      return "Mooooooo";
    }

  }
  
  class domba extends Sapi{
    domba(String name, int weight, String value) {
      super(name, weight,value);
    }
  
    @Override
    public String sound() {
      return "mbee mbeee";
    }
  
  }
