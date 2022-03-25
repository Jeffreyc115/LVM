public class Pv extends Power{
    private PHD drive;
    private VG volumeGroup;

    public Pv(String name, String uuid, int storage, PHD drive) {
        super(name, uuid, storage);
        this.drive = drive;
    }


    public PHD getDrive() {
        return drive;
    }

    public VG getVolumeGroup() {
        return volumeGroup;
    }

    public boolean hasVg()
    {
        return volumeGroup != null;
    }
}
