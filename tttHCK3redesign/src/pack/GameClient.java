package pack;



import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameClient {

  
    public JFrame frame = new JFrame("Tic Tac Toe: Game");
//    frame.setSize(500, 500);
//	frame.setVisible(true);
//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	frame.setLocationRelativeTo(null);
   
    //GUI
    //-------------------------------------------------------------------//
    private JLabel updateLabel = new JLabel("");
    private ImageIcon icon;
    private ImageIcon enemyIcon;

    private Square[] tictactoeBoard = new Square[9];
    private Square currentSquare;
    
    //SERVER NET
    //--------------------------------------------------------------------------//
    private static int PORT = 8901;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;


    public GameClient(String serverAddress) throws Exception {

        // Setup networking
        socket = new Socket(serverAddress, PORT);
        in = new BufferedReader(new InputStreamReader(
            socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);

        // Layout GUI
        updateLabel.setBackground(Color.lightGray);
        frame.getContentPane().add(updateLabel, "South");

        JPanel boardPanel = new JPanel();
        boardPanel.setBackground(Color.black);
        boardPanel.setLayout(new GridLayout(3, 3, 2, 2));
        for (int i = 0; i < tictactoeBoard.length; i++) {
            final int j = i;
            tictactoeBoard[i] = new Square();
            tictactoeBoard[i].addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    currentSquare = tictactoeBoard[j];
                    out.println("MOVE " + j);}});
            boardPanel.add(tictactoeBoard[i]);
        }
        frame.getContentPane().add(boardPanel, "Center");
    }

    public void play() throws Exception {
        String response;
        try {
            response = in.readLine();
            if (response.startsWith("WELCOME")) {
                char letter = response.charAt(8);
                icon = new ImageIcon(letter == 'X' ? "x.jpg" : "o.png");
                enemyIcon  = new ImageIcon(letter == 'X' ? "o.png" : "x.jpg");
                frame.setTitle("Tic Tac Toe - Player " + letter);
            }
            
//            while (true) {
//                response = in.readLine();
//                if (response.startsWith("VALID_MOVE")) {
//                    updateLabel.setText("Valid move, please wait");
//                    currentSquare.repaint();
//                } else if (response.startsWith("OPPONENT_MOVED")) {
//                    int loc = Integer.parseInt();
//                    tictactoeBoard[loc].repaint();
//                    updateLabel.setText("Opponent moved, your turn");
//                } else if (response.startsWith("VICTORY")) {
//                    updateLabel.setText("You win");
//                } else if (response.startsWith("DEFEAT")) {
//                    updateLabel.setText("You lose");
//                } else if (response.startsWith("TIE")) {
//                    updateLabel.setText("You tied");
//                } 
//            }
            
            while (true) {
                response = in.readLine();
                if (response.startsWith("VALID_MOVE")) {
                    updateLabel.setText("Valid move, please wait");
                    currentSquare.setIcon(icon);
                    currentSquare.repaint();
                } else if (response.startsWith("OPPONENT_MOVED")) {
                    int loc = Integer.parseInt(response.substring(15));
                    tictactoeBoard[loc].setIcon(enemyIcon);
                    tictactoeBoard[loc].repaint();
                    updateLabel.setText("Opponent moved, your turn");
                } else if (response.startsWith("VICTORY")) {
                    updateLabel.setText("You win");
                    break;
                } else if (response.startsWith("DEFEAT")) {
                    updateLabel.setText("You lose");
                    break;
                } else if (response.startsWith("TIE")) {
                    updateLabel.setText("You tied");
                    break;
                } else if (response.startsWith("MESSAGE")) {
                    updateLabel.setText(response.substring(8));
                }
            }
            out.println("QUIT");
        }
        finally {
            socket.close();
        }
    }

    private boolean playAgain() {
        int response = JOptionPane.showConfirmDialog(frame,
            "play again?",
            "Good Game!",
            JOptionPane.YES_NO_OPTION);
        frame.dispose();
        return response == JOptionPane.YES_OPTION;
    }

    static class Square extends JPanel {
        JLabel label = new JLabel((Icon)null);
        
        public Square() {
            setBackground(Color.white);
            add(label);
        }
        public void setIcon(Icon icon) {
            label.setIcon(icon);
        }
    }

    public static void main(String[] args) throws Exception {
        while (true) {
            String serverAddress = (args.length == 0) ? "localhost" : args[1];
            GameClient client = new GameClient(serverAddress);
            client.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            client.frame.setSize(300, 300);
            client.frame.setVisible(true);
            client.frame.setResizable(false);
            client.frame.setLocationRelativeTo(null);
            client.play();
            if (!client.playAgain()) {
                break;
            }
        }
    }
}