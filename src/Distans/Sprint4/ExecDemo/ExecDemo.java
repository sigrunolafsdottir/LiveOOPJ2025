package Distans.Sprint4.ExecDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExecDemo {
    public static void main(String[] args) {
        try {
            // Run the ipconfig command
            Process process = Runtime.getRuntime().exec("ipconfig");

            // Read the command output
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream())
            );

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for the process to finish
            int exitCode = process.waitFor();
            System.out.println("\nCommand exited with code: " + exitCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
