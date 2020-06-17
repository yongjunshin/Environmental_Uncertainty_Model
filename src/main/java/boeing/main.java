package boeing;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BoeingSimulation boeingSim = new BoeingSimulation();
        ArrayList<Log> simLogs = boeingSim.executeSimulation(40);
        exportSmartHomeLogsToCSV(simLogs, "src/main/java/boeing/output/" + "BoeingSimResult.csv");
    }

    private static void exportSmartHomeLogsToCSV(ArrayList<Log> logs, String fileLocName){
        File file = new File(fileLocName);
        try {
            FileWriter fw = new FileWriter(file);

            fw.write("time, EO_angle, SI_angle, SO_control, EI_control\n");

            for (Log log: logs){
                fw.write(Integer.toString(log.getTime()) + ",");
                fw.write(Double.toString(log.getEO().getAngleOfAttack()) + ",");

                if(log.getSI().getMonitoredAngleOfAttack() == null){
                    fw.write(",");
                }
                else{
                    fw.write(Double.toString(log.getSI().getMonitoredAngleOfAttack()) + ",");
                }

                if(log.getSO().getPlannedNoseControl() == null){
                    fw.write(",");
                }
                else{
                    fw.write(log.getSO().getPlannedNoseControl().toString() + ",");
                }

                fw.write(Double.toString(log.getEI().getExecutedNoseControl()) + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
