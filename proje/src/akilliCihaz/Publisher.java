package akilliCihaz;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements ISubject{
    private List<IObserver> obsess = new ArrayList<>();
    @Override
    public void attach(IObserver obs) {
        obsess.add(obs);
    }

    @Override
    public void detach(IObserver obs) {
        obsess.add(obs);
    }

    @Override
    public void bildirim() {
        for(IObserver obs: obsess) {
            obs.update();
        }
    }
}
