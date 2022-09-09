package mainEgenerico;

import Tips.F;
import Tips.S;

public class Par<T> {
    private S sus;
    private F amongus;
    public Par(S sus, F amongus) {
        this.amongus = amongus;
        this.sus = sus;
    }

    public S getSus() {
        return sus;
    }

    public void setSus(S sus) {
        this.sus = sus;
    }

    public F getAmongus() {
        return amongus;
    }

    public void setAmongus(F amongus) {
        this.amongus = amongus;
    }
}
