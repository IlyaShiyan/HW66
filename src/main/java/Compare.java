public class Compare {
    private boolean compare;

    public <T,V> Compare(T arg1,V arg2) {
        if (arg1.getClass()==arg2.getClass())
            this.compare = true;
        else
            this.compare = false;
        if (compare)
            System.out.println("Равны");
        else
            System.out.println("Не равны");
    }
}
