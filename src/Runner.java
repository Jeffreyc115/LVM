import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boss manager = new Boss();
        System.out.println("What do you want to do");
        String input = scan.nextLine();
String [] insert = input.split(" ");
if (insert[0].equals("install-drive"))
{
    if (manager.installDrive(insert[1],Integer.parseInt(insert[2])) == false) System.out.println("ERROR");
    else System.out.println("Drive Installion Successful");
}
if (insert[0].equals("list-drives"))
{
    manager.listDrives();
}
if (insert[0].equals("pvcreate")){
    if (manager.pvcreate(insert[1],insert[2]) == false) System.out.println("ERROR");
    else System.out.println("Physical Volume Creation Successful");

}
if (insert[0].equals("pvlist")){
    manager.pvList();
}
if (insert[0].equals("vgcreate")){
    if (manager.vgCreate(insert[1],insert[2]) == false) System.out.println("ERROR");
    else System.out.println("VG Creation Successful");
}
if (insert[0].equals("vgextend")){
    if (manager.vgExtend(insert[1],insert[2])== false)System.out.println("ERROR");
    else System.out.println("volume group successfully extended");
        }
if (insert[0].equals("vgList")){
    manager.vgList();
}
if (insert[0].equals("lvcreate")) {
    if (manager.lvCreate(insert[1], Integer.parseInt(insert[2]), insert[3]) == false) System.out.println("ERROR");
    else System.out.println("Logical Volume successfully creaed");
}
if(insert[0].equals("lvlist")) {
    manager.lvList();
}
        scan.close();
    }
}

