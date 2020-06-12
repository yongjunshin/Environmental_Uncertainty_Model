package smarthome;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        smarthomeSimulation smarthomeSim = new smarthomeSimulation();
        ArrayList<Log> simLogs = smarthomeSim.executeSimulation(1248);
        exportSmartHomeLogsToCSV(simLogs, "src/main/java/smarthome/output/" + "smarthomeSimResult.csv");
    }

    private static void exportSmartHomeLogsToCSV(ArrayList<Log> logs, String fileLocName){
        File file = new File(fileLocName);
        try {
            FileWriter fw = new FileWriter(file);

            fw.write("time, EO_temp, EO_humi, SI_temp, SI_humi, SO_temp, SO_humi, EI_temp, EI_humi, EP_temp, EP_humi\n");

            for (Log log: logs){
                fw.write(Integer.toString(log.getTime()) + ",");
                fw.write(Double.toString(log.getEO().getIndoorTemperature()) + ",");
                fw.write(Double.toString(log.getEO().getIndoorHumidity()) + ",");

                if(log.getSI().getMonitoredTemperature() == null){
                    fw.write(",");
                }
                else{
                    fw.write(Double.toString(log.getSI().getMonitoredTemperature()) + ",");
                }
                if(log.getSI().getMonitoredHumidity() == null){
                    fw.write(",");
                }
                else {
                    fw.write(Double.toString(log.getSI().getMonitoredHumidity()) + ",");
                }

                if(log.getSO().getTemperatureControl() == null){
                    fw.write(",");
                }
                else{
                    fw.write(Double.toString(log.getSO().getTemperatureControl()) + ",");
                }
                if(log.getSO().getHumidityControl() ==null){
                    fw.write(",");
                }
                else {
                    fw.write(Double.toString(log.getSO().getHumidityControl()) + ",");
                }

                fw.write(Double.toString(log.getEI().getExecutedTemperatureControl()) + ",");
                fw.write(Double.toString(log.getEI().getExecutedHumidityControl()) + ",");
                fw.write(Double.toString(log.getEP().getOutdoorTemperature()) + ",");
                fw.write(Double.toString(log.getEP().getOutdoorHumidity()) + "\n");
            }


            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
