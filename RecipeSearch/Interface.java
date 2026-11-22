import java.util.Scanner;
import java.nio.file.Paths;

public class Interface {
    private Scanner scanner;
    public Interface(){
        scanner=new Scanner(System.in);
    }
    public void start(){
        System.out.println("File to read: ");
        String filename=scanner.nextLine();
        System.out.println("Commands:"+"\n"+"list - lists the recipes"+"\n"+"stop - stops the program"+"\n"+"find name - searches recipes by name"+"\n"+"find cooking time - searches recipes by cooking time"+"\n"+"find ingredient - searches recipes by ingredient");
        System.out.println("Enter command: ");
        String command = scanner.nextLine();
        if(command.equals("list")){
            System.out.println("Recipes:");
            try(Scanner sc = new Scanner(Paths.get(filename))){
                while(sc.hasNextLine()){
                    String name = sc.nextLine();
                    String time = sc.nextLine();
                    System.out.println(name+", "+"cooking time: "+time);
                    while(sc.hasNextLine()){
                        String ingredients = sc.nextLine();
                        if(ingredients.isEmpty()){
                            break;
                        }
                    }

                }
            }
            catch(Exception e){
                System.out.println("error:"+e.getMessage());
            }
            
        }
        if(command.equals("stop")){

        }
        if(command.equals("find name")){
            System.out.println("Searched word: ");
            String word =scanner.nextLine();
            System.out.println("Recipes:");
            try(Scanner sc1 = new Scanner(Paths.get(filename))){
                while(sc1.hasNextLine()){
                    String searchedName = sc1.nextLine();
                    String searchedTime= sc1.nextLine();
                    if(searchedName.contains(word)){
                        System.out.println(searchedName+", "+"cooking time: "+searchedTime);
                    }
                    while(sc1.hasNextLine()){
                        String ingred =sc1.nextLine();
                        if(ingred.isEmpty()){
                            break;
                        }
                    }
                }
            }
            catch(Exception e){
                System.out.println("error: "+e.getMessage());
            }
        }
        if(command.equals("find cooking time")){
            System.out.println("Max cooking time: ");
            int time = Integer.valueOf(scanner.nextLine());
            System.out.println("Recipes:");
            try(Scanner sc2 = new Scanner(Paths.get(filename))){
                while(sc2.hasNextLine()){
                    String name =sc2.nextLine();
                    int rtime=Integer.valueOf(sc2.nextLine());
                    if(rtime<=time){
                        System.out.println(name+", "+"cooking time: "+rtime);
                    }
                    while(sc2.hasNextLine()){
                        String ingred =sc2.nextLine();
                        if(ingred.isEmpty()){
                            break;
                        }
                    }
                }
            }
            catch(Exception e){
                System.out.println("error: "+e.getMessage());
            }
        }
        if(command.equals("find ingredient")){
            System.out.println("Ingredient: ");
            String ingred= scanner.nextLine();
            System.out.println("Recipes:");
            try(Scanner sc2 = new Scanner(Paths.get(filename))){
                while(sc2.hasNextLine()){
                    String name = sc2.nextLine();
                    String time = sc2.nextLine();
                    while(sc2.hasNextLine()){
                        String singred=sc2.nextLine();
                        if(singred.equals(ingred)){
                            System.out.println(name+", "+"cooking time: "+time);
                        }
                        if(singred.isEmpty()){
                            break;
                        }
                    }
                }
            }
            catch(Exception e){
                System.out.println("error: "+e.getMessage());
            }
        }
       
    }
    
}
