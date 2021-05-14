package main;

public class Main  {

    public static void main(String[] args) {

        Drummer drummer = new Drummer();
        drummer.bandMembersAmount();
        drummer.play();
        drummer.headbangingStyle();
        Human.hairLength(new Drummer());

        Guitarist guitarist = new Guitarist();
        guitarist.play();
        guitarist.headbangingStyle();
        Human.hairLength(new Guitarist());

        Vocalist vocalist = new Vocalist();
        vocalist.play();
        vocalist.headbangingStyle();
        Human.hairLength(new Vocalist());

        Keyboardist keyboardist = new Keyboardist();
        keyboardist.play();
        keyboardist.headbangingStyle();
        Human.hairLength(new Keyboardist());

    }
}
