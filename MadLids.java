/*
Second practice project for Learn Java at Codecademy by Audrey Johnson in July 25, 2024.
This one practices applying variables and strings. 
*/

public class MadLibs {
  	public static void main(String[] args){
      String name1 = "Audrey";
      String name2 = "Brayden";
      String adjective1 = "red";
      String adjective2 = "slow";
      String adjective3 = "wet";
      String verb1 = "whistle";
      String noun1 = "dog";
      String noun2 = "cloud";
      String noun3 = "brick";
      String noun4 = "cat";
      String noun5 = "pencil";
      String noun6 = "fan";
      String place1 = "Seoul";
      int number = 13;
      
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
