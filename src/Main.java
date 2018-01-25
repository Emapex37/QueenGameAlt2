/**
 * God Save the Queen, a java recreation of Reigns: Her Majesty
 * Created by: Evan McQueen, Jordan Klug, and Soleeman Hakimi
 * 
 */

//import com.sun.glass.events.KeyEvent;

//Audio
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import javax.swing.JOptionPane;
//import sun.audio.AudioPlayer;
//import sun.audio.AudioStream;

public class Main extends javax.swing.JFrame {
    
    //Variables
    int cardNum = 0;
    
    int chur = 5;
    int pop = 5;
    int army = 5;
    int mon = 5;
    
    int save1Dat = 0, save2Dat = 0, save3Dat = 0, save4Dat = 0;
    
    // Special conditions
    
    
    //Constructors
    Game thisGame = new Game(cardNum, chur, pop, army, mon);
    Write save = new Write();//chur, army, pop, mon, cardNum, "src\\data\\slotx"
    Read load = new Read();
    
    //Arrays
    //Option 1
    int[] chur1 = {0,0,2,1,2,-1,2,0,2,1,0,0,0,0,-2,3,0,0,0,0,0,2,0,1,0,2,-1,2,
                    0,0};
    int[] pop1 = {0,1,0,-1,1,0,2,1,1,0,2,3,1,2,1,0,1,1,1,-1,0,0,-1,1,0,1,-1,1,
                    -1,0};
    int[] army1 = {0,0,-1,0,0,-2,2,2,0,-2,1,-1,-10,1,0,0,0,-2,-1,-1,-1,0,0,0,
                    -2,-1,0,0,1,0};
    int[] mon1 = {0,-1,0,0,-1,0,-2,-2,0,0,-2,-1,0,0,0,-2,0,0,0,0,0,-1,0,0,3,-3,
                    0,0,1,0};
    
    //Option 2
    int[] chur2 = {0,-1,-3,-1,-1,1,-1,0,-1,-1,0,0,0,-1,0,-3,0,0,0,0,0,-1,0,-1,
                    0,-3,0,-2,0,0};
    int[] pop2 = {0,-1,0,1,-2,1,-2,-1,-2,0,-1,-3,-1,-1,0,0,-1,-1,-1,2,1,0,0,-1,
                    0,0,0,0,1,0};
    int[] army2 = {0,0,2,0,0,0,-1,-1,0,0,-1,1,0,1,0,0,0,1,0,1,1,0,-1,0,0,0,0,0,
                    -1,0};
    int[] mon2 = {0,0,2,0,1,-1,0,0,1,0,1,2,0,0,-1,1,0,0,0,-2,-1,1,0,0,0,2,-2,3,
                    1,0};
    
    //Conversations
    String[] toYou = {"Your story takes place during the dark ages, where you have just become Queen.",
                    "My Queen, the peasants are complaining about a food shortage."
                    , "My Queen, we wish to mine a nearby mountain, but the church says it is holy ground.",
                    "My Queen, the church believes there is a witch amongst your subjects",
                    "Your Majesty! There is a plague sweeping our Kingdom! Should we help the sick or dispose of them?",
                    "My Queen, our scout has spotted an army heading to attack us! Should we fight back or try to negotiate?",
                    "My Queen, the kingdom is running out of food! Should we buy more from neighbouring villages and kingdoms or let the peasants starve?",
                    "A group of skilled hunters are looking to be hired by you, My Queen, to bring good quality food to our kingdom!",
                    "We believe there are a group of witches that are hiding in our Kingdom. My Queen, shall we burn them at the stake or use them for their power?",
                    "A general in your army has been cheating on his wife!",
                    "The castle is throwing a feast for the new year, how would you like the food?",
                    "The civilians are demanding that taxes be lowered!",
                    "An enemy army has approached your castle and are offering us a giant wooden horse. Should we accept?",
                    "Your Highness, a hunting squad has captured a ferocious beast. What would you like to do with it?",
                    "Your Highness, you should not wear clothes that revealing.",
                    "The church has requested that you send tribute to the them to prove your loyalty to God.",
                    "Your Majesty, I have brought you a frog to celebrate your birthday.",
                    "Your Majesty, some of your soldiers stole my sheep! Will you not show them justice?",
                    "My Queen, a bunch of dangerous wild animals have moved into the villages!",
                    "The peasants have been throwing stones at the patrols! How can we make them respect the city watch?",
                    "One of your generals is looking for a bride. Will you give him your handmaid?",
                    "The priest said that your latest portrait had some evil symbolism in it.",
                    "Your Highness, a man who was caught with suspicous blueprints of the palace is claiming that he thought they were art. Is he guilty?",
                    "People have mentioned that they find some of your language offensive.",
                    "The army is so costly. Why not decrease patrols to save money?",
                    "The church is planning the festival of the Gods is requesting money and land from you. What say you?",
                    "A neighbouring kingdom has sent an army to our castle demanding gold in exchange for peace. What shall we do?",
                    "A gigantic rock has crashed near our castle, and the church is claiming that it's a sign from God that we must change and beg for mercy.",
                    "Your Highness, the farmers are having trouble keeping some of the more dangerous animals out of their fields, how can we help them?",
                    "Ending"};
    String[] ans1 = {"Got it",
                    "Increase funding for farmers.",
                    "Leave it be! Do you wish to anger the Gods?",
                    "Burn the witch!",
                    "Help them, of course!",
                    "To arms!",
                    "We need to overcome this crisis. Buy all the food we can afford.",
                    "Hire them! I've always wanted fresh food.",
                    "Hunt them down and kill them, obviously!",
                    "Unacceptible! I don't need people like that fighting for me.",
                    "Only the best for our people.",
                    "Perhaps we have been too hard on them...",
                    "OH GOOD, I LOVE HORSES!",
                    "Kill it for food and fur.",
                    "You dare tell me what to do?",
                    "If they insist.",
                    "Ummm, thanks?",
                    "They will be punished!",
                    "Send in the army to clean them out.",
                    "Time to crack down.",
                    "Of course not.",
                    "Have a new one painted right away.",
                    "Off with his head!",
                    "Oh. Sorry, I'll try to be less vulgar.",
                    "That's not a bad idea...",
                    "Of course, inform the church that the money is on the way.",
                    "THE ONLY OPTION IS WAR!!!",
                    "Begin construction of a temple around the rock.",
                    "Give our farmers basic training in hunting.",
                    "Ending"};
    String[] ans2 = {"Cool",
                    "Who cares?",
                    "Ignore the church, we need those metals.",
                    "Don't you touch them!",
                    "Don't risk it.",
                    "Hold it, let's see if they'll listen to reason.",
                    "Let the lower class starve, they aren't important anyways.",
                    "Turn them down, I am satisfied with my meals as they are.",
                    "We'd be fools to give up such power.",
                    "Don't bring your stupid gossip to me!",
                    "Anything will do.",
                    "Who are they to demand anything?",
                    "I already have, like, 14 horses I don't need any more.",
                    "Train it and keep it as my pet.",
                    "I suppose you have a point...",
                    "The only person I am loyal to is myself.",
                    "Off with both of your heads!",
                    "How could I believe you without any proof?",
                    "The villagers can handle it themselves.",
                    "Just bribe them with gifts.",
                    "Sure, whatever.",
                    "What does he know?",
                    "Nah, I like art too.",
                    "What the hell do those pieces of garbage know?",
                    "No. The safety of the kingdom is my primary concern.",
                    "Their festival, their problem.",
                    "We will see to their requests for now.",
                    "We should mine it for it's minerals.",
                    "Send in some soldiers to keep watch and patrol the area.",
                    "Ending"};
    
    
    
    
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        NGLabel = new javax.swing.JLabel();
        DatLabel = new javax.swing.JLabel();
        ExitLabel = new javax.swing.JLabel();
        DatBackLabel = new javax.swing.JLabel();
        ToMenuLabel = new javax.swing.JLabel();
        DataTitle = new javax.swing.JLabel();
        stat1 = new javax.swing.JLabel();
        stat2 = new javax.swing.JLabel();
        stat3 = new javax.swing.JLabel();
        stat4 = new javax.swing.JLabel();
        stat1Img = new javax.swing.JLabel();
        stat2Img = new javax.swing.JLabel();
        stat3Img = new javax.swing.JLabel();
        stat4Img = new javax.swing.JLabel();
        Ins10 = new javax.swing.JLabel();
        Ins9 = new javax.swing.JLabel();
        Ins8 = new javax.swing.JLabel();
        Ins7 = new javax.swing.JLabel();
        Ins6 = new javax.swing.JLabel();
        Ins5 = new javax.swing.JLabel();
        Ins4 = new javax.swing.JLabel();
        Ins3 = new javax.swing.JLabel();
        Ins2 = new javax.swing.JLabel();
        Ins1 = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        op1 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        op2 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        datImg1 = new javax.swing.JLabel();
        datImg2 = new javax.swing.JLabel();
        datImg3 = new javax.swing.JLabel();
        datImg4 = new javax.swing.JLabel();
        datBox1 = new javax.swing.JLabel();
        datBox2 = new javax.swing.JLabel();
        datBox3 = new javax.swing.JLabel();
        datBox4 = new javax.swing.JLabel();
        dTBoxB = new javax.swing.JLabel();
        gTBoxMM = new javax.swing.JLabel();
        gTBoxRight = new javax.swing.JLabel();
        gTBoxLeft = new javax.swing.JLabel();
        gTBoxMid = new javax.swing.JLabel();
        gTBoxTop = new javax.swing.JLabel();
        BGData = new javax.swing.JLabel();
        BGMenu = new javax.swing.JLabel();
        BGGame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 650));
        setMinimumSize(new java.awt.Dimension(1200, 650));
        setPreferredSize(new java.awt.Dimension(1200, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenLogo.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(450, 40, 230, 210);

        TitleLabel.setFont(new java.awt.Font("Plantagenet Cherokee", 3, 44)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(156, 239, 255));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("God  Save  the  Queen");
        getContentPane().add(TitleLabel);
        TitleLabel.setBounds(320, 270, 490, 50);

        NGLabel.setFont(new java.awt.Font("Pristina", 3, 38)); // NOI18N
        NGLabel.setForeground(new java.awt.Color(202, 239, 242));
        NGLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NGLabel.setText("New Game");
        NGLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NGLabelMouseClicked(evt);
            }
        });
        getContentPane().add(NGLabel);
        NGLabel.setBounds(480, 350, 170, 70);

        DatLabel.setFont(new java.awt.Font("Pristina", 3, 28)); // NOI18N
        DatLabel.setForeground(new java.awt.Color(191, 226, 229));
        DatLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DatLabel.setText("Save / Load");
        DatLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatLabelMouseClicked(evt);
            }
        });
        getContentPane().add(DatLabel);
        DatLabel.setBounds(480, 440, 160, 50);

        ExitLabel.setFont(new java.awt.Font("Pristina", 3, 28)); // NOI18N
        ExitLabel.setForeground(new java.awt.Color(181, 214, 216));
        ExitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitLabel.setText("Exit");
        ExitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitLabelMouseClicked(evt);
            }
        });
        getContentPane().add(ExitLabel);
        ExitLabel.setBounds(520, 520, 80, 40);

        DatBackLabel.setFont(new java.awt.Font("Pristina", 3, 36)); // NOI18N
        DatBackLabel.setForeground(new java.awt.Color(202, 239, 242));
        DatBackLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DatBackLabel.setText("Back");
        DatBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatBackLabelMouseClicked(evt);
            }
        });
        getContentPane().add(DatBackLabel);
        DatBackLabel.setBounds(1080, 560, 80, 40);

        ToMenuLabel.setFont(new java.awt.Font("Pristina", 3, 36)); // NOI18N
        ToMenuLabel.setForeground(new java.awt.Color(202, 239, 242));
        ToMenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ToMenuLabel.setText("Main Menu");
        ToMenuLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToMenuLabelMouseClicked(evt);
            }
        });
        getContentPane().add(ToMenuLabel);
        ToMenuLabel.setBounds(990, 560, 170, 40);

        DataTitle.setFont(new java.awt.Font("Pristina", 3, 36)); // NOI18N
        DataTitle.setForeground(new java.awt.Color(156, 239, 255));
        DataTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DataTitle.setText("Save / Load Data");
        getContentPane().add(DataTitle);
        DataTitle.setBounds(430, 60, 270, 120);

        stat1.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        stat1.setForeground(new java.awt.Color(156, 239, 255));
        stat1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stat1.setText("5");
        getContentPane().add(stat1);
        stat1.setBounds(380, 50, 40, 44);

        stat2.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        stat2.setForeground(new java.awt.Color(156, 239, 255));
        stat2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stat2.setText("5");
        getContentPane().add(stat2);
        stat2.setBounds(510, 50, 40, 44);

        stat3.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        stat3.setForeground(new java.awt.Color(156, 239, 255));
        stat3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stat3.setText("5");
        getContentPane().add(stat3);
        stat3.setBounds(640, 50, 40, 44);

        stat4.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        stat4.setForeground(new java.awt.Color(156, 239, 255));
        stat4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stat4.setText("5");
        getContentPane().add(stat4);
        stat4.setBounds(750, 50, 40, 44);

        stat1Img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stat1Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenCross.png"))); // NOI18N
        getContentPane().add(stat1Img);
        stat1Img.setBounds(330, 30, 50, 80);

        stat2Img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stat2Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenHeart.png"))); // NOI18N
        getContentPane().add(stat2Img);
        stat2Img.setBounds(440, 30, 60, 70);

        stat3Img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stat3Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenArmy.png"))); // NOI18N
        getContentPane().add(stat3Img);
        stat3Img.setBounds(570, 30, 60, 80);

        stat4Img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stat4Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenDollar.png"))); // NOI18N
        getContentPane().add(stat4Img);
        stat4Img.setBounds(700, 30, 50, 80);

        Ins10.setFont(new java.awt.Font("Pristina", 0, 20)); // NOI18N
        Ins10.setForeground(new java.awt.Color(202, 239, 242));
        Ins10.setText("will affect, and make the best choice.");
        getContentPane().add(Ins10);
        Ins10.setBounds(20, 340, 240, 40);

        Ins9.setFont(new java.awt.Font("Pristina", 0, 20)); // NOI18N
        Ins9.setForeground(new java.awt.Color(202, 239, 242));
        Ins9.setText("Try to guess what stats each choice");
        getContentPane().add(Ins9);
        Ins9.setBounds(20, 310, 240, 40);

        Ins8.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        Ins8.setForeground(new java.awt.Color(156, 239, 255));
        Ins8.setText("their problems.");
        getContentPane().add(Ins8);
        Ins8.setBounds(20, 270, 260, 40);

        Ins7.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        Ins7.setForeground(new java.awt.Color(156, 239, 255));
        Ins7.setText("People will come to your with");
        getContentPane().add(Ins7);
        Ins7.setBounds(20, 250, 260, 40);

        Ins6.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        Ins6.setForeground(new java.awt.Color(156, 239, 255));
        Ins6.setText("They must not reach 10 or 0");
        getContentPane().add(Ins6);
        Ins6.setBounds(20, 190, 260, 40);

        Ins5.setFont(new java.awt.Font("Pristina", 0, 20)); // NOI18N
        Ins5.setForeground(new java.awt.Color(202, 239, 242));
        Ins5.setText("and the wealth of your kingdom.");
        getContentPane().add(Ins5);
        Ins5.setBounds(20, 150, 240, 40);

        Ins4.setFont(new java.awt.Font("Pristina", 0, 20)); // NOI18N
        Ins4.setForeground(new java.awt.Color(202, 239, 242));
        Ins4.setText("The strength of your army,");
        getContentPane().add(Ins4);
        Ins4.setBounds(20, 120, 240, 40);

        Ins3.setFont(new java.awt.Font("Pristina", 0, 20)); // NOI18N
        Ins3.setForeground(new java.awt.Color(202, 239, 242));
        Ins3.setText("How much the people like you,");
        getContentPane().add(Ins3);
        Ins3.setBounds(20, 90, 240, 40);

        Ins2.setFont(new java.awt.Font("Pristina", 0, 20)); // NOI18N
        Ins2.setForeground(new java.awt.Color(202, 239, 242));
        Ins2.setText("Your relationship with the church,");
        getContentPane().add(Ins2);
        Ins2.setBounds(20, 60, 240, 40);

        Ins1.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 18)); // NOI18N
        Ins1.setForeground(new java.awt.Color(156, 239, 255));
        Ins1.setText("The four stats above represent...");
        getContentPane().add(Ins1);
        Ins1.setBounds(20, 20, 260, 40);

        text.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        text.setForeground(new java.awt.Color(202, 239, 242));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("Intro");
        text.setToolTipText("");
        getContentPane().add(text);
        text.setBounds(330, 150, 460, 100);

        op1.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        op1.setForeground(new java.awt.Color(202, 239, 242));
        op1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        op1.setText("Got it");
        op1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                op1KeyPressed(evt);
            }
        });
        getContentPane().add(op1);
        op1.setBounds(330, 310, 140, 180);

        img1.setFont(new java.awt.Font("Pristina", 3, 36)); // NOI18N
        img1.setForeground(new java.awt.Color(156, 239, 255));
        img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img1.setText("Next");
        img1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img1MouseClicked(evt);
            }
        });
        getContentPane().add(img1);
        img1.setBounds(320, 480, 140, 89);

        op2.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        op2.setForeground(new java.awt.Color(202, 239, 242));
        op2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        op2.setText("Cool");
        getContentPane().add(op2);
        op2.setBounds(650, 310, 140, 180);

        img2.setFont(new java.awt.Font("Pristina", 3, 36)); // NOI18N
        img2.setForeground(new java.awt.Color(156, 239, 255));
        img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img2.setText("Next");
        img2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img2MouseClicked(evt);
            }
        });
        getContentPane().add(img2);
        img2.setBounds(650, 500, 130, 44);

        s1.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        s1.setForeground(new java.awt.Color(255, 255, 255));
        s1.setText("Save");
        s1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s1MouseClicked(evt);
            }
        });
        getContentPane().add(s1);
        s1.setBounds(350, 300, 50, 40);

        s2.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        s2.setForeground(new java.awt.Color(255, 255, 255));
        s2.setText("Save");
        s2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s2MouseClicked(evt);
            }
        });
        getContentPane().add(s2);
        s2.setBounds(670, 300, 50, 40);

        s3.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        s3.setForeground(new java.awt.Color(255, 255, 255));
        s3.setText("Save");
        s3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s3MouseClicked(evt);
            }
        });
        getContentPane().add(s3);
        s3.setBounds(350, 500, 50, 40);

        s4.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        s4.setForeground(new java.awt.Color(255, 255, 255));
        s4.setText("Save");
        s4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s4MouseClicked(evt);
            }
        });
        getContentPane().add(s4);
        s4.setBounds(670, 500, 50, 40);

        l1.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("Load");
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });
        getContentPane().add(l1);
        l1.setBounds(410, 300, 50, 40);

        l2.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("Load");
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });
        getContentPane().add(l2);
        l2.setBounds(730, 300, 50, 40);

        l3.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("Load");
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });
        getContentPane().add(l3);
        l3.setBounds(410, 500, 50, 40);

        l4.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setText("Load");
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
        });
        getContentPane().add(l4);
        l4.setBounds(730, 500, 50, 40);

        datImg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CrownIconSmall.png"))); // NOI18N
        getContentPane().add(datImg1);
        datImg1.setBounds(340, 180, 130, 90);

        datImg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CrownIconSmall.png"))); // NOI18N
        getContentPane().add(datImg2);
        datImg2.setBounds(660, 180, 130, 90);

        datImg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datImg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CrownIconSmall.png"))); // NOI18N
        getContentPane().add(datImg3);
        datImg3.setBounds(340, 380, 130, 90);

        datImg4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datImg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CrownIconSmall.png"))); // NOI18N
        getContentPane().add(datImg4);
        datImg4.setBounds(660, 380, 130, 90);

        datBox1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenDatBox.png"))); // NOI18N
        getContentPane().add(datBox1);
        datBox1.setBounds(330, 150, 150, 150);

        datBox2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenDatBox.png"))); // NOI18N
        getContentPane().add(datBox2);
        datBox2.setBounds(650, 150, 150, 150);

        datBox3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenDatBox.png"))); // NOI18N
        getContentPane().add(datBox3);
        datBox3.setBounds(330, 350, 150, 150);

        datBox4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenDatBox.png"))); // NOI18N
        getContentPane().add(datBox4);
        datBox4.setBounds(650, 350, 150, 150);

        dTBoxB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dTBoxB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenTextboxSmall.png"))); // NOI18N
        dTBoxB.setText("jLabel1");
        getContentPane().add(dTBoxB);
        dTBoxB.setBounds(1080, 550, 90, 50);

        gTBoxMM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gTBoxMM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenTextboxSmall.png"))); // NOI18N
        getContentPane().add(gTBoxMM);
        gTBoxMM.setBounds(990, 550, 180, 50);

        gTBoxRight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gTBoxRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenTextboxSmall.png"))); // NOI18N
        getContentPane().add(gTBoxRight);
        gTBoxRight.setBounds(630, 290, 180, 270);

        gTBoxLeft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gTBoxLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenTextboxSmall.png"))); // NOI18N
        getContentPane().add(gTBoxLeft);
        gTBoxLeft.setBounds(310, 290, 180, 270);

        gTBoxMid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gTBoxMid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenTextboxSmall.png"))); // NOI18N
        getContentPane().add(gTBoxMid);
        gTBoxMid.setBounds(310, 130, 500, 140);

        gTBoxTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gTBoxTop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenTextboxSmall.png"))); // NOI18N
        getContentPane().add(gTBoxTop);
        gTBoxTop.setBounds(310, 30, 500, 80);

        BGData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenData.jpg"))); // NOI18N
        getContentPane().add(BGData);
        BGData.setBounds(0, 0, 1200, 650);

        BGMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenMenu.jpg"))); // NOI18N
        getContentPane().add(BGMenu);
        BGMenu.setBounds(0, 0, 1200, 650);

        BGGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QueenGame.jpg"))); // NOI18N
        getContentPane().add(BGGame);
        BGGame.setBounds(0, 0, 1200, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Shouldn't exist
     */  
    private void op1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_op1KeyPressed
        // TODO add your handling code here:

//        if (evt.getKeyCode()==KeyEvent.VK_LEFT){
//            
//            System.out.println("TO THE LEFT");
//            
//        }
//        public void KeyPressed(KeyEvent e) {
//            
//        }
        
        
        
    }//GEN-LAST:event_op1KeyPressed

    
    /**
     * Pre: N/A
     * Post: Calls the "assignLeft" and "checkAndContinue" methods
     */
    private void img1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img1MouseClicked
        // TODO add your handling code here:
        
        //System.out.println("Left");
        Ins1.setVisible(false);
        Ins2.setVisible(false);
        Ins3.setVisible(false);
        Ins4.setVisible(false);
        Ins5.setVisible(false);
        Ins6.setVisible(false);
        Ins7.setVisible(false);
        Ins8.setVisible(false);
        Ins9.setVisible(false);
        Ins10.setVisible(false);
        
        //Assignment      
        assignLeft();
        
        //Check values (OutOfBounds, cardNum, Misc conditions)
        //Continue if nothing flags
        checkAndContinue();
        
    }//GEN-LAST:event_img1MouseClicked
    
    
    
    
    /**
     * Pre: N/A
     * Post: Calls the "assignRight" and "checkAndContinue" methods
     */
    private void img2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img2MouseClicked
        // TODO add your handling code here:
        
        //System.out.println("Right");
        Ins1.setVisible(false);
        Ins2.setVisible(false);
        Ins3.setVisible(false);
        Ins4.setVisible(false);
        Ins5.setVisible(false);
        Ins6.setVisible(false);
        Ins7.setVisible(false);
        Ins8.setVisible(false);
        Ins9.setVisible(false);
        Ins10.setVisible(false);
        
        //Assignment
        assignRight();
        
        //Check values (OutOfBounds, cardNum, Misc conditions)
        //Continue if nothing flags
        checkAndContinue();
        
        
    }//GEN-LAST:event_img2MouseClicked

    /**
     * Pre: N/A
     * Post: Things that run when the game is launched. Sets all GUI elements
     * besides the main menu's to be invisible, and checks to see if any save
     * data exists
     */
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        //Making everything invisible at start
        //Backgrounds
        BGData.setVisible(false);
        
        //In-Game Stuff
        stat1.setVisible(false);
        stat2.setVisible(false);
        stat3.setVisible(false);
        stat4.setVisible(false);
        text.setVisible(false);
        op1.setVisible(false);
        op2.setVisible(false);
        img1.setVisible(false);
        img2.setVisible(false);
        ToMenuLabel.setVisible(false);
        gTBoxTop.setVisible(false);
        gTBoxMid.setVisible(false);
        gTBoxLeft.setVisible(false);
        gTBoxRight.setVisible(false);
        gTBoxMM.setVisible(false);
        stat1Img.setVisible(false);
        stat2Img.setVisible(false);
        stat3Img.setVisible(false);
        stat4Img.setVisible(false);
        //Data stuff
        s1.setVisible(false);
        s2.setVisible(false);
        s3.setVisible(false);
        s4.setVisible(false);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        DatBackLabel.setVisible(false);
        DataTitle.setVisible(false);
        dTBoxB.setVisible(false);
        datBox1.setVisible(false);
        datBox2.setVisible(false);
        datBox3.setVisible(false);
        datBox4.setVisible(false);
        datImg1.setVisible(false);
        datImg2.setVisible(false);
        datImg3.setVisible(false);
        datImg4.setVisible(false);
        Ins1.setVisible(false);
        Ins2.setVisible(false);
        Ins3.setVisible(false);
        Ins4.setVisible(false);
        Ins5.setVisible(false);
        Ins6.setVisible(false);
        Ins7.setVisible(false);
        Ins8.setVisible(false);
        Ins9.setVisible(false);
        Ins10.setVisible(false);
        
        //Check save slots
        
        checkSaveSlots();
        
        text.setText(convertTM(toYou[0]));
        //"Your story takes place in the dark ages, where you have just become
        //Queen. The four stats above represent your relationship with the church,
        //how much your subjects like you, the strength of your army, and 
        //the wealth of your kingdom."
        
        //Music
//        InputStream music;
//        try{ 
//        music=new FileInputStream(new File("src\\Audio\\QueenBGM.wav"));
//        
//        AudioStream audios=new AudioStream(music);
//        AudioPlayer.player.start(audios);
//        }
//        catch(Exception e){
//       JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
//        }

        
        //System.out.println("Salad\n kills");
        
    }//GEN-LAST:event_formWindowActivated

    /**
     * Pre: N/A
     * Post: Game closes. Pretty obvious if you ask me.
     */
    private void ExitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseClicked
        // TODO add your handling code here:
        
        System.exit(0);
        
    }//GEN-LAST:event_ExitLabelMouseClicked

    /**
     * Pre: N/A
     * Post: Disables menu GUI elements, and enables the data screen's
     */
    private void DatLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatLabelMouseClicked
        // TODO add your handling code here:
        
        //Set elements visible
        BGData.setVisible(true);
        s1.setVisible(true);
        s2.setVisible(true);
        s3.setVisible(true);
        s4.setVisible(true);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(true);
        DatBackLabel.setVisible(true);
        DataTitle.setVisible(true);
        dTBoxB.setVisible(true);
        datBox1.setVisible(true);
        datBox2.setVisible(true);
        datBox3.setVisible(true);
        datBox4.setVisible(true);
        
        if (save1Dat == 1){
            datImg1.setVisible(true);
        }
        if (save2Dat == 1){
            datImg2.setVisible(true);
        }
        if (save3Dat == 1){
            datImg3.setVisible(true);
        }
        if (save4Dat == 1){
            datImg4.setVisible(true);
        }
        //Disable other things
        logo.setVisible(false);
        TitleLabel.setVisible(false);
        DatLabel.setVisible(false);
        ExitLabel.setVisible(false);
        NGLabel.setVisible(false);

        
    }//GEN-LAST:event_DatLabelMouseClicked

    /**
     * Pre: N/A
     * Post: Disables data GUI elements, and enables the main menu's
     */
    private void DatBackLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatBackLabelMouseClicked
        // TODO add your handling code here:
        
        //Enable other things
        logo.setVisible(true);
        TitleLabel.setVisible(true);
        DatLabel.setVisible(true);
        ExitLabel.setVisible(true);
        NGLabel.setVisible(true);
        
        //Set elements invisible
        BGData.setVisible(false);
        s1.setVisible(false);
        s2.setVisible(false);
        s3.setVisible(false);
        s4.setVisible(false);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        DatBackLabel.setVisible(false);
        DataTitle.setVisible(false);
        dTBoxB.setVisible(false);
        datBox1.setVisible(false);
        datBox2.setVisible(false);
        datBox3.setVisible(false);
        datBox4.setVisible(false);
        datImg1.setVisible(false);
        datImg2.setVisible(false);
        datImg3.setVisible(false);
        datImg4.setVisible(false);
        
    }//GEN-LAST:event_DatBackLabelMouseClicked

    /**
     * Pre: N/A
     * Post: Disables menu GUI elements, and enables the game's
     */
    private void NGLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NGLabelMouseClicked
        // TODO add your handling code here:
        
        //Change label
        NGLabel.setText("Continue");
        
        //Enable elements
        img1.setVisible(true);
        img2.setVisible(true);
        op1.setVisible(true);
        op2.setVisible(true);
        stat1.setVisible(true);
        stat2.setVisible(true);
        stat3.setVisible(true);
        stat4.setVisible(true);
        text.setVisible(true);
        ToMenuLabel.setVisible(true);
        gTBoxTop.setVisible(true);
        gTBoxMid.setVisible(true);
        gTBoxLeft.setVisible(true);
        gTBoxRight.setVisible(true);
        gTBoxMM.setVisible(true);
        stat1Img.setVisible(true);
        stat2Img.setVisible(true);
        stat3Img.setVisible(true);
        stat4Img.setVisible(true);
        
        //Instructions visible if neccessary
        if (cardNum == 0){
            Ins1.setVisible(true);
            Ins2.setVisible(true);
            Ins3.setVisible(true);
            Ins4.setVisible(true);
            Ins5.setVisible(true);
            Ins6.setVisible(true);
            Ins7.setVisible(true);
            Ins8.setVisible(true);
            Ins9.setVisible(true);
            Ins10.setVisible(true);
        }
        
        //Disable other things
        logo.setVisible(false);
        TitleLabel.setVisible(false);
        DatLabel.setVisible(false);
        ExitLabel.setVisible(false);
        NGLabel.setVisible(false);  
        BGMenu.setVisible(false);
        
    }//GEN-LAST:event_NGLabelMouseClicked

    /**
     * Pre: N/A
     * Post: Disables game GUI elements, and enables the main menu's
     */
    private void ToMenuLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToMenuLabelMouseClicked
        // TODO add your handling code here:
        
        if (chur >= 10 || pop >= 10 || army >= 10 || mon >= 10 || chur <= 0 || 
                pop <= 0 || army <= 0 || mon <= 0 || cardNum >= 30){
            
            NGLabel.setText("New Game");
            chur = 5;
            pop = 5;
            army = 5;
            mon = 5;
            cardNum = 0;
            
            //Set texts to defaults
            text.setText(convertTM(toYou[cardNum]));
            op1.setText(convertTM(ans1[cardNum]));
            op2.setText(convertTM(ans2[cardNum]));
            
        } else {
            
            
        }
        
        
        //Disable elements
        img1.setVisible(false);
        img2.setVisible(false);
        op1.setVisible(false);
        op2.setVisible(false);
        stat1.setVisible(false);
        stat2.setVisible(false);
        stat3.setVisible(false);
        stat4.setVisible(false);
        text.setVisible(false);
        ToMenuLabel.setVisible(false);
        gTBoxTop.setVisible(false);
        gTBoxMid.setVisible(false);
        gTBoxLeft.setVisible(false);
        gTBoxRight.setVisible(false);
        gTBoxMM.setVisible(false);
        stat1Img.setVisible(false);
        stat2Img.setVisible(false);
        stat3Img.setVisible(false);
        stat4Img.setVisible(false);
        
        //Enable other things
        logo.setVisible(true);
        TitleLabel.setVisible(true);
        DatLabel.setVisible(true);
        ExitLabel.setVisible(true);
        NGLabel.setVisible(true);  
        BGMenu.setVisible(true);
        
    }//GEN-LAST:event_ToMenuLabelMouseClicked

    //SAVING
    /**
     * Pre: N/A
     * Post: Writes current values to corresponding file
     */
    private void s1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s1MouseClicked
        // TODO add your handling code here:
        
        save.writeTest(chur, army, pop, mon, cardNum, "src\\data\\Slot1.txt");
        //change icon to "saved"
        if (cardNum != 0){
            save1Dat = 1;
            datImg1.setVisible(true);
        }
        
    }//GEN-LAST:event_s1MouseClicked

    /**
     * Pre: N/A
     * Post: Writes current values to corresponding file
     */
    private void s2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s2MouseClicked
        // TODO add your handling code here:
        
        save.writeTest(chur, army, pop, mon, cardNum, "src\\data\\Slot2.txt");
        
        if (cardNum != 0){
            save2Dat = 1;
            datImg2.setVisible(true);
        }
        
    }//GEN-LAST:event_s2MouseClicked

    /**
     * Pre: N/A
     * Post: Writes current values to corresponding file
     */
    private void s3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s3MouseClicked
        // TODO add your handling code here:
        
        save.writeTest(chur, army, pop, mon, cardNum, "src\\data\\Slot3.txt");
        
        if (cardNum != 0){
            save3Dat = 1;
            datImg3.setVisible(true);
        }
        
    }//GEN-LAST:event_s3MouseClicked

    /**
     * Pre: N/A
     * Post: Writes current values to corresponding file
     */
    private void s4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s4MouseClicked
        // TODO add your handling code here:
        
        save.writeTest(chur, army, pop, mon, cardNum, "src\\data\\Slot4.txt");
        
        if (cardNum != 0){
            save4Dat = 1;
            datImg4.setVisible(true);
        }
        
    }//GEN-LAST:event_s4MouseClicked

    //LOADING
    /**
     * Pre: N/A
     * Post: Updates GUI and variables with new, loaded values
     */
    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        // TODO add your handling code here:
        
        int[] slot1Data = load.readFile("src\\data\\Slot1.txt");
        
        chur = slot1Data[0];
        army = slot1Data[1];
        pop = slot1Data[2];
        mon = slot1Data[3];
        cardNum = slot1Data[4];
        
        NGLabel.setText("Continue");
        
        //Set elements
        stat1.setText(chur + "");
        stat2.setText(pop + "");
        stat3.setText(army + "");
        stat4.setText(mon + "");
        text.setText(convertTM(toYou[cardNum]));
        op1.setText(convertTM(ans1[cardNum]));
        op2.setText(convertTM(ans2[cardNum]));
        
    }//GEN-LAST:event_l1MouseClicked

    /**
     * Pre: N/A
     * Post: Updates GUI and variables with new, loaded values
     */
    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        // TODO add your handling code here:
        
        int[] slot2Data = load.readFile("src\\data\\Slot2.txt");
        
        chur = slot2Data[0];
        army = slot2Data[1];
        pop = slot2Data[2];
        mon = slot2Data[3];
        cardNum = slot2Data[4];
        
        NGLabel.setText("Continue");
        
        stat1.setText(chur + "");
        stat2.setText(pop + "");
        stat3.setText(army + "");
        stat4.setText(mon + "");
        text.setText(convertTM(toYou[cardNum]));
        op1.setText(convertTM(ans1[cardNum]));
        op2.setText(convertTM(ans2[cardNum]));
        
    }//GEN-LAST:event_l2MouseClicked

    /**
     * Pre: N/A
     * Post: Updates GUI and variables with new, loaded values
     */
    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        // TODO add your handling code here:
        
        int[] slot3Data = load.readFile("src\\data\\Slot3.txt");
        
        chur = slot3Data[0];
        army = slot3Data[1];
        pop = slot3Data[2];
        mon = slot3Data[3];
        cardNum = slot3Data[4];
        
        NGLabel.setText("Continue");
        
        stat1.setText(chur + "");
        stat2.setText(pop + "");
        stat3.setText(army + "");
        stat4.setText(mon + "");
        text.setText(convertTM(toYou[cardNum]));
        op1.setText(convertTM(ans1[cardNum]));
        op2.setText(convertTM(ans2[cardNum]));
        
    }//GEN-LAST:event_l3MouseClicked
    
    /**
     * Pre: N/A
     * Post: Updates GUI and variables with new, loaded values
     */
    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
        // TODO add your handling code here:
        
        int[] slot4Data = load.readFile("src\\data\\Slot4.txt");
        
        chur = slot4Data[0];
        army = slot4Data[1];
        pop = slot4Data[2];
        mon = slot4Data[3];
        cardNum = slot4Data[4];
        
        NGLabel.setText("Continue");
        
        stat1.setText(chur + "");
        stat2.setText(pop + "");
        stat3.setText(army + "");
        stat4.setText(mon + "");
        text.setText(convertTM(toYou[cardNum]));
        op1.setText(convertTM(ans1[cardNum]));
        op2.setText(convertTM(ans2[cardNum]));
        
    }//GEN-LAST:event_l4MouseClicked
    
    
    
    /**
     * Pre: N/A
     * Post: Assigns the new values to the variables and updates GUI
     */
    public void assignLeft(){
        
        //New values
        chur = thisGame.assignChur(chur, chur1[cardNum]);
        pop = thisGame.assignPop(pop, pop1[cardNum]);
        army = thisGame.assignArmy(army, army1[cardNum]);
        mon = thisGame.assignMon(mon, mon1[cardNum]);
        
        //Change in gui
        stat1.setText("" + chur);
        stat2.setText("" + pop);
        stat3.setText("" + army);
        stat4.setText("" + mon);
        
        
    }
    
    /**
     * Pre: N/A
     * Post: Assigns the new values to the variables and updates GUI
     */
    public void assignRight(){
        
        //New values
        chur = thisGame.assignChur(chur, chur2[cardNum]);
        pop = thisGame.assignPop(pop, pop2[cardNum]);
        army = thisGame.assignArmy(army, army2[cardNum]);
        mon = thisGame.assignMon(mon, mon2[cardNum]);
        
        //Change in gui
        stat1.setText("" + chur);
        stat2.setText("" + pop);
        stat3.setText("" + army);
        stat4.setText("" + mon);
        
    }
    
    /**
     * Pre: N/A
     * Post: Will either end the game with the appropriate message, or call the
     * "advance" method and continue play
     */
    public void checkAndContinue(){
    
    //Different game enders
        if (chur >= 10){
            // Church thinks you're a saint, you're not, you starve
            stat1.setText("-");
            stat2.setText("-");
            stat3.setText("-");
            stat4.setText("-");
            
            text.setText(convertTM("The church, believing you to be a saint, has you"
                    + " fast until you hear the voice of god. You do not. You"
                    + " starve."));
            op1.setText("-");
            op2.setText("-");
            
            
        } else if (pop >= 10) {
            // Fans storm castle and you are trampled
            stat1.setText("-");
            stat2.setText("-");
            stat3.setText("-");
            stat4.setText("-");
            
            text.setText(convertTM("The public, desperate to see their beloved queen,"
                    + " storm into the castle. "
                    + "You are trampled amidst the confusion and excitement."));
            op1.setText("-");
            op2.setText("-");
            
            
            
        } else if (army >= 10) {
            // Army grows restless, you are overthrown and beheaded
            stat1.setText("-");
            stat2.setText("-");
            stat3.setText("-");
            stat4.setText("-");
            
            text.setText(convertTM("The army, now too large for you to handle,"
                    + " decides you are unfit as ruler and starts an uprising. "
                    + "You are overthrown and beheaded."));
            op1.setText("-");
            op2.setText("-");
            
            
            
        } else if (mon >= 10) {
            // Invaded by other nation, they were attracted to your great wealth
            stat1.setText("-");
            stat2.setText("-");
            stat3.setText("-");
            stat4.setText("-");
            
            text.setText(convertTM("Attracted by your great wealth, an enemy nation"
                    + " launches a frontal assault on your kingdom. The entire"
                    + " castle is burned to the ground with you in it."));
            op1.setText("-");
            op2.setText("-");
            
            
            
        } else if (chur <= 0) {
            // You are deemed a heretic, and burned at the stake
            stat1.setText("-");
            stat2.setText("-");
            stat3.setText("-");
            stat4.setText("-");
            
            text.setText(convertTM("The church deems you a heretic, and burns you at the"
                    + " stake for your blasphemous acts."));
            op1.setText("-");
            op2.setText("-");
            
            
            
        } else if (pop <= 0) {
            // People hate you, you are dragged out of your castle and stoned
            stat1.setText("-");
            stat2.setText("-");
            stat3.setText("-");
            stat4.setText("-");
            
            text.setText(convertTM("The public, infuriated by your actions, storm your"
                    + " castle with fire in their eyes. You are dragged out"
                    + " onto the streets and stoned."));
            op1.setText("-");
            op2.setText("-");
            
            
            
        } else if(army <= 0) {
            // Other nation takes advantage of weakness, you are pillaged
            stat1.setText("-");
            stat2.setText("-");
            stat3.setText("-");
            stat4.setText("-");
            
            text.setText(convertTM("An enemy kingdom, taking advantage of your"
                    + " non-existent army, pillages your lands. Your kingdom"
                    + " burns before your eyes."));
            op1.setText("-");
            op2.setText("-");
            
            
            
        } else if (mon <= 0) {
            // Starving and cold, your subjects die off one by one
            stat1.setText("-");
            stat2.setText("-");
            stat3.setText("-");
            stat4.setText("-");
            
            text.setText(convertTM("Starving and cold, your subjects die off one by"
                    + " one until you yourself succumb to famine."));
            op1.setText("-");
            op2.setText("-");
            
            
            
        } else if (cardNum >= 30) {
            //You win! Having reached the end of your life you die a good ruler
            text.setText(convertTM(toYou[30]));
            op1.setText(convertTM(ans1[30]));
            op2.setText(convertTM(ans2[30]));
            
        } else {
            //Advance
            
            advance();
            
        }
    
    
}
    /**
     * Pre: N/A
     * Post: Determines whether there is non-default data in any of the save 
     * slots
     */
    public void checkSaveSlots(){
        
        int[] save1 = load.readFile("src\\data\\Slot1.txt");
        int[] save2 = load.readFile("src\\data\\Slot2.txt");
        int[] save3 = load.readFile("src\\data\\Slot3.txt");
        int[] save4 = load.readFile("src\\data\\Slot4.txt");
        if (save1[4] != 0){
            save1Dat = 1;
        }
        if (save2[4] != 0){
            save2Dat = 1;
        }
        if (save3[4] != 0){
            save3Dat = 1;
        }
        if (save4[4] != 0){
            save4Dat = 1;
        }
        
    }
    
    /**
     * Pre: N/A
     * Post: Advances progress in game by loading the next text boxes
     */
    public void advance(){
        
        cardNum++;
        text.setText(convertTM(toYou[cardNum]));
        op1.setText(convertTM(ans1[cardNum]));
        op2.setText(convertTM(ans2[cardNum]));
        
    }
    
    public String convertTM(String message){
        
        return "<html>" + message;
        
    }
    
//    public void save(){
//        
//        save.writeTest(chur, army, pop, mon, cardNum, "src\\data\\slot1");
//        
//    }
//    
//    public void load(){
//        
//        //Set NGLabel to ("Continue")
//        
//    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGData;
    private javax.swing.JLabel BGGame;
    private javax.swing.JLabel BGMenu;
    private javax.swing.JLabel DatBackLabel;
    private javax.swing.JLabel DatLabel;
    private javax.swing.JLabel DataTitle;
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JLabel Ins1;
    private javax.swing.JLabel Ins10;
    private javax.swing.JLabel Ins2;
    private javax.swing.JLabel Ins3;
    private javax.swing.JLabel Ins4;
    private javax.swing.JLabel Ins5;
    private javax.swing.JLabel Ins6;
    private javax.swing.JLabel Ins7;
    private javax.swing.JLabel Ins8;
    private javax.swing.JLabel Ins9;
    private javax.swing.JLabel NGLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel ToMenuLabel;
    private javax.swing.JLabel dTBoxB;
    private javax.swing.JLabel datBox1;
    private javax.swing.JLabel datBox2;
    private javax.swing.JLabel datBox3;
    private javax.swing.JLabel datBox4;
    private javax.swing.JLabel datImg1;
    private javax.swing.JLabel datImg2;
    private javax.swing.JLabel datImg3;
    private javax.swing.JLabel datImg4;
    private javax.swing.JLabel gTBoxLeft;
    private javax.swing.JLabel gTBoxMM;
    private javax.swing.JLabel gTBoxMid;
    private javax.swing.JLabel gTBoxRight;
    private javax.swing.JLabel gTBoxTop;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel op1;
    private javax.swing.JLabel op2;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel stat1;
    private javax.swing.JLabel stat1Img;
    private javax.swing.JLabel stat2;
    private javax.swing.JLabel stat2Img;
    private javax.swing.JLabel stat3;
    private javax.swing.JLabel stat3Img;
    private javax.swing.JLabel stat4;
    private javax.swing.JLabel stat4Img;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
