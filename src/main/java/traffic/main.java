package traffic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        TrafficSimulation trafficSim = new TrafficSimulation();
        ArrayList<Log> simLogs = trafficSim.executeSimulation(8640);
        exportTrafficLogsToCSV(simLogs, "src/main/java/traffic/output/" + "trafficSimResult.csv");
    }

    private static void exportTrafficLogsToCSV(ArrayList<Log> logs, String fileLocName){
        File file = new File(fileLocName);
        try {
            FileWriter fw = new FileWriter(file);

            fw.write("time,");
            ArrayList<String> roads = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));
            for (String src: roads){
                for (String dest: roads){
                    fw.write("EO_"+src+"2"+dest+",");
                }
            }
            for (String src: roads){
                for (String dest: roads){
                    fw.write("SI_"+src+"2"+dest+",");
                }
            }
            for (String src: roads){
                for (String dest: roads){
                    fw.write("SO_"+src+"2"+dest+",");
                }
            }
            for (String src: roads){
                for (String dest: roads){
                    fw.write("EI_"+src+"2"+dest+",");
                }
            }
            for (String src: roads){
                for (String dest: roads){
                    fw.write("EP_"+src+"2"+dest+",");
                }
            }
            fw.write("\n");

            for (Log log: logs){
                fw.write(Integer.toString(log.getTime()) + ",");
                for(int i = 0; i < log.getEO().getNumCars().length; i++){
                    fw.write(Integer.toString(log.getEO().getNumCars()[i]) + ",");
                }
                for(int i = 0; i < log.getSI().getMonitoredNumCars().length; i++){
                    if (log.getSI().getMonitoredNumCars()[i] == null){
                        fw.write(",");
                    }
                    else{
                        fw.write(Integer.toString(log.getSI().getMonitoredNumCars()[i]) + ",");
                    }
                }
                for(int i = 0; i < log.getSO().getPlannedSignals().length; i++){
                    if (log.getSO().getPlannedSignals()[i] == null){
                        fw.write(",");
                    }
                    else{
                        fw.write(log.getSO().getPlannedSignals()[i].toString() + ",");
                    }
                }
                for(int i = 0; i < log.getEI().getExecutedSignals().length; i++){
                    if (log.getEI().getExecutedSignals()[i] == null){
                        fw.write(",");
                    }
                    else{
                        fw.write(log.getEI().getExecutedSignals()[i].toString() + ",");
                    }
                }
                for(int i = 0; i < log.getEP().getInflowNumCars().length; i++){
                    fw.write(Integer.toString(log.getEP().getInflowNumCars()[i]) + ",");
                }
                fw.write("\n");
            }

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
