package de.b4sh.challenge229easy;

public class Challenge {
    public Challenge(int n){this.doStuff(n);}
    private void doStuff(int n){
        double tmp = Math.cos(n);
        while(tmp != Math.cos(tmp)){
            tmp = Math.cos(tmp);
        }
        System.out.println(tmp);
    }
}
