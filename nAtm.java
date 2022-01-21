import java.util.Scanner;
import java.util.*;
class atm1 {
    static Scanner sc=new Scanner(System.in);
    static Date time=java.util.Calendar.getInstance().getTime();
    static List<String> list=new ArrayList<String>(); 
    static List<String> list1=new ArrayList<String>(); 
    static List<String> list2=new ArrayList<String>(); 
    static int accno1=1234;
    static int accno2=5678;
    static int fass=1234; 
    static int mass=1234; 
    static int arr2[]={0,0,0,0};
    static int arr1[]={0,0,0,0};
    static int arr[]={0,0,0,0};
    static int balance=20000;
    static int balance1=0;
    static void with2(){
        if(arr1[0]>arr[0]){
            int m=arr1[0]-arr[0];
            int n=m*2000;
            if(n%10==0){
                arr1[1]=arr1[1]+(n/500);
                arr1[0]=arr[0];
            }
        }
        if(arr1[1]>arr[1]){
            int m=arr1[1]-arr[1];
            int n=m*500;
            int k=n/200;
            n=n%200;
            int kl=n/100;
            arr1[1]=arr[1];
            arr1[2]=arr1[2]+k;
            arr1[3]=arr1[3]+kl;

        }
        if(arr1[2]>arr[2]){
            int m=arr1[2]-arr[2];
            int n=m*2;
            arr1[2]=arr[2];
            arr1[3]=arr1[3]+n;

        }
        
    }
    static void with(int kk){
        if(kk/2000!=0){
            arr1[0]=kk/2000;
            kk=kk%2000;
        }
        if(kk/500!=0){
            arr1[1]=kk/500;
            kk=kk%500;
        }
        if(kk/200!=0){
            arr1[2]=kk/200;
            kk=kk%200;
        }
        if(kk/100!=0){
            arr1[3]=kk/100;
            kk=kk%100;
        }
    }
    public void customer(){
        int a;
        Boolean kpr=true;
        do{
           //J");
            //f
            System.out.println("*Welcome to A bank*");
            System.out.println("User Bank:A Bank");
            System.out.println("1.Withdraw");
            System.out.println("2.deposit");
            System.out.println("3.Check Balance"); 
            System.out.println("4.pin change");
            System.out.println("5.Mini Statement");
            System.out.println("6.EXIT");
            System.out.println("7.Account Transfer");
            a=sc.nextInt();
            if(a>=3 && a<1){
                System.exit(0);
            }
            switch(a){
                case 1:
               //J");
                //f
                System.out.println("Enter the amount to Withdraw:");
                int with1=sc.nextInt();
                
                with(with1);
                
                if(with1<=balance){
                    with2();
                    for(int i=0;i<4;i++){
                        System.out.print(arr1[i]+" ");
                    }
                    if(arr1[3]>arr[3]){
                        System.out.println("Amount Unavailable Pls Enter less amount!!!");
                    }
                    else if(arr1[3]<=arr[3]){
                        balance=balance-with1;
                        System.out.println("Amount Withdrawn Sucessfully");
                        list.add(time+" "+"Amount debited:"+with1);
                        arr[0]=arr[0]-arr1[0];
                        arr[1]=arr[1]-arr1[1];
                        arr[2]=arr[2]-arr1[2];
                        arr[3]=arr[3]-arr1[3];
                        System.out.println("Current balance:Rs:"+balance);

                    }
                }
                else if(with1>balance){
                    System.out.println("Insufficient Balance Pls Try again after checking balance!!!");
                }
                
                System.out.println("Enter 0 to continue:");
                int m=sc.nextInt();
                if(m==0){
                    continue;
                }
                break;
                case 2:
               //J");
                //f
                System.out.println("Enter the no.of.2000 rupess:");
                arr2[0]=sc.nextInt();
                System.out.println("Enter the no.of.500 rupess:");
                arr2[1]=sc.nextInt();
                System.out.println("Enter the no.of.200 rupess:");
                arr2[2]=sc.nextInt();
                System.out.println("Enter the no.of.100 rupess:");
                arr2[3]=sc.nextInt();
                int depo=(arr2[0]*2000+arr2[1]*500+arr2[3]*200+arr2[3]*100);
                balance=balance+depo;
                System.out.println("Total amount="+depo);
                arr[0]=arr[0]+arr2[0];
                arr[1]=arr[1]+arr2[1];
                arr[2]=arr[2]+arr2[2];
                arr[3]=arr[3]+arr2[3];
                System.out.println("Amount Deposited Sucessfully");
                list.add(time+" "+"Amount deposited:"+depo);
                System.out.println("Current Balance:"+balance);
                System.out.println("Enter 0 to continue:");
                int n=sc.nextInt();
                if(n==0){
                    continue;
                }
                break;
                case 3:
               //J");
                //f
                System.out.println("Current Balance:"+balance);
                System.out.println("Enter 0 to continue:");
                int o=sc.nextInt();
                if(o==0){
                    continue;
                }
                break;
                case 4:
               //J");
                //f
                System.out.println("Enter the new pin:");
                int newpin=sc.nextInt();
                fass=newpin;
                System.out.println("pin changed sucessfully!!!");
                System.out.println("Enter 0 to continue:");
                int oom=sc.nextInt();
                if(oom==0){
                    continue;
                }
                case 5:
               //J");
                //f
                
                for(int i=0;i<list.size();i++){
                    System.out.println(list.get(i));
                }
                System.out.println("Enter 0 to continue:");
                int oo=sc.nextInt();
                if(oo==0){
                    continue;
                }
                break;
                case 6:
                kpr=false;
                break;
                case 7:
               //J");
               
                System.out.println("Enter Benificiary Account no:");
                int accno=sc.nextInt();
                System.out.println("Enter Acount Holder Name:");
                String accname=sc.next();
                customer1();


                break;
       
            } 
        }while(kpr);
    }
    public void customer1(){
        int a;
        Boolean kpr=true;
        do{
           //J");
            //c
            System.out.println("*Welcome to A bank*");
            System.out.println("User Bank:B Bank");
            System.out.println("1.Withdraw");
            System.out.println("2.deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.pin change");
            System.out.println("5.Mini Statement");
            System.out.println("6.EXIT");
            a=sc.nextInt();
            
            switch(a){
                case 1:
               //J");
                //c
                System.out.println("Enter the amount to Withdraw:");
                int with1=sc.nextInt();
                
                with(with1);
                
                if(with1<=balance1){
                    with2();
                    
                    if(arr1[3]>arr[3]){
                        System.out.println("Amount Unavailable Pls Enter less amount!!!");
                    }
                    else if(arr1[3]<=arr[3]){
                        
                        if(with1<=1000){
                            with1=with1+5;
                        }
                        else{
                            with1=with1+10;
                        }
                        balance1=balance1-with1;
                        System.out.println("Amount Withdrawn Sucessfully");
                        list1.add(time+" "+"Amount debited:"+with1);
                        arr[0]=arr[0]-arr1[0];
                        arr[1]=arr[1]-arr1[1];
                        arr[2]=arr[2]-arr1[2];
                        arr[3]=arr[3]-arr1[3];
                        System.out.println("Current balance:Rs:"+balance1);
                        if(with1<=1005){
                            System.out.println("Service Charge for Other Bank User:5");
                        }
                        else{
                            System.out.println("Service Charge for Other Bank User:10");
                        }

                    }
                }
                else if(with1>balance1){
                    System.out.println("Insufficient Balance Pls Try again after checking balance!!!");
                }
                
                System.out.println("Enter 0 to continue:");
                int m=sc.nextInt();
                if(m==0){
                    continue;
                }
                break;
                case 2:
               //J");
                //c
                System.out.println("Enter the no.of.2000 rupess:");
                arr2[0]=sc.nextInt();
                System.out.println("Enter the no.of.500 rupess:");
                arr2[1]=sc.nextInt();
                System.out.println("Enter the no.of.200 rupess:");
                arr2[2]=sc.nextInt();
                System.out.println("Enter the no.of.100 rupess:");
                arr2[3]=sc.nextInt();
                int depo=(arr2[0]*2000+arr2[1]*500+arr2[3]*200+arr2[3]*100);
                balance1=balance1+depo;
                System.out.println("Total amount="+depo);
                arr[0]=arr[0]+arr2[0];
                arr[1]=arr[1]+arr2[1];
                arr[2]=arr[2]+arr2[2];
                arr[3]=arr[3]+arr2[3];
                System.out.println("Amount Deposited Sucessfully");
                list1.add(time+" "+"Amount deposited:"+depo);
                System.out.println("Current Balance:"+balance1);
                System.out.println("Enter 0 to continue:");
                int n=sc.nextInt();
                if(n==0){
                    continue;
                }
                break;
                case 3:
               //J");
                //c
                System.out.println("Current Balance:"+balance1);
                System.out.println("Enter 0 to continue:");
                int o=sc.nextInt();
                if(o==0){
                    continue;
                }
                break;
                case 4:
               //J");
                //c
                System.out.println("Enter the new pin:");
                int newpin=sc.nextInt();
                mass=newpin;
                System.out.println("pin changed sucessfully!!!");
                System.out.println("Enter 0 to continue:");
                int oom=sc.nextInt();
                if(oom==0){
                    continue;
                }
                case 5:
               //J");
                //c
                
                for(int i=0;i<list1.size();i++){
                    System.out.println(list1.get(i));
                }
                System.out.println("Enter 0 to continue:");
                int oo=sc.nextInt();
                if(oo==0){
                    continue;
                }
                break;
                case 6:
                kpr=false;
                break;
            } 
        }while(kpr);
    }
    public void admin(){
        int a;
        Boolean kpr=true;
        do{
           //J");
            System.out.println("*Welcome Admin*");
            System.out.println("1.LOAD");
            System.out.println("2.SHOW");
            System.out.println("3.EXIT");
            a=sc.nextInt();
            if(a>=3 && a<1){
                System.exit(0);

            }
            switch(a){
                case 1:
               //J");
                //f
                 for(int i=0;i<4;i++){
                    if(i==0){
                        System.out.println("Enter 2000 note:");
                        arr[i]=arr[i]+sc.nextInt();
                    }
                    else if(i==1){
                        System.out.println("Enter 500 note:");
                        arr[i]=arr[i]+sc.nextInt();
                    }
                    else if(i==2){
                        System.out.println("Enter 200 note:");
                        arr[i]=arr[i]+sc.nextInt();
                    }
                    else if(i==3){
                        System.out.println("Enter 100 note:");
                        arr[i]=arr[i]+sc.nextInt();
                    }
                }
                int atmbal1=arr[0]*2000+arr[1]*500+arr[2]*200+arr[2]*100;
                System.out.println("Total Atm Balance:"+" "+atmbal1);
                System.out.println("Amount Loaded Sucessfully");
                System.out.println("Enter 0 to continue:");
                int m=sc.nextInt();
                if(m==0){
                    continue;
                }
                break;
                case 2:
               //J");
                //f
                 for(int i=0;i<4;i++){
                    if(i==0){
                        System.out.println("no of 2000 rupees note is:"+arr[0]);
                    }
                    else if(i==1){
                        System.out.println("no of 500 rupees note is:"+arr[1]);
                    }
                    else if(i==2){
                        System.out.println("no of 200 rupees note is:"+arr[2]);
                    }
                    else if(i==3){
                        System.out.println("no of 100 rupees note is:"+arr[3]);
                    }
                }
                int atmbal=arr[0]*2000+arr[1]*500+arr[2]*200+arr[2]*100;
                System.out.println("Total Atm Balance:"+" "+atmbal);
                System.out.println("Enter 0 to continue:");
                int n=sc.nextInt();
                if(n==1){
                    continue;
                }
                break;
                case 3:
                kpr=false;
                break;
            }
        }while(kpr);


    
    }
    public static void main(String[] args){
        atm1 op=new atm1();
        int x;
        Boolean kpr=true;
        do{
           //J");
            //f
            System.out.println("1.ADMIN");
            System.out.println("2.CUSTOMER");
            System.out.println("3.EXIT");
            x=sc.nextInt();
            
            if(x>=3 && x<1){
                System.exit(0);

            }
            switch(x){
                case 1:
               //J");
                //f
                System.out.println("Enter Username:");
                String username=sc.next();
                System.out.println("Enter Password:");
                int pass=sc.nextInt();
                if((username).equals("Admin")&& (pass==1234)){
                    op.admin();
                }
                
                break;
                case 2:
               //J");
                //f
                
                for(int i=3;i>=0;i--){
                    
                    System.out.println("Enter Username:");
                    String username1=sc.next();
                    System.out.println("Enter Password:");
                    int pass1=sc.nextInt();
                    if((username1).equals("Aakash")&& (pass1==fass)){
                        op.customer();
                        break;
                    }
                    else if((username1).equals("user")&& (pass1==mass)){
                        op.customer1();
                        break;
                    }
                    else if(i>0){
                       //J");
                        //f
                        System.out.println("you have only "+i+" attempts:");
                    }
                    else if(i==0){
                        System.out.println("sry,You have no attempts!!!");
                        
                    }
                }
                System.out.println("Enter 0 to continue:");
                int n=sc.nextInt();
                if(n==1){
                    continue;
                }
                

                
                break;
                case 3:
                kpr=false;
            }
            
        }while(kpr);
    }
}