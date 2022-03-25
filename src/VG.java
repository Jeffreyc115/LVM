import java.util.UUID;
import java.util.*;
public class VG extends Power{

    private int storageUsed;
    private ArrayList <Pv> pvs = new ArrayList<Pv>();
    private ArrayList<LV> lvs = new ArrayList<>();

    public VG(String name, String uuid, int storage, Pv pv) {
        super(name, uuid, storage);
        pvs = new ArrayList<>();
        lvs = new ArrayList<>();
        storageUsed = 0;
        pvs.add(pv);
    }

    public void extendVg(Pv pv)
    {

    }

    public boolean addLv(LV lv)
    {
        int lvStore = lv.getStorage();
        if(storageUsed + lvStore > getStorage())
        {
            return false;
        }
        else
        {
            lvs.add(lv);
            storageUsed += lvStore;
            return true;
        }
    }


}


