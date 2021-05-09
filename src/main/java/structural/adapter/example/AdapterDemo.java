package structural.adapter.example;

class AdapterDemo {
    public static void main(String[] args) {


        BInterface b = new B();
        BToAdapter adapter = new BToAdapter(new A());

        useObject(adapter);
        useObject(b);
    }


    public static void useObject(BInterface object) {
        System.out.println("Operacja na obiekcie : " + object);
    }


}
