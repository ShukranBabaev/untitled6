package animals;

public abstract class Animals {

    protected int weight;
    public Animals (int weight){
        this.weight = weight;
    }

     public abstract void eat (String food);

     public void drink() {
        System.out.println("пьем");
    }


}


