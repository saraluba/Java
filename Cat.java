public class Cat {
    private String name;
    private boolean isHungry;

    public Cat(String name){
        this.name = name;
        this.isHungry = true;
    }
    public void isHungry(){
        if(this.isHungry){
            System.out.printf("%s is hungry %n", this.name);
        } else{
            System.out.printf("%s is not hungry %n", this.name);
        }

    }
    public void eat(String food){
        if(this.isHungry) {
            System.out.printf("%s is eating %s %n", this.name, food);
            this.isHungry = false;
        } else{
            System.out.printf("%s is not hungry %n", this.name);
        }
    }

    public void play(String toy){
        System.out.printf("%s is playing with %s %n", this.name, toy);
    }

    public void sleep(int hours){
        System.out.printf("%s is going to sleep for %d hours %n", this.name, hours);
        this.isHungry = true;
    }
}
