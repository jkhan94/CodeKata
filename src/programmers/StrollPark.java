package programmers;

public class StrollPark {
    public static void main(String[] args) {
        String[] park ={"OOOOO", "OOOOO", "OOSOO", "OOOOO", "OOOOO"};
        String[] routes ={"E 3", "W 3", "S 3", "N 3", "E 2", "E 1", "W 4", "W 1", "S 2", "S 1", "N 4", "N 1"};
        int[] answer = new int[2];
        int num = 0;
        boolean isX = false;
        int x=0;
        int y=0;

        // S 위치
        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
                break;
            }
        }
        System.out.println(answer[0] + " " + answer[1]);

        for (int i = 0; i < routes.length; i++) {
            isX = false;
            x= answer[0];
            y=answer[1];
            num = Character.getNumericValue(routes[i].charAt(2));
            switch (routes[i].charAt(0)) {
                case 'E':
                    if( y + num >= park[0].length() || y + num < 0) {
                        break;
                    }
                    for (int j = 0; j < num; j++) {
                        if (x>=0 && park[x].charAt(++y) == 'X') {
                            isX = true;
                            break;
                        }
                    }

                    if (!isX) {
                        answer[1] += num;
                    }
                    break;
                case 'W':
                    if (y - num >= park[0].length() || y - num < 0) {
                        break;
                    }
                    for (int j = 0; j < num; j++) {
                        if (x>=0 && park[x].charAt(--y) == 'X') {
                            isX = true;
                            break;
                        }
                    }

                    if (!isX) {
                        answer[1] -= num;
                    }
                    break;
                case 'S':
                    if (x + num >= park[0].length() || x + num < 0) {
                        break;
                    }
                    for (int j = 0; j < num; j++) {
                        if (x+1>=0 && park[++x].charAt(y) == 'X') {
                            isX = true;
                            break;
                        }
                    }

                    if (!isX) {
                        answer[0] += num;
                    }
                    break;
                case 'N':
                    if (x - num >= park[0].length() || x - num < 0) {
                        break;
                    }
                    for (int j = 0; j < num; j++) {
                        if (x-1>=0 && park[--x].charAt(y) == 'X') {
                            isX = true;
                            break;
                        }
                    }

                    if (!isX) {
                        answer[0] -= num;
                    }
                    break;
            }
            System.out.println(answer[0] + " " + answer[1]);
        }
    }
}
