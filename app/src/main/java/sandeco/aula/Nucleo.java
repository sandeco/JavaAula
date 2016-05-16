package sandeco.aula;

/**
 * Created by sandeco on 16/05/16.
 */
public class Nucleo {

    private String clock;
    private String cache;


    public Nucleo() {
        this.clock = "1.2GHZ";
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }
}
