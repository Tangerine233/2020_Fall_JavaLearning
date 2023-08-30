/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 13A
*/

import java.util.Scanner;
public class Lab13A {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int userInput =0;
        int numberOfEnemy =0;
        int enemyDamage =0;
        int heroHP =0;
        int heroDamage =0;
        int enemiesAlive =0;
        int roundCounting =0;

        //input values
        System.out.print("Enter the number of enemies: ");
        numberOfEnemy = input.nextInt();
        System.out.print("Enter the enemy damage: ");
        enemyDamage = input.nextInt();
        System.out.print("Enter the hero's starting HP: ");
        heroHP = input.nextInt();
        System.out.print("Enter the hero's damage: ");
        heroDamage = input.nextInt();

        //create an enemy array use Enemy class as datatype
        Enemy[] enemyArr = new Enemy[numberOfEnemy];

        //give hp and damages to each unit in the array
        for (int i=0; i<numberOfEnemy; i++){
            (enemyArr[i]) = new Enemy((10+2*i),enemyDamage);
        }

        //give values to enemiesAlive
        for (int i=0; i<numberOfEnemy; i++){
            if (enemyArr[i].checkAlive()) enemiesAlive++;
        }

        //create an hero object use Hero class as datatype
        Hero hero1 = new Hero(heroHP,heroDamage);

        //loop to fight while hero or enemies are still alive
        while (hero1.checkAlive()&&enemiesAlive>0){
            //hero take damage
            hero1.takeDamage((enemyDamage * enemiesAlive));
            //enemies take damage
            for (int i=0; i<numberOfEnemy; i++){
                if (enemyArr[i].checkAlive()){
                    enemyArr[i].takeDamage(heroDamage);
                    //decrease enemiesAlive if died during attack
                    if (!enemyArr[i].checkAlive()){
                        enemiesAlive--;
                    }
                }
            }
            //display result after each round of fight
            roundCounting++;
            System.out.println("==== After round "+ roundCounting +" ====");
            System.out.println("Num enemies left: "+ enemiesAlive);
            //loop to display each enemy's HP
            for (int i=0; i<numberOfEnemy; i++){
                System.out.print("|"+ enemyArr[i].getHP());
            }
            System.out.println("");
            //display hero's HP
            System.out.println("Hero HP: " + hero1.getHP());
        }

        //display final result
        if (hero1.getHP()<=0){
            System.out.print("Enemies win!");
        }
        else System.out.print("Hero wins!");


        //declaim resource
        input.close();
    }
}
