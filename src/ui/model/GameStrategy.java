package ui.model;

/**
 * Created by miaomuzhi on 2017/10/16.
 * <br>born when 3, survive when 2 or 3<br/>
 */
public class GameStrategy implements GamePlay{
    private Broad broad;

    private int row;
    private int column;

    public void initiate(Broad broad){
        this.broad = broad;
        this.row = broad.getRow();
        this.column = broad.getColumn();
    }

    public Broad nextStep(){
        for (int i=0; i<this.row; i++){
            for (int j=0; j<this.column; j++){
                if (broad.adjacentCount(i,j)==1 || broad.adjacentCount(i,j)==4 ){
                    broad.setBlock(i,j, false);
                } else if (broad.adjacentCount(i,j)==3){
                    broad.setBlock(i,j,true);
                } else {
                    //do nothing
                }
            }
        }
        return broad;
    }
}
