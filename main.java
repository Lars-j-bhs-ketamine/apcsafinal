import java.util.Scanner;

public class equipmentFinder {
    public static Scanner scan = new Scanner(System.in);
    
    public static void secondaryFormation(String[] array) {
        String curve = "0";
        
        if (array[0].equals("BAUER")) {
            if (array[2].equals("SHALLOW")) {
                curve = "P92";
            } else if (array[2].equals("DEEP")) {
                curve = "P88";
            } else if (array[2].equals("BROAD")) {
                curve = "P28";
            }
        } else if (array[0].equals("CCM")) {
            if (array[2].equals("SHALLOW")) {
                curve = "P92";
            } else if (array[2].equals("DEEP")) {
                curve = "P30";
            } else if (array[2].equals("BROAD")) {
                curve = "P28";
            }
        } else if (array[0].equals("WARRIOR")) {
            if (array[2].equals("SHALLOW")) {
                curve = "W03";
            } else if (array[2].equals("DEEP")) {
                curve = "W88";
            } else if (array[2].equals("BROAD")) {
                curve = "W28";
            }
        }
        
        if (array[0].equals("BAUER")) {
            switch (array[1]) {
                case "SHOT":
                    System.out.println("Your stick: Bauer Supreme Mach with a " + curve + " curve. Your stick flex is " + array[3] + ". You are " + array[4] + " handed.\nConfigurator terminated.");
                    break;
                case "HANDS":
                    System.out.println("Your stick: Bauer Nexus Sync with a " + curve + " curve. Your stick flex is " + array[3] + ". You are " + array[4] + " handed.\nConfigurator terminated.");
                    break;
                case "RELEASE":
                    System.out.println("Your stick: Bauer Vapor Hyperlite with a " + curve + " curve. Your stick flex is " + array[3] + ". You are " + array[4] + " handed.\nConfigurator terminated.");
                    break;
            }
        } else if (array[0].equals("CCM")) {
            switch (array[1]) {
                case "SHOT":
                    System.out.println("Your stick: CCM Tacks ASVI with a " + curve + " curve. Your stick flex is " + array[3] + ". You are " + array[4] + " handed.\nConfigurator terminated.");
                    break;
                case "HANDS":
                    System.out.println("Your stick: CCM Jetspeed FT7 Pro with a " + curve + " curve. Your stick flex is " + array[3] + ". You are " + array[4] + " handed.\nConfigurator terminated.");
                    break;
                case "RELEASE":
                    System.out.println("Your stick: CCM Ribcore Trigger 8 Pro with a " + curve + " curve. Your stick flex is " + array[3] + ". You are " + array[4] + " handed.\nConfigurator terminated.");
                    break;
            }
        } else if (array[0].equals("WARRIOR")) {
            switch (array[1]) {
                case "SHOT":
                    System.out.println("Your stick: Warrior Super Novium with a " + curve + " curve. Your stick flex is " + array[3] + ". You are " + array[4] + " handed.\nConfigurator terminated.");
                    break;
                case "HANDS":
                    System.out.println("Your stick: Warrior Alpha LX2 Pro with a " + curve + " curve. Your stick flex is " + array[3] + ". You are " + array[4] + " handed.\nConfigurator terminated.");
                    break;
                case "RELEASE":
                    System.out.println("Your stick: Warrior Covert QRE10 with a " + curve + " curve. Your stick flex is " + array[3] + ". You are " + array[4] + " handed.\nConfigurator terminated.");
                    break;
            }
        }
    }

    public static void stickConfigurator() {
        String[] storage = {"0",  "0",  "0",  "0",  "0"};
        String[] textArray = {"Please enter which brand of stick you would like (Bauer,  CCM,  Warrior): ",  "Enter if you like to have better hands,  a harder shot,  or a quick release (Enter Shot,  Hands,  or Release): ",  "What curve would you like (Shallow,  deep,  broad): ",  "How much do you weigh (in lbs): ",  "What hand do you shoot with (Left or Right): "};
        System.out.println("Welcome to the stick configurator. This will help you select the stick that best fits your style of play.");
        System.out.println(textArray[0]);
        boolean control = false; // false = invalid
        
        while (control == false) {
            String brand = scan.nextLine();
            String bUpper = brand.toUpperCase();
            
            if (bUpper.equals("BAUER") || bUpper.equals("CCM") || bUpper.equals("WARRIOR")) {
                control = true;
                storage[0] = bUpper;
                control = false;
                break;
            } else {
                System.out.println("Invalid input. Please enter a correct brand: ");
            }
        }
        
        while (control == false) {
            System.out.println(textArray[1]);
            String pStyle = scan.nextLine();
            String pUpper = pStyle.toUpperCase();
            
            if (pUpper.equals("SHOT") || pUpper.equals("HANDS") || pUpper.equals("RELEASE")) {
                control = true;
                storage[1] = pUpper;
                control = false;
                break;
            } else {
                System.out.println("Invalid input. Please enter a correct playstyle: ");
            }
        }
        
        while (control == false) {
            System.out.println(textArray[2]);
            String curve = scan.nextLine();
            String cUpper = curve.toUpperCase();
            
            if (cUpper.equals("SHALLOW") || cUpper.equals("DEEP") || cUpper.equals("BROAD")) {
                control = true;
                storage[2] = cUpper;
                control = false;
                break;
            } else {
                System.out.println("Invalid input. Please enter a correct curve: ");
            }
        }
        
        while (control == false) {
            System.out.println(textArray[3]);
            int weight = scan.nextInt();
            
            if (weight >= 2 && weight <= 1000) {
                if (weight >= 220) {
                    weight = 110;
                } else {
                    weight = weight / 2;
                }
                control = true;
                String wInt = Integer.toString(weight);
                storage[3] = wInt;
                control = false;
                break;
            } else {
                System.out.println("Invalid input. Please enter a weight within the the range: ");
            }
        }
    
        while (control == false) {
                System.out.println(textArray[4]);
                scan.nextLine();
                String hand = scan.nextLine();
                String hUpper = hand.toUpperCase();
                
                if (hUpper.equals("LEFT") || hUpper.equals("RIGHT")) {
                    control = true;
                    storage[4] = hUpper;
                    control = false;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a correct handness: ");
            }
        }
        System.out.println("------------------------ RESULTS ------------------------");
        secondaryFormation(storage);
    }
    
    public static void primaryFormation(String[] array) {
        if (array[0].equals("BAUER")) {
            String fit = "0";
            
            if (array[3].equals("S")) {
                fit = "1";
            } else if (array[3].equals("M")) {
                fit = "2";
            } else if (array[3].equals("L")) {
                fit = "3";
            }

            switch (array[1]) {
                case "AGGRESSIVE": 
                    System.out.println("You will need Bauer Nexus skates sized " + array[2] + " with fit profile " + fit + ". You selected " + array[4] + " steel with an additional cost of $" + array[5] + ".\nConfigurator terminated.");
                    break;
                case "POWERFUL": 
                    System.out.println("You will need Bauer Supreme skates sized " + array[2] + " with fit profile " + fit + ". You selected " + array[4] + " steel with an additional cost of $" + array[5] + ".\n Configurator terminated.");
                    break;
                case "AGILE": 
                    System.out.println("You will need Bauer Vapor skates sized " + array[2] + " with fit profile " + fit + ". You selected " + array[4] + " steel with an additional cost of $" + array[5] + ".\n Configurator terminated.");
                    break;
            }
        } else if (array[0].equals("CCM")) {
            String fit = "0";
            
            if (array[3].equals("S")) {
                fit = "1";
            } else if (array[3].equals("M")) {
                fit = "2";
            } else if (array[3].equals("L")) {
                fit = "3";
            }

            switch (array[1]) {
                case "AGGRESSIVE": 
                    System.out.println("You will need CCM Ribcore skates sized " + array[2] + " with fit profile " + fit + ". You selected " + array[4] + " steel with an additional cost of $" + array[5] + ".\nConfigurator terminated.");
                    break;
                case "POWERFUL": 
                    System.out.println("You will need CCM Tacks skates sized " + array[2] + " with fit profile " + fit + ". You selected " + array[4] + " steel with an additional cost of $" + array[5] + ".\n Configurator terminated.");
                    break;
                case "AGILE": 
                    System.out.println("You will need CCM Jetspeed skates sized " + array[2] + " with fit profile " + fit + ". You selected " + array[4] + " steel with an additional cost of $" + array[5] + ".\n Configurator terminated.");
                    break;
            }
        }
    }
    
    public static void skateConfigurator() {
        String[] storage = {"0",  "0",  "0",  "0",  "0",  "0"};
        String[] textArray = {"Enter your foot size (1-16):  ",  "Enter your playstyle (Aggressive,  powerful,  agile):  ",  "Enter your foot width (S,  M,  L):  ",  "Enter your steel preference (Steel,  Carbonized,  Titanium):  "};
        System.out.println("Welcome to the skate configurator. This will help you select the skate that best fits your foot and style of play.");
        System.out.println("Please enter which brand you'd like to continute with (Bauer or CCM):  ");
        boolean control = false; // false = invalid input
        
        while (control == false) {
            String brand = scan.nextLine();
            String upper = brand.toUpperCase();
            
            if (upper.equals("BAUER") || upper.equals("CCM")) {
                control = true;
                storage[0] = upper;
                control = false;
                break;
            } else {
                System.out.println("Invalid input. Please enter a correct brand:  ");
            }
        }
        
        while (control == false) {
            System.out.println(textArray[1]);
            String pStyle = scan.nextLine();
            String upper = pStyle.toUpperCase();
            
            if (upper.equals("POWERFUL") || upper.equals("AGGRESSIVE") || upper.equals("AGILE")) {
                control = true;
                storage[1] = upper;
                control = false;
                break;
            } else {
                System.out.println("Invalid input. Please enter a correct playstyle:  ");
            }
        }
        
        while (control == false) {
            System.out.println("You must now enter 3 pieces of information.");
            System.out.println(textArray[0]);
            int fSize = scan.nextInt();
            scan.nextLine();
            
            if (fSize >= 1 && fSize <= 16) {
                storage[2] = Integer.toString(fSize);
                System.out.println(textArray[2]);
                String fWidth = scan.nextLine();
                String wUpper = fWidth.toUpperCase();
                
                if (wUpper.equals("S") || wUpper.equals("M") || wUpper.equals("L")) {
                    storage[3] = wUpper;
                    System.out.println(textArray[3]);
                    String steel = scan.nextLine();
                    String stUpper = steel.toUpperCase();
                    
                    if (stUpper.equals("CARBONIZED") || stUpper.equals("STEEL") || stUpper.equals("TITANIUM")) {
                        storage[4] = stUpper;
                        control = true;
                        
                        switch (stUpper) {
                            case "TITANIUM": 
                                storage[5] = "129.99";
                                break;
                            case "CARBONIZED": 
                                storage[5] = "149.99";
                                break;
                            case "STEEL": 
                                storage[5] = "74.99";
                                break;
                        }
                    } else {
                        System.out.println("Invalid input. Please enter your preferred steel for your skate blades:  ");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid foot width (Just letter (S,  M,  L)):  ");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid foot size (3-13):  ");
            }
        }
        System.out.println("------------------------ RESULTS ------------------------");
        primaryFormation(storage);
    }

    public static void assetGuide(String asset) {
        String upper = asset.toUpperCase();

        switch(upper) {
          case "SKATES": 
            skateConfigurator();
            break;
          case "STICK": 
              stickConfigurator();
              break;
          default: 
            System.out.println("No item selected or invalid input/item entered. Please input if you're looking for skates or a stick.");
        }
    }
    
    public static void password(String inp) {
        if (inp.equals("APCSA2024")) {
            System.out.println("Password correct!");
            System.out.println("Please input if you're looking for skates or a stick. Do not put (a) in front of skates or stick.");
            String inpAsset = scan.nextLine();
            assetGuide(inpAsset);
        } else {
            System.out.println("Wrong password! Configurator terminated.");
        }
    }
    
    public static void main(String args[]) {
        System.out.println("Enter your password:  ");
        String inp = scan.nextLine();
        password(inp);
    }
}
