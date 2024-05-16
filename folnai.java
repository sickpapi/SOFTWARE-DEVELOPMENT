import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class folnai {
    // The following function determines what rarity the assault rifle / scar will be, randomized between common, rare, epic, or legendary.
    public static String getLoot(Random random) {
        int rarity = random.nextInt(3);
        switch (rarity) {
            case 0:
                return "Rare";
            case 1:
                return "Epic (games)";
            case 2:
                return "LEGENDARY SCAR";
            default:
                return "Common (noob)";
        }
    }
    // The following function determines the speed at which the letters will be printed. It is customizable to the user's liking.
    static void Text(String dialogue){
        for (int i = 0; i < dialogue.length(); i++) {
            char letter = dialogue.charAt(i);
            System.out.print(letter);
        try {
            Thread.sleep(17); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
        System.out.println();
        System.out.println();
    }
    static void JonesyImage(String dialogue){
        for (int i = 0; i < dialogue.length(); i++) {
            char letter = dialogue.charAt(i);
            System.out.print(letter);
        try {
            Thread.sleep(1); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
        System.out.println();
        System.out.println();
    }
    // The following function provides the user with 4 choices, which are chosen by typing the listed numbers.
    static Integer Decision14(){
        Scanner scanner = new Scanner(System.in);
        Text("Select your option via the numbers 1, 2, 3, and 4.");
        while(true){
        try{
            int selection = scanner.nextInt();
        if (selection == 1){
            return 1;
        }
        else if (selection == 2){
            return 2;
        }
        else if (selection == 3){
            return 3;
        }
        else if (selection == 4){
            return 4;
        }
        else{
        throw new Exception();
        }
        }
        catch (Exception e){
            System.out.println("");
            System.out.println("Numbers 1-4, not anything else buddy.");
            System.out.println("");
            scanner.nextLine();
            continue;
        }
        }
    }
    // The following function provides the user with 2 choices, which are chosen by typing the listed numbers.
    static Integer Decision12(){
        Scanner scanner = new Scanner(System.in);
        Text("Select your option via the numbers 1 and 2.");
        while(true){
        try{
            int selection = scanner.nextInt();
        if (selection == 1){
            return 1;
        }
        else if (selection == 2){
            return 2;
        }
        else{
        throw new Exception();
        }
        }
        catch (Exception x){
            System.out.println("");
            System.out.println("Seriously? Numbers 1-2.");
            System.out.println("");
            scanner.nextLine();
            continue;
        }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
    System.out.println("");
    Text("- ? : Welcome to Fortnite Battle Royale. You must be new to this game, judging by your Jonesy skin.");
    JonesyImage("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*****//(@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%(#(**///*/##(/**#/*//*////(@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(///**///(((///*(%&#*//////(////((&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@////(((((((#(((((#%&%((((///(%(((((((((&%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%(//#&%%%%&%##((((((#%&(((((#%%%%#((((((((#%#(&%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@////(#%%&&%###((((((%&#/(########%%/(#%&%#######*&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@//(((###%####((((((%&#############%%##(######%#%#(*##@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@((((((#%(###((((((&@###(#########%%##(####((#&%#%%/(@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%#((##&%#(((((((((@@####((((#((#%#####%###(#%%&%#%%/&%@/&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#(##%%&&&&&&@&#(((/****##(((#%@#(((%@#(%%&%%#%&#(##(@&@%#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#(#%%#&/(((/////******/((%@%(((%&////////(((((#%%#@@%@%(@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(/(##@/(///////*****************//////////(((##(%&%&@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(((#&/////////*******************/////////(((####&&&%&#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@//#%(/////////********************////////((((#((%@#&%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(/(#/*//////*/******************//////////(((###(%&&%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(#&**////(#((((((/************////////////(((##((#@##@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,///((**///%(((((###((((/********//////////(###%%#(((%(@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*#%/(#**///((((((((((####%%((#/////(/(#(###%%%%%&&&#((@%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&/(((##,*////((#/,&@@@&#%####(////((#%&&%%%%###%%%%%##((%,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/(#&%#,*//////(((((((###(((((/*///#&&&&**&@@&*#%%%%%##(@%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&/(#&%(*//(///////((((/*/((((/////(#%%%#(((((####((###&@@%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/(((/*//((/////////**//(((((////(#%%%#(/(((((((((###@@%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/((/*//(((///////////(((((////((#%&%#((((((((((#%%@@&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@((/*//((((//////////(((((/////(#%&&#(((((((((#%%&@&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#*//((((((/////(((((((//////(#%%%%#(((####%&%#&%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*//((((((((/////#(((///////((%%%&&%#####%&%#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*(##*//((((((((///////(####((##%&&&&&&%%#%%%&&%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*(##%,//(((((((((//////////(#%%%%&&&&%%%#%%%&&%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&*/(#%%*/((((((((((((##((////(/(/(#######%%%%&&%#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(**/(%(//(((((((((((((((//((#%%%%%%%%%%#%%%&&&%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,,,**/*/**#%(((((((((////((((((((((######%%%%%%%&&%%#/%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/,***//*/((**%%((((((((//////////////(((######%%&&&&@%@%(%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(*/////*/(((*/#%#((((((//////////////((((####%&&&@@&%@%(((/@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@**//(*/////*/##((*(#%%#(((((////////////(((###%%&&@@@&&&%##(((//*,*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/,,**//(((#*/(//*(####(*/#%&%#((((//////////((##%%&&@@@@&%%&%###((((#((**/@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/,****///////((#**//*(####((*/#%@&%#((((((((((((##%&@@@@@&%%%%%%%%###((#%%#(//*/@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@//////////////////**/(#####((/*((%&&#(((#%%&&&&&&&&&&&&%%###%%%%%%#####&%%%#////%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/*(//////////////////**/##%%####(((///(%%%#((((((############%%%%%%######&&&&%#/((((((@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@***/////#///////////////////**#%&&%####(((((((((((#%%##########%&&%%%%%%######&&&&&#((((((&&(#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@**///(((((((((///////////////////**/#%&@&#####(#############(#%%%&&&&%%%%%%#####(#&&&&&%##(#((((@%//#(@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#*/((((((########((((((///////////////**(###%&%(/((/(#%%&%######%%#####%&&%%%%%##(((%&@@&&&%######((#%#((*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%,***/////(#((#######%%%%%/(((((((//////////////*/(((##%%%%((((((//***/((((####%%%%#((((((&&&@@@&%#########(#%%###(//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&(/////((((((##%###%%%%%%%%%%&/((((((((((///////////**//(((##%%%%#(((((((((///////////****#%%&&&@@&#(########((&&%%%####(#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/(#(((((((######%%%%%%%%%%%%%%&%/((((((((((((((//////*****//((#(###%%%#(((((((((((((((((((##%%&&@@%(((#######((&&@%#%%%%###%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/&**((%((((########%&%%%%%%%%%%%%#&%(((((((((((##((((///**//****//((#####(#&###(((((((((((((((#%%&@&#(((##((###((&&&@%#%%%%%%%%///,*/@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@//((#((########%%%&%%%%%%%%%%##&%&#(/((((((((###(((((//*///***,,*/(((#%###(#%((((//(/(((((((%%@%(((###(((((((%&&&&#%%&&&%%%%###(((**%@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%,,,****//((%(##########%&@%%%%%%%%&&#&%%%&(//(((((((((((((((//***////***,*/((((#%%####%#(////////(#%#(((#####(((((%&&&&%#%%&&&&&&&&%##((((///@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@******/////////((#(#########%%@&&%%%%%%%%%%&%%##&(//(((((((((((((((//***/////******/(((((#%&%%###(////&#(((((#####(((#%&@&&&#%%%&&&&&&&&%%#%#((((((/&@@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@@@@@#***////////(((((*//(%(#########%%@@&%%%%%%%%%#&%%%###&(///((((((////((((/****//*///******,/###(###%%%&&%####((((((((((/%&&@@&&&#%%%&&&&&&&&&&%#%#((((((((@@@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@@@/****/////////((((((((*/(%###########%@&%%%%%%%%%%%@%%#######(////((/////////(((/***//////*********/(############((((((((((%&&@@&%@&#%&&&&&&&&&&@&&%##((((((#((#@@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@@&**///////////////((((((*/(############%@&%%%%%%%%%%%&%%#######%#/////////////////((/**///////////********/((#######((((((((%&&@@&%%@%%%&&&&&&&&&&@@&%#%((((((#####@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@@@*/(//////////////////((((//(#%##########%&@%%%%%%%%%%%&%#########%%(//////////////////((**////////////////******//(((#((((((%&&&@@&%&&%%&&&&&&&&&&&@@&%%#%(((((######@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@@@%((###///////////////////((//((&##########%&@%%%%%%%%%%%&%##########%%%(//////////////////((/*//////////////////////****////(%&&&&@&%&@%&&&&&&&&&&&&&@@@&#%%#((((#####%%@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@&((###%#/////////////////////(*//@%#########%&@%%%%%%%%%%%%&############%%#(//////////////////(#/*///////////////////////////(#%&&&&&%%@&%&&&&&&&&&&&&&@@@&&%#%#((######%%&@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@@@(###%%%%/////////////////////(//(#&((########%@%%%%%%%%%%%%&%###########%%&&#///////////////////(#(/////////////////////////(#%%%&&&&%@&&&&&&&&&&&&&&&&@@@@&&#%#((#####%%%%@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@@&(##%%%%%%//////////////////////(*((@%/########%@%#%%%%%%%###&%%###########%%&&%((//////////////((((((#(////////////////////(((#%%%%&&%&&@&&&&&&&&&&&&&&@@@&@@&%%##(#####%%%&@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@&#/(%%%%%%(///////////////////////*/(&%(#######%%@&%%%%%######&%%###########%%&@&@#(((////////////(((((((##//////(((///////((((###%%%&%%&%@&&&&&&&&&&&&&&@@@&@@@&#%#######%%%&@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@@#(/(%%%%%(//////////////////////////(%&(/%###%%%%@&%%%%%%#####&%%###########%%%@&%%%((((///////////((((####(#(//((((((((/((((((##%%%%%&@@#@&&&&&&&&&&&&&&@@@&&@@@%&%#####%%%%&&@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@#/#%%%%%&/////####////////////////(//((&#/#%%%%%%%@&%%%%%###(/%&%%###########%%%&@&%#%((((((////////((((((####(#(/((((((((((((((##%%%%@#%&#@&&&&&&&&&&&&&@@@@@&@@@%&%####%%%%%&@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@%(((#&&%%/#%%#/////////////////////(/*(#@%/#%%%%%%&&####%%##((##@%%##########%%%%&@&%%#%#(((((((/////////((((#####(#(((((((((((((###%%@#&&%#@&&&&&&&&&&&&&@@@@&&@@@&&&%##%%%%%%&@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@#/#%#%%%&&%%(/////////////////////(((//#%&/(%%%%%%@&&%%%%#(//*##@&%####%%%%%%%%%%&@&%%##%#(((((((((///////((((((##%%###(((((((((####@##&&%%#&&&&&&&&&&&&&@@@@@&&@@@@@&%%%%%%%%&&@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@#(#%%%%%%&/////////////////////(((((((/##@(#%%%%%%@&%%%%%######%@%%######%%%%%&&%&@&&%####%((((((((((/////((((((((##%%%#%#(((((####@(#%%%%#%&&&&&&&&&&&&@@@@&@@&@@@@@@%%%%%%&&&@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@%%(&&&&%(((((((((///////////(((((((((((/#(@%#%%%%%%%@%&%%%%###(/@%%%%#########%%%%&&&&%%####%#((((((((((//////((((((((##%%%###(((#%(((%%####%@&&&&&&&&&&@@@@@@@@@&@@@@@&%%%%&&&@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@%%&&&#&&%%#((((((((((((((((((((((((((((/##&%(%%%%%%%@%&&%%%%####@%%%%##########%%%&&&&&%#####&#((((((((((((/////(((((((((########(((#%%%####%@&&&&&&&&&&@@@&@@@@@&&@@@@&%%%&&&@@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@(#%%((#&&#(((((((((((((((((((((((((###/##&#%%%%%%%&&%&%%%%%%##%&%%%%##########%%%&&@&&%#####%%%((((((((((((((////(((((((((((((((###%%######%@&&&&&&&&&@@@&@@@@@@@&@@@@@&%%%&&&@@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@(##%###(((((((((((((((((((((((((((####(#%&%%%%%%%%@&%&&&%%%%%#&%%%%%#########%%%%%&@&%%%####%%%&#((((((((((((((/////(((((((((((###%%%######%@&&&&&&&&@@@&&@@@@@@@@@@@@&%#%%&&%&@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@((#####%###(((((((((((((((###########%(#%&&%%%%%%%@%&&&&&%%%%#@%%%%%%#######%%%%%&&@&%&%%###%%%%&%(((((((((((((((((((((((((((####%%########&&&&&&&&&@@@&&&&@@@@@@@@@@@%##%%%&&%@@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@((##%%###%((((((((((############%%&&&##%&%&&&&&&&&%&&&&&&&%#%&%%%%%%%#####%%%%%%&&&@%&&%%%%%%%%%%%#((((((((((((((((((((#######%&%########%@@&&&&&&@@@&&&&&@@@@@&@@@@&%###%%%&%%@@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@@%(#########################%%%%&&&@@@(##&%&&&&&&@%%&&&&&&&%%@%%%%%%%%%%%%%%%%%%&&&&@%&%%%%%%%%%%%%%#(((((((((((((###((#######%&%%########&&&&&&&&@@@&&&&&@@@@@@@@@@@&####%%%%%%&@@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@@@(/(#####################%%%%&&&&&&&&%##%&&&&&&&&&&%&&&&&&&&#&&%%%%%%%%%%%%%%%%%&&&&@@&&%%%%%%%%%%%%%%#(((((((((############%%%&%%########@&&&&&&@@@&&&&&&&@@@@@@@@@@@&#####%%%%%%%@@@@@@@@@@@@\r\n" + //
            "@@@@@@@@&#/(###################%%%%%%%%%%%%%@@%&%@&&&&&&&&@&&&&&&&&&%%@&&%%%%%%%%%%%%%%%&&&&&@@&&&&%%%%%%%%%%%%%%(((#############%%%%%%%%########&@&&&&&&@@@&&&&&&&@@@@&@@@@@@@&#####%%%%%%%#@@@@@@@@@@@\r\n" + //
            "@@@@@@@@#%###(################%#########%%%@@@@@@%&&&&&&&&@&&&&&&&&&&&@&&%%%%%%%%%%%%%&&&&&&&&@&&&&%%%%%%%%%%%%%%%#(#############%%%%%%%#####(#&@&&&&&&&@@&&&&&&&&&@@@@@@@@@@@&%#####%%%%%%%%#@@@@@@@@@@\r\n" + //
            "@@@@@@@@##%%%###########((((((((((####%%%%@@@@&&&&&&&&&&&@%&&&&&&&&&&@&&&&%%%%%%%%%%%&&&&&&&&&@@&&&%%%%%%%%%%%%&&%%#(#############%%%%#######@&&&&&&&&@@@&&&&&&&&@&@@@@@@@@@@@%######%%%%%######@@@@@@@@\r\n" + //
            "@@@@@@@%%%%%%&######((((((((((((#####%%%%@@@@@@@@@&&&&&&@&&&&&&&&&&&@&&&&&&%%%%%%%%%%&&&&&&&&&@@&&&%%%%%%%%%%%%&&&&%######################%@&&&@@&&&&@@@&&&&&&&&&@@@@@@@@@@@@&#######%%%%%#######&@@@@@@\r\n" + //
            "@@@@@@@%%%%%%%%&###((((((((((((#####%%%%&@@@@@&@@@@@@@@@&&&@@@@@@@@@@&&&&&&&&&&&&&&&&&&&&&&&&&&@&&&%%%%%%%%%&&&&&&&&%###################@@&&&&&&&&&@@@@&&&&&&&@@@@@@@@@@@@@@@%########%%%#########(&@@@@");
    Text("- ? : Alas, I'll explain the rules. You must choose a destination to drop in. You must also choose between what fights to take on, and which to avoid.");
    Text("- ? : Foremost, you must have more kills than the last player left in order to win the game. Good luck.\"");
    Text("- Renegade Raider: The bus is dropping everyone in 3 seconds! Pick your destinations!");
    Text("1 | Salty Springs");
    Text("2 | Tilted Towers");
    Text("3 | Greasy Grove");
    Text("4 | Haunted Hills");

    int dropspot = Decision14();
    String loot = "";
    int kills = 0;

    if (dropspot == 1) {
        System.out.println("");
        Text("- Renegade Raider: Dropping at Salty Springs!");
       loot = getLoot(random);
        Text("You found a " + loot + " Assault Rifle in Salty Springs!");
    } else if (dropspot == 2) {
        System.out.println("");
        Text("- Renegade Raider: Dropping at Tilted Towers!");
        loot = getLoot(random);
        Text("You found a " + loot + " Assault Rifle in Tilted Towers!");
    } else if (dropspot == 3) {
        System.out.println("");
        Text("- Renegade Raider: Dropping at Greasy Grove!");
        loot = getLoot(random);
        Text("You found a " + loot + " Assault Rifle in Greasy Grove!");
    } else if (dropspot == 4) {
        System.out.println("");
        Text("- Renegade Raider: Dropping at Haunted Hills!");
        loot = getLoot(random);
        Text("You found a " + loot + " Assault Rifle in Haunted Hills!");
    }
if (loot == "Rare"){
    Text("You've landed smoothly and immediately spotted a Rare Assault Rifle gleaming under the sun.");
    Text("You quickly grab the weapon, feeling its weight and balance. It's a perfect fit for your hands.");
    Text("As you cautiously explore the area, you hear footsteps. Your heart races.");
    
    Text("Suddenly, an enemy appears around the corner! You take a deep breath and aim.");
    Text("With a burst of gunfire, the enemy is taken by surprise. They're down!");
    Text("'First Kill! The Rare Assault Rifle has proven its worth. You quickly loot some ammo and healing items.");

    Text("Not long after, you spot two more enemies engaged in a fight. You decide to take a chance.");
    Text("You position yourself strategically and wait for the right moment.");
    Text("As one emerges victorious, weakened, you unleash a hail of bullets. Second Kill!");
    Text("You can feel the adrenaline pumping. The rifle's accuracy and firepower are impeccable.");

    Text("The final encounter comes when you least expect it. Caught off-guard while looting, you're under fire!");
    Text("You roll for cover, heart pounding. The enemy is aggressive, but you're determined.");
    Text("Peeking out, you aim with precision. The Rare Assault Rifle roars to life, and it's a direct hit. Third Kill!");
    
    Text("Breathing heavily, you realize you've just eliminated three opponents with your Rare Assault Rifle.");
    Text("This weapon, your skill, and a bit of luck have kept you in the game. But the battle is far from over.");
    Text("You reload, gather your thoughts, and prepare to move on. The quest for victory continues!");
    kills = 3;
}

else if (loot == "Epic (games)"){
    Text("As you touch down, your eyes catch the shimmer of an Epic Assault Rifle.");
    Text("It's not just any rifle; it's known for its superior accuracy and devastating power.");
    Text("You grasp the weapon, feeling a surge of confidence. This could be your game changer.");

    Text("Your first encounter is swift. Spotting an enemy unprepared, you take aim.");
    Text("The rifle's precise burst shreds through their defense. First Kill!");
    Text("You can't help but admire the rifle's smooth recoil and pinpoint accuracy.");

    Text("Moving stealthily, you find two unsuspecting foes in a nearby building.");
    Text("You unleash the Epic Rifle's power, catching them off-guard. Two rapid kills!");
    Text("Your heart races as you realize the potential of your newfound weapon.");

    Text("The game intensifies. You encounter a skilled duo, ready for battle.");
    Text("But with superior positioning and the Epic Rifle's firepower, you outgun them both. Four kills now!");
    Text("You're becoming a legend on the battlefield, one burst at a time.");

    Text("The next target is a lone wanderer, skilled but outmatched.");
    Text("You engage in a fierce shootout. With a final accurate shot, the fifth kill is yours.");
    Text("You're not just surviving; you're dominating.");

    Text("The next three kills are a blur of adrenaline and tactical prowess.");
    Text("One enemy falls from a long-range encounter. The sixth kill.");
    Text("Another in a surprise attack as you navigate the terrain. Seven down.");
    Text("The last one, a tense face-off where your Epic Rifle ultimately prevails. Eight kills!");

    Text("You pause, catching your breath. The Epic Assault Rifle in your hands feels like an extension of yourself.");
    Text("Eight opponents have fallen to its might. But there's no time to rest.");
    Text("The game is still on, and victory is within reach. You reload, focus, and move on, ready for the next challenge.");
kills = 8;
}

else if (loot == "LEGENDARY SCAR"){
    Text("As you land, your eyes immediately lock onto a Legendary Assault Rifle. Its aura of power is unmistakable.");
    Text("Grasping the weapon, you feel an instant connection. This isn't just any rifle; it's a game winner.");

    Text("Your first engagement is almost poetic. Spotting an enemy, you take aim.");
    Text("The Legendary Rifle speaks with authority, and your foe falls. First Kill!");
    Text("The weapon's balance and deadly precision fill you with confidence.");

    Text("You move with purpose, spotting a squad unaware of your presence.");
    Text("With tactical positioning and the rifle's unmatched firepower, you swiftly dispatch them. Four kills already!");
    Text("Each shot of the Legendary Rifle cements your control over the battlefield.");

    Text("Next, you encounter a duo in a fortified position. They're skilled, but so are you.");
    Text("With calculated bursts, you breach their defense. Six kills!");
    Text("Your Legendary Rifle is not just a weapon; it's a statement of your prowess.");

    Text("The middle phase of the game sees you outmaneuver and outgun three separate enemies.");
    Text("Each encounter is intense, but the Legendary Rifle's reliability never falters. Nine kills!");
    Text("You're a force to be reckoned with, a blend of strategy and raw power.");

    Text("As the game progresses, you find yourself in a heated skirmish against a skilled squad.");
    Text("In a breathtaking display of skill and the rifle's epic capabilities, you emerge victorious. Thirteen kills!");
    Text("The air is thick with tension and admiration. Your presence on the battlefield is legendary.");

    Text("Breathing heavily, you survey the area. Thirteen opponents have fallen to your Legendary Rifle.");
    Text("You've become more than just a player; you're a legend in this game.");
    Text("Reloading your rifle, you prepare for the final battles. Victory is not just a possibility; it's within your grasp.");
kills = 13;
}

Text("You have " + kills + " amount of kills, where will you rotate to now?");
Text("1 | Loot Lake");
Text("2 | Dusty Divot");
int nextspot = Decision12();

if (nextspot == 1){
    System.out.println("");
    Text("You have " + kills + " amount of kills. You decide to rotate to Loot Lake.");
    Text("As you approach the serene waters of Loot Lake, the environment seems eerily quiet.");
    Text("The sun reflects off the lake, casting shimmering patterns across its surface. It's peaceful, yet you remain alert.");

    Text("You traverse the edges of the lake, rifle at the ready, eyes scanning for movement.");
    Text("The usual chaos of the battleground seems a world away. Here, it's just you and the gentle lapping of the water.");
    
    Text("You check the usual hiding spots - behind rocks, in the small cabins, near the abandoned boats.");
    Text("Every step is cautious, deliberate. But there's no one. No footsteps, no distant gunfire, just silence.");
    
    Text("You climb to a higher vantage point, surveying the area with a keen eye.");
    Text("The lake reflects the sky like a giant mirror, but it reveals no enemies, only the tranquility of nature.");
    
    Text("Minutes tick by. You're alone, with only the soft rustle of the wind for company.");
    Text("You ponder, 'Is this a stroke of luck, or is it too calm?' Paranoia briefly sets in, but you shake it off.");
    
    Text("You use this time to regroup. Checking your ammunition, healing any minor wounds, staying vigilant.");
    Text("The lack of action is a stark contrast to the earlier frenzy. You find it oddly disconcerting yet welcome.");
    
    Text("As the circle begins to close, you realize it's time to move on.");
    Text("With one last glance over the serene Loot Lake, you head towards the next zone.");
    Text("The kill count remains the same, but you're well-prepared, both in gear and mindset, for the battles ahead.");
}

else if(nextspot == 2){
    System.out.println("");
    Text("You have " + kills + " amount of kills. Deciding your next move, you head towards Dusty Divot.");
    Text("The rugged terrain of Dusty Divot looms ahead, a stark contrast to the calm of Loot Lake.");
    Text("As you enter the Divot, your senses heighten. The area is known for close encounters and fierce battles.");

    Text("You navigate through the remnants of the meteor-struck site, your Assault Rifle at the ready.");
    Text("The silence is abruptly broken by the sound of footsteps. An enemy appears, sprinting across the terrain.");
    Text("You take aim and with precise bursts, you bring them down. Another kill added to your tally.");

    Text("Barely catching your breath, you hear a distant gunfire. Two more enemies are in a skirmish nearby.");
    Text("You seize the opportunity. Positioning yourself strategically, you prepare to engage.");
    Text("As one emerges victorious, wounded and distracted, you unleash a flurry of bullets. The second enemy falls to your might.");

    Text("The final enemy, alert to your presence, engages in a desperate battle.");
    Text("You both maneuver around the Divot's unique landscape, exchanging gunfire.");
    Text("Your experience and the Rifle's power give you the edge. With a final accurate shot, your opponent collapses. Three kills in quick succession!");

    Text("The Dusty Divot is now eerily quiet, the echoes of your gunshots fading away.");
    Text("You take a moment to loot, gathering ammo and supplies from your fallen adversaries.");
    Text("The battle at Dusty Divot has further cemented your reputation as a formidable fighter.");

    Text("With the storm circle closing in, you know it's time to move again.");
    Text("You leave the Divot, three more kills richer, and ready for the next challenge.");
    Text("Your kill count has risen impressively. The game is intensifying, and you're at the heart of it.");
    kills += 3;
}

if (kills > 10){

    Text("Having more than 10 kills, you decide to rotate to Neo Tilted.");
    Text("The futuristic skyline of Neo Tilted rises before you, a labyrinth of high-tech buildings and narrow streets.");
    Text("This urban jungle is a hotspot for intense battles, and you're ready to dive in.");

    Text("As you enter the city, the hum of neon signs and the shadows of towering structures set the stage.");
    Text("Your footsteps echo on the concrete. Every corner could hide an enemy, every building a sniper's nest.");

    Text("Your first encounter is abrupt. An enemy ambushes you from a doorway!");
    Text("Reacting instantly, your Rifle roars to life, cutting them down. Another kill to your name.");
    Text("The close-quarters battle leaves your heart pounding, but you remain focused.");

    Text("Moving deeper into Neo Tilted, you spot two players engaged in a rooftop duel.");
    Text("You ascend a nearby building, taking a vantage point. With deadly precision, you take out both. Two quick kills!");
    Text("Your position gives you the advantage, and your rifle's power seals the deal.");

    Text("Descending back to the streets, you hear distant gunfire. You follow the sound.");
    Text("In a narrow alley, you find two enemies unaware of your approach.");
    Text("With strategic positioning and controlled bursts, you eliminate both before they can react. Two more kills!");

    Text("The city now feels like a ghost town. The echoes of your gunfire slowly dissipate.");
    Text("You take a moment to regroup, reloading your rifle and scanning the area.");
    Text("Five enemies down in Neo Tilted. Your kill count is soaring, and so is your confidence.");

    Text("You realize the storm is closing in. It's time to move again.");
    Text("Leaving the now-quiet Neo Tilted behind, you prepare for the next phase of the game.");
    Text("Your journey continues, with each step taking you closer to potential victory.");
    kills += 5;
}

else{
    Text("With fewer than 10 kills, you decide to head towards the main block of the zone, known for its high player density.");
    Text("As you approach, the sounds of battle grow louder. This is the heart of the conflict, teeming with adversaries.");

    Text("Your first engagement is immediate. An enemy rushes at you from a side street.");
    Text("You react swiftly, and your Rifle delivers. One enemy down.");
    Text("The quick victory bolsters your confidence as you delve deeper into the fray.");

    Text("In the chaos of the main block, you spot a trio of enemies in a heated exchange.");
    Text("Seizing the opportunity, you position yourself above them on a rooftop.");
    Text("With a well-timed assault, you take out all three, one after another. Your kill count rises rapidly.");

    Text("The next encounter is a test of your strategic decision-making.");
    Text("You spot an enemy, seemingly alone, but their position is advantageous.");
    Text("You pause, considering your options. It's time to make a choice.");
    Text("1 | Engage");
    Text("2 | Don't engage");

    int shootDecision = Decision12();
    if (shootDecision == 1) {
        System.out.println("");
        Text("Deciding to take the shot, you line up your rifle and fire.");
        Text("Your aim is true, and the enemy falls. Another calculated risk pays off.");
        kills++;
    }
    
    else {
        System.out.println("");
        Text("You choose not to engage, avoiding potential exposure. Sometimes, discretion is the better part of valor.");
    }
    Text("As you navigate through the bustling streets, two more enemies cross your path.");
    Text("In a rapid, adrenaline-fueled confrontation, you outmaneuver and eliminate both.");
    Text("Your Rifle is a beacon of destruction, and you wield it masterfully.");

    Text("The final challenge in this area is a skilled opponent, moving swiftly between cover.");
    Text("The battle is intense, pushing both your skills to the limit.");
    Text("With a combination of tactical movement and precision shooting, you secure your seventh kill in the main block.");

    Text("The zone is quieter now, the aftermath of your actions evident all around.");
    Text("Seven or more opponents have fallen to your prowess here, a testament to your skill and strategy.");
    Text("You gather your thoughts and resources, preparing for the next move. The game is far from over, and you're a key player.");
    kills += 7;
}

if (kills > 15){

    Text("You have more than 15 kills, you're doing pretty good! Would you like to go to a high density zone or a low density zone?");
    Text("1 | Midas' House (tryhard)");
    Text("2 | The Backyards (bot)");
    int selection = Decision12();
    if (selection == 1){
        System.out.println("");
        Text("You make the bold decision to head towards Midas' house, a notorious hotspot for intense battles.");
        Text("As the grand, opulent mansion comes into view, you steel yourself for what's to come.");
    
        Text("Approaching cautiously, you notice the first enemy patrolling the outer garden.");
        Text("With a swift, precise shot from your rifle, you take them down. The battle has begun.");
        Text("You quickly move the body out of sight, preparing for more encounters.");
    
        Text("Inside the mansion, the atmosphere is tense. Every shadow could be an enemy, every sound a potential threat.");
        Text("You encounter two foes in the grand hallway, engaged in looting. Without hesitation, you engage.");
        Text("The element of surprise is on your side; two quick kills are added to your count.");
    
        Text("As you ascend the ornate staircase, you hear footsteps. Two more enemies, unaware of your presence.");
        Text("Positioned above, you unleash a barrage of bullets, taking both out with ruthless efficiency.");
        Text("Your control over the situation is absolute; your kill count climbs higher.");
    
        Text("In the upper chambers, a fierce gunfight breaks out between you and three skilled enemies.");
        Text("It's a dance of bullets and strategy. You maneuver around lavishly decorated rooms, firing with deadly accuracy.");
        Text("One by one, they fall. Your Legendary Rifle is unrelenting, and so are you.");
    
        Text("The final three enemies are the toughest. They're well-armed and aware of your prowess.");
        Text("The confrontation takes you through the mansion's intricate corridors and opulent spaces.");
        Text("Each enemy is a formidable opponent, but your skill and strategy reign supreme.");
        Text("With calculated moves and precise shooting, you eliminate all three.");
    
        Text("The mansion falls silent, save for the distant sounds of the storm closing in.");
        Text("You stand amidst the aftermath of your incredible feat. Ten enemies, each a story now ended by your hand.");
        Text("You take a moment to gather loot, ammunition, and your thoughts.");
        Text("The journey is far from over, but in Midas' house, you've proven yourself a legend.");
        kills += 10;
    }

    else{
        System.out.println("");
        Text("Choosing a more cautious approach, you head towards the backyards, known for their lower player density.");
        Text("The area is a stark contrast to the frenzied battlegrounds you've left behind. It's quieter, more secluded.");
    
        Text("As you cautiously move through the backyards, with their manicured lawns and fences, you stay alert.");
        Text("Your senses are heightened, knowing that danger could lurk in any shadow.");
    
        Text("Your vigilance pays off when you spot the first enemy, trying to hide behind a garden shed.");
        Text("You take aim with your rifle and eliminate them swiftly. One more kill to your name.");
        Text("You quickly scan the area for more threats before moving on.");
    
        Text("Moving through the maze of fences and shrubbery, you encounter a duo.");
        Text("They are caught off guard, giving you the upper hand. You engage, your rifle echoing through the backyards.");
        Text("The duo puts up a fight, but you outmaneuver them, securing two more kills.");
    
        Text("With three more enemies down, you pause to assess the situation.");
        Text("The backyards are now eerily quiet, the recent chaos having subsided.");
        Text("You face a critical decision: camp here and wait for the zone to close or continue hunting for more kills.");
        Text("1 | Camp like the Jonesy you are");
        Text("2 | Be a sigma and continue hunting");

        int strategyChoice = Decision12();
        if (strategyChoice == 1) {
            Text("You decide to camp, finding a strategic spot to watch for incoming enemies.");
            Text("It's a game of patience now. You stay low, keeping an eye on the surroundings, waiting for the right moment.");
            Text("The zone closes in slowly, and you're ready for anyone trying to enter your domain.");
        } else {
            Text("Opting for aggression, you choose to keep moving and hunting.");
            Text("You leave the backyards, rifle in hand, ready for the next encounter.");
            Text("The thrill of the hunt drives you, and you move towards the next zone, eyes peeled for the next target.");
        }
        kills += 3;
    
        Text("Your decision is made, your strategy set. The game continues, and you're a key player in its unfolding drama.");
    }
}

else{
    Text("Recognizing the need to boost your kill count, you make a bold decision to head straight to Meowscles' Den.");
    Text("As you approach, you can sense the danger. Meowscles' Den is notorious for its intense firefights and fierce competitors.");

    Text("Stepping into the Den, the air is thick with tension. It's a labyrinth of rooms and corridors, each potentially hiding an enemy.");
    Text("You're on high alert, your senses finely tuned to any movement or sound.");

    Text("The first encounter happens swiftly. Two enemies, locked in a battle, don't notice your approach.");
    Text("Seizing the opportunity, you jump into the fray, taking them both down in a rapid, calculated assault. Two kills added to your count.");

    Text("Moving deeper into the Den, you hear the footsteps of another opponent.");
    Text("You set up an ambush, waiting patiently. As they pass by, you strike with precision. Another kill, quick and silent.");

    Text("You barely have time to catch your breath when you're attacked from behind.");
    Text("A close-quarters battle ensues. Adrenaline pumping, you manage to overcome your assailant. Four kills now.");

    Text("The Den's narrow hallways and sharp corners make for intense combat.");
    Text("You encounter a squad of three, skillfully navigating the terrain and engaging them.");
    Text("The fight is fierce, but your determination and tactical prowess prevail. Three more enemies down.");

    Text("As you clear the last room, you find your final target.");
    Text("They're cautious, but so are you. The ensuing duel is a test of skill and nerve.");
    Text("Ultimately, your superior tactics and the lethal precision of your rifle grant you the victory. Your eighth kill in the Den.");

    Text("Meowscles' Den falls silent, the echoes of your battles fading away.");
    Text("You stand amidst the chaos you've created, eight more kills to your name.");
    Text("With a deep breath, you collect valuable loot and prepare to move on.");
    Text("Your actions in the Den have changed the course of the game, and you're now a formidable presence on the battlefield.");
    kills += 8;
}

Text("The final zone is closing in! The server will now decide who wins, you or the last player standing, based on the number of kills.");
Text("The tension is palpable as you spot the last opponent. There's no need for a direct confrontation; the server's judgment will be the final arbiter.");
Text("You both stand in the diminishing safe zone, the final circle of combat, aware that the decision hinges on your respective kill counts.");

Text("The landscape around you bears the scars of the fierce battles that have taken place. The air is heavy with anticipation, the silence punctuated only by the encroaching storm.");
Text("You keep a wary eye on your adversary, acknowledging their skill and resilience in making it this far.");

Text("As you stand there, a mix of anxiety and hope courses through you. You reflect on each encounter, each strategic decision that brought you here.");
Text("Your opponent, a worthy adversary, mirrors your sense of anticipation, waiting for the server's verdict.");

Text("The moment stretches, each second feeling like an eternity. Both of you have fought valiantly, but only one can emerge victorious.");
Text("Finally, the server's decision flashes on the screen. It's analyzing the kill counts, assessing who has been the more dominant player.");

Text("Your heart races as the server processes the final tally. Then, the screen updates with the outcome.");

int KillsOpponent = random.nextInt(50);

if(KillsOpponent < kills){

Text("Kills Opponent: " + KillsOpponent);
Text("Your kills: " + kills);

Text("You've done it! Your aggressive strategy and skillful eliminations have paid off. You have more kills, granting you the victory.");

Text("A message appears: 'Victory Royale!' The sense of achievement is overwhelming. Against all odds, your determination and combat prowess have led you to this moment.");
Text("The last player is salty about his loss, so you open up your emote list and dance to take the L upon his defeat.");

Text("As the game ends, you take a moment to soak in your triumph. From the first drop to this final stand, your journey has been marked by strategic thinking, skillful engagements, and unwavering focus.");
Text("You are the victor, not just by chance, but by merit. The champion of the game. The Jonesy.");
}

else{
    Text("Kills Opponent: " + KillsOpponent);
    Text("Your kills: " + kills);

    Text("The tense moment of decision arrives. Despite your aggressive strategy and skillful eliminations, the server's verdict reveals a different outcome.");
    Text("The message appears on the screen: 'Game Over.' Your heart sinks as you realize your opponent has secured more kills, clinching the victory.");
    
    Text("A wave of disappointment washes over you, but it's mingled with a sense of pride. You've battled valiantly, outlasting many in a challenging game.");
    Text("The last player, now declared the victor, laughs in his triumph, and wags his finger on your face.");
    
    Text("As the game concludes, you take a moment to reflect on your journey. From the first drop to this final standoff, your path has been one of strategic planning, intense combat, and relentless pursuit of victory.");
    Text("Though you didn't emerge as the champion this time, the experience has honed your skills and sharpened your resolve.");
    
    Text("You understand that in the world of competitive gaming, every defeat is a lesson, a stepping stone to future triumphs.");
    Text("Resolved to come back stronger, you prepare for the next game, carrying with you the knowledge and experience gained from this battle.");
    Text("You may not have claimed the title of victor today, but your determination and prowess make you a worthy contender, ready to face the next challenge.");
    Text("But before exiting to go back to the lobby, you hear a voice stemming from the heavens above, saying:");
    Text("You are just a Jonesy. You will never be a Renegade Raider. Get off the game kiddo");
}

try (BufferedWriter writer = new BufferedWriter(new FileWriter("GameResult.txt"))) {
    if (KillsOpponent < kills) {
        writer.write("You won the game! Congratulations on your win, try again for different outcomes!\n");
        writer.write("Your Assault Rifle Rarity was: " + loot + "\n");
    } else {
        writer.write("You lost the game! Don't worry, you can always try again to maybe find better loot.");
        writer.write("Your Assault Rifle Rarity was: " + loot + "\n");
    }
} catch (IOException e) {
    e.printStackTrace();
}
}
}