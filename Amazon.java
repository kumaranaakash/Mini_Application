import java.util.*

class amazon {
    public static Scanner sc=new Scanner(System.in);
    static List<String> name = new ArrayList<>();//name
    static List<String> id = new ArrayList<>();//id
    static List<String> password = new ArrayList<>();//pass
    
    static List<String> newName = new ArrayList<>();//name
    static List<String> newId = new ArrayList<>();//id
    static List<String> newPass = new ArrayList<>();//pass
  
    static List<Integer> pId = new ArrayList<>();//Productid
    static List<String> pName = new ArrayList<>();//product name
    static List<Integer> pPrice = new ArrayList<>();//product price
    static List<Integer> pQuantity = new ArrayList<>();//product quantu
    static List<Integer> pDis = new ArrayList<>();//product dis
    static List<Integer> pSale = new ArrayList<>();//pro saled
    static List<String>pMerchantId = new ArrayList<>();//product merchant id
    static List<Integer> pCategory= new ArrayList<>();//product category
    static List<String> pCategoryname = new ArrayList<>();//product category name
    static int ProductID=2000;
    
    static List<String> username = new ArrayList<>();//username name
    static List<String> userpass = new ArrayList<>();//userpassword
    static List<Integer> userbal = new ArrayList<>();//userbal
    static List<Integer> usercart = new ArrayList<>();//usercart
    static List<String> usercartname = new ArrayList<>();//usercartid
    static List<Integer> usercartrate = new ArrayList<>();//user order
    static List<String> userordername = new ArrayList<>();//userorder id
    static List<Integer> userorder = new ArrayList<>();//user order
    static List<Integer> userorderprice = new ArrayList<>();//user order price

    static List<String> list=new ArrayList<>();



   
    public static void add(){
        newName.add("Aakash");
        newId.add("A000");
        newPass.add("1234");
        pId.add(1001);
        pName.add("Oppo");
        pPrice.add(16000);
        pQuantity.add(10);
        pDis.add(10);
        pSale.add(0);
       pMerchantId.add("A000");
        pCategory.add(1);
        pCategoryname.add("Phone");
        username.add("Aakash");
        userpass.add("1234");
        userbal.add(40000);
        list.add("Phone");
        list.add("Laptop");
        list.add("Clothes");
        list.add("Kitchen equipement");

    }
    public static void delay(){
        System.out.println("Press 1 to continue");
        int one =sc.nextInt();
        if(one==1){

        }
    }
    
    
    
    
    public static void approval(){
       
        System.out.println("\tWelcome Admin");
        for(int i =0;i<name.size();i++){
            newName.add(name.get(i));
            newId.add(id.get(i));
            newPass.add(password.get(i));
        }
        name.clear();
        id.clear();
        password.clear();
        System.out.println("!!!Approved!!!");
        

    }
    public static void listmerchent(){

        System.out.println("\tWelcome Admin");
        System.out.println("List of Merchant");
        for(int i =0;i<newName.size();i++){
            System.out.println();
            System.out.println("Merchant Number : "+(i+1)+"\n");
            System.out.println("Merchant Name :"+newName.get(i));
            System.out.println("Merchant ID   :"+newId.get(i));
           
        }
       
    }
    public static void removemerchent(){
        a:while(true){
            System.out.println("Merchant id:");
            String check=sc.next();
            sc.nextLine();
            int check1=0;
            for(int i=0;i<newId.size();i++){
              

                if(check.equals(newId.get(i))){
                    newName.remove(i);
                    newId.remove(i);
                    newPass.remove(i);
                    check1=1;
                    System.out.println("!!!Merchant Removed!!!");
                    break a;
                }
            }
            if(check1==0){
                System.out.println("!!!Merchant not found!!!");
                break a;
            }
              
           }
    }
    public static void meruser(){
           
            System.out.println("Enter Merchant Id:");
            String merusr=sc.next();
            sc.nextLine();
            System.out.println("Enter Merchant password:");
            String merpass=sc.next();
            sc.nextLine();    
           a: while(true){
                for(int i=0;i<newName.size();i++){
                    if(newId.get(i).equals(merusr) && newPass.get(i).equals(merpass) ){
                        while(true){
                        
                        System.out.println("\tWellcome "+newName.get(i));
                        System.out.println("1. Add Product\n2. List My Products\n3. Edit Product\n4. Remove Product\n5. View most sold product\n6. View Sales Report\n7. Home");
                        System.out.println("Enter Choice :");
                        int meruser=sc.nextInt();
                        if(meruser==1){
                              addproduct(i);
                        }else if(meruser==2){
                             listproduct(i);
                        }else if(meruser==3){
                             editproduct(i);
                        }else if(meruser==4){
                             removeproduct(i);
                        }else if(meruser==5){
                            mostsoldproduct(i);
                        }else if(meruser==6){
                            salesreport(i);
                        }
                        else if(meruser==7){
                            break a;
                        }else{
                            System.out.println("!!!Invalid input!!!");
                            delay();
                        }delay();
                    }
                    
                    
                    }
                }
                System.out.println("!!!Invalid Password or username!!!");
                delay();
                break;
                
           }
        
    }
    public static void addproduct(int i){
        int product_catagory;
        while(true){
       System.out.println("Choose product catagory :\n1. Phone\n2. Laptop\n3. Clothes\n4. Kitchen equipement");
        product_catagory=sc.nextInt();
       if(product_catagory==1){
          pCategoryname.add("Phone");
          break;
       }else if(product_catagory==2){
          pCategoryname.add("Laptop");
          break;
       }else if(product_catagory==3){
          pCategoryname.add("Clothes");
          break;
       }else if(product_catagory==4){
          pCategoryname.add("Kitchen equipement");
          break;
       }else{
        System.out.println("!!!Invalid input!!!");
       }
       }
       System.out.println();
       System.out.println("Enter Product name:");
       String product_name=sc.next();
       sc.nextLine();
       System.out.println();
       System.out.println("Enter Product price");
       int product_price=sc.nextInt();
       System.out.println();
       System.out.println("Enter Product Quantity");
       int product_Quantity=sc.nextInt();
       System.out.println();
       System.out.println("Enter Product Discount");
       int product_discount=sc.nextInt();
       System.out.println();
       pName.add(product_name);
       pQuantity.add(product_Quantity);
       pPrice.add(product_price);
       pDis.add(product_discount);
       pId.add(ProductID);
       ProductID++;
      pMerchantId.add(newId.get(i));
       pSale.add(0);
       pCategory.add(product_catagory);
       
       System.out.println("!!!Product added!!!");
       

    }
    public static void listproduct(int i){
        
        String list=newId.get(i);
        System.out.println("List of products");
        for (int j=0;j<pId.size();j++){
            if(list.equals(pMerchantId.get(j))){
                System.out.println("Merchant Name    :"+newName.get(i));
                System.out.println("Product ID       :"+pId.get(j));
                System.out.println("Product Catagory :"+pCategoryname.get(j));
                System.out.println("Product Name     :"+pName.get(j));
                System.out.println("Product Price    :"+pPrice.get(j));
                System.out.println("Product Quantity :"+pQuantity.get(j));
                System.out.println("Product Discount :"+pDis.get(j));
                System.out.println("Product Saled    :"+pSale.get(j));
                System.out.println("----------------------------------------");
                System.out.println();

            }
            
           
        }
       
    }
    public static void alllistproduct(){
       
        
        System.out.println("List of products");
        for (int j=0;j<pId.size();j++){
            
                System.out.println("Merchant Id      :"+pMerchantId.get(j));
                System.out.println("Product ID       :"+pId.get(j));
                System.out.println("Product Catagory :"+pCategoryname.get(j));
                System.out.println("Product Name     :"+pName.get(j));
                System.out.println("Product Price    :"+pPrice.get(j));
                System.out.println("Product Quantity :"+pQuantity.get(j));
                System.out.println("Product Discount :"+pDis.get(j));
                System.out.println("Product Saled    :"+pSale.get(j));

            
            System.out.println("----------------------------------------");
            System.out.println();
        }
       
    }
    public static void editproduct(int i){
        
        String list=newId.get(i);
        System.out.println("Enter Product Id:");
        int id=sc.nextInt();
        int check=0;
        System.out.println("Edit products");
        for (int j=0;j<pId.size();j++){
            if(list.equals(pMerchantId.get(j))&& pId.get(j)==id){
                System.out.println("Merchant Name    :"+newName.get(i));
                System.out.println("Product ID       :"+pId.get(j));
                System.out.println("Product Catagory :"+pCategoryname.get(j));
                System.out.println("Product Name     :"+pName.get(j));
                System.out.println("Enter new Name   :");
                String newname=sc.next();sc.nextLine();
                pName.set(j,newname);
                System.out.println("Product Price    :"+pPrice.get(j));
                System.out.println("Enter new Price  :");
                int productprice=sc.nextInt();
                pPrice.set(j,productprice);
                System.out.println("Product Quantity :"+pQuantity.get(j));
                System.out.println("Enter new count  :");
                int productquan=sc.nextInt();
                pQuantity.set(j,productquan);
                System.out.println("Product Discount    :"+pDis.get(j));
                System.out.println("Enter new Discount  :");
                int productdis=sc.nextInt();
                pDis.set(j,productdis);
                System.out.println("Product Saled    :"+pSale.get(j));
                System.out.println("----------------------------------------");
                check=1;
                System.out.println();

            }  
        }
        if(check==0){
            System.out.println("!!!Invalid product id!!!");
        }
    }
    public static void removeproduct(int i){
        
        String list=newId.get(i);
        System.out.println("Remove product");
        System.out.println("Enter Product ID");
        int productid=sc.nextInt();
        int id=0;
        
        for (int j=0;j<pId.size();j++){
            if(list.equals(pMerchantId.get(j))&& productid==pId.get(j)){

                pId.remove(j);
                pCategoryname.remove(j);
                pName.remove(j);
                pPrice.remove(j);
                pQuantity.remove(j);
                pDis.remove(j);
                pSale.remove(j);
               pMerchantId.remove(j);
                pCategory.remove(j);
                System.out.println("!!!Product Removed!!!");
                id=1;

            }
            
           
        }if(id==0){
            System.out.println("!!!Product Id not found!!!");
        }

       
    }
    public static void mostsoldproduct(int i){
       
        String list=newId.get(i);
        int check=0;
        System.out.println("Most sold product");
        for (int j=0;j<pId.size();j++){
            if(list.equals(pMerchantId.get(j))){
                 if(check<pSale.get(j)){
                     check=pSale.get(j);
                 }
            }   
        }
        for (int j=0;j<pId.size();j++){
            if(list.equals(pMerchantId.get(j)) && pSale.get(j)==check){
                System.out.println("Merchant Name    :"+newName.get(i));
                System.out.println("Product ID       :"+pId.get(j));
                System.out.println("Product Catagory :"+pCategoryname.get(j));
                System.out.println("Product Name     :"+pName.get(j));
                System.out.println("Product Price    :"+pPrice.get(j));
                System.out.println("Product Quantity :"+pQuantity.get(j));
                System.out.println("Product Discount :"+pDis.get(j));
                System.out.println("Product Sold     :"+pSale.get(j));
                
            }   
        }
    }
    public static void newuser(){
        System.out.println("Enter username :");
        String usrname=sc.next();
        sc.nextLine();
        System.out.println("Enter user password:");
        String usrpass=sc.next();
        sc.nextLine();   
        int check=0;
        a:while(true){
            for(int i =0;i<username.size();++i){
                if(username.get(i).equals(usrname) && userpass.get(i).equals(usrpass) ){
                    check=1;
                    while(true){
                        
                        System.out.println("\tWellcome "+username.get(i));
                        System.out.println("1.Shopping");
                        System.out.println("2.Your Cart");
                        System.out.println("3.Order History");
                        System.out.println("4.Wallet");
                        System.out.println("5.Password change");
                        System.out.println("6.Exit");
                        System.out.println("Enter your choice:");
                        int userchoice=sc.nextInt(); 

                        if(userchoice==1){
                           shopping(i);
                        }else if(userchoice==2){
                           cart(i);
                        }else if(userchoice==3){
                           order(i);
                        }else if(userchoice==4){
                            wallet(i);
                        }else if(userchoice==5){
                            pingeneration(i);
                        }else if(userchoice==6){
                               break a;
                        }else{
                            System.out.println("!!!Invalid Input!!!");
                        }
                       
                        
                    }
                }}if(check==0){
                    System.out.println("Invalid username or password");
                    break a;
                }

            
        }
    }
    public static void user(){
        
        System.out.println("ADD new User");
        a1:while(true){
        System.out.println("Enter User name:");
        String check=sc.next();
        sc.nextLine();
        int check1=0;
        for(int i=0;i<username.size();i++){                    
           if(check.equals(username.get(i)) ){
               System.out.println("name is exsisting try another name");
                  check1=1;
                   break ;
            }
        }
        if(check1==0){
             username.add(check);
             break a1;
            }
                              
        }
        a1:while(true){
        System.out.println("Enter password:");
        String check=sc.next();
        sc.nextLine();
        int check1=0;
        for(int i=0;i<userpass.size();i++){                    
           if(check.equals(userpass.get(i)) ){
               System.out.println("password is exsisting try another password");
                  check1=1;
                   break ;
            }
        }
        if(check1==0){
             userpass.add(check);
             break a1;
            }
                              
        }
        System.out.println("Enter User balance :");
        int usrbalance=sc.nextInt();
        userbal.add(usrbalance);
        System.out.println("!!!User Created!!!");
        System.out.println(username+" "+userpass+" "+userbal);
    }
    public static void cart(int a){
        
        while(true){
            int check=0;

        System.out.println("\tWelcome to cart");
         for(int i =0;i<usercart.size();i++){
             if(username.get(a).equals(usercartname.get(i))){
                for(int j=0;j<pId.size();j++){
                    if(usercart.get(i).equals(pId.get(j)) && pQuantity.get(j)>0){
                        System.out.println((i+1)+"). ");
                        System.out.println("Product ID       :"+pId.get(j));
                        System.out.println("Product Catagory :"+pCategoryname.get(j));
                        System.out.println("Product Name     :"+pName.get(j));
                        System.out.println("Product Price    :"+pPrice.get(j));
                        check=j;
                    }
                }
               
             }
         }
         System.out.println("1. Buy\n2. Back\nEnter choise :");
         int buy=sc.nextInt();
         if(buy==1){
         System.out.println("Enter Product ID :");
                int productid=sc.nextInt();
                for(int j=0;j<pId.size();j++){
                if(productid==pId.get(j)){

                    int product_price=(pPrice.get(j))/pDis.get(j);
                    int pr=pPrice.get(j)-product_price;

                    if(pr<=userbal.get(a)){
                        System.out.println("Final Price :"+pr);
                        userbal.set(a,userbal.get(a)-pr);
                        System.out.println("!!!Ordered Product will be delivered in 10 days!!!");
                        userordername.add(username.get(a));
                        System.out.println(userordername);
                        userorder.add(pId.get(j));
                        userorderprice.add(pr);
                        usercart.remove(pId.get(j));
                        usercartname.remove(username.get(a));
                        pSale.set(j,(pSale.get(j)+1));
                        pQuantity.set(j,(pQuantity.get(j)-1));
                        delay();
                    }else{
                        System.out.println("!!!Insufficient Balance!!!");
                    }
                }}}else if(buy==2){
                    break;
                }else{
                    System.out.println("!!!Invalid input!!!");
                }
            }
         
    }
    public static void shopping(int a){
        while(true){
        
        System.out.println("\tWelcome To Shopping");

        System.out.println("Choose product catagory :\n1. Phone\n2. Laptop\n3. Clothes\n4. Kitchen equipement\n5. Exit");
        
        System.out.println("Enter Choice:");
        int usrcatagory=sc.nextInt();
        
        if(usrcatagory==1){
           product(0,a);
        }else if(usrcatagory==2){
            product(1,a);

        }else if(usrcatagory==3){
            product(2,a);

        }else if(usrcatagory==4){
            product(3,a);
        }else if(usrcatagory==5){
           break;
        }else{
           System.out.println("!!!Invalid Input!!!");
        }
        
        }

    }
    public static void order(int a){
        
        int check=0;
        while(true){
        System.out.println("\tYour Order");
         for(int i =0;i<userorder.size();i++){
             if(username.get(a).equals(userordername.get(i))){
                for(int j=0;j<pId.size();j++){
                    if(userorder.get(i).equals(pId.get(j))){
                        System.out.println((i+1)+"). ");
                        System.out.println("Product ID       :"+pId.get(j));
                        System.out.println("Product Catagory :"+pCategoryname.get(j));
                        System.out.println("Product Name     :"+pName.get(j));
                        System.out.println("Product Price    :"+userorderprice.get(i));
                        System.out.println();
                        check=1;
            
                    }}
                    if(check==0){
                        System.out.println("Invalid id");
                    }
                
               
             }
         }
         
         delay();
         break;
        }
    }
    public static void product(int a,int p){
        while(true){
            
            System.out.println("List of Products");
            System.out.println("Product Catagory :"+list.get(a));
            for(int j=0;j<pName.size();j++){
                if (pCategory.get(j)==(a+1)&& pQuantity.get(j)>0){
                    System.out.println("Product ID       :"+pId.get(j));
                    System.out.println("Product Name     :"+pName.get(j));
                    System.out.println("Product Price    :"+pPrice.get(j));
                    System.out.println("Product Quantity :"+pQuantity.get(j));
                    System.out.println("Product Discount :"+pDis.get(j));
                    System.out.println("----------------------------------------");
                    System.out.println();
                }
            }
            
            System.out.println("1.Add to cart");
            System.out.println("2.Buy");
            System.out.println("3.Back");
            System.out.println("Enter choice:");
            int catagory1=sc.nextInt();
            if(catagory1==1){
                System.out.println("Enter Product ID :");
                int productid=sc.nextInt();
                int check1=0;
                for(int j=0;j<pId.size();j++){
                if(productid==pId.get(j)){
                    usercart.add(productid);
                    usercartname.add(username.get(p));
                    System.out.println("Added to cart");
                    System.out.println(username.get(p));
                    check1=1;
                    delay();

                }
                }
                if(check1==0){
                    System.out.println("!!!Invalid id!!!");
                    delay();
                }
                
            }else if(catagory1==2){
                System.out.println("Enter Product ID :");
                int productid=sc.nextInt();
                int check=0;
                for(int j=0;j<pId.size();j++){
                if(productid==pId.get(j)){
                    check=1;
                    int product_price=(pPrice.get(j))/pDis.get(j);
                    int pr=pPrice.get(j)-product_price;

                    if(pr<=userbal.get(p)){
                        System.out.println("Final Price :"+pr);
                        userbal.set(p,userbal.get(p)-pr);
                        System.out.println("Ordered Product will be delivered in 10 days!!!");
                        userordername.add(username.get(p));
                        System.out.println(userordername);
                        userorder.add(pId.get(j));
                        userorderprice.add(pr);
                        pSale.set(j,(pSale.get(j)+1));
                        pQuantity.set(j,(pQuantity.get(j)-1));
                        delay();

                       

                    }

                }}if(check==0){
                    System.out.println("!!!Invalid Product Id!!!");
                    delay();
                }
            }else if (catagory1==3){
                break ;
                
            }
        }
    }
    public static void wallet(int a){
        while(true){
        
        System.out.println("\tWallet");
        System.out.println("Your current balance:"+userbal.get(a));
        System.out.println("1.Add money\n2.Back\nEnter choice:");
        int wallet=sc.nextInt();
        if(wallet==1){
            System.out.println("Enter Amount:");
            int amount =sc.nextInt();
            userbal.set(a,(userbal.get(a)+amount));
            System.out.println("Amount Added");
            System.out.println();
            System.out.println("Your current balance:"+userbal.get(a));
            System.out.println();
            delay();
        }else if(wallet==2){
            break;
        }else{
           System.out.println("!!!Invalid input!!!");
        }
    }
    }
    public static void pingeneration(int i){
        
        System.out.println("\tWelcome "+username.get(i));
        System.out.println("Enter new Pin:");
        String newpin=sc.next();
        sc.nextLine();
        System.out.println("Confirm new Pin:");
        String repin=sc.next();
        sc.nextLine();
        if(newpin.equals(repin)){
            userpass.set(i,newpin);
            System.out.println("!!!Pin changed Succesfully!!!");
        }else{
            System.out.println("!!!Incorrect Pin!!!");
        }
        delay();

    }
    public static void salesreport(int i){
        
        String list=newId.get(i);
        System.out.println("List of products");
        for (int j=0;j<pId.size();j++){
            if(list.equals(pMerchantId.get(j))){
                
                System.out.println("Product ID       :"+pId.get(j));
                System.out.println("Product Catagory :"+pCategoryname.get(j));
                System.out.println("Product Name     :"+pName.get(j));
                System.out.println("Product Saled    :"+pSale.get(j));
                System.out.println("----------------------------------------");
                System.out.println();

            }
            
           
        }
    }
    public static void main(String[] args){
        add();
        while(true){
            
            System.out.println("-----Amazon-----");
            System.out.println("1. Admin");
            System.out.println("2. Merchant");
            System.out.println("3. User");
            System.out.println("4. Exit");
            System.out.println("Enter Choice: ");
            int Choice=sc.nextInt();
            if(Choice==1) {

                
                System.out.println("Enter admin username:");
                String adminusr=sc.next();
                sc.nextLine();
                System.out.println("Enter admin password:");
                String adminpass=sc.next();
                sc.nextLine();
                while(true){
                if(adminpass.equals("1234") && adminusr.equals("Aakash")){
                    
                    System.out.println("\t-----Welcome Admin-----\n\t\t1. Merchant Approval List\n\t\t2. Add Merchant\n\t\t3. Remove Merchant\n\t\t4. List the Merchant\n\t\t5. List all Products\n\t\t6. Home\n\t\t Enter Choice: ");  
                       int usrchoice=sc.nextInt();
                       if(usrchoice==1){
                           approval();
                       }else if(usrchoice==2){
                        System.out.println("ADD new Merchant");
                        a1:while(true){
                           System.out.println("Merchant name:");
                           String check=sc.next();
                           sc.nextLine();
                           int check1=0;
                           for(int i=0;i<newName.size();i++){
                               if(check.equals(newName.get(i))){
                                   System.out.println("name is exsisting try another name");
                                   check1=1;
                                   break ;
                               }
                           }
                           if(check1==0){
                               newName.add(check);
                               break a1;
                           }
                             
                          }
                        a:while(true){
                        System.out.println("Merchant id:");
                        String check=sc.next();
                        sc.nextLine();
                        int check1=0;
                        for(int i=0;i<newId.size();i++){
                            if(check.equals(newId.get(i))){
                                System.out.println("Id is exsisting try another id");
                                check1=1;
                                break ;
                            }
                        }
                        if(check1==0){
                            newId.add(check);
                            break a;
                        }
                          
                       }
                       a2:while(true){
                           System.out.println("Merchant password:");
                           String check=sc.next();
                           sc.nextLine();
                           int check1=0;
                           for(int i=0;i<newPass.size();i++){
                               if(check.equals(newPass.get(i))){
                                   System.out.println("Password is exsisting try another Password");
                                   check1=1;
                                   break ;
                               }
                           }
                           if(check1==0){
                               newPass.add(check);
                               break a2;
                           }
                             
                          }
                          System.out.println("Account Added");
                         
                        }
                       else if(usrchoice==3){
                           removemerchent();
                        }
                       else if(usrchoice==4){
                           listmerchent();
                        }else if(usrchoice==5){
                            alllistproduct();
                        }
                       else if(usrchoice==6){
                           break;
                        }else{
                          System.out.println("Invalid input");
                      }
                     delay();

                }else{break;}
                }

            }
            else if(Choice==2) {
               while(true){
                   
                System.out.println("\t-----Merchant Portal-----\n\t\t1. New Merchant\n\t\t2. Existing Merchant\n\t\t3. Exit \n\t\t Enter Choice: ");  
                  int Merchoice=sc.nextInt();
                  if(Merchoice==1){
                         System.out.println("ADD new Merchant");
                         a1:while(true){
                            System.out.println("Merchant name:");
                            String check=sc.next();
                            sc.nextLine();
                            int check1=0;
                            for(int i=0;i<name.size();i++){
                                for(int j=0;j<newName.size();j++){
                                if(check.equals(name.get(i)) && check.equals(newName.get(j))){
                                    System.out.println("name is exsisting try another name");
                                    check1=1;
                                    break ;
                                }}
                            }
                            if(check1==0){
                                name.add(check);
                                break a1;
                            }
                              
                           }
                         a:while(true){
                         System.out.println("Merchant id:");
                         String check=sc.next();
                         sc.nextLine();
                         int check1=0;
                         for(int i=0;i<id.size();i++){
                            for(int j=0;j<newId.size();j++){
                                if(check.equals(id.get(i)) && check.equals(newId.get(j))){
                            
                                 System.out.println("Id is exsisting try another id");
                                 check1=1;
                                 break ;
                             }
                         }}
                         if(check1==0){
                             id.add(check);
                             break a;
                         }
                           
                        }
                        a2:while(true){
                            System.out.println("Merchant password:");
                            String check=sc.next();
                            sc.nextLine();
                            int check1=0;
                            for(int i=0;i<password.size();i++){
                                for(int j=0;j<newPass.size();j++){
                                    if(check.equals(password.get(i)) && check.equals(newPass.get(j))){
                                    System.out.println("Password is exsisting try another Password");
                                    check1=1;
                                    break ;
                                }}
                            }
                            if(check1==0){
                                password.add(check);
                                break a2;
                            }                 
                           }
                           System.out.println("Acount is waiting for admin approval ");
                           delay();
                  }else if(Merchoice==2){
                    meruser();
                  }else if(Merchoice==3){
                      break;
                    }else{
                       
                      System.out.println("Invalid input");
                      delay();
                  }
               }
            }
            else if(Choice==3) {
               while(true){
                  
                   System.out.println("\t-----Welcome User-----\n1. New User\n2. Existing User\n3. Home \n Enter Choice: ");  
                   int userchoise=sc.nextInt();
                   if(userchoise==1){
                       user();
                   }else if(userchoise==2){
                     newuser();
                   }else if(userchoise==3){
                       break;

                   }else{
                       System.out.println("Invalid input");
                   }
                   delay();
               }
            }
            else if(Choice==4) {
                  break;
            }else{
                System.out.println("Invalid input");
                delay();
            }
        }
    }
}

