package akilliCihaz;

public interface ISubject {
    void attach(IObserver obs);
    void detach(IObserver obs);
    void bildirim();
}
