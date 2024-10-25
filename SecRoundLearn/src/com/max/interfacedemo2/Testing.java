package com.max.interfacedemo2;

public class Testing {
    public static void main(String[] args) {
        PpPlayer p1 = new PpPlayer("Jack",19);
        BasketballPlayer b1 = new BasketballPlayer("King",29);
        BasketCoach bcoach = new BasketCoach("Bob",51);
        PpCoach pcoach = new PpCoach("Peter",58);

        p1.learnEng();
        p1.learn();

        b1.learn();

        bcoach.teach(b1);
        bcoach.teach(p1);

        pcoach.learnEng();
        pcoach.teach(p1);
        pcoach.teach(b1);
    }
}
