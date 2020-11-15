package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 15; i++) {
            if (i % 15 == 0) {
                stringBuilder.append("WuTang Forever");
            } else if (i % 5 == 0) {
                stringBuilder.append("Tang\n");
            } else if (i % 3 == 0) {
                stringBuilder.append("Wu\n");
            } else {
                stringBuilder.append(i + "\n");
            }
        }
        return stringBuilder.toString();
        }

}