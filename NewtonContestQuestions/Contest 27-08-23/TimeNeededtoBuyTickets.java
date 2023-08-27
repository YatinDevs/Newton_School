package NewtonContestQuestions;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class TimeNeededtoBuyTickets {

	public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int []ticket = new int[n];
        for(int i=0;i<n;i++){
            ticket[i]=sc.nextInt();
        }

        int time = calculateTime(ticket,k);
        System.out.println(time);

        }
        
        public static int calculateTime(int []ticket,int k){
            int n=ticket.length;
            int time = 0;
            while(ticket[k]>0){
               for(int i=0;i<n;i++){
                    if(ticket[i]>0){
                        ticket[i]--;
                        time++;
                        if(i==k && ticket[k]==0){
                             return time;
                        }
                    }
               }
            }
        return time;
    }
}


