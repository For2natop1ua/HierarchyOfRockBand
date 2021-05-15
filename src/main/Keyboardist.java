package main;

public class Keyboardist extends Human implements BandActions {
    @Override
    public void play() {
        System.out.println("*The keystroke sound is coming from nowhere.*");
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
        return 8;
    }

    @Override
    public void headbangingStyle() {
        System.out.println("I like the low-profile: a variation on the up and down where the performer's headbanging movements are short and more subtle, but still noticeable.");
    }
}
