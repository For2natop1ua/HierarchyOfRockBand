package main;

public class Vocalist extends Human implements BandActions{
    @Override
    public void play() {
        System.out.println("*Suddenly a baritone is heard.*");
    }

    public  void play(String song){
        System.out.println("I'd like to sing a song: " + song);
    }

    @Override
    public void bandMembersAmount() {
        System.out.println("There are " + membersAmount + " members in my band!!!");
    }

    @Override
    public int getHairLength() {
        return 10;
    }

    @Override
    public void headbangingStyle(){
        System.out.println("I love the up and down style!!!! YEAH!");
    }
}
