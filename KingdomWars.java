
import java.io.*;

public class KingdomWars
{
    static InputStreamReader read = new InputStreamReader(System.in);
    static BufferedReader in = new BufferedReader(read);

    static KingdomWars ob=new KingdomWars(); 
    static Productions ob1=new Productions();

    static String Rome="capital";
    static String Iberia="enemy"; 
    static String Zama="enemy";
    static String Thapsus="enemy";
    static String Carthage="enemy";

    /////////////////////////////////

    static int RrecruitQueue=-1;
    static int Rvillagers=0;

    static int IrecruitQueue=-1;
    static int Ivillagers=0;

    static int ZrecruitQueue=-1;
    static int Zvillagers=0;

    static int TrecruitQueue=-1;
    static int Tvillagers=0;

    ///////////////////////////////////

    static int RromanLegionary=0;
    static int RromanCavalry=0; 
    static int Rarchers=0;

    static int IromanLegionary=0;
    static int IromanCavalry=0; 
    static int Iarchers=0;

    static int ZromanLegionary=0;
    static int ZromanCavalry=0; 
    static int Zarchers=0;

    static int TromanLegionary=0;
    static int TromanCavalry=0; 
    static int Tarchers=0;

    //////////////////////////////////

    static int Pinfantry=0;
    static int Pcavalry=0;
    static int Parchers=0;

    static int IberianInfantry=0;
    static int IberianCavalry=0;
    static int BarbarianArchers=0;    

    static int DesertInfantry=0;
    static int NumidianCavalry=0;
    static int LibyanPeltasts=0;    

    static int GreekHoplites=0;
    static int GreekLightCavalry=0;
    static int ThracianArchers=0;

    static int SacredBand=0;
    static int ImperialGuard=0;
    static int Slingers=0;

    /////////////////////////////////

    static int RmilitaryRecruitmentQueue=0;
    static String RrecruitmentQueueUnits[]={"","","",""};

    static int ImilitaryRecruitmentQueue=0;
    static String IrecruitmentQueueUnits[]={"","","",""};

    static int ZmilitaryRecruitmentQueue=0;
    static String ZrecruitmentQueueUnits[]={"","","",""};

    static int TmilitaryRecruitmentQueue=0;
    static String TrecruitmentQueueUnits[]={"","","",""};

    ////////////////////////////////

    static int Rgoldminers=0;
    static int Rlumberjacks=0;
    static int Rfoodgatherers=0;

    static int Igoldminers=0;
    static int Ilumberjacks=0;
    static int Ifoodgatherers=0;

    static int Zgoldminers=0;
    static int Zlumberjacks=0;
    static int Zfoodgatherers=0;

    static int Tgoldminers=0;
    static int Tlumberjacks=0;
    static int Tfoodgatherers=0;

    /////////////////////////////////

    static int Pfood=500;
    static int Pgold=500;
    static int Pwood=500;

    ///////////////////////////////

    static String Rforum="false";
    static int RforumTime=5;
    static String RcavalryStables="false";
    static int RcavalryStablesTime=4;
    static String RarcheryRange="false";
    static int RarcheryRangeTime=3;

    static String Iforum="false";
    static int IforumTime=5;
    static String IcavalryStables="false";
    static int IcavalryStablesTime=4;
    static String IarcheryRange="false";
    static int IarcheryRangeTime=3;

    static String Zforum="false";
    static int ZforumTime=5;
    static String ZcavalryStables="false";
    static int ZcavalryStablesTime=4;
    static String ZarcheryRange="false";
    static int ZarcheryRangeTime=3;

    static String Tforum="false";
    static int TforumTime=5;
    static String TcavalryStables="false";
    static int TcavalryStablesTime=4;
    static String TarcheryRange="false";
    static int TarcheryRangeTime=3;

    ///////////////////////

    static int RvillagerCarryingCapacity=50;
    static int IvillagerCarryingCapacity=50;
    static int ZvillagerCarryingCapacity=50;
    static int TvillagerCarryingCapacity=50;

    static int TurnNumber=1;
    static int Year=264;
    static int SeasonNumber=1;
    static String Season="Winter";

    public static void main(String args[])throws IOException
    {
        ob1.main();
        for(long i=0;i<999999999;i++){}
        for(long i=0;i<999999999;i++){}
        System.out.print("\f");
        ob.Welcome();
    }
    
    void Welcome()throws IOException
    {
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("                                         -------------------------------------------------");
        System.out.println("                                              ___    __    ___                   ___   ___   ___         ");
        System.out.println("                              |  /  | |\\   | |      |   \\ |   | |\\  /|   |    | |   | |   | |          ");
        System.out.println("                              | /   | | \\  | |      |   | |   | | \\/ |   |    | |   | |   | |          ");
        System.out.println("                              |     | |  \\ | |    _ |   | |   | |    |   |    | |---| |--\\   ---       ");
        System.out.println("                              | \\   | |   \\| |   |  |   | |   | |    |   | /\\ | |   | |   \\     |      ");
        System.out.println("                              |  \\  | |    | |___|  |___/ |___| |    |   |/  \\| |   | |    \\ ___|      ");
        System.out.println();
        System.out.println("                                            ------------- THE PUNIC WARS ---------------                                       ");
        System.out.println("\n");
        System.out.println("                                                                By,");
        System.out.println("                                        -------------- SHARVAI PATIL --------------\n\n\n");
        for(long i=0;i<999999999;i++){}
        for(long i=0;i<999999999;i++){}
        ob.Mainmenu();
    }

    void Mainmenu()throws IOException
    {
        // System.out.print("\f");
        int choice;
        System.out.println("--------------------------- KINGDOM WARS - The Punic Wars--------------------------------");
        System.out.println();
        System.out.println(" _____________________________________________________________ ");
        System.out.println("|,,,,,,,,,,,,,,,,,,,,,,,|,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,|");
        System.out.println("|,,,,,,,,,,,,,,,,,,,,,,,|,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,|");
        System.out.println("|,,,,,,,,,IBERIA,,,,,,,,|,,,,,,,,,,,,,, /\\/\\/\\,,,,,,,,,,,,,,,,|");
        System.out.println("|,,,,,,,,,,,,,,,,,,,,,,,|___________ /\\/\\/\\/\\/\\/\\_____________|");
        System.out.println("|,,,,,Iberian Peninsula,|           |,,,,,,,,,,,,|            |");
        System.out.println("|_______________________|            |,,,,ROME,,,,| Adriatic  |");
        System.out.println("|               Balearic Sea          |,,,,,,,,,,,,|     Sea  |");
        System.out.println("|                                     |,,,,,,,,,,,,|          |");
        System.out.println("|                                 __ |____________|           |");
        System.out.println("|                                |__|            Ionian Sea   |");
        System.out.println("|    Alboran Sea                                              |");
        System.out.println("|                                                             |");
        System.out.println("|                                                             |");
        System.out.println("|________________________           Mediterranean Sea         |");
        System.out.println("|.......................|                _____________________|");
        System.out.println("|.......................|_______________|.....................|");
        System.out.println("|.....THAPSUS...........|...............|.....................|");
        System.out.println("|.......................|...............|......CARTHAGE.......|");
        System.out.println("|.......................|.....ZAMA......|.....................|");
        System.out.println(" _______________________|_______________|_____________________ ");
        System.out.println();
        System.out.println("\n------------ RESOURCES --------------");
        System.out.println("Gold="+Pgold);
        System.out.println("Food="+Pfood);
        System.out.println("Wood="+Pwood);
        System.out.println("-------------- YEAR -------------------");
        System.out.println("Turn Number="+TurnNumber);
        System.out.println("Year="+Year+"BC");
        System.out.println("Season="+Season);        
        System.out.println("--------------  OPTIONS  --------------");
        System.out.println("1.Territories");
        System.out.println("2.Military");
        System.out.println("3.End Turn");
        System.out.println("0.Exit");
        System.out.print("\nChoice:");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            ob.Territories();
        }
        else if(choice==2)
        {
            ob.MilitarySetup();
        }
        else if(choice==3)
        {
            ob.EndTurn();
        }
        else if(choice==0)
        {
            System.exit(0);
        }
        else if(choice==9999)
        {
            Pgold=9999;
            Pfood=9999;
            Pwood=9999;
            Pinfantry=15;
            Pcavalry=20;
            Parchers=10;
            ob.Mainmenu();
        }
        else
        {
            ob.Mainmenu();
        }
    }

    void Territories()throws IOException
    { 
        System.out.print("\f");
        int choice;
        System.out.println("1.Rome"); 
        if(Iberia.equals("allied"))
        {
            System.out.println("2.Iberia");
        }
        if(Zama.equals("allied"))
        {
            System.out.println("3.Zama");
        }
        if(Thapsus.equals("allied"))
        {
            System.out.println("4.Thapsus");
        }
        System.out.println("0.Go back");
        System.out.print("\nChoice:");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            ob.RomeManageTerritories();
        }
        else if(choice==2)
        {
            ob.IberiaManageTerritories();
        }
        else if(choice==3)
        {
            ob.ZamaManageTerritories();
        }
        else if(choice==4)
        {
            ob.ThapsusManageTerritories();
        }
        else if(choice==0)
        {
            ob.Mainmenu();
        }
        else
        {
            ob.Territories();
        }
    }

    ////////////////////////////////////////////////////////
    ///////////////////////////////

    ///////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////ROME

    void RomeManageTerritories() throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("ROME");
        System.out.println("\n1.Recruit Villagers");
        System.out.println("2.Construction Management");        
        System.out.println("0. Go back");
        System.out.print("\nChoice:");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            ob.RrecruitVillagers();
        }
        else if(choice==2)
        {
            ob.RconstructionManagement();
        }        
        else if(choice==0)
        {
            ob.Territories();
        }
        else
        {
            ob.RomeManageTerritories();
        }
    }

    void RrecruitVillagers() throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("-------VILLAGER RECRUITMENT(ROME)------");
        System.out.println();
        System.out.println("\n------------ RESOURCES --------------");
        System.out.println("Gold="+Pgold);
        System.out.println("Food="+Pfood);
        System.out.println("Wood="+Pwood);
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Number of recruited villagers:"+Rvillagers);
        System.out.println("\n");
        System.out.println("1.Recruit Villager  (Food=100 , Gold=150)");
        if(RrecruitQueue>-1)
        {
            System.out.println("2.Remove 1 Villager from the Queue");
        }
        else 
        {
            System.out.println();
        }
        System.out.println("3. Manage Villagers.");
        System.out.println("0. Go back.");
        System.out.println("\nQueue :"+(RrecruitQueue+1));
        System.out.print("\nChoice: ");
        choice=Integer.parseInt(in.readLine());

        if(choice==1 && RrecruitQueue!=3 && Pfood>=100 && Pgold>=150)
        {
            RrecruitQueue+=1;
            Pfood-=100;
            Pgold-=150;
            ob.RrecruitVillagers();
        }
        else if(choice==2 && RrecruitQueue>-1)
        {
            RrecruitQueue-=1;
            Pfood+=100;
            Pgold+=150;
            ob.RrecruitVillagers();
        }
        else if(choice==3)
        {
            ob.RmanageVillagers();
        }
        else if(choice==0)
        {
            ob.RomeManageTerritories();
        }
        else
        {
            ob.RrecruitVillagers();
        }               

    }

    void RmanageVillagers() throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("-------VILLAGER MANAGEMENT(ROME)------");
        System.out.println();
        System.out.println("Number of idle villagers:"+Rvillagers);
        System.out.println("\n");

        System.out.println("Gold Miners = "+Rgoldminers);
        System.out.println("Lumberjacks = "+Rlumberjacks);
        System.out.println("Food Gatherers = "+Rfoodgatherers);
        System.out.println("\n");

        System.out.println("1. Deploy for gold mining.");
        System.out.println("2. Deploy as lumberjack.");
        System.out.println("3. Deploy for food gathering.");
        System.out.println("\n");
        System.out.println("4. Remove from gold mining.");
        System.out.println("5. Remove as lumberjack.");
        System.out.println("6. Remove from food gathering.");
        System.out.println("0. Go back.");
        System.out.print("Choice:");

        choice=Integer.parseInt(in.readLine());

        if(choice==1 && Rvillagers>0)
        {
            Rgoldminers+=1;
            Rvillagers-=1;
            ob.RmanageVillagers();
        }
        else if(choice==2 && Rvillagers>0)
        {
            Rlumberjacks+=1;
            Rvillagers-=1;
            ob.RmanageVillagers();
        }
        else if(choice==3 && Rvillagers>0)
        {
            Rfoodgatherers+=1;
            Rvillagers-=1;
            ob.RmanageVillagers();
        }
        else if(choice==4 && Rgoldminers>0)
        {
            Rgoldminers-=1;
            Rvillagers+=1;
            ob.RmanageVillagers();
        }
        else if(choice==5 && Rlumberjacks>0)
        {
            Rlumberjacks-=1;
            Rvillagers+=1;
            ob.RmanageVillagers();
        }
        else if(choice==6 && Rfoodgatherers>0)
        {
            Rfoodgatherers-=1;
            Rvillagers+=1;
            ob.RmanageVillagers();
        }
        else if(choice==0)
        {
            ob.RrecruitVillagers();
        }
        else
        {
            ob.RmanageVillagers();
        }
    }

    void RconstructionManagement()throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("-------CONSTRUCTION MANAGEMENT(ROME)------");
        System.out.println();
        System.out.println("\n------------ RESOURCES --------------");
        System.out.println("Gold="+Pgold);
        System.out.println("Food="+Pfood);
        System.out.println("Wood="+Pwood);
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("BUILD:");
        System.out.println("1. FORUM ( Food=300 , Gold=250 , Wood=150 )");
        System.out.println(" Increases carrying capacity of villagers by 30.");
        System.out.println();
        System.out.println("2. CAVALRY STABLES ( Food=400 , Gold=200 , Wood=200 )");
        System.out.println(" Allows you to recruit Roman Cavalry.");
        System.out.println();
        System.out.println("3. ARCHERY RANGE ( Food=200 , Gold=150 , Wood=300 )");
        System.out.println(" Allows you to recruit Roman Archers.");

        System.out.println("BUILT :");
        if(RforumTime==0)
        {
            System.out.println("FORUM");
        }
        if(RcavalryStablesTime==0)
        {
            System.out.println("CAVALRY STABLES");            
        }
        if(RarcheryRangeTime==0)
        {
            System.out.println("ARCHERY RANGE");
        }
        System.out.println("\n");
        System.out.println("0. Back");
        if(Rforum=="building")
        {
            System.out.println("\nQueue : FORUM");
            System.out.println("Time left :"+RforumTime);
        }
        else if(RcavalryStables=="building")
        {
            System.out.println("\nQueue :CAVALRY STABLES");
            System.out.println("Time left :"+RcavalryStablesTime);
        }
        else if(RarcheryRange=="building")
        {
            System.out.println("\nQueue : ARCHERY RANGE");
            System.out.println("Time left :"+RarcheryRangeTime);
        }
        else
        {
            System.out.println("\nQueue : null");
            System.out.println("Time left : 0");
        }

        System.out.print("Choice:");

        choice=Integer.parseInt(in.readLine());

        if(choice==1 && Pfood>=300 && Pgold>=250 && Pwood>=150 && Rforum=="false")
        {
            Rforum="building";
            Pfood-=300;
            Pgold-=250;
            Pwood-=150;
            ob.RconstructionManagement();
        }
        else if(choice==2 && Pfood>=400 && Pgold>=200 && Pwood>=200 && RcavalryStables=="false")
        {
            RcavalryStables="building";
            Pfood-=400;
            Pgold-=200;
            Pwood-=200;
            ob.RconstructionManagement();
        }
        else if(choice ==3 && Pfood>=200 && Pgold>=150 && Pwood>=300 && RarcheryRange=="false")
        {
            RarcheryRange="building";
            Pfood-=200;
            Pgold-=150;
            Pwood-=300;
            ob.RconstructionManagement();
        }
        else if(choice==0)
        {
            ob.RomeManageTerritories();
        }
        else
        {
            ob.RconstructionManagement();
        }
    }

    void Rrecruitment()throws IOException
    {
        System.out.print("\f");
        int choice;
        System.out.println("------------------ ROME MILITARY RECRUITMENT -------------");
        System.out.println();
        System.out.println("\n------------ RESOURCES --------------");
        System.out.println("Gold="+Pgold);
        System.out.println("Food="+Pfood);
        System.out.println("Wood="+Pwood);
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Recruit:");
        System.out.println("1. Roman Legionary ( Food=200 , Gold=200 , Wood=150 )");  
        if(RcavalryStables.equals("built"))
        {
            System.out.println("2. Roman Cavalry ( Food=300 , Gold=300 , Wood=50 )");
        }
        if(RarcheryRange.equals("built"))
        {
            System.out.println("3. Archers (Food=100 , Gold=150 , Wood=300)");
        }
        System.out.println("\n");
        System.out.print("Queue:");
        for(int i=0;i<4;i++)
        {
            System.out.print("[ "+RrecruitmentQueueUnits[i]+" ]");
        }
        System.out.println();
        System.out.println("Time = 1 turn");
        System.out.println("0. Back");
        System.out.println();
        System.out.print("CHOICE:");
        choice=Integer.parseInt(in.readLine());

        if(choice==1 && Pfood>=200 && Pgold>=200 && Pwood>=150 && RmilitaryRecruitmentQueue!=4)
        {
            RrecruitmentQueueUnits[RmilitaryRecruitmentQueue]="Roman Legionary";
            RmilitaryRecruitmentQueue+=1;
            Pfood-=200;
            Pgold-=200;
            Pwood-=150;
            ob.Rrecruitment();
        }
        else if(choice==2 && Pfood>=300 && Pgold>=300 && Pwood>=50 && RcavalryStables.equals("built")  && RmilitaryRecruitmentQueue!=4)
        {
            RrecruitmentQueueUnits[RmilitaryRecruitmentQueue]="Roman Cavalry";
            RmilitaryRecruitmentQueue+=1;
            Pfood-=300;
            Pgold-=300;
            Pwood-=50;
            ob.Rrecruitment();
        }
        else if(choice==3 && Pfood>=100 && Pgold>=150 && Pwood>=300 && RarcheryRange.equals("built") && RmilitaryRecruitmentQueue!=4)
        {
            RrecruitmentQueueUnits[RmilitaryRecruitmentQueue]="Archers";
            RmilitaryRecruitmentQueue+=1;
            Pfood-=100;
            Pgold-=150;
            Pwood-=300;
            ob.Rrecruitment();
        }        
        else if(choice==0)
        {
            ob.RecruitMenu();
        }
        else
        {
            ob.Rrecruitment();
        }

    }

    //////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////IBERIA

    void IberiaManageTerritories() throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("IBERIA");
        System.out.println("\n1.Recruit Villagers");
        System.out.println("2.Construction Management");        
        System.out.println("0. Go back");
        System.out.print("\nChoice:");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            ob.IrecruitVillagers();
        }
        else if(choice==2)
        {
            ob.IconstructionManagement();
        }        
        else if(choice==0)
        {
            ob.Territories();
        }
        else
        {
            ob.IberiaManageTerritories();
        }
    }

    void IrecruitVillagers() throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("-------VILLAGER RECRUITMENT(IBERIA)------");
        System.out.println();
        System.out.println("\n------------ RESOURCES --------------");
        System.out.println("Gold="+Pgold);
        System.out.println("Food="+Pfood);
        System.out.println("Wood="+Pwood);
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Number of recruited villagers:"+Ivillagers);
        System.out.println("\n");
        System.out.println("1.Recruit Villager  (Food=100 , Gold=150)");
        if(IrecruitQueue>-1)
        {
            System.out.println("2.Remove 1 Villager from the Queue");
        }
        else 
        {
            System.out.println();
        }
        System.out.println("3. Manage Villagers.");
        System.out.println("0. Go back.");
        System.out.println("\nQueue :"+(IrecruitQueue+1));
        System.out.print("\nChoice: ");
        choice=Integer.parseInt(in.readLine());

        if(choice==1 && IrecruitQueue!=3 && Pfood>=100 && Pgold>=150)
        {
            IrecruitQueue+=1;
            Pfood-=100;
            Pgold-=150;
            ob.IrecruitVillagers();
        }
        else if(choice==2 && IrecruitQueue>-1)
        {
            IrecruitQueue-=1;
            Pfood+=100;
            Pgold+=150;
            ob.IrecruitVillagers();
        }
        else if(choice==3)
        {
            ob.ImanageVillagers();
        }
        else if(choice==0)
        {
            ob.IberiaManageTerritories();
        }
        else
        {
            ob.IrecruitVillagers();
        }               

    }

    void ImanageVillagers() throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("-------VILLAGER MANAGEMENT(IBERIA)------");
        System.out.println();
        System.out.println("Number of idle villagers:"+Ivillagers);
        System.out.println("\n");

        System.out.println("Gold Miners = "+Igoldminers);
        System.out.println("Lumberjacks = "+Ilumberjacks);
        System.out.println("Food Gatherers = "+Ifoodgatherers);
        System.out.println("\n");

        System.out.println("1. Deploy for gold mining.");
        System.out.println("2. Deploy as lumberjack.");
        System.out.println("3. Deploy for food gathering.");
        System.out.println("\n");
        System.out.println("4. Remove from gold mining.");
        System.out.println("5. Remove as lumberjack.");
        System.out.println("6. Remove from food gathering.");
        System.out.println("0. Go back.");
        System.out.print("Choice:");

        choice=Integer.parseInt(in.readLine());

        if(choice==1 && Ivillagers>0)
        {
            Igoldminers+=1;
            Ivillagers-=1;
            ob.ImanageVillagers();
        }
        else if(choice==2 && Ivillagers>0)
        {
            Ilumberjacks+=1;
            Ivillagers-=1;
            ob.ImanageVillagers();
        }
        else if(choice==3 && Ivillagers>0)
        {
            Ifoodgatherers+=1;
            Ivillagers-=1;
            ob.ImanageVillagers();
        }
        else if(choice==4 && Igoldminers>0)
        {
            Igoldminers-=1;
            Ivillagers+=1;
            ob.ImanageVillagers();
        }
        else if(choice==5 && Ilumberjacks>0)
        {
            Ilumberjacks-=1;
            Ivillagers+=1;
            ob.ImanageVillagers();
        }
        else if(choice==6 && Ifoodgatherers>0)
        {
            Ifoodgatherers-=1;
            Ivillagers+=1;
            ob.ImanageVillagers();
        }
        else if(choice==0)
        {
            ob.IrecruitVillagers();
        }
        else
        {
            ob.ImanageVillagers();
        }
    }

    void IconstructionManagement()throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("-------CONSTRUCTION MANAGEMENT(IBERIA)------");
        System.out.println();
        System.out.println("\n------------ RESOURCES --------------");
        System.out.println("Gold="+Pgold);
        System.out.println("Food="+Pfood);
        System.out.println("Wood="+Pwood);
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("BUILD:");
        System.out.println("1. FORUM ( Food=300 , Gold=250 , Wood=150 )");
        System.out.println(" Increases carrying capacity of villagers by 30.");
        System.out.println();
        System.out.println("2. CAVALRY STABLES ( Food=400 , Gold=200 , Wood=200 )");
        System.out.println(" Allows you to recruit Roman Cavalry.");
        System.out.println();
        System.out.println("3. ARCHERY RANGE ( Food=200 , Gold=150 , Wood=300 )");
        System.out.println(" Allows you to recruit Roman Archers.");

        System.out.println("BUILT :");
        if(IforumTime==0)
        {
            System.out.println("FORUM");
        }
        if(IcavalryStablesTime==0)
        {
            System.out.println("CAVALRY STABLES");            
        }
        if(IarcheryRangeTime==0)
        {
            System.out.println("ARCHERY RANGE");
        }
        System.out.println("\n");
        System.out.println("0. Back");
        if(Iforum=="building")
        {
            System.out.println("\nQueue : FORUM");
            System.out.println("Time left :"+IforumTime);
        }
        else if(IcavalryStables=="building")
        {
            System.out.println("\nQueue : CAVALRY STABLES");
            System.out.println("Time left :"+IcavalryStablesTime);
        }
        else if(IarcheryRange=="building")
        {
            System.out.println("\nQueue : ARCHERY RANGE");
            System.out.println("Time left :"+IarcheryRangeTime);
        }
        else
        {
            System.out.println("\nQueue : null");
            System.out.println("Time left : 0");
        }

        System.out.print("Choice:");

        choice=Integer.parseInt(in.readLine());

        if(choice==1 && Pfood>=300 && Pgold>=250 && Pwood>=150 && Iforum=="false")
        {
            Iforum="building";
            Pfood-=300;
            Pgold-=250;
            Pwood-=150;
            ob.IconstructionManagement();
        }
        else if(choice==2 && Pfood>=400 && Pgold>=200 && Pwood>=200 && IcavalryStables=="false")
        {
            IcavalryStables="building";
            Pfood-=400;
            Pgold-=200;
            Pwood-=200;
            ob.IconstructionManagement();
        }
        else if(choice ==3 && Pfood>=200 && Pgold>=150 && Pwood>=300 && IarcheryRange=="false")
        {
            IarcheryRange="building";
            Pfood-=200;
            Pgold-=150;
            Pwood-=300;
            ob.IconstructionManagement();
        }
        else if(choice==0)
        {
            ob.IberiaManageTerritories();
        }
        else
        {
            ob.IconstructionManagement();
        }
    }

    void Irecruitment()throws IOException
    {
        System.out.print("\f");
        int choice;
        System.out.println("------------------ IBERIA MILITARY RECRUITMENT -------------");
        System.out.println();
        System.out.println("\n------------ RESOURCES --------------");
        System.out.println("Gold="+Pgold);
        System.out.println("Food="+Pfood);
        System.out.println("Wood="+Pwood);
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Recruit:");
        System.out.println("1. Roman Legionary ( Food=200 , Gold=200 , Wood=150 )");  
        if(IcavalryStables.equals("built"))
        {
            System.out.println("2. Roman Cavalry ( Food=300 , Gold=300 , Wood=50 )");
        }
        if(IarcheryRange.equals("built"))
        {
            System.out.println("3. Archers (Food=100 , Gold=150 , Wood=300)");
        }
        System.out.println("\n");
        System.out.print("Queue:");
        for(int i=0;i<4;i++)
        {
            System.out.print("[ "+IrecruitmentQueueUnits[i]+" ]");
        }
        System.out.println();
        System.out.println("Time = 1 turn");
        System.out.println("0. Back");
        System.out.println();
        System.out.print("CHOICE:");
        choice=Integer.parseInt(in.readLine());

        if(choice==1 && Pfood>=200 && Pgold>=200 && Pwood>=150 && ImilitaryRecruitmentQueue!=4)
        {
            IrecruitmentQueueUnits[ImilitaryRecruitmentQueue]="Roman Legionary";
            ImilitaryRecruitmentQueue+=1;
            Pfood-=200;
            Pgold-=200;
            Pwood-=150;
            ob.Irecruitment();
        }
        else if(choice==2 && Pfood>=300 && Pgold>=300 && Pwood>=50 && IcavalryStables.equals("built")  && ImilitaryRecruitmentQueue!=4)
        {
            IrecruitmentQueueUnits[ImilitaryRecruitmentQueue]="Roman Cavalry";
            ImilitaryRecruitmentQueue+=1;
            Pfood-=300;
            Pgold-=300;
            Pwood-=50;
            ob.Irecruitment();
        }
        else if(choice==3 && Pfood>=100 && Pgold>=150 && Pwood>=300 && IarcheryRange.equals("built") && ImilitaryRecruitmentQueue!=4)
        {
            IrecruitmentQueueUnits[ImilitaryRecruitmentQueue]="Archers";
            ImilitaryRecruitmentQueue+=1;
            Pfood-=100;
            Pgold-=150;
            Pwood-=300;
            ob.Irecruitment();
        }        
        else if(choice==0)
        {
            ob.RecruitMenu();
        }
        else
        {
            ob.Irecruitment();
        }

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////
    /////////ZAMA

    void ZamaManageTerritories() throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("ZAMA");
        System.out.println("\n1.Recruit Villagers");
        System.out.println("2.Construction Management");        
        System.out.println("0. Go back");
        System.out.print("\nChoice:");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            ob.ZrecruitVillagers();
        }
        else if(choice==2)
        {
            ob.ZconstructionManagement();
        }        
        else if(choice==0)
        {
            ob.Territories();
        }
        else
        {
            ob.ZamaManageTerritories();
        }
    }

    void ZrecruitVillagers() throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("-------VILLAGER RECRUITMENT(ZAMA)------");
        System.out.println();
        System.out.println("\n------------ RESOURCES --------------");
        System.out.println("Gold="+Pgold);
        System.out.println("Food="+Pfood);
        System.out.println("Wood="+Pwood);
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Number of recruited villagers:"+Zvillagers);
        System.out.println("\n");
        System.out.println("1.Recruit Villager  (Food=100 , Gold=150)");
        if(ZrecruitQueue>-1)
        {
            System.out.println("2.Remove 1 Villager from the Queue");
        }
        else 
        {
            System.out.println();
        }
        System.out.println("3. Manage Villagers.");
        System.out.println("0. Go back.");
        System.out.println("\nQueue :"+(ZrecruitQueue+1));
        System.out.print("\nChoice: ");
        choice=Integer.parseInt(in.readLine());

        if(choice==1 && ZrecruitQueue!=3 && Pfood>=100 && Pgold>=150)
        {
            ZrecruitQueue+=1;
            Pfood-=100;
            Pgold-=150;
            ob.ZrecruitVillagers();
        }
        else if(choice==2 && ZrecruitQueue>-1)
        {
            ZrecruitQueue-=1;
            Pfood+=100;
            Pgold+=150;
            ob.ZrecruitVillagers();
        }
        else if(choice==3)
        {
            ob.ZmanageVillagers();
        }
        else if(choice==0)
        {
            ob.ZamaManageTerritories();
        }
        else
        {
            ob.ZrecruitVillagers();
        }               

    }

    void ZmanageVillagers() throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("-------VILLAGER MANAGEMENT(ZAMA)------");
        System.out.println();
        System.out.println("Number of idle villagers:"+Zvillagers);
        System.out.println("\n");

        System.out.println("Gold Miners = "+Zgoldminers);
        System.out.println("Lumberjacks = "+Zlumberjacks);
        System.out.println("Food Gatherers = "+Zfoodgatherers);
        System.out.println("\n");

        System.out.println("1. Deploy for gold mining.");
        System.out.println("2. Deploy as lumberjack.");
        System.out.println("3. Deploy for food gathering.");
        System.out.println("\n");
        System.out.println("4. Remove from gold mining.");
        System.out.println("5. Remove as lumberjack.");
        System.out.println("6. Remove from food gathering.");
        System.out.println("0. Go back.");
        System.out.print("Choice:");

        choice=Integer.parseInt(in.readLine());

        if(choice==1 && Zvillagers>0)
        {
            Zgoldminers+=1;
            Zvillagers-=1;
            ob.ZmanageVillagers();
        }
        else if(choice==2 && Zvillagers>0)
        {
            Zlumberjacks+=1;
            Zvillagers-=1;
            ob.ZmanageVillagers();
        }
        else if(choice==3 && Zvillagers>0)
        {
            Zfoodgatherers+=1;
            Zvillagers-=1;
            ob.ZmanageVillagers();
        }
        else if(choice==4 && Zgoldminers>0)
        {
            Zgoldminers-=1;
            Zvillagers+=1;
            ob.ZmanageVillagers();
        }
        else if(choice==5 && Zlumberjacks>0)
        {
            Zlumberjacks-=1;
            Zvillagers+=1;
            ob.ZmanageVillagers();
        }
        else if(choice==6 && Zfoodgatherers>0)
        {
            Zfoodgatherers-=1;
            Zvillagers+=1;
            ob.ZmanageVillagers();
        }
        else if(choice==0)
        {
            ob.ZrecruitVillagers();
        }
        else
        {
            ob.ZmanageVillagers();
        }
    }

    void ZconstructionManagement()throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("-------CONSTRUCTION MANAGEMENT(ZAMA)------");
        System.out.println();
        System.out.println("\n------------ RESOURCES --------------");
        System.out.println("Gold="+Pgold);
        System.out.println("Food="+Pfood);
        System.out.println("Wood="+Pwood);
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("BUILD:");
        System.out.println("1. FORUM ( Food=300 , Gold=250 , Wood=150 )");
        System.out.println(" Increases carrying capacity of villagers by 30.");
        System.out.println();
        System.out.println("2. CAVALRY STABLES ( Food=400 , Gold=200 , Wood=200 )");
        System.out.println(" Allows you to recruit Roman Cavalry.");
        System.out.println();
        System.out.println("3. ARCHERY RANGE ( Food=200 , Gold=150 , Wood=300 )");
        System.out.println(" Allows you to recruit Roman Archers.");

        System.out.println("BUILT :");
        if(ZforumTime==0)
        {
            System.out.println("FORUM");
        }
        if(ZcavalryStablesTime==0)
        {
            System.out.println("CAVALRY STABLES");            
        }
        if(ZarcheryRangeTime==0)
        {
            System.out.println("ARCHERY RANGE");
        }
        System.out.println("\n");
        System.out.println("0. Back");
        if(Zforum=="building")
        {
            System.out.println("\nQueue : FORUM");
            System.out.println("Time left :"+ZforumTime);
        }
        else if(ZcavalryStables=="building")
        {
            System.out.println("\nQueue : CAVALRY STABLES");
            System.out.println("Time left :"+ZcavalryStablesTime);
        }
        else if(ZarcheryRange=="building")
        {
            System.out.println("\nQueue : ARCHERY RANGE");
            System.out.println("Time left :"+ZarcheryRangeTime);
        }
        else
        {
            System.out.println("\nQueue : null");
            System.out.println("Time left : 0");
        }

        System.out.print("Choice:");

        choice=Integer.parseInt(in.readLine());

        if(choice==1 && Pfood>=300 && Pgold>=250 && Pwood>=150 && Zforum=="false")
        {
            Zforum="building";
            Pfood-=300;
            Pgold-=250;
            Pwood-=150;
            ob.ZconstructionManagement();
        }
        else if(choice==2 && Pfood>=400 && Pgold>=200 && Pwood>=200 && ZcavalryStables=="false")
        {
            ZcavalryStables="building";
            Pfood-=400;
            Pgold-=200;
            Pwood-=200;
            ob.ZconstructionManagement();
        }
        else if(choice ==3 && Pfood>=200 && Pgold>=150 && Pwood>=300 && ZarcheryRange=="false")
        {
            ZarcheryRange="building";
            Pfood-=200;
            Pgold-=150;
            Pwood-=300;
            ob.ZconstructionManagement();
        }
        else if(choice==0)
        {
            ob.ZamaManageTerritories();
        }
        else
        {
            ob.ZconstructionManagement();
        }
    }

    void Zrecruitment()throws IOException
    {
        System.out.print("\f");
        int choice;
        System.out.println("------------------ ZAMA MILITARY RECRUITMENT -------------");
        System.out.println();
        System.out.println("\n------------ RESOURCES --------------");
        System.out.println("Gold="+Pgold);
        System.out.println("Food="+Pfood);
        System.out.println("Wood="+Pwood);
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Recruit:");
        System.out.println("1. Roman Legionary ( Food=200 , Gold=200 , Wood=150 )");  
        if(ZcavalryStables.equals("built"))
        {
            System.out.println("2. Roman Cavalry ( Food=300 , Gold=300 , Wood=50 )");
        }
        if(ZarcheryRange.equals("built"))
        {
            System.out.println("3. Archers (Food=100 , Gold=150 , Wood=300)");
        }
        System.out.println("\n");
        System.out.print("Queue:");
        for(int i=0;i<4;i++)
        {
            System.out.print("[ "+ZrecruitmentQueueUnits[i]+" ]");
        }
        System.out.println();
        System.out.println("Time = 1 turn");
        System.out.println("0. Back");
        System.out.println();
        System.out.print("CHOICE:");
        choice=Integer.parseInt(in.readLine());

        if(choice==1 && Pfood>=200 && Pgold>=200 && Pwood>=150 && ZmilitaryRecruitmentQueue!=4)
        {
            ZrecruitmentQueueUnits[ZmilitaryRecruitmentQueue]="Roman Legionary";
            ZmilitaryRecruitmentQueue+=1;
            Pfood-=200;
            Pgold-=200;
            Pwood-=150;
            ob.Zrecruitment();
        }
        else if(choice==2 && Pfood>=300 && Pgold>=300 && Pwood>=50 && ZcavalryStables.equals("built")  && ZmilitaryRecruitmentQueue!=4)
        {
            ZrecruitmentQueueUnits[ZmilitaryRecruitmentQueue]="Roman Cavalry";
            ZmilitaryRecruitmentQueue+=1;
            Pfood-=300;
            Pgold-=300;
            Pwood-=50;
            ob.Zrecruitment();
        }
        else if(choice==3 && Pfood>=100 && Pgold>=150 && Pwood>=300 && ZarcheryRange.equals("built") && ZmilitaryRecruitmentQueue!=4)
        {
            ZrecruitmentQueueUnits[ZmilitaryRecruitmentQueue]="Archers";
            ZmilitaryRecruitmentQueue+=1;
            Pfood-=100;
            Pgold-=150;
            Pwood-=300;
            ob.Zrecruitment();
        }        
        else if(choice==0)
        {
            ob.RecruitMenu();
        }
        else
        {
            ob.Zrecruitment();
        }

    }

    ///////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////THAPSUS

    void ThapsusManageTerritories() throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("THAPSUS");
        System.out.println("\n1.Recruit Villagers");
        System.out.println("2.Construction Management");        
        System.out.println("0. Go back");
        System.out.print("\nChoice:");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            ob.TrecruitVillagers();
        }
        else if(choice==2)
        {
            ob.TconstructionManagement();
        }        
        else if(choice==0)
        {
            ob.Territories();
        }
        else
        {
            ob.ThapsusManageTerritories();
        }
    }

    void TrecruitVillagers() throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("-------VILLAGER RECRUITMENT(THAPSUS)------");
        System.out.println();
        System.out.println("\n------------ RESOURCES --------------");
        System.out.println("Gold="+Pgold);
        System.out.println("Food="+Pfood);
        System.out.println("Wood="+Pwood);
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Number of recruited villagers:"+Tvillagers);
        System.out.println("\n");
        System.out.println("1.Recruit Villager  (Food=100 , Gold=150)");
        if(TrecruitQueue>-1)
        {
            System.out.println("2.Remove 1 Villager from the Queue");
        }
        else 
        {
            System.out.println();
        }
        System.out.println("3. Manage Villagers.");
        System.out.println("0. Go back.");
        System.out.println("\nQueue :"+(TrecruitQueue+1));
        System.out.print("\nChoice: ");
        choice=Integer.parseInt(in.readLine());

        if(choice==1 && TrecruitQueue!=3 && Pfood>=100 && Pgold>=150)
        {
            TrecruitQueue+=1;
            Pfood-=100;
            Pgold-=150;
            ob.TrecruitVillagers();
        }
        else if(choice==2 && TrecruitQueue>-1)
        {
            TrecruitQueue-=1;
            Pfood+=100;
            Pgold+=150;
            ob.TrecruitVillagers();
        }
        else if(choice==3)
        {
            ob.TmanageVillagers();
        }
        else if(choice==0)
        {
            ob.ThapsusManageTerritories();
        }
        else
        {
            ob.TrecruitVillagers();
        }               

    }

    void TmanageVillagers() throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("-------VILLAGER MANAGEMENT(THAPSUS)------");
        System.out.println();
        System.out.println("Number of idle villagers:"+Ivillagers);
        System.out.println("\n");

        System.out.println("Gold Miners = "+Tgoldminers);
        System.out.println("Lumberjacks = "+Tlumberjacks);
        System.out.println("Food Gatherers = "+Tfoodgatherers);
        System.out.println("\n");

        System.out.println("1. Deploy for gold mining.");
        System.out.println("2. Deploy as lumberjack.");
        System.out.println("3. Deploy for food gathering.");
        System.out.println("\n");
        System.out.println("4. Remove from gold mining.");
        System.out.println("5. Remove as lumberjack.");
        System.out.println("6. Remove from food gathering.");
        System.out.println("0. Go back.");
        System.out.print("Choice:");

        choice=Integer.parseInt(in.readLine());

        if(choice==1 && Tvillagers>0)
        {
            Tgoldminers+=1;
            Tvillagers-=1;
            ob.TmanageVillagers();
        }
        else if(choice==2 && Tvillagers>0)
        {
            Tlumberjacks+=1;
            Tvillagers-=1;
            ob.TmanageVillagers();
        }
        else if(choice==3 && Tvillagers>0)
        {
            Tfoodgatherers+=1;
            Tvillagers-=1;
            ob.TmanageVillagers();
        }
        else if(choice==4 && Tgoldminers>0)
        {
            Tgoldminers-=1;
            Tvillagers+=1;
            ob.TmanageVillagers();
        }
        else if(choice==5 && Tlumberjacks>0)
        {
            Tlumberjacks-=1;
            Tvillagers+=1;
            ob.TmanageVillagers();
        }
        else if(choice==6 && Tfoodgatherers>0)
        {
            Tfoodgatherers-=1;
            Tvillagers+=1;
            ob.TmanageVillagers();
        }
        else if(choice==0)
        {
            ob.TrecruitVillagers();
        }
        else
        {
            ob.TmanageVillagers();
        }
    }

    void TconstructionManagement()throws IOException
    {
        int choice;

        System.out.print("\f");
        System.out.println("-------CONSTRUCTION MANAGEMENT(THAPSUS)------");
        System.out.println();
        System.out.println("\n------------ RESOURCES --------------");
        System.out.println("Gold="+Pgold);
        System.out.println("Food="+Pfood);
        System.out.println("Wood="+Pwood);
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("BUILD:");
        System.out.println("1. FORUM ( Food=300 , Gold=250 , Wood=150 )");
        System.out.println(" Increases carrying capacity of villagers by 30.");
        System.out.println();
        System.out.println("2. CAVALRY STABLES ( Food=400 , Gold=200 , Wood=200 )");
        System.out.println(" Allows you to recruit Roman Cavalry.");
        System.out.println();
        System.out.println("3. ARCHERY RANGE ( Food=200 , Gold=150 , Wood=300 )");
        System.out.println(" Allows you to recruit Roman Archers.");

        System.out.println("BUILT :");
        if(TforumTime==0)
        {
            System.out.println("FORUM");
        }
        if(TcavalryStablesTime==0)
        {
            System.out.println("CAVALRY STABLES");            
        }
        if(TarcheryRangeTime==0)
        {
            System.out.println("ARCHERY RANGE");
        }
        System.out.println("\n");
        System.out.println("0. Back");
        if(Tforum=="building")
        {
            System.out.println("\nQueue : FORUM");
            System.out.println("Time left :"+TforumTime);
        }
        else if(TcavalryStables=="building")
        {
            System.out.println("\nQueue : CAVALRY STABLES");
            System.out.println("Time left :"+TcavalryStablesTime);
        }
        else if(TarcheryRange=="building")
        {
            System.out.println("\nQueue : ARCHERY RANGE");
            System.out.println("Time left :"+TarcheryRangeTime);
        }
        else
        {
            System.out.println("\nQueue : null");
            System.out.println("Time left : 0");
        }

        System.out.print("Choice:");

        choice=Integer.parseInt(in.readLine());

        if(choice==1 && Pfood>=300 && Pgold>=250 && Pwood>=150 && Tforum=="false")
        {
            Tforum="building";
            Pfood-=300;
            Pgold-=250;
            Pwood-=150;
            ob.TconstructionManagement();
        }
        else if(choice==2 && Pfood>=400 && Pgold>=200 && Pwood>=200 && TcavalryStables=="false")
        {
            TcavalryStables="building";
            Pfood-=400;
            Pgold-=200;
            Pwood-=200;
            ob.TconstructionManagement();
        }
        else if(choice ==3 && Pfood>=200 && Pgold>=150 && Pwood>=300 && TarcheryRange=="false")
        {
            TarcheryRange="building";
            Pfood-=200;
            Pgold-=150;
            Pwood-=300;
            ob.TconstructionManagement();
        }
        else if(choice==0)
        {
            ob.ThapsusManageTerritories();
        }
        else
        {
            ob.TconstructionManagement();
        }
    }

    void Trecruitment()throws IOException
    {
        System.out.print("\f");
        int choice;
        System.out.println("------------------ THAPSUS MILITARY RECRUITMENT -------------");
        System.out.println();
        System.out.println("\n------------ RESOURCES --------------");
        System.out.println("Gold="+Pgold);
        System.out.println("Food="+Pfood);
        System.out.println("Wood="+Pwood);
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Recruit:");
        System.out.println("1. Roman Legionary ( Food=200 , Gold=200 , Wood=150 )");  
        if(IcavalryStables.equals("built"))
        {
            System.out.println("2. Roman Cavalry ( Food=300 , Gold=300 , Wood=50 )");
        }
        if(IarcheryRange.equals("built"))
        {
            System.out.println("3. Archers (Food=100 , Gold=150 , Wood=300)");
        }
        System.out.println("\n");
        System.out.print("Queue:");
        for(int i=0;i<4;i++)
        {
            System.out.print("[ "+TrecruitmentQueueUnits[i]+" ]");
        }
        System.out.println();
        System.out.println("Time = 1 turn");
        System.out.println("0. Back");
        System.out.println();
        System.out.print("CHOICE:");
        choice=Integer.parseInt(in.readLine());

        if(choice==1 && Pfood>=200 && Pgold>=200 && Pwood>=150 && TmilitaryRecruitmentQueue!=4)
        {
            TrecruitmentQueueUnits[TmilitaryRecruitmentQueue]="Roman Legionary";
            TmilitaryRecruitmentQueue+=1;
            Pfood-=200;
            Pgold-=200;
            Pwood-=150;
            ob.Trecruitment();
        }
        else if(choice==2 && Pfood>=300 && Pgold>=300 && Pwood>=50 && TcavalryStables.equals("built")  && TmilitaryRecruitmentQueue!=4)
        {
            TrecruitmentQueueUnits[TmilitaryRecruitmentQueue]="Roman Cavalry";
            TmilitaryRecruitmentQueue+=1;
            Pfood-=300;
            Pgold-=300;
            Pwood-=50;
            ob.Trecruitment();
        }
        else if(choice==3 && Pfood>=100 && Pgold>=150 && Pwood>=300 && TarcheryRange.equals("built") && TmilitaryRecruitmentQueue!=4)
        {
            TrecruitmentQueueUnits[TmilitaryRecruitmentQueue]="Archers";
            TmilitaryRecruitmentQueue+=1;
            Pfood-=100;
            Pgold-=150;
            Pwood-=300;
            ob.Trecruitment();
        }        
        else if(choice==0)
        {
            ob.RecruitMenu();
        }
        else
        {
            ob.Trecruitment();
        }

    }

    /////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////

    void MilitarySetup()throws IOException
    {
        System.out.print("\f");
        int choice;
        System.out.println("------------------ M I L I T A R Y    S E T U P ------------------");
        System.out.println("\n");
        System.out.println("1. Recruit");
        System.out.println("2. Attack");
        System.out.println("3. Army Status");
        System.out.println("0. Back");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            ob.RecruitMenu();
        }
        else if(choice==2)
        {
            ob.PlayerAttack();
        }
        else if(choice==3)
        {
            ob.ArmyStatus();
        }
        else if(choice==0)
        {
            ob.Mainmenu();
        }
        else
        {
            ob.MilitarySetup();
        }

    }

    void RecruitMenu() throws IOException
    {
        System.out.print("\f");
        int choice;
        System.out.println("------------------ R E C R U I T   M E N U------------------");
        System.out.println("\n");
        System.out.println("1. Rome");

        if(Iberia.equals("allied"))
        {
            System.out.println("2.Iberia");
        }
        if(Zama.equals("allied"))
        {
            System.out.println("3.Zama");
        }
        if(Thapsus.equals("allied"))
        {
            System.out.println("4.Thapsus");
        }
        System.out.println("0. Back");
        System.out.print("CHOICE:");
        choice=Integer.parseInt(in.readLine());
        if(choice==1)
        {
            ob.Rrecruitment();
        }
        else if(Zama.equals("allied") && choice==3)
        {
            ob.Zrecruitment();
        }
        else if(Iberia.equals("allied") && choice==2)
        {
            ob.Irecruitment();
        }
        else if(Thapsus.equals("allied") && choice==4)
        {
            ob.Trecruitment();
        }
        else if(choice==0)
        {
            ob.MilitarySetup();
        }
        else
        {
            ob.RecruitMenu();            
        }
    }    

    void PlayerAttack() throws IOException
    {
        System.out.print("\f");
        int choice;
        System.out.println("-------------- BATTLE DEPLOYMENT-------------------");
        System.out.println("Select the enemy city that can be attacked:");
        if(Iberia.equals("enemy"))
        {
            System.out.println("1.IBERIA");
        }
        else if(Zama.equals("enemy"))
        {
            System.out.println("2.ZAMA");
        }
        else if(Thapsus.equals("enemy"))
        {
            System.out.println("3.THAPSUS");
        }
        else
        {
            System.out.println("4.CARTHAGE");
        }      
        System.out.println("0.Back");
        System.out.println("If you are not able to attack your enemy even though you enter the correct choice, it might mean that \nyour Battle Front troops have not been allocated");
        System.out.print("\nEnter choice:");
        choice=Integer.parseInt(in.readLine());
        if(choice==1 && Iberia.equals("enemy") && (Pinfantry>0 || Pcavalry>0 || Parchers>0))
        {
            ob.AttackIberia();
        }
        else if(choice==2 && Zama.equals("enemy") && (Pinfantry>0 || Pcavalry>0 || Parchers>0))
        {
            ob.AttackZama();
        }
        else if(choice==3 && Thapsus.equals("enemy") && (Pinfantry>0 || Pcavalry>0 || Parchers>0))
        {
            ob.AttackThapsus();
        }
        else if(choice==4 && Carthage.equals("enemy") && (Pinfantry>0 || Pcavalry>0 || Parchers>0))
        {
            ob.AttackCarthage();
        }
        else if(choice==0)
        {
            ob.MilitarySetup();
        }
        else
        {
            ob.PlayerAttack();
        }

    }

    void AttackIberia()throws IOException
    {
        System.out.print("\f");
        int choice;        
        System.out.println("-------------- IBERIAN SIEGE (Year:"+Year+")-------------------");
        System.out.println("Your troops (under General Publius Cornelius Scipio):");
        System.out.println("1.Roman Legionaries = "+Pinfantry);
        System.out.println("2.Roman Cavalry = "+Pcavalry);
        System.out.println("3.Archers = "+Parchers);
        System.out.println();
        System.out.println("Enemy troops (under General Kartlos):");
        System.out.println("1.Iberian Infantry = "+IberianInfantry);
        System.out.println("2.Iberian Cavalry = "+IberianCavalry);
        System.out.println("3.Spanish Barbarian Archers = "+BarbarianArchers);

        System.out.println("Do you wish to continue siege? Press 1 for yes.\nTo break siege, press 2");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            System.out.println("\nThe Battle proceeds....");            
            int php=Pinfantry*50+Pcavalry*60+Parchers*30;
            int ehp=IberianInfantry*30+IberianCavalry*70+BarbarianArchers*40;

            if(php>ehp)
            {
                System.out.println("The Battle is WON!!!");

                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Kartlos         : Iberian Infantry="+IberianInfantry+"  ;Iberian Cavalry="+IberianCavalry+"  ;Archers="+BarbarianArchers);

                if(Pinfantry>IberianInfantry)
                {
                    Pinfantry-=IberianInfantry;
                    IberianInfantry=0;
                }
                else
                {
                    Pinfantry=0;
                    IberianInfantry=0;
                }

                if(Pcavalry>IberianCavalry)
                {
                    Pcavalry-=IberianCavalry;
                    IberianCavalry=0;
                }
                else
                {
                    Pcavalry=0;
                    IberianCavalry=0;
                }

                if(Parchers>BarbarianArchers)
                {
                    Parchers-=BarbarianArchers;
                    BarbarianArchers=0;
                }
                else
                {
                    Parchers=0;
                    BarbarianArchers=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Kartlos         : Iberian Infantry="+IberianInfantry+"  ;Iberian Cavalry="+IberianCavalry+"  ;Archers="+BarbarianArchers);
                System.out.println("Iberia is Captured!!");
                Iberia="allied";
                //RromanLegionary=Pinfantry;
                //RromanCavalry=Pcavalry;
                //Rarchers=Parchers;
                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.PlayerAttack();
            }
            else
            {
                System.out.println("The battle is lost!! Our troops are routed! Our Army has been vanquished!");
                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Kartlos         : Iberian Infantry="+IberianInfantry+"  ;Iberian Cavalry="+IberianCavalry+"  ;Archers="+BarbarianArchers);

                if(IberianInfantry>Pinfantry)
                {
                    IberianInfantry-=Pinfantry;
                    Pinfantry=0;
                }
                else
                {
                    Pinfantry=0;
                    IberianInfantry=0;
                }

                if(IberianCavalry>Pcavalry)
                {
                    IberianCavalry-=Pcavalry;
                    Pcavalry=0;
                }
                else
                {
                    Pcavalry=0;
                    IberianCavalry=0;
                }

                if(BarbarianArchers>Parchers)
                {
                    BarbarianArchers-=Parchers;
                    Parchers=0;
                }
                else
                {
                    Parchers=0;
                    BarbarianArchers=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Kartlos         : Iberian Infantry="+IberianInfantry+"  ;Iberian Cavalry="+IberianCavalry+"  ;Archers="+BarbarianArchers);

                //RromanLegionary=Pinfantry;
                //RromanCavalry=Pcavalry;
                //Rarchers=Parchers;
                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.PlayerAttack();
            }
        }
        else if(choice==2)
        {
            if(Pinfantry>0)
            {
                Pinfantry-=1;
            }
            if(Pcavalry>0)
            {
                Pcavalry-=1;
            }
            if(Parchers>0)
            {
                Parchers-=1;
            }
            System.out.println("\nThe siege has been broken! A few of our troops have been killed by the chasing enemies!");
            System.out.println("------------------------RESULTS-------------------------------");
            System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
            System.out.println("  General Kartlos         : Iberian Infantry="+IberianInfantry+"  ;Iberian Cavalry="+IberianCavalry+"  ;Archers="+BarbarianArchers);
            System.out.println("\nPress 1 to continue");
            int choice1=Integer.parseInt(in.readLine());
            if(choice1==1)
                ob.PlayerAttack();
        }
        else
        {
            ob.AttackIberia();
        }
    }

    void AttackZama()throws IOException
    {
        System.out.print("\f");
        int choice;        
        System.out.println("-------------- SIEGE OF ZAMA (Year:"+Year+")-------------------");
        System.out.println("Your troops (under General Publius Cornelius Scipio):");
        System.out.println("1.Roman Legionaries = "+Pinfantry);
        System.out.println("2.Roman Cavalry = "+Pcavalry);
        System.out.println("3.Archers = "+Parchers);
        System.out.println();
        System.out.println("Enemy troops (under General Xanthippus):");
        System.out.println("1.Desert Infantry = "+DesertInfantry);
        System.out.println("2.Numidian Cavalry = "+NumidianCavalry);
        System.out.println("3.Libyan Peltasts = "+LibyanPeltasts);

        System.out.println("Do you wish to continue siege? Press 1 for yes.\nTo break siege, press 2");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            System.out.println("\nThe Battle proceeds....");            
            int php=Pinfantry*50+Pcavalry*60+Parchers*30;
            int ehp=DesertInfantry*20+NumidianCavalry*90+LibyanPeltasts*50;

            if(php>ehp)
            {
                System.out.println("The Battle is WON!!!");

                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Xanthippus      : Desert Infantry="+DesertInfantry+"  ;Numidian Cavalry="+NumidianCavalry+"  ;Libyan Peltasts="+LibyanPeltasts);

                if(Pinfantry>DesertInfantry)
                {
                    Pinfantry-=DesertInfantry;
                    DesertInfantry=0;
                }
                else
                {
                    Pinfantry=0;
                    DesertInfantry=0;
                }

                if(Pcavalry>NumidianCavalry)
                {
                    Pcavalry-=NumidianCavalry;
                    NumidianCavalry=0;
                }
                else
                {
                    Pcavalry=0;
                    NumidianCavalry=0;
                }

                if(Parchers>LibyanPeltasts)
                {
                    Parchers-=LibyanPeltasts;
                    LibyanPeltasts=0;
                }
                else
                {
                    Parchers=0;
                    LibyanPeltasts=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Xanthippus      : Desert Infantry="+DesertInfantry+"  ;Numidian Cavalry="+NumidianCavalry+"  ;Libyan Peltasts="+LibyanPeltasts);
                System.out.println("Zama is Captured!!");
                Zama="allied";
                //IromanLegionary=Pinfantry;
                //IromanCavalry=Pcavalry;
                //Iarchers=Parchers;
                //RromanLegionary=0;
                //RromanCavalry=0;
                //Rarchers=0;
                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.PlayerAttack();
            }
            else
            {
                System.out.println("The battle is lost!! Our troops are routed! Our Army has been vanquished!");
                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Xanthippus      : Desert Infantry="+DesertInfantry+"  ;Numidian Cavalry="+NumidianCavalry+"  ;Libyan Peltasts="+LibyanPeltasts);

                if(DesertInfantry>Pinfantry)
                {
                    DesertInfantry-=Pinfantry;
                    Pinfantry=0;
                }
                else
                {
                    Pinfantry=0;
                    DesertInfantry=0;
                }

                if(NumidianCavalry>Pcavalry)
                {
                    NumidianCavalry-=Pcavalry;
                    Pcavalry=0;
                }
                else
                {
                    Pcavalry=0;
                    NumidianCavalry=0;
                }

                if(LibyanPeltasts>Parchers)
                {
                    LibyanPeltasts-=Parchers;
                    Parchers=0;
                }
                else
                {
                    Parchers=0;
                    LibyanPeltasts=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Xanthippus      : Desert Infantry="+DesertInfantry+"  ;Numidian Cavalry="+NumidianCavalry+"  ;Libyan Peltasts="+LibyanPeltasts);

                //IromanLegionary=Pinfantry;
                //IromanCavalry=Pcavalry;
                //Iarchers=Parchers;
                //RromanLegionary=0;
                //RromanCavalry=0;
                //Rarchers=0;
                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.PlayerAttack();
            }
        }
        else if(choice==2)
        {
            if(Pinfantry>0)
            {
                Pinfantry-=1;
            }
            if(Pcavalry>0)
            {
                Pcavalry-=1;
            }
            if(Parchers>0)
            {
                Parchers-=1;
            }
            System.out.println("\nThe siege has been broken! A few of our troops have been killed by the chasing enemies!");
            System.out.println("------------------------RESULTS-------------------------------");
            System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
            System.out.println("  General Xanthippus      : Desert Infantry="+DesertInfantry+"  ;Numidian Cavalry="+NumidianCavalry+"  ;Libyan Peltasts="+LibyanPeltasts);
            System.out.println("\nPress 1 to continue");
            int choice1=Integer.parseInt(in.readLine());
            if(choice1==1)
                ob.PlayerAttack();
        }
        else
        {
            ob.AttackZama();
        }
    }

    void AttackThapsus()throws IOException
    {
        System.out.print("\f");
        int choice;        
        System.out.println("-------------- SIEGE OF THAPSUS (Year:"+Year+")-------------------");
        System.out.println("Your troops (under General Publius Cornelius Scipio):");
        System.out.println("1.Roman Legionaries = "+Pinfantry);
        System.out.println("2.Roman Cavalry = "+Pcavalry);
        System.out.println("3.Archers = "+Parchers);
        System.out.println();
        System.out.println("Enemy troops (under King Juba):");
        System.out.println("1.Greek Hoplites = "+GreekHoplites);
        System.out.println("2.Greek Light Cavalry = "+GreekLightCavalry);
        System.out.println("3.Thracian Archers = "+ThracianArchers);

        System.out.println("Do you wish to continue siege? Press 1 for yes.\nTo break siege, press 2");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            System.out.println("\nThe Battle proceeds....");            
            int php=Pinfantry*50+Pcavalry*60+Parchers*30;
            int ehp=GreekHoplites*30+GreekLightCavalry*70+ThracianArchers*40;

            if(php>ehp)
            {
                System.out.println("The Battle is WON!!!");

                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  King Juba         : Greek Hoplites="+GreekHoplites+"  ;Greek Light Cavalry="+GreekLightCavalry+"  ;Thracian Archers="+ThracianArchers);

                if(Pinfantry>GreekHoplites)
                {
                    Pinfantry-=GreekHoplites;
                    GreekHoplites=0;
                }
                else
                {
                    Pinfantry=0;
                    GreekHoplites=0;
                }

                if(Pcavalry>GreekLightCavalry)
                {
                    Pcavalry-=GreekLightCavalry;
                    GreekLightCavalry=0;
                }
                else
                {
                    Pcavalry=0;
                    GreekLightCavalry=0;
                }

                if(Parchers>ThracianArchers)
                {
                    Parchers-=ThracianArchers;
                    ThracianArchers=0;
                }
                else
                {
                    Parchers=0;
                    ThracianArchers=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  King Juba         : Greek Hoplites="+GreekHoplites+"  ;Greek Light Cavalry="+GreekLightCavalry+"  ;Thracian Archers="+ThracianArchers);
                System.out.println("Thapsus is Captured!!");
                Thapsus="allied";
                //RromanLegionary=Pinfantry;
                //RromanCavalry=Pcavalry;
                //Rarchers=Parchers;
                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.PlayerAttack();
            }
            else
            {
                System.out.println("The battle is lost!! Our troops are routed! Our Army has been vanquished!");
                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  King Juba         : Greek Hoplites="+GreekHoplites+"  ;Greek Light Cavalry="+GreekLightCavalry+"  ;Thracian Archers="+ThracianArchers);

                if(GreekHoplites>Pinfantry)
                {
                    GreekHoplites-=Pinfantry;
                    Pinfantry=0;
                }
                else
                {
                    Pinfantry=0;
                    GreekHoplites=0;
                }

                if(GreekLightCavalry>Pcavalry)
                {
                    GreekLightCavalry-=Pcavalry;
                    Pcavalry=0;
                }
                else
                {
                    Pcavalry=0;
                    GreekLightCavalry=0;
                }

                if(ThracianArchers>Parchers)
                {
                    ThracianArchers-=Parchers;
                    Parchers=0;
                }
                else
                {
                    Parchers=0;
                    ThracianArchers=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  King Juba         : Greek Hoplites="+GreekHoplites+"  ;Greek Light Cavalry="+GreekLightCavalry+"  ;Thracian Archers="+ThracianArchers);

                //RromanLegionary=Pinfantry;
                //RromanCavalry=Pcavalry;
                //Rarchers=Parchers;
                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.PlayerAttack();
            }
        }
        else if(choice==2)
        {
            if(Pinfantry>0)
            {
                Pinfantry-=1;
            }
            if(Pcavalry>0)
            {
                Pcavalry-=1;
            }
            if(Parchers>0)
            {
                Parchers-=1;
            }
            System.out.println("\nThe siege has been broken! A few of our troops have been killed by the chasing enemies!");
            System.out.println("------------------------RESULTS-------------------------------");
            System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
            System.out.println("  King Juba         : Greek Hoplites="+GreekHoplites+"  ;Greek Light Cavalry="+GreekLightCavalry+"  ;Thracian Archers="+ThracianArchers);
            System.out.println("\nPress 1 to continue");
            int choice1=Integer.parseInt(in.readLine());
            if(choice1==1)
                ob.PlayerAttack();
        }
        else
        {
            ob.AttackThapsus();
        }
    }   

    void AttackCarthage()throws IOException
    {
        System.out.print("\f");
        int choice;        
        System.out.println("-------------- SIEGE OF CARTHAGE (Year:"+Year+")-------------------");
        System.out.println("Your troops (under General Publius Cornelius Scipio):");
        System.out.println("1.Roman Legionaries = "+Pinfantry);
        System.out.println("2.Roman Cavalry = "+Pcavalry);
        System.out.println("3.Archers = "+Parchers);
        System.out.println();
        System.out.println("Enemy troops (under General Hanibal Barca):");
        System.out.println("1.Sacred Band Hoplites = "+SacredBand);
        System.out.println("2.Imperial Guard Cavalry = "+ImperialGuard);
        System.out.println("3.Slingers = "+Slingers);

        System.out.println("Do you wish to continue siege? Press 1 for yes.\nTo break siege, press 2");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            System.out.println("\nThe Battle proceeds....");            
            int php=Pinfantry*50+Pcavalry*60+Parchers*30;
            int ehp=SacredBand*30+ImperialGuard*70+Slingers*40;

            if(php>ehp)
            {
                System.out.println("The Battle is WON!!!");

                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Hanibal Barca         : Sacred Band Hoplites="+SacredBand+"  ;Imperial Guard Cavalry="+ImperialGuard+"  ;Slingers="+Slingers);

                if(Pinfantry>SacredBand)
                {
                    Pinfantry-=SacredBand;
                    SacredBand=0;
                }
                else
                {
                    Pinfantry=0;
                    SacredBand=0;
                }

                if(Pcavalry>ImperialGuard)
                {
                    Pcavalry-=ImperialGuard;
                    ImperialGuard=0;
                }
                else
                {
                    Pcavalry=0;
                    ImperialGuard=0;
                }

                if(Parchers>Slingers)
                {
                    Parchers-=Slingers;
                    Slingers=0;
                }
                else
                {
                    Parchers=0;
                    Slingers=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Hanibal Barca         : Sacred Band Hoplites="+SacredBand+"  ;Imperial Guard Cavalry="+ImperialGuard+"  ;Slingers="+Slingers);
                System.out.println("Carthage is Captured!!");
                Carthage="allied";
                //RromanLegionary=Pinfantry;
                //RromanCavalry=Pcavalry;
                //Rarchers=Parchers;
                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.Victory();
            }
            else
            {
                System.out.println("The battle is lost!! Our troops are routed! Our Army has been vanquished!");
                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Hanibal Barca         : Sacred Band Hoplites="+SacredBand+"  ;Imperial Guard Cavalry="+ImperialGuard+"  ;Slingers="+Slingers);

                if(SacredBand>Pinfantry)
                {
                    SacredBand-=Pinfantry;
                    Pinfantry=0;
                }
                else
                {
                    Pinfantry=0;
                    SacredBand=0;
                }

                if(ImperialGuard>Pcavalry)
                {
                    ImperialGuard-=Pcavalry;
                    Pcavalry=0;
                }
                else
                {
                    Pcavalry=0;
                    ImperialGuard=0;
                }

                if(Slingers>Parchers)
                {
                    Slingers-=Parchers;
                    Parchers=0;
                }
                else
                {
                    Parchers=0;
                    Slingers=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Hanibal Barca         : Sacred Band Hoplites="+SacredBand+"  ;Imperial Guard Cavalry="+ImperialGuard+"  ;Slingers="+Slingers);

                //RromanLegionary=Pinfantry;
                //RromanCavalry=Pcavalry;
                //Rarchers=Parchers;
                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.PlayerAttack();
            }
        }
        else if(choice==2)
        {
            if(Pinfantry>0)
            {
                Pinfantry-=1;
            }
            if(Pcavalry>0)
            {
                Pcavalry-=1;
            }
            if(Parchers>0)
            {
                Parchers-=1;
            }
            System.out.println("\nThe siege has been broken! A few of our troops have been killed by the chasing enemies!");
            System.out.println("------------------------RESULTS-------------------------------");
            System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
            System.out.println("  General Hanibal Barca         : Sacred Band Hoplites="+SacredBand+"  ;Imperial Guard Cavalry="+ImperialGuard+"  ;Slingers="+Slingers);
            System.out.println("\nPress 1 to continue");
            int choice1=Integer.parseInt(in.readLine());
            if(choice1==1)
                ob.PlayerAttack();
        }
        else
        {
            ob.AttackCarthage();
        }
    }

    void IberiaAttacks()throws IOException
    {
        System.out.print("\f");
        int choice;      

        System.out.println("-------------- SIEGE OF ROME (Year:"+Year+")-------------------");
        System.out.println("We have been besieged my lord!!");
        System.out.println("\nYour troops (under General Publius Cornelius Scipio):");
        System.out.println("1.Roman Legionaries = "+Pinfantry);
        System.out.println("2.Roman Cavalry = "+Pcavalry);
        System.out.println("3.Archers = "+Parchers);
        System.out.println();
        System.out.println("Enemy troops (under General Kartlos):");
        System.out.println("1.Iberian Infantry = "+IberianInfantry);
        System.out.println("2.Iberian Cavalry = "+IberianCavalry);
        System.out.println("3.Spanish Barbarian Archers = "+BarbarianArchers);

        System.out.println("To fight, press 1. To surrender city along with its troops, press 2");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            System.out.println("\nThe Battle proceeds....");            
            int php=Pinfantry*50+Pcavalry*60+Parchers*30;
            int ehp=IberianInfantry*30+IberianCavalry*70+BarbarianArchers*40;

            if(php>ehp)
            {
                System.out.println("The Battle is WON!!!");

                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Kartlos         : Iberian Infantry="+IberianInfantry+"  ;Iberian Cavalry="+IberianCavalry+"  ;Archers="+BarbarianArchers);

                if(Pinfantry>IberianInfantry)
                {
                    Pinfantry-=IberianInfantry;
                    IberianInfantry=0;
                }
                else
                {
                    Pinfantry=0;
                    IberianInfantry=0;
                }

                if(Pcavalry>IberianCavalry)
                {
                    Pcavalry-=IberianCavalry;
                    IberianCavalry=0;
                }
                else
                {
                    Pcavalry=0;
                    IberianCavalry=0;
                }

                if(Parchers>BarbarianArchers)
                {
                    Parchers-=BarbarianArchers;
                    BarbarianArchers=0;
                }
                else
                {
                    Parchers=0;
                    BarbarianArchers=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Kartlos         : Iberian Infantry="+IberianInfantry+"  ;Iberian Cavalry="+IberianCavalry+"  ;Archers="+BarbarianArchers);

                //RromanLegionary=Pinfantry;
                //RromanCavalry=Pcavalry;
                //Rarchers=Parchers;
                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.Mainmenu(); 
            }
            else
            {
                System.out.println("The battle is lost!! Our troops are routed! Our Army has been vanquished! ROME is Lost!!");
                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Kartlos         : Iberian Infantry="+IberianInfantry+"  ;Iberian Cavalry="+IberianCavalry+"  ;Archers="+BarbarianArchers);

                if(IberianInfantry>Pinfantry)
                {
                    IberianInfantry-=Pinfantry;
                    Pinfantry=0;
                }
                else
                {
                    Pinfantry=0;
                    IberianInfantry=0;
                }

                if(IberianCavalry>Pcavalry)
                {
                    IberianCavalry-=Pcavalry;
                    Pcavalry=0;
                }
                else
                {
                    Pcavalry=0;
                    IberianCavalry=0;
                }

                if(BarbarianArchers>Parchers)
                {
                    BarbarianArchers-=Parchers;
                    Parchers=0;
                }
                else
                {
                    Parchers=0;
                    BarbarianArchers=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Kartlos         : Iberian Infantry="+IberianInfantry+"  ;Iberian Cavalry="+IberianCavalry+"  ;Archers="+BarbarianArchers);

                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.GameOver();
            }
        }
        else if(choice==2)
        {
            Pinfantry=0;
            Pcavalry=0;
            Parchers=0;
            System.out.println("\nRome is lost!!");
            System.out.println("------------------------RESULTS-------------------------------");
            System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
            System.out.println("  General Kartlos         : Iberian Infantry="+IberianInfantry+"  ;Iberian Cavalry="+IberianCavalry+"  ;Archers="+BarbarianArchers);
            System.out.println("\nPress 1 to continue");
            int choice1=Integer.parseInt(in.readLine());
            if(choice1==1)
                ob.GameOver();
        }
        else
        {
            ob.IberiaAttacks();
        }
    }

    void ZamaAttacks()throws IOException
    {
        System.out.print("\f");
        int choice;      

        System.out.println("-------------- SIEGE OF IBERIA (Year:"+Year+")-------------------");
        System.out.println("We have been besieged my lord!!");
        System.out.println("\nYour troops (under General Publius Cornelius Scipio):");
        System.out.println("1.Roman Legionaries = "+Pinfantry);
        System.out.println("2.Roman Cavalry = "+Pcavalry);
        System.out.println("3.Archers = "+Parchers);
        System.out.println();
        System.out.println("Enemy troops (under General Xanthippus):");
        System.out.println("1.Desert Infantry = "+DesertInfantry);
        System.out.println("2.Numidian Cavalry = "+NumidianCavalry);
        System.out.println("3.Libyan Peltasts = "+LibyanPeltasts);

        System.out.println("To fight, press 1. To surrender city along with its troops, press 2");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            System.out.println("\nThe Battle proceeds....");            
            int php=Pinfantry*50+Pcavalry*60+Parchers*30;
            int ehp=DesertInfantry*20+NumidianCavalry*90+LibyanPeltasts*50;

            if(php>ehp)
            {
                System.out.println("The Battle is WON!!!");

                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Xanthippus      : Desert Infantry="+DesertInfantry+"  ;Numidian Cavalry="+NumidianCavalry+"  ;LibyanPeltasts="+LibyanPeltasts);

                if(Pinfantry>DesertInfantry)
                {
                    Pinfantry-=DesertInfantry;
                    DesertInfantry=0;
                }
                else
                {
                    Pinfantry=0;
                    DesertInfantry=0;
                }

                if(Pcavalry>NumidianCavalry)
                {
                    Pcavalry-=NumidianCavalry;
                    NumidianCavalry=0;
                }
                else
                {
                    Pcavalry=0;
                    NumidianCavalry=0;
                }

                if(Parchers>LibyanPeltasts)
                {
                    Parchers-=LibyanPeltasts;
                    LibyanPeltasts=0;
                }
                else
                {
                    Parchers=0;
                    LibyanPeltasts=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Xanthippus      : Desert Infantry="+DesertInfantry+"  ;Numidian Cavalry="+NumidianCavalry+"  ;LibyanPeltasts="+LibyanPeltasts);

                //IromanLegionary=Pinfantry;
                //IromanCavalry=Pcavalry;
                //Iarchers=Parchers;
                //RromanLegionary=0;
                //RromanCavalry=0;
                //Rarchers=0;
                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.Mainmenu(); 
            }
            else
            {
                System.out.println("The battle is lost!! Our troops are routed! Our Army has been vanquished! IBERIA is Lost!!");
                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Xanthippus      : Desert Infantry="+DesertInfantry+"  ;Numidian Cavalry="+NumidianCavalry+"  ;LibyanPeltasts="+LibyanPeltasts);

                if(DesertInfantry>Pinfantry)
                {
                    DesertInfantry-=Pinfantry;
                    Pinfantry=0;
                }
                else
                {
                    Pinfantry=0;
                    DesertInfantry=0;
                }

                if(NumidianCavalry>Pcavalry)
                {
                    NumidianCavalry-=Pcavalry;
                    Pcavalry=0;
                }
                else
                {
                    Pcavalry=0;
                    NumidianCavalry=0;
                }

                if(LibyanPeltasts>Parchers)
                {
                    LibyanPeltasts-=Parchers;
                    Parchers=0;
                }
                else
                {
                    Parchers=0;
                    LibyanPeltasts=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Xanthippus      : Desert Infantry="+DesertInfantry+"  ;Numidian Cavalry="+NumidianCavalry+"  ;LibyanPeltasts="+LibyanPeltasts);
                Iberia="enemy";
                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.Mainmenu();
            }
        }
        else if(choice==2)
        {
            Pinfantry=0;
            Pcavalry=0;
            Parchers=0;
            //RromanLegionary=0;
            //RromanCavalry=0;
            //Rarchers=0;
            //IromanLegionary=0;
            //IromanCavalry=0;
            //Iarchers=0;            
            Iberia="enemy";
            System.out.println("\nIberia is lost!!");
            System.out.println("------------------------RESULTS-------------------------------");
            System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
            System.out.println("  General Xanthippus      : Desert Infantry="+DesertInfantry+"  ;Numidian Cavalry="+NumidianCavalry+"  ;LibyanPeltasts="+LibyanPeltasts);
            System.out.println("\nPress 1 to continue");
            int choice1=Integer.parseInt(in.readLine());
            if(choice1==1)
                ob.Mainmenu();
        }
        else
        {
            ob.ZamaAttacks();
        }
    }

    void ThapsusAttacks()throws IOException
    {
        System.out.print("\f");
        int choice;      

        System.out.println("-------------- SIEGE OF ZAMA (Year:"+Year+")-------------------");
        System.out.println("We have been besieged my lord!!");
        System.out.println("\nYour troops (under General Publius Cornelius Scipio):");
        System.out.println("1.Roman Legionaries = "+Pinfantry);
        System.out.println("2.Roman Cavalry = "+Pcavalry);
        System.out.println("3.Archers = "+Parchers);
        System.out.println();
        System.out.println("Enemy troops (under King Juba):");
        System.out.println("1.Greek Hoplites = "+GreekHoplites);
        System.out.println("2.Greek Light Cavalry = "+GreekLightCavalry);
        System.out.println("3.Thracian Archers = "+ThracianArchers);

        System.out.println("To fight, press 1. To surrender city along with its troops, press 2");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            System.out.println("\nThe Battle proceeds....");            
            int php=Pinfantry*50+Pcavalry*60+Parchers*30;
            int ehp=GreekHoplites*20+GreekLightCavalry*90+ThracianArchers*50;

            if(php>ehp)
            {
                System.out.println("The Battle is WON!!!");

                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  King Juba      : Greek Hoplites="+GreekHoplites+"  ;Greek Light Cavalry="+GreekLightCavalry+"  ;Thracian Archers="+ThracianArchers);

                if(Pinfantry>GreekHoplites)
                {
                    Pinfantry-=GreekHoplites;
                    GreekHoplites=0;
                }
                else
                {
                    Pinfantry=0;
                    GreekHoplites=0;
                }

                if(Pcavalry>GreekLightCavalry)
                {
                    Pcavalry-=GreekLightCavalry;
                    GreekLightCavalry=0;
                }
                else
                {
                    Pcavalry=0;
                    GreekLightCavalry=0;
                }

                if(Parchers>ThracianArchers)
                {
                    Parchers-=ThracianArchers;
                    ThracianArchers=0;
                }
                else
                {
                    Parchers=0;
                    ThracianArchers=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  King Juba      : Greek Hoplites="+GreekHoplites+"  ;Greek Light Cavalry="+GreekLightCavalry+"  ;Thracian Archers="+ThracianArchers);

                //IromanLegionary=Pinfantry;
                //IromanCavalry=Pcavalry;
                //Iarchers=Parchers;
                //RromanLegionary=0;
                //RromanCavalry=0;
                //Rarchers=0;
                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.Mainmenu(); 
            }
            else
            {
                System.out.println("The battle is lost!! Our troops are routed! Our Army has been vanquished! IBERIA is Lost!!");
                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  King Juba      : Greek Hoplites="+GreekHoplites+"  ;Greek Light Cavalry="+GreekLightCavalry+"  ;Thracian Archers="+ThracianArchers);

                if(GreekHoplites>Pinfantry)
                {
                    GreekHoplites-=Pinfantry;
                    Pinfantry=0;
                }
                else
                {
                    Pinfantry=0;
                    GreekHoplites=0;
                }

                if(GreekLightCavalry>Pcavalry)
                {
                    GreekLightCavalry-=Pcavalry;
                    Pcavalry=0;
                }
                else
                {
                    Pcavalry=0;
                    GreekLightCavalry=0;
                }

                if(ThracianArchers>Parchers)
                {
                    ThracianArchers-=Parchers;
                    Parchers=0;
                }
                else
                {
                    Parchers=0;
                    ThracianArchers=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  King Juba      : Greek Hoplites="+GreekHoplites+"  ;Greek Light Cavalry="+GreekLightCavalry+"  ;Thracian Archers="+ThracianArchers);

                Zama="enemy";
                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.Mainmenu();
            }
        }
        else if(choice==2)
        {
            Pinfantry=0;
            Pcavalry=0;
            Parchers=0;
            //RromanLegionary=0;
            //RromanCavalry=0;
            //Rarchers=0;
            //IromanLegionary=0;
            //IromanCavalry=0;
            //Iarchers=0;            
            Zama="enemy";
            System.out.println("\nZama is lost!!");
            System.out.println("------------------------RESULTS-------------------------------");
            System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
            System.out.println("  King Juba      : Greek Hoplites="+GreekHoplites+"  ;Greek Light Cavalry="+GreekLightCavalry+"  ;Thracian Archers="+ThracianArchers);
            System.out.println("\nPress 1 to continue");
            int choice1=Integer.parseInt(in.readLine());
            if(choice1==1)
                ob.Mainmenu();
        }
        else
        {
            ob.ThapsusAttacks();
        }
    }
    
    void CarthageAttacks()throws IOException
    {
        System.out.print("\f");
        int choice;      

        System.out.println("-------------- SIEGE OF THAPSUS (Year:"+Year+")-------------------");
        System.out.println("We have been besieged my lord!!");
        System.out.println("\nYour troops (under General Publius Cornelius Scipio):");
        System.out.println("1.Roman Legionaries = "+Pinfantry);
        System.out.println("2.Roman Cavalry = "+Pcavalry);
        System.out.println("3.Archers = "+Parchers);
        System.out.println();
        System.out.println("Enemy troops (underGeneral Hannibal Barca):");
        System.out.println("1.Sacred Band Hoplites = "+SacredBand);
        System.out.println("2.Imperial Guard Cavalry = "+ImperialGuard);
        System.out.println("3.Slingers = "+Slingers);

        System.out.println("To fight, press 1. To surrender city along with its troops, press 2");
        choice=Integer.parseInt(in.readLine());

        if(choice==1)
        {
            System.out.println("\nThe Battle proceeds....");            
            int php=Pinfantry*50+Pcavalry*60+Parchers*30;
            int ehp=SacredBand*20+ImperialGuard*90+Slingers*50;

            if(php>ehp)
            {
                System.out.println("The Battle is WON!!!");

                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Hanibal Barca      : Sacred Band Hoplites="+SacredBand+"  ;Imperial Guard Cavalry="+ImperialGuard+"  ;Slingers="+Slingers);

                if(Pinfantry>SacredBand)
                {
                    Pinfantry-=SacredBand;
                    SacredBand=0;
                }
                else
                {
                    Pinfantry=0;
                    SacredBand=0;
                }

                if(Pcavalry>ImperialGuard)
                {
                    Pcavalry-=ImperialGuard;
                    ImperialGuard=0;
                }
                else
                {
                    Pcavalry=0;
                    ImperialGuard=0;
                }

                if(Parchers>Slingers)
                {
                    Parchers-=Slingers;
                    Slingers=0;
                }
                else
                {
                    Parchers=0;
                    Slingers=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Hanibal Barca      : Sacred Band Hoplites="+SacredBand+"  ;Imperial Guard Cavalry="+ImperialGuard+"  ;Slingers="+Slingers);

                //IromanLegionary=Pinfantry;
                //IromanCavalry=Pcavalry;
                //Iarchers=Parchers;
                //RromanLegionary=0;
                //RromanCavalry=0;
                //Rarchers=0;
                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.Mainmenu(); 
            }
            else
            {
                System.out.println("The battle is lost!! Our troops are routed! Our Army has been vanquished! IBERIA is Lost!!");
                System.out.println("------------------------RESULTS-------------------------------");
                System.out.println("  Initial Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Hanibal Barca      : Sacred Band Hoplites="+SacredBand+"  ;Imperial Guard Cavalry="+ImperialGuard+"  ;Slingers="+Slingers);

                if(SacredBand>Pinfantry)
                {
                    SacredBand-=Pinfantry;
                    Pinfantry=0;
                }
                else
                {
                    Pinfantry=0;
                    SacredBand=0;
                }

                if(ImperialGuard>Pcavalry)
                {
                    ImperialGuard-=Pcavalry;
                    Pcavalry=0;
                }
                else
                {
                    Pcavalry=0;
                    ImperialGuard=0;
                }

                if(Slingers>Parchers)
                {
                    Slingers-=Parchers;
                    Parchers=0;
                }
                else
                {
                    Parchers=0;
                    Slingers=0;
                }

                System.out.println("\n  Final Armies:");
                System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
                System.out.println("  General Hanibal Barca      : Sacred Band Hoplites="+SacredBand+"  ;Imperial Guard Cavalry="+ImperialGuard+"  ;Slingers="+Slingers);

                Thapsus="enemy";
                System.out.println("\nPress 1 to continue");
                int choice1=Integer.parseInt(in.readLine());
                if(choice1==1)
                    ob.Mainmenu();
            }
        }
        else if(choice==2)
        {
            Pinfantry=0;
            Pcavalry=0;
            Parchers=0;
            //RromanLegionary=0;
            //RromanCavalry=0;
            //Rarchers=0;
            //IromanLegionary=0;
            //IromanCavalry=0;
            //Iarchers=0;            
            Thapsus="enemy";
            System.out.println("\nThapsus is lost!!");
            System.out.println("------------------------RESULTS-------------------------------");
            System.out.println("  Publius Cornelius Scipio: Roman Legionaries="+Pinfantry+"  ;Roman Cavalry="+Pcavalry+"  ;Archers="+Parchers);
            System.out.println("  General Hanibal Barca      : Sacred Band Hoplites="+SacredBand+"  ;Imperial Guard Cavalry="+ImperialGuard+"  ;Slingers="+Slingers);
            System.out.println("\nPress 1 to continue");
            int choice1=Integer.parseInt(in.readLine());
            if(choice1==1)
                ob.Mainmenu();
        }
        else
        {
            ob.CarthageAttacks();
        }
    }

    void ArmyStatus()throws IOException
    {
        System.out.print("\f");
        int choice;int inf,cav,arc=0;char c;int choice1,choice3;int choice2=0;
        System.out.println("-------------- ARMY STATUS-------------------");
        System.out.println("Displayes number of troops that have been recruited(in total) in each city.");
        System.out.println("As soon as troops are recruited, they are transferred to the frontline army.\n");

        System.out.println("   CITY                    LEGIONARIES       CAVALRY       ARCHERS");
        System.out.println("   ROME                         "+RromanLegionary+"               "+RromanCavalry+"          "+Rarchers);
        if(Iberia.equals("allied"))
            System.out.println("   IBERIA                       "+IromanLegionary+"               "+IromanCavalry+"          "+Iarchers);
        if(Zama.equals("allied"))
            System.out.println("   ZAMA                         "+ZromanLegionary+"               "+ZromanCavalry+"          "+Zarchers);
        if(Thapsus.equals("allied"))
            System.out.println("   THAPSUS                      "+TromanLegionary+"               "+TromanCavalry+"          "+Tarchers);
        
        System.out.println();
        System.out.println("Battle Front Army troops:");
        System.out.println("Roman Legionaries:"+Pinfantry);
        System.out.println("Roman Cavalry:"+Pcavalry);
        System.out.println("Archers:"+Parchers);
        /*System.out.println("\nDo you wish to add/remove troops from your Battle Front Army? To do so, press 1 else press 0.");
        choice1=Integer.parseInt(in.readLine());
        if(choice1==1)
        {
        System.out.println("1.Add troops");
        System.out.println("2.Remove troops");
        choice2=Integer.parseInt(in.readLine());
        if(choice2==1)
        {
        System.out.println("Which city do you wish to add troops from?");
        System.out.println("1.Rome");

        }
        }
        System.out.println("Choose your Battle Front army from:");
        System.out.println("ROME");
        System.out.print("1.Number of legionaries:");
        inf=Integer.parseInt(in.readLine());
        Pinfantry+=inf;
        RromanLegionary-=inf;
        System.out.print("1.Number of Roman Cavalry units:");
        cav=Integer.parseInt(in.readLine());
        Pcavalry+=cav;
        RromanCavalry-=cav;
        System.out.print("1.Number of Archer units:");
        arc=Integer.parseInt(in.readLine());
        Parchers+=arc;
        Rarchers-=arc;*/

        System.out.println("0. Back");
        System.out.println();
        System.out.print("CHOICE:");
        choice=Integer.parseInt(in.readLine());

        if(choice==0)
        {
            ob.MilitarySetup();
        }
        else
        {
            ob.ArmyStatus();
        }
    }

    void EndTurn() throws IOException
    {
        //////////////////////////////////////////////////////////////////////////
        //ROME
        Rvillagers+=RrecruitQueue+1;
        RrecruitQueue=-1;

        Pfood+=Rfoodgatherers*RvillagerCarryingCapacity;
        Pgold+=Rgoldminers*RvillagerCarryingCapacity;
        Pwood+=Rlumberjacks*RvillagerCarryingCapacity;

        if(Rforum=="building")
        {
            RforumTime-=1;
        }
        else if(RcavalryStables=="building")
        {
            RcavalryStablesTime-=1;
        }
        else if(RarcheryRange=="building")
        {
            RarcheryRangeTime-=1;
        }

        if(RforumTime==0)
        {
            Rforum="built";
        }
        if(RcavalryStablesTime==0)
        {
            RcavalryStables="built";
        }
        if(RarcheryRangeTime==0)
        {
            RarcheryRange="built";
        }

        if(Rforum=="built")
        {
            RvillagerCarryingCapacity=80;
        }

        //the following three variables that have been declared, are to count the number of troops recruited in THAT turn...the reason is that RromanLegionaries(for example), stores the number of roman legionaries recruited from the very beginning
        int RrL=0;
        int RrC=0;
        int Ra=0;
        for(int i=0;i<4;i++)
        {
            if(RrecruitmentQueueUnits[i].equals("Roman Legionary"))
            {
                RromanLegionary+=1;
                RrL+=1;
                RrecruitmentQueueUnits[i]="";
            }
            else if(RrecruitmentQueueUnits[i].equals("Roman Cavalry"))
            {                
                RromanCavalry+=1;
                RrC+=1;
                RrecruitmentQueueUnits[i]="";
            }
            else if(RrecruitmentQueueUnits[i].equals("Archers"))
            {
                Rarchers+=1;
                Ra+=1;
                RrecruitmentQueueUnits[i]="";
            }
        }
        RmilitaryRecruitmentQueue=0;

        Pinfantry+=RrL;
        Pcavalry+=RrC;
        Parchers+=Ra;
        //RromanLegionary=0;
        //RromanCavalry=0;
        //Rarchers=0;
        ///////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////

        /////////////////////////////////////////////////////////////////////////////////////////
        //IBERIA
        if(Iberia.equals("allied"))
        {
            Ivillagers+=IrecruitQueue+1;
            IrecruitQueue=-1;

            Pfood+=Ifoodgatherers*IvillagerCarryingCapacity;
            Pgold+=Igoldminers*IvillagerCarryingCapacity;
            Pwood+=Ilumberjacks*IvillagerCarryingCapacity;

            if(Iforum=="building")
            {
                IforumTime-=1;
            }
            else if(IcavalryStables=="building")
            {
                IcavalryStablesTime-=1;
            }
            else if(IarcheryRange=="building")
            {
                IarcheryRangeTime-=1;
            }

            if(IforumTime==0)
            {
                Iforum="built";
            }
            if(IcavalryStablesTime==0)
            {
                IcavalryStables="built";
            }
            if(IarcheryRangeTime==0)
            {
                IarcheryRange="built";
            }

            if(Iforum=="built")
            {
                IvillagerCarryingCapacity=80;
            }

            int IrL=0;
            int IrC=0;
            int Ia=0;
            for(int i=0;i<4;i++)
            {
                if(IrecruitmentQueueUnits[i].equals("Roman Legionary"))
                {
                    IromanLegionary+=1;
                    IrL+=1;
                    IrecruitmentQueueUnits[i]="";
                }
                else if(IrecruitmentQueueUnits[i].equals("Roman Cavalry"))
                {
                    IromanCavalry+=1;
                    IrC+=1;
                    IrecruitmentQueueUnits[i]="";
                }
                else if(IrecruitmentQueueUnits[i].equals("Archers"))
                {
                    Iarchers+=1;
                    Ia+=1;
                    IrecruitmentQueueUnits[i]="";
                }
            }
            ImilitaryRecruitmentQueue=0;

            Pinfantry+=IrL;
            Pcavalry+=IrC;
            Parchers+=Ia;
            //IromanLegionary=0;
            //IromanCavalry=0;
            //Iarchers=0;
        }
        ///////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////

        /////////////////////////////////////////////////////////////////////////////////////////
        //ZAMA
        if(Zama.equals("allied"))
        {
            Zvillagers+=ZrecruitQueue+1;
            ZrecruitQueue=-1;

            Pfood+=Zfoodgatherers*ZvillagerCarryingCapacity;
            Pgold+=Zgoldminers*ZvillagerCarryingCapacity;
            Pwood+=Zlumberjacks*ZvillagerCarryingCapacity;

            if(Zforum=="building")
            {
                ZforumTime-=1;
            }
            else if(ZcavalryStables=="building")
            {
                ZcavalryStablesTime-=1;
            }
            else if(ZarcheryRange=="building")
            {
                ZarcheryRangeTime-=1;
            }

            if(ZforumTime==0)
            {
                Zforum="built";
            }
            if(ZcavalryStablesTime==0)
            {
                ZcavalryStables="built";
            }
            if(ZarcheryRangeTime==0)
            {
                ZarcheryRange="built";
            }

            if(Zforum=="built")
            {
                ZvillagerCarryingCapacity=80;
            }

            int ZrL=0;
            int ZrC=0;
            int Za=0;
            for(int i=0;i<4;i++)
            {
                if(ZrecruitmentQueueUnits[i].equals("Roman Legionary"))
                {
                    ZromanLegionary+=1;
                    ZrL+=1;                    
                    ZrecruitmentQueueUnits[i]="";
                }
                else if(ZrecruitmentQueueUnits[i].equals("Roman Cavalry"))
                {
                    ZromanCavalry+=1;
                    ZrC+=1;
                    ZrecruitmentQueueUnits[i]="";
                }
                else if(ZrecruitmentQueueUnits[i].equals("Archers"))
                {
                    Zarchers+=1;
                    Za+=1;
                    ZrecruitmentQueueUnits[i]="";
                }
            }
            ZmilitaryRecruitmentQueue=0;

            Pinfantry+=ZrL;
            Pcavalry+=ZrC;
            Parchers+=Za;
            //ZromanLegionary=0;
            //ZromanCavalry=0;
            //Zarchers=0;
        }
        ///////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////

        /////////////////////////////////////////////////////////////////////////////////////////
        //THAPSUS
        if(Thapsus.equals("allied"))
        {
            Tvillagers+=TrecruitQueue+1;
            TrecruitQueue=-1;

            Pfood+=Tfoodgatherers*TvillagerCarryingCapacity;
            Pgold+=Tgoldminers*TvillagerCarryingCapacity;
            Pwood+=Tlumberjacks*TvillagerCarryingCapacity;

            if(Tforum=="building")
            {
                TforumTime-=1;
            }
            else if(TcavalryStables=="building")
            {
                TcavalryStablesTime-=1;
            }
            else if(TarcheryRange=="building")
            {
                TarcheryRangeTime-=1;
            }

            if(TforumTime==0)
            {
                Tforum="built";
            }
            if(TcavalryStablesTime==0)
            {
                TcavalryStables="built";
            }
            if(TarcheryRangeTime==0)
            {
                TarcheryRange="built";
            }

            if(Tforum=="built")
            {
                TvillagerCarryingCapacity=80;
            }

            int TrL=0;
            int TrC=0;
            int Ta=0;
            for(int i=0;i<4;i++)
            {
                if(TrecruitmentQueueUnits[i].equals("Roman Legionary"))
                {
                    TromanLegionary+=1;
                    TrL+=1;
                    TrecruitmentQueueUnits[i]="";
                }
                else if(TrecruitmentQueueUnits[i].equals("Roman Cavalry"))
                {
                    TromanCavalry+=1;
                    TrC+=1;
                    TrecruitmentQueueUnits[i]="";
                }
                else if(TrecruitmentQueueUnits[i].equals("Archers"))
                {
                    Tarchers+=1;
                    Ta+=1;
                    TrecruitmentQueueUnits[i]="";
                }
            }
            TmilitaryRecruitmentQueue=0;

            Pinfantry+=TrL;
            Pcavalry+=TrC;
            Parchers+=Ta;
            //TromanLegionary=0;
            //TromanCavalry=0;
            //Tarchers=0;
        }
        ///////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////

        TurnNumber+=1;

        if((TurnNumber-1)%4==0)
            Year-=1;
        SeasonNumber+=1;
        if(SeasonNumber==5)
        {
            SeasonNumber=1;
        }
        if(SeasonNumber==1)
        {
            Season="Winter";
        }
        if(SeasonNumber==2)
        {
            Season="Spring";
        }
        if(SeasonNumber==3)
        {
            Season="Summer";
        }
        if(SeasonNumber==4)
        {
            Season="Autumn";
        }

        //////////////////////////////////
        //Timeline for Iberia
        if(TurnNumber==17 && Iberia.equals("enemy"))
        {
            IberianInfantry=3;
        }
        if(TurnNumber==19 && Iberia.equals("enemy"))
        {
            IcavalryStables="built";
            IcavalryStablesTime=0;
        }
        if(TurnNumber==25 && Iberia.equals("enemy"))
        {
            IberianCavalry=2;
        }
        if(TurnNumber==35 && Iberia.equals("enemy"))
        {
            IarcheryRange="built";
            IarcheryRangeTime=0;
        }
        if(TurnNumber>36 && TurnNumber%3==0 && Iberia.equals("enemy"))
        {
            IberianInfantry+=1;
            IberianCavalry+=1;
            BarbarianArchers+=1;
        }
        if(TurnNumber==60 && Iberia.equals("enemy"))
        {
            Iforum="built";
            IforumTime=0;
        }
        if(TurnNumber==30 && Iberia.equals("enemy"))
        {
            ob.IberiaAttacks();
        }
        if(TurnNumber>30 && TurnNumber%20==0 && Iberia.equals("enemy"))
        {
            ob.IberiaAttacks();
        }

        ///////////////////
        //////////////////////////////////
        //Timeline for Zama
        if(TurnNumber==17 && Zama.equals("enemy"))
        {
            DesertInfantry=4;
        }
        if(TurnNumber==19 && Zama.equals("enemy"))
        {
            ZcavalryStables="built";
            ZcavalryStablesTime=0;
        }
        if(TurnNumber==25 && Zama.equals("enemy"))
        {
            NumidianCavalry=2;
        }
        if(TurnNumber==23 && Zama.equals("enemy"))
        {
            ZarcheryRange="built";
            ZarcheryRangeTime=0;
        }
        if(TurnNumber>29 &&  TurnNumber%6==0 && Zama.equals("enemy"))
        {
            DesertInfantry+=1;
            NumidianCavalry+=1;
            LibyanPeltasts+=1;
        }
        if(TurnNumber==75 && Zama.equals("enemy"))
        {
            Zforum="built";
            ZforumTime=0;
        }
        if(TurnNumber==80 && Iberia.equals("allied") && Zama.equals("enemy"))
        {
            ob.ZamaAttacks();
        }
        if(TurnNumber>80 && TurnNumber%20==0 && Iberia.equals("allied") && Zama.equals("enemy"))
        {
            ob.ZamaAttacks();
        }
        /*if(TurnNumber==120 && Iberia.equals("allied") && Zama.equals("enemy"))
        {
            ob.ZamaAttacks();
        }
        if(TurnNumber==150 && Iberia.equals("allied") && Zama.equals("enemy"))
        {
            ob.ZamaAttacks();
        }*/

        ///////////////////

        ob.Mainmenu();
    }        

    void GameOver()throws IOException
    {
        System.out.println("\f");
        System.out.println("***************** GAME OVER ***********************");
        System.out.println("You have lost your only city! The great Roman Empire has been defeated!");
        System.out.println("**********CREDITS************");
        System.out.println("--> SHARVAI OPTIMUS MAXIMUS");
        System.out.println("email--> sharvai_spqr@yahoo.com");
        System.out.println("\nPress 1 to exit");
        int choice1=Integer.parseInt(in.readLine());
        System.exit(0);
    }
    
    void Victory()throws IOException
    {
        System.out.println("\f");
        System.out.println("***************** VICTORY!!! ***********************");
        System.out.println("You have defeated General Hannibal Barca's troops! Hannibal has committed suicide! The long Punic war has ended! \nThe Roman Empire has proved its greatness! No one challenges our might anymore!");
        System.out.println("\nYear="+Year+" BC");
        System.out.println("Turn Number="+TurnNumber);
        System.out.println("\n**********CREDITS************");
        System.out.println("--> SHARVAI OPTIMUS MAXIMUS");
        System.out.println("email--> sharvai_spqr@yahoo.com");
        System.out.println("\nPress 1 to exit");
        int choice1=Integer.parseInt(in.readLine());
        System.exit(0);
    }
}
