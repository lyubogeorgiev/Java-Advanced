import java.util.*;

public class Ex10Robotics {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        Deque<String> assemblyLine = new ArrayDeque<>();
        Deque<String> robotsLine = new ArrayDeque<>();

        Map<String, Long[]> robotsMap = new HashMap<>();

        String[] robotsInput = scanner.nextLine().split(";");
        String[] startTimeTokens = scanner.nextLine().split(":");

        int parsedHours = Integer.parseInt(startTimeTokens[0]) * 3600;
        int parsedMinutes = Integer.parseInt(startTimeTokens[1]) * 60;
        int parsedSeconds = Integer.parseInt(startTimeTokens[2]);

        long currentTime = parsedHours + parsedMinutes + parsedSeconds;

        for (String robot : robotsInput) {
            String[] robotTokens = robot.split("-");

            String robotName = robotTokens[0];
            long robotProcessingTime = Integer.parseInt(robotTokens[1]);

            robotsMap.put(robotName, new Long[2]);
            robotsMap.get(robotName)[0] = robotProcessingTime;
            robotsMap.get(robotName)[1] = currentTime;

            robotsLine.offer(robotName);
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String material = input;

            assemblyLine.offer(material);

            input = scanner.nextLine();
        }

        while (!assemblyLine.isEmpty()) {
            currentTime++;

            String currentDetail = assemblyLine.poll();
            boolean isDetailTaken = false;

            for (int i = 0; i < robotsLine.size(); i++){

                String currentRobot = robotsLine.poll();

                robotsLine.offer(currentRobot);

                if (robotsMap.get(currentRobot)[1] <= currentTime){
                    // the current robot takes the job and gets busy for certain time and get back on the queue
                    robotsMap.get(currentRobot)[1] = currentTime + robotsMap.get(currentRobot)[0];


                    long hour = currentTime / 3600;
                    long min = (currentTime % 3600) / 60;
                    long sec = (currentTime % 3600) % 60;

                    isDetailTaken = true;

                    System.out.printf("%s - %s [%02d:%02d:%02d]%n", currentRobot, currentDetail, hour, min, sec);
                    break;
                }
            }

            if (!isDetailTaken){
                assemblyLine.offer(currentDetail);
            }
        }
    }
}