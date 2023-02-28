public class first_28 {
    int x;
    boolean boolValue;
  
    public first_28(int x) {
      this.x = x;
      if (x > 50) {
        boolValue = true;
      } else {
        boolValue = false;
      }
    }
      public static void Unlocker(boolean value) {
        boolean isUnlocked;
        isUnlocked = !value;
      }
      public static void Locker(boolean value) {
        if(value=true){
          Unlocker(value);
        }value = value;
      }
  
    public static void main(String[] args) {
      first_28 obj1 = new first_28(30);
      first_28 obj2 = new first_28(70);
  
      System.out.println("Obj1 - x: " + obj1.x + ", Valore booleano: " + obj1.boolValue);
      System.out.println("Obj2 - x: " + obj2.x + ", Valore booleano: " + obj2.boolValue);
    }
}