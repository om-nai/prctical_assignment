class Association<T1, T2> {
    T1 object1;
    T2 object2;
  
    public Association(T1 object1, T2 object2) {
      this.object1 = object1;
      this.object2 = object2;
    }
  }
  
  class Transition<T1, T2, T3> {
    T1 object1;
    T2 object2;
    T3 object3;
  
    public Transition(T1 object1, T2 object2, T3 object3) {
      this.object1 = object1;
      this.object2 = object2;
      this.object3 = object3;
    }
  }
  
  public class ass_12{
    public static void main(String[] args) {
      Association<String, Integer> asso1 = new Association<String, Integer>("One", 1);
      Association<String, Integer> asso2 = new Association<String, Integer>("Two", 2);
      Association<String, Integer> asso3 = new Association<String, Integer>("Three", 3);
  
      System.out.println(asso1.object1 + " " + asso1.object2);
      System.out.println(asso2.object1 + " " + asso2.object2);
      System.out.println(asso3.object1 + " " + asso3.object2);
  
      Transition<String, Integer, String> tran1 = new Transition<String, Integer, String>("One", 1, "One");
      Transition<String, Integer, String> tran2 = new Transition<String, Integer, String>("Two", 2, "Two");
      Transition<String, Integer, String> tran3 = new Transition<String, Integer, String>("Three", 3, "Three");
  
      System.out.println(tran1.object1 + " " + tran1.object2 + " " + tran1.object3);
      System.out.println(tran2.object1 + " " + tran2.object2 + " " + tran2.object3);
      System.out.println(tran3.object1 + " " + tran3.object2 + " " + tran3.object3);
    }
  }
