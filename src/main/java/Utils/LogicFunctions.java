package Utils;

public class LogicFunctions {

    public static boolean cigarParty(int cigars, boolean isWeekend){


        return(((cigars >= 40 && cigars <= 60) && !isWeekend) || (cigars >= 40 && isWeekend));



    }

    public int dateFashion(int you, int date){
        int result;

        if(you <= 2 || date <= 2){
            result = 0;
        }else if(Math.max(you, date) >= 8){
            result = 2;
        }else{
            result = 1;
        }
        return result;
    }

    public boolean squirrelPlay(int temp, boolean isSummer){

        return (((temp >= 60 && temp <=90) && !isSummer) || ((temp >= 60 && temp <=100) && isSummer));

    }

    public int caughtSpeeding(int speed, boolean isBirthday){
        int result;
       if (!isBirthday){
           if(speed <= 60){
               result = 0;
           }else if(speed >= 61 && speed <= 80){
               result = 1;
           }else{
               result = 2;
           }
       }else{
           if(speed <= 65){
               result = 0;
           }else if(speed >=66 && speed <= 85){
               result = 1;
           }else{
               result = 2;
           }
       }
       return result;
    }


}
