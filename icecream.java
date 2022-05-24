import java.util.PriorityQueue;
import java.util.Scanner;
class Customer implements Comparable<Customer>{
    int icecreamlover,Numberoficecream;

    public Customer(int icecreamlover, int numberoficecream) {
        this.icecreamlover = icecreamlover;
        Numberoficecream = numberoficecream;
    }
    public int getNumberoficecream() {
        return Numberoficecream;
    }

    public int compareTo(Customer m)
    {
        return (m.icecreamlover - this.icecreamlover);
    }
}
public class icecream {
    public static void main(String[] args) {
        PriorityQueue<Customer> pQueue = new PriorityQueue<>();
        int Icecreaminventory,Inventory = 0,icecreamlover,Numberoficecream,poll,profit = 0;
        Scanner scanner=new Scanner(System.in);
        char c = 0;
        while (c!='r'){
            c=scanner.next().charAt(0);
            switch (c){
                case 'a':{
                    Icecreaminventory=scanner.nextInt();
                    Inventory+=Icecreaminventory;
                }break;
                case 'e':{
                    icecreamlover=scanner.nextInt();
                    Numberoficecream=scanner.nextInt();
                    pQueue.add(new Customer(icecreamlover,Numberoficecream));
                }break;
                case 'b':{
                    if (!pQueue.isEmpty()) {
                        poll = pQueue.poll().getNumberoficecream();
                        if(poll>Inventory){
                            profit+=Inventory;
                            Inventory=0;
                        }else {
                            Inventory -= poll;
                            profit += poll;
                        }
                    }
                }break;
                case 's':{
                    if (pQueue.size()==0){
                        System.out.println("empty");
                    }else {
                        System.out.println(pQueue.size());
                    }
                }break;
                case 'p':{
                    System.out.println(profit);
                }
            }
        }
    }
}
