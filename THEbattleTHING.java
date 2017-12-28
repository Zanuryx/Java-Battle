//Made by David Christopher Bernhardt

import java.util.Random;
import java.util.Scanner;

public class THEbattleTHING {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 

String intro="Welcome to the Battle Thing!\n";

System.out.println(intro);
	
		

			int PlayerHealth = 1000;

			int EnemyHealth = 1000;
		    
		    	
		    int Poke = 10;

		    int Kick = 20;

		    int Chomp = 30;

		    int Strike = 40;

		    int Heal = 50;

		    int Punch = 60;

		    int Smack = 70;

		    int Slap = 80;

		    int Jab = 90;

			int Explode = 100;	
			
		
			{


	while (true) {
			int count = 0; {
					
				while (count < 20) {

				String question = "What will you do?\n";
				System.out.println(question);				
				System.out.println("What will Player use?\n");
				String UserAttack1 = scanner.nextLine();
				count = count + 1;
				
				
		switch (UserAttack1) {

			case "poke": UserAttack1.equals("poke"); 

				EnemyHealth = EnemyHealth-10;
        		System.out.println ("Player poked the enemy!" + "\n" + "Ummmm.....alright???" + "\n");
                System.out.println ("The enemy's health has dropped to: " + "\n");
                System.out.println(EnemyHealth + "\n");
                break;

			case "kick": UserAttack1.equals("kick");

				EnemyHealth = EnemyHealth-20;
            	System.out.println("Player kicked the enemy!" + "\n" + "Your parents must be so proud that you're kicking a computer program..." + "\n");
            	System.out.println("The enemy's health has dropped to: " + "\n");
            	System.out.println(EnemyHealth + "\n");
            	break;
            	
			case "chomp": UserAttack1.equals("chomp");

				EnemyHealth = EnemyHealth-30;
                System.out.println("Player chomped the enemy!" + "\n" + "WHO WOULD RAISE SUCH A CHILD?!" + "\n");
                System.out.println("The enemy's health has dropped to: " + "\n");
                System.out.println(EnemyHealth + "\n");
                break;
                
		    case "strike": UserAttack1.equals("strike");
        		
		    EnemyHealth = EnemyHealth-40;
            	System.out.println("Player striked the enemy!" + "\n" + "Dictionary not included with this attack." + "\n");
            	System.out.println("The enemy's health has dropped to: " + "\n");
            	System.out.println(EnemyHealth + "\n");
                break;
                
		    case "heal": UserAttack1.equals("heal");

		    EnemyHealth = EnemyHealth+50;
            	System.out.println("Player healed themselves!" + "\n" + "What a cheater." + "\n");
            	System.out.println("Your health has been boosted to:" + "\n");
            	System.out.println(EnemyHealth + "\n");
                break;
                
		    case "punch": UserAttack1.equals("punch");

		    EnemyHealth = EnemyHealth-60;
                System.out.println("Player punched the enemy!" + "\n" + "Ouch. Violent much?" + "\n");
                System.out.println("The enemy's health has dropped to:" + "\n");
                System.out.println (EnemyHealth-60);
                break;
                
		    case "smack": UserAttack1.equals("smack");

		    EnemyHealth = EnemyHealth-70;
                System.out.println("Player smacked the enemy!" + "\n" + "Why you gotta be so rude??" + "\n");
                System.out.println("The enemy's health has dropped to:");
                System.out.println (EnemyHealth + "\n");
                break;
                
		    case "slap": UserAttack1.equals("slap");

		    EnemyHealth = EnemyHealth-80;
              System.out.println("Player slapped the enemy!" + "\n" + "All the enemy wanted was a hug..." + "\n");
              System.out.println("The enemy's health has dropped to:");
              System.out.println (EnemyHealth + "\n");
              break;
              
		    case "jab": UserAttack1.equals("jab");

		    EnemyHealth = EnemyHealth-90;
        	  System.out.println("Player dabbed with the enemy!" + "\n" + "Wait, jab? Ohhhhh, I thought you said dab." + "\n");
              System.out.println("The enemy's health has dropped to:");
              System.out.println (EnemyHealth + "\n");
              break;
              
		    case "explode": UserAttack1.equals("explode");

		    EnemyHealth = EnemyHealth-100;
		    PlayerHealth = PlayerHealth-100;
        	System.out.println("Player exploded!" + "\n" + "Why would you do that?" + "\n");
        	System.out.println("The enemy's health has dropped to:");
            System.out.println(EnemyHealth + "\n");
            System.out.println("Player's health has dropped to:");
            System.out.println(PlayerHealth + "\n");            
            break;            
            
            
		}
		
            Random rand = new Random();
            int  EnemyAttack = rand.nextInt(10) + 1;
			switch(EnemyAttack){
            case 1: 

			PlayerHealth = PlayerHealth-10;
    		System.out.println ("Enemy poked the Player!" + "\n" + "That shouldn't hurt, right?" + "\n");
            System.out.println ("The player's health has dropped to: " + "\n");
            System.out.println(PlayerHealth + "\n");
            break;

		case 2:

		PlayerHealth = PlayerHealth-20;
		System.out.println ("Enemy kicked the Player!" + "\n" + "What doesn't kill you makes you stronger." + "\n");
        System.out.println ("The player's health has dropped to: " + "\n");
        System.out.println(PlayerHealth + "\n");
        	break;
        	
		case 3:

		PlayerHealth = PlayerHealth-30;
		System.out.println ("Enemy chomped the Player!" + "\n" + "Don't worry, you only have some broken bones. Nothing serious." + "\n");
        System.out.println ("The player's health has dropped to: " + "\n");
        System.out.println(PlayerHealth + "\n");
            break;
            
	    case 4:
    		
		PlayerHealth = PlayerHealth-40;
		System.out.println ("Enemy striked the Player!" + "\n" + "Enemy needs to go back to skool..." + "\n");
        System.out.println ("The player's health has dropped to: " + "\n");
        System.out.println(PlayerHealth + "\n");
            break;
            
	    case 5:

		EnemyHealth = EnemyHealth+50;
		System.out.println ("Enemy healed itself!" + "\n" + "DICK MOVE ENEMY! DICK. MOVE." + "\n");
        System.out.println ("The Enemy's health has boosted to: " + "\n");
        System.out.println(EnemyHealth + "\n");
            break;
            
	    case 6:

		PlayerHealth = PlayerHealth-60;
		System.out.println ("Enemy punched the Player!" + "\n" + "C'mon, take it like a champ!" + "\n");
        System.out.println ("The player's health has dropped to: " + "\n");
        System.out.println(PlayerHealth + "\n");
            break;
            
	    case 7:

		PlayerHealth = PlayerHealth-70;
		System.out.println ("Enemy smacked the Player!" + "\n" + "Get that counterattack ready..." + "\n");
        System.out.println ("The player's health has dropped to: " + "\n");
        System.out.println(PlayerHealth + "\n");
            break;
            
	    case 8:

		PlayerHealth = PlayerHealth-80;
		System.out.println ("Enemy slapped the Player!" + "\n" + "The enemy didn't slap you, it hi-fived your face." + "\n");
        System.out.println ("The player's health has dropped to: " + "\n");
        System.out.println(PlayerHealth + "\n");
          break;
          
	    case 9:

		PlayerHealth = PlayerHealth-90;
		System.out.println ("Enemy jabbed the Player!" + "\n" + "If you can't walk this one off, how do you think you can handle the others??" + "\n");
        System.out.println ("The player's health has dropped to: " + "\n");
        System.out.println(PlayerHealth + "\n");
          break;
          
	    case 10:

	    EnemyHealth = EnemyHealth-100;
	    PlayerHealth = PlayerHealth-100;
    	System.out.println("Enemy exploded!" + "\n" + "This should help you in the long run." + "\n");
    	System.out.println("The enemy's health has dropped to:");
        System.out.println(EnemyHealth + "\n");
        System.out.println("Player's health has dropped to:");
        System.out.println(PlayerHealth + "\n");            
        break;
            

			}

            }
		}
			
			
			if (PlayerHealth <= 0); {
				System.out.println("Sorry, you were defeated. Please revive and try again.");
				//System.exit(0);
				
				
				}
			}
	}
}
}
