import java.util.Arrays;

public class buah extends Box {
  void tambahKeLapak(String item) {
    this.addToBox(item);
  }

  void tampilkanLapak() {
    System.out.println(Arrays.deepToString(
     this.restructured ? this.boxes : this.box
    ));
  }

  void susunUlangLapak() {
    this.restructureBox();
  }

  public static void main(String[] args) {
    buah petani = new buah();
    petani.tambahKeLapak("Durian");
    petani.tambahKeLapak("Salak");
    petani.tambahKeLapak("Semangka");
    petani.tambahKeLapak("Jeruk");
    petani.tambahKeLapak("Nangka");
    petani.tambahKeLapak("Melon");
    petani.tambahKeLapak("Srikaya");
    petani.susunUlangLapak();
    petani.tampilkanLapak();
  }

}

class Box {
  public int maximumItem = 7;
  public int currentIndex = 0;
  public boolean restructured = false;
  public String[] box = new String[maximumItem];
  public String[][] boxes = new String[3][3];

  void setMaximumItem(int num) {
    this.maximumItem = num;
  }

  void addToBox(String item) {
    this.box[currentIndex] = item;
    this.currentIndex++;
  }

  void restructureBox() {
    this.sortBox();
    this.mapToBoxes();
    this.restructured = true;
  }

  void mapToBoxes() {
    int boxIndex = 0;
    int containerBoxIndex = 0;
    int boxSize = this.box.length;

    String[] boxOfOrganizedFruits = this.box;
    String[][] boxesOfOrganizedFruits = this.boxes;
    String pointer = boxOfOrganizedFruits[0];

    for (int i = 0; i < boxOfOrganizedFruits.length; i++) {
      String fruit = boxOfOrganizedFruits[i];

      if (pointer.charAt(pointer.length() - 1) != fruit.charAt(fruit.length() - 1)) {
        pointer = fruit;
        containerBoxIndex++;
        boxIndex = 0;
      } 

      if (pointer.charAt(pointer.length() - 1) == fruit.charAt(fruit.length() - 1)) {
        boxesOfOrganizedFruits[containerBoxIndex][boxIndex] = fruit;
        boxIndex += 1;
      } 
    }
  }

  void sortBox() {
    String[] items = this.box;
    for (int i = 0; i < items.length; i++) {
      String temp = items[i];
      int tempCharLength = temp.length();
      int position = i;

      while( 
          position >= 1 && 
          items[position - 1].charAt(
            items[position - 1].length() - 1
          ) < temp.charAt(temp.length() - 1) 
        ) {

        items[position] = items[position - 1];
        position--;
      }

      items[position] = temp;
    }
  }

}