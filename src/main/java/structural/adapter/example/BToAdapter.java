package structural.adapter.example;

class BToAdapter implements BInterface {

    private AInterface aInterfaceObject;

    BToAdapter(AInterface aInterfaceObject) {
        this.aInterfaceObject = aInterfaceObject;
    }

    @Override
    public void doSmth() {
       aInterfaceObject.doIt();
    }
}
