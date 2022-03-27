public class Lv extends Power{
    private VG volumegroup;

    public Lv(String name, int storage, VG volumegroup) {
        super(name, storage);
        this.volumegroup = volumegroup;
    }

}


