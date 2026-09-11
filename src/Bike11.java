class Bike11{
    private static String brand;
    private static int count;

    private int engNum;
    private String color;
    private String ownerName;
    private String bikeNumber;

    public Bike11(int engNum,String color,String ownerName,String bikeNumber){
        this.engNum = engNum;
        this.color = color;
        this.ownerName = ownerName;
        this.bikeNumber = bikeNumber;
    }

    public void setEngNum(int engNum){
        this.engNum = engNum;
    }
    public int getEngNum(){
        return engNum;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public String getOwnerName(){
        return ownerName;
    }

    public void setBikeNumber(String bikeNumber){
        this.bikeNumber = bikeNumber;
    }
    public String getBikeNumber(){
        return bikeNumber;
    }

    public void start(){
        System.out.println(ownerName+" started"+brand+" Bike");
    }
    public void move(){
        System.out.println(ownerName+" is moving"+brand+" Bike");
    }
    public void stop(){
        System.out.println(ownerName+" Stopped "+brand+" Bike");
    }

    public String toString(){
        return
                        "   brand\t: " + brand      + "\n" +
                        "   engNum\t: " + engNum    + "\n" +
                        "   color\t: " + color      + "\n" +
                        "   ownerName\t: " + ownerName + "\n" +
                        "   bikeNumber\t: " + bikeNumber;
    }




}