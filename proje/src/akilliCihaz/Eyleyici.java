package akilliCihaz;

public class Eyleyici implements IObserver{

    public void SogutucuAc(){
        System.out.println("Sogutucu açıldı...");
    }

    public void SogutucuKapat(){
        System.out.println("Sogutucu kapatıldı...");
    }

    @Override
    public void update() {
        System.out.println("Sıcaklık degeri eyleyiciye gönderildi...");
    }
}
