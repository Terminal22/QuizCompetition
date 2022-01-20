package com.company;
import java.util.Scanner;
public class QuizCompetition {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);//creates scanner
        int rnum=0, rnum1=0, rnum2=0, rnum3=0, rnum4=0, rnum5=0, rnum6=0, rnum7=0, rnum8=0, rnum9=0, rnum10=0, rnum11=0, rnum12=0, rnum13=0, rnum14=0, rnum15=0, rnum16=0, rnum17=0, rnum18=0, rnum19=0, rnum20=0;
        boolean [][] tracker = new boolean [20][20];//creates tracker for questions
        String [] questions = new String[20];// questions that can be asked as part of the competition
        questions[0]="In which continent is Brazil located?";
        questions[1]="In what year was Canada created?";
        questions[2]="What day is rememberance day on?";
        questions[3]="Whats the largest continent?";
        questions[4]="Whats the smallest continent ";
        questions[5]="Who discovered America?";
        questions[6]="Who invented the first car?";
        questions[7]="Who invented the first plane?";
        questions[8]="When was the Canadian Charter of rights and freedoms created?";
        questions[9]="In which country is New York located?";
        questions[10]="What color is on the sides of the Canadian flag?";
        questions[11]="Whats the symbol in the middle of the Canadian flag?";
        questions[12]="In what year did World War 2 begin?";
        questions[13]="In what year did World War 2 end?";
        questions[14]="When did the Cold War begin?";
        questions[15]="When did the Cold War end?";
        questions[16]="When was the first phone created?";
        questions[17]="When was the first car invented?";
        questions[18]="When was the first plane invented";
        questions[19]="How many points are there on the Canadian flags maple leaf?";
        String [] useranswers = new String[20];//array that stores user answers
        useranswers[0]="";
        useranswers[1]="";
        useranswers[2]="";
        useranswers[3]="";
        useranswers[4]="";
        useranswers[5]="";
        useranswers[6]="";
        useranswers[8]="";
        useranswers[9]="";
        useranswers[10]="";
        useranswers[11]="";
        useranswers[12]="";
        useranswers[13]="";
        useranswers[14]="";
        useranswers[15]="";
        useranswers[16]="";
        useranswers[17]="";
        useranswers[18]="";
        useranswers[19]="";
        String [] Answers = new String[20];//creates an array of sting variables for the answers
        Answers[0]= "South America";//answer for question 1
        Answers[1]= "1867";//answer for question 2
        Answers[2]= "November 11th";//answer for question 3
        Answers[3]= "Asia";//answer for question 4
        Answers[4]= "Australia";//answer for question 5
        Answers[5]= "Christopher Columbus";//answer for question 6
        Answers[6]= "Karl Benz";//answer for question 7
        Answers[7]= "Wright Brothers";//answer for question 8
        Answers[8]= "1982";//answer for question 9
        Answers[9]= "America";//answer for question 10
        Answers[10]= "Red";//answer for question 11
        Answers[11]= "Maple Leaf";//answer for question 12
        Answers[12]= "1939";//answer for question 13
        Answers[13]= "1945";//answer for question 14
        Answers[14]= "1947";//answer for question 15
        Answers[15]= "1989";//answer for question 16
        Answers[16]= "1876";//answer for question 17
        Answers[17]= "1885";//answer for question 18
        Answers[18]= "1903";//answer for question 19
        Answers[19]= "11 points";//answer for question 20
        int [] Scores = new int[20];//creates an array of variables for the scores of each question
        Scores[0]=1;//score for question 1
        Scores[1]=2;//score for question 2
        Scores[2]=3;//score for question 3
        Scores[3]=4;//score for question 4
        Scores[4]=5;//score for question 5
        Scores[5]=6;//score for question 6
        Scores[6]=7;//score for question 7
        Scores[7]=8;//score for question 8
        Scores[8]=9;//score for question 9
        Scores[9]=10;//score for question 10
        Scores[10]=11;//score for question 11
        Scores[11]=12;//score for question 12
        Scores[12]=13;//score for question 13
        Scores[13]=14;//score for question 14
        Scores[14]=15;//score for question 15
        Scores[15]=16;//score for question 16
        Scores[16]=17;//score for question 17
        Scores[17]=18;//score for question 18
        Scores[18]=19;//score for question 19
        Scores[19]=20;//score for question 20
        String [] companswers1 = new String[4];//computers answers for question one
        companswers1[0]="South America";
        companswers1[1]="America";
        companswers1[2]="Asia";
        companswers1[3]="Europe";
        String [] companswers2 = new String[4];//computers answers for question two
        companswers2[0]="1867";
        companswers2[1]="1881";
        companswers2[2]="1880";
        companswers2[3]="1900";
        String [] companswers3 = new String[4];//computers answers for question three
        companswers3[0]="November 11th";
        companswers3[1]="November 10th";
        companswers3[2]="November 9th";
        companswers3[3]="November 10th";
        String [] companswers4 = new String[4];//computers answers for question four
        companswers4[0]="Asia";
        companswers4[1]="america";
        companswers4[2]="canada";
        companswers4[3]="europe";
        String [] companswers5 = new String[4];//computers answers for question five
        companswers5[0]="Australia";
        companswers5[1]="america";
        companswers5[2]="canada";
        companswers5[3]="europe";
        String [] companswers6 = new String[4];//computers answers for question six
        companswers6[0]="i don't know";
        companswers6[1]="Christopher Colombus";
        companswers6[2]="uhhhh";
        companswers6[3]="i didn't study";
        String [] companswers7 = new String[4];//computers answers for question seven
        companswers7[0]="i forgot who";
        companswers7[1]="christopher columbus";
        companswers7[2]="Karl Benz";
        companswers7[3]="i didn't study";
        String [] companswers8 = new String[4];//computers answers for question eight
        companswers8[0]="i forgot who";
        companswers8[1]="christopher columbus";
        companswers8[2]="Karl Benz";
        companswers8[3]="i didn't study";
        String [] companswers9 = new String[4];//computers answers for question nine
        companswers9[0]="i forgot who";
        companswers9[1]="christopher columbus";
        companswers9[2]="Karl Benz";
        companswers9[3]="Wright Brothers";
        String [] companswers10 = new String[4];//computers answers for question ten
        companswers10[0]="europe";
        companswers10[1]="America";
        companswers10[2]="asia";
        companswers10[3]="south america";
        String [] companswers11 = new String[4];//computers answers for question eleven
        companswers11[0]="white";
        companswers11[1]="green";
        companswers11[2]="blue";
        companswers11[3]="Red";
        String [] companswers12 = new String[4];//computers answers for question twelve
        companswers12[0]="Maple leaf";
        companswers12[1]="Stars and stripes";
        companswers12[2]="the color red";
        companswers12[3]="white";
        String [] companswers13 = new String[4];//computers answers for question thirteen
        companswers13[0]="1920";
        companswers13[1]="1918";
        companswers13[2]="1939";
        companswers13[3]="1945";
        String [] companswers14 = new String[4];//computers answers for question fourteen
        companswers14[0]="1920";
        companswers14[1]="1918";
        companswers14[2]="1939";
        companswers14[3]="1945";
        String [] companswers15 = new String[4];//computers answers for question fifteen
        companswers15[0]="1947";
        companswers15[1]="1918";
        companswers15[2]="1939";
        companswers15[3]="1945";
        String [] companswers16 = new String[4];//computers answers for question sixteen
        companswers16[0]="1947";
        companswers16[1]="1989";
        companswers16[2]="1939";
        companswers16[3]="1945";
        String [] companswers17 = new String[4];//computers answers for question seventeen
        companswers17[0]="1900";
        companswers17[1]="1885";
        companswers17[2]="1876";
        companswers17[3]="1880";
        String [] companswers18 = new String[4];//computers answers for question eighteen
        companswers18[0]="1900";
        companswers18[1]="1885";
        companswers18[2]="1876";
        companswers18[3]="1880";
        String [] companswers19 = new String[4];//computers answers for question nineteen
        companswers19[0]="1900";
        companswers19[1]="1903";
        companswers19[2]="1904";
        companswers19[3]="1915";
        String [] companswers20 = new String[4];//computers answers for question twenty
        companswers20[0]="14 points";
        companswers20[1]="10 points";
        companswers20[2]="12 points";
        companswers20[3]="11 points";
        String [][] companswers = new String[20][20];//2d array that makes sure the computers answer matches with what the question is asking
        String play="y";
        int compwins=0, userwins=0;
        System.out.println("Welcome to the Quiz Competition!");
        System.out.println("You will be competing with the system to see who can get a higher overall score. Winner gets displayed at the end of the competition!");
        while (play.equals ("y")) {
            rnum1 = (int) (Math.random ()*(4));
            rnum2= (int) (Math.random ()*(4));
            rnum3= (int) (Math.random ()*(4));
            rnum4= (int) (Math.random ()*(4));
            rnum5= (int) (Math.random ()*(4));
            rnum6= (int) (Math.random ()*(4));
            rnum7= (int) (Math.random ()*(4));
            rnum8= (int) (Math.random ()*(4));
            rnum9= (int) (Math.random ()*(4));
            rnum10= (int) (Math.random ()*(4));
            rnum11 = (int) (Math.random ()*(4));
            rnum12 = (int) (Math.random ()*(4));
            rnum13 = (int) (Math.random ()*(4));
            rnum14 = (int) (Math.random ()*(4));
            rnum15 = (int) (Math.random ()*(4));
            rnum16 = (int) (Math.random ()*(4));
            rnum17 = (int) (Math.random ()*(4));
            rnum18 = (int) (Math.random ()*(4));
            rnum19 =(int) (Math.random ()*(4));
            rnum20 =(int) (Math.random ()*(4));
            companswers[0][0]=companswers1[rnum1];
            companswers[1][1]=companswers2[rnum2];
            companswers[2][2]=companswers3[rnum3];
            companswers[3][3]=companswers4[rnum4];
            companswers[4][4]=companswers5[rnum5];
            companswers[5][5]=companswers6[rnum6];
            companswers[6][6]=companswers7[rnum7];
            companswers[7][7]=companswers8[rnum8];
            companswers[8][8]=companswers9[rnum9];
            companswers[9][9]=companswers10[rnum10];
            companswers[10][10]=companswers11[rnum11];
            companswers[11][11]=companswers12[rnum12];
            companswers[12][12]=companswers13[rnum13];
            companswers[13][13]=companswers14[rnum14];
            companswers[14][14]=companswers15[rnum15];
            companswers[15][15]=companswers16[rnum16];
            companswers[16][16]=companswers17[rnum17];
            companswers[17][17]=companswers18[rnum18];
            companswers[18][18]=companswers19[rnum19];
            companswers[19][19]=companswers20[rnum20];
            int qnum=1, count3=0, amount=10, uscore=0, cscore=0;
            for (count3 = 0; count3 < amount; count3++) {
                rnum = (int) (Math.random() * (20));
                if (!(tracker[rnum][rnum])) //check to see if it has been displayed
                {
                    System.out.println("Q" + qnum + "." + questions[rnum] + "(" + Scores[count3] + " marks)");
                    tracker[rnum][rnum] = true; //after display set tracker to true so it won't be shown again
                    useranswers[count3] = kb.nextLine();//gets users answer
                    if (useranswers[count3].equalsIgnoreCase(Answers[rnum])) {//if the users answer is correct
                        System.out.println("You are correct");
                        uscore = uscore + Scores[count3];
                        System.out.println("Users score is now " + uscore);
                    } else {//if the users answer is incorrect
                        System.out.println("You are Incorrect, answer was " + Answers[rnum]);//displays correct answer
                        System.out.println("Your answer was " + useranswers[count3]);//displays what the user answered
                    }
                    if (companswers[rnum][rnum].equalsIgnoreCase(Answers[rnum])) {// if the computers answer is correct
                        System.out.println("System was correct, systems answer was " + companswers[rnum][rnum]);//displays systems answer
                        cscore = cscore + Scores[count3];//adds to computers score
                        System.out.println("Systems score is now " + cscore);//displays computers current score
                    } else {// if the computers answer is incorrect
                        System.out.println("Systems answer was wrong, Systems answer was " + companswers[rnum][rnum]);//displays systems incorrect answer
                    }
                    qnum++;
                } else {
                    count3 = count3 - 1;
                }
            }
            System.out.println("Users total score was " + uscore);//displays user score
            System.out.println("Systems total score was " + cscore);// displays computers score
            if (uscore > cscore) {//if the users score is higher than the computers score
                System.out.println("User has won the quiz competition with a score of " + uscore);
                System.out.println("Well done!");
            } else {//if the computers score is higher than the users score
                System.out.println("System has won with a score of " + cscore);
                System.out.println("Well done!");
            }
            if (uscore > cscore) {//if the users score is higher than the computers score
                userwins=userwins+1;
            } else {//if the computers score is higher than the users score
                compwins=compwins+1;
            }
            System.out.println("User has " + userwins + " wins");
            System.out.println("System has " + compwins + " wins");
            System.out.println("Would you like to play again?(Y/N)");
            play = kb.nextLine();
        }
    }
}
