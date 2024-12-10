package Mo3;

public class Euro3 {

        public static void main(String[] args) {
            final int durchleaufe = 10000;
            int anzahlSchublade3 = 0;
            int anzahlNichtInSchublade3 = 0;


            for(int i = 0; i < durchleaufe; i++){
                boolean EuroInSchreibtisch = (int)(Math.random()*2)+1 == 2;
                boolean EuroInSchublade1_2 = (int)(Math.random()*3)+1 <= 2;
                if(!EuroInSchreibtisch){
                    anzahlNichtInSchublade3++;
                }else if(EuroInSchublade1_2){
                    anzahlNichtInSchublade3++;
                }else{
                    anzahlSchublade3++;
                }
            }
            System.out.println(anzahlSchublade3/(double)anzahlNichtInSchublade3 *100);
        }
    }

