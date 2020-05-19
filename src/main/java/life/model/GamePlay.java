package life.model;

/**
 * Created by miaomuzhi on 2017/10/17.
 */
public interface GamePlay {
    /**
     *
     * @param broad
     */
    void initiate(Broad broad);

    /**
     *
     * @return
     */
    Broad nextStep();
}
