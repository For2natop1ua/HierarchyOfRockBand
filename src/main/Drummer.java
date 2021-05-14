package main;

public class Drummer extends Human implements BandActions {
    @Override
    public void play() {
        System.out.println("*BA-DUM-TSS!*");
    }

    @Override
    public void bandMembersAmount() {
        System.out.println("There are " + membersAmount + " members in my band!!!");
    }

    @Override
    public int getHairLength() {
        return 12;
    }

    @Override
    public void headbangingStyle(){
        System.out.println("My favourite style is the circular swing (windmill): swinging the head in a circular motion!");
    }
}
