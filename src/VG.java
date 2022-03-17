import java.util.UUID;
import java.util.ArrayList;
public class VG extends PHD{
private int size;
private String uuid;
private <Pv>  ArrayList pvs = new ArrayList<Pv>;

    public VG (String name, int size){
    super(name,size);
        UUID u = UUID.randomUUID();
    this.uuid=u.toString();



            }
        }


