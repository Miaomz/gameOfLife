package ui.model;

/**
 * Created by miaomuzhi on 2017/10/16.
 */
public class Broad {
    private int row;
    private int column;

    private boolean[][] lives;


    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }


    public Broad(boolean[][] lives){
        this.lives = lives;
        this.row = lives.length;
        this.column = lives[0].length;
    }

    public boolean getBlock(int row, int column){
        return lives[row][column];
    }

    public void setBlock(int row, int column, boolean value){
        lives[row][column] = value;
    }

    public int adjacentCount(int row, int column){
        int count = 0;
        for (int i=row-1; i<row+1; i++){
            if (i<0 || i>this.row-1){
                continue;
            }
            for (int j=column-1; j<column+1; j++){
                if (j<0 || j>this.column-1 ||
                        (i==row && j==column)){
                    continue;
                } else if (this.lives[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
}
