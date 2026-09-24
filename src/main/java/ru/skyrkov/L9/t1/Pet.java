package ru.skyrkov.L9.t1;

public abstract class Pet {
    private String voice;
    private int pawsCount;

    public Pet(String voice, int pawsCount) {
        this.voice = voice;
        this.pawsCount = pawsCount;
    }

    public void sleep(){
        System.out.println("Сплю");
    }

    public void play(){
        System.out.println("Играю");
    }

    public void giveVoice() {
        System.out.println(voice);
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }
}
