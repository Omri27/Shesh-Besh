package sheshbesh;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;



public class LeaderBoards extends JFrame{
    public static class ScoreEntry{
        public int score;
        public String userName;

        public ScoreEntry(int score, String userName) {
            this.score = score;
            this.userName = userName;
        }
    }

    public LeaderBoards(){
        initComponents();
    }
    private void initComponents(){
        String[] columns = new String[] {
                "UserName", "Score"
        };

        ArrayList<Map.Entry<String,Integer>> leaderBoards = SQLiteJDBC.getLeaderBoards();
        Object[][] mat = new Object[leaderBoards.size()][2];
        int i = 0;

        for(Map.Entry<String,Integer> entry : leaderBoards){
            mat[i][0] = entry.getKey();
            mat[i][1] = entry.getValue();
            i++;

        }

        table = new JTable(mat,columns);
        table.setEnabled(false);
        this.add(new JScrollPane(table));
        pack();


    }

    private JTable table;

}
