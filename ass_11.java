class Triplet<T> {
    private T object1;
    private T object2;
    private T object3;
    
    public Triplet(T object1, T object2, T object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }
    
    public T getObject1() {
        return object1;
    }
    
    public T getObject2() {
        return object2;
    }
    
    public T getObject3() {
        return object3;
    }
}

public class ass_11{
    public static void main(String[] args) {
        Triplet<String> triplet = new Triplet<>("Hello", "World", "!");
        System.out.println(triplet.getObject1());
        System.out.println(triplet.getObject2());
        System.out.println(triplet.getObject3());
    }
}

