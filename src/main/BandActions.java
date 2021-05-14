package main;

public interface BandActions {
    void play();
    int membersAmount = 4;
    void bandMembersAmount();

    default void headbangingStyle() {
        System.out.println("My headbanging style is up to down!!! OH HELL YES!");
    }
}
