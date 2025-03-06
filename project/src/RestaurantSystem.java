/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



import java.util.Scanner;

/**

 
 */
public class RestaurantSystem {
    static TreeNode ItemsRoot;
    static Queue<Order> kitchenQueue;
    static DrinkVendingMachine vendingMachine;
    
    private static void FillIMenu() {
        //Kitchen
        TreeNode Appetizers = new TreeNode(1, "Appetizers");
        TreeNode Salads = new TreeNode(2, "Salads");
        TreeNode Burgers = new TreeNode(3, "Burgers");
        TreeNode Pizzas = new TreeNode(4, "Pizzas");
        TreeNode Desserts = new TreeNode(5, "Desserts");
        TreeNode FriedBurgers = new TreeNode(6, "Fried_Burgers");
        TreeNode GrilledBurgers = new TreeNode(7, "Grilled_Burgers");
        ItemsRoot.children.addLast(Appetizers);
        ItemsRoot.children.addLast(Salads);
        ItemsRoot.children.addLast(Burgers);
        ItemsRoot.children.addLast(Pizzas);
        ItemsRoot.children.addLast(Desserts);
        Burgers.children.addLast(FriedBurgers);
        Burgers.children.addLast(GrilledBurgers);
        
        Appetizers.items.addLast(new Item(1, "French_Fries", 18, 7, 20));
        Appetizers.items.addLast(new Item(2, "Onion_Rings", 18, 7, 18));
        Appetizers.items.addLast(new Item(3, "Mozzarella_Sticks", 22, 9, 15));
        Appetizers.items.addLast(new Item(4, "Chicken_Wings", 24, 10, 12));
        Appetizers.items.addLast(new Item(5, "Nachos", 20, 8, 12));
        
        Salads.items.addLast(new Item(6, "Caesar_Salad", 24, 12, 8));
        Salads.items.addLast(new Item(7, "Greek_Salad", 24, 12, 8));
        Salads.items.addLast(new Item(8, "Caprese_Salad", 24, 12, 8));
        Salads.items.addLast(new Item(9, "Cobb_Salad", 26, 13, 8));
        Salads.items.addLast(new Item(10, "Garden_Salad", 20, 10, 10));

        FriedBurgers.items.addLast(new Item(11, "Cheeseburger", 30, 10, 10));
        FriedBurgers.items.addLast(new Item(12, "Hamburger", 28, 9, 15));

        GrilledBurgers.items.addLast(new Item(13, "Veggie_Burger", 26, 10, 12));
        GrilledBurgers.items.addLast(new Item(14, "Mushroom_Swiss_Burger", 32, 12, 10));
        GrilledBurgers.items.addLast(new Item(15, "BBQ_Chicken_Burger", 32, 12, 10));
        
        Pizzas.items.addLast(new Item(16, "Cheese_Pizza", 36, 14, 10));
        Pizzas.items.addLast(new Item(17, "Pepperoni_Pizza", 36, 14, 10));
        Pizzas.items.addLast(new Item(18, "Margherita_Pizza", 36, 14, 10));
        Pizzas.items.addLast(new Item(29, "BBQ_Chicken_Pizza", 38, 15, 10));
        Pizzas.items.addLast(new Item(20, "Veggie_Pizza", 38, 15, 10));

        Desserts.items.addLast(new Item(21, "Chocolate_Cake", 18, 9, 10));
        Desserts.items.addLast(new Item(22, "Apple_Pie", 18, 9, 10));
        Desserts.items.addLast(new Item(23, "Ice_Cream_Sundae", 12, 9, 10));
        Desserts.items.addLast(new Item(24, "Brownie_Sundae", 14, 10, 10));
        Desserts.items.addLast(new Item(25, "Cheesecake", 20, 11, 8));
        
        //Drinks
        vendingMachine.colaStack.push(new Item(2, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(5, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(8, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(11, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(14, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(17, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(20, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(23, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(26, "Cola", 10, 5, null));
        vendingMachine.colaStack.push(new Item(29, "Cola", 10, 5, null));
        
        vendingMachine.juiceStack.push(new Item(1, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(4, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(7, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(10, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(13, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(16, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(19, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(22, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(25, "Juice", 100, 10, null));
        vendingMachine.juiceStack.push(new Item(28, "Juice", 100, 10, null));
        
        vendingMachine.waterStack.push(new Item(3, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(6, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(9, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(12, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(15, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(18, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(21, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(24, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(27, "Water", 10, 2, null));
        vendingMachine.waterStack.push(new Item(30, "Water", 10, 2, null));
    }

    public static void main(String[] args) {
        ItemsRoot = new TreeNode(0, "Menu");
        kitchenQueue = new Queue<>();
        vendingMachine = new DrinkVendingMachine();
        FillIMenu(); 
        Scanner scan = new Scanner(System.in);
                
        int choice;
        do{
            System.out.println("\nChoose an option.\n 1 = make an order,\n 2 = preparing orders, \n 3 = drinks vending machine,\n 4 = close this application.");            
            choice = scan.nextInt();
            switch (choice){
                case 1: {
                    //Create an order
                    Order order1 = new Order(1);
                    do{
                        //Show Catogories
                        TreeNode Category = ItemsRoot;
                        while(! Category.children.isEmpty()){
                            for (int i = 0; i < Category.children.size(); i++) {
                                TreeNode node = Category.children.removeFirst();
                                System.out.print(node.id + "-" + node.name + "  ");
                                Category.children.addLast(node);
                            }
                            System.out.println();
                            System.out.println("Choose a category number.");
                            choice = scan.nextInt();

                            TreeNode categoryChoice = Category;
                            for (int i = 0; i < Category.children.size(); i++) {
                                TreeNode node = Category.children.removeFirst();
                                if(node.id == choice){
                                    categoryChoice = node;
                                }
                                Category.children.addLast(node);
                            }
                            Category = categoryChoice;
                        }

                        //Show Category Items
                        for (int i = 0; i < Category.items.size(); i++) {
                                Item node = Category.items.removeFirst();
                                System.out.print(node.id + "-" + node.name + "  ");
                                Category.items.addLast(node);
                        }
                        System.out.println();

                        Item itemChoice = null;
                        while(itemChoice == null){
                            System.out.println("Choose an item.");
                            choice = scan.nextInt();
                            for (int i = 0; i < Category.items.size(); i++) {
                                Item item = Category.items.removeFirst();
                                if(item.id == choice){
                                    itemChoice = item;
                                }
                                Category.items.addLast(item);
                            }
                        }
                        if(itemChoice.count > 0){
                            itemChoice.count --;
                            order1.items.addLast(itemChoice);
                        }
                        else{
                            System.out.println("We are sorry, this item is currently not availble.");
                        }

                        System.out.println("Add another item? 1 = yes, 0 = no.");
                        choice = scan.nextInt();
                    }while(choice == 1);

                    float totalCost = 0;
                    int totalTime = 0;
                    System.out.print("Your order is: ");
                    for (int i = 0; i < order1.items.size(); i++) {
                        Item node = order1.items.removeFirst();      
                        totalCost += node.cost;
                        totalTime += node.preparingTime;
                        System.out.print(node.name + "  ");
                        order1.items.addLast(node);
                    }
                    System.out.println();
                    System.out.println("Total order cost = " + totalCost);
                    System.out.println("Total order time = " + totalTime);
                    kitchenQueue.enqueue(order1);
                    break;
                }
                //prepare an order
                case 2: {
                    do{
                        if(kitchenQueue.size() > 0){
                           Order order1 = kitchenQueue.dequeue();
                            System.out.print("Current order is: ");
                            for (int i = 0; i < order1.items.size(); i++) {
                                Item node = order1.items.removeFirst();                    
                                System.out.print(node.name + "  ");
                                order1.items.addLast(node);
                            }
                            System.out.println();                            
                        }
                        else{
                            System.out.println("kitchen queue is empty.");
                        }  
                        System.out.println("Prepare another order? 1 = yes, 0 = no.");
                        choice = scan.nextInt(); 
                    }while(choice == 1);      
                    break;
                }  
                //drinks vending machine
                case 3: {
                    do{
                        System.out.println("Choose a drink category. 1 = juice, 2 = cola, 3 = water.");      
                        choice = scan.nextInt(); 
                        switch (choice){
                            case 1:{
                                if(vendingMachine.juiceStack.size() > 0){
                                    Item node = vendingMachine.juiceStack.pop();
                                    System.out.println("Cost = " + node.cost);
                                }
                                else{
                                    System.out.println("We are sorry, this drink is currently not availble.");
                                }
                                break;
                            }
                            case 2:{
                                if(vendingMachine.colaStack.size() > 0){
                                    Item node = vendingMachine.colaStack.pop();
                                    System.out.println("Cost = " + node.cost);
                                }
                                else{
                                    System.out.println("We are sorry, this drink is currently not availble.");
                                }
                                break;
                            }
                            case 3:{
                                if(vendingMachine.waterStack.size() > 0){
                                    Item node = vendingMachine.waterStack.pop();
                                    System.out.println("Cost = " + node.cost);
                                }
                                else{
                                    System.out.println("We are sorry, this drink is currently not availble.");
                                }
                                break;
                            }
                            default:
                                System.out.println("Invalid drink!");
                        }
                        
                        System.out.println("Order another drink? 1 = yes, 0 = no.");
                        choice = scan.nextInt(); 
                    }while(choice == 1);
                    break;
                }
                default: {
                    if(choice != 4)                            
                        System.out.println("Invalid choice!");
                }        
            }            
        }while(choice != 4);       
    }    
}
