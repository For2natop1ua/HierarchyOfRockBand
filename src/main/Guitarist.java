package main;

public class Guitarist extends Human implements BandActions {
    @Override
    public void play() {
        System.out.println("*From somewhere comes the sound of a guitar playing something languid.*");
    }

    @Override
    public void bandMembersAmount() {
        System.out.println("There are " + membersAmount + " members in my band!!!");
    }

    @Override
    public int getHairLength() {
        return 20;
    }

    @Override
    public void headbangingStyle(){
        System.out.println("The side to side: shaking the head from side to side, "
                + "whipping the hair on each transition. I LOVE THIS STYLE!!!");
    }
}
