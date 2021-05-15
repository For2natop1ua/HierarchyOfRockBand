package main;

public class Main  {

    public static void main(String[] args) {

        Drummer drummer = new Drummer();
        drummer.bandMembersAmount();
        drummer.play();
        drummer.headbangingStyle();
        drummer.play("We Will Rock You");
        Human.hairLength(new Drummer());

        Guitarist guitarist = new Guitarist();
        guitarist.play();
        guitarist.headbangingStyle();
        guitarist.play("It`s My Life");
        Human.hairLength(new Guitarist());

        Vocalist vocalist = new Vocalist();
        vocalist.play();
        vocalist.headbangingStyle();
        vocalist.play("Let There Be Rock");
        Human.hairLength(new Vocalist());

        Keyboardist keyboardist = new Keyboardist();
        keyboardist.play();
        keyboardist.headbangingStyle();
        keyboardist.play("Nothing Else Matters");
        Human.hairLength(new Keyboardist());

    }
}
