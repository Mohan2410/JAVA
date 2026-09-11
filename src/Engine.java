public class Engine{
    private String model;
    private int rmp;

    public Engine(String model,int rmp){
        this.model = model;
        this.rmp = rmp;
    }

    public String getName(){
        return model;
    }

    public void setName(String model){
        this.model = model;
    }

    public int getrmp(){
        return rmp;
    }

    public void setrmp(){
        this.rmp = rmp;
    }
}