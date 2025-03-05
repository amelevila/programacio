import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class aeropatinVazgen {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String[] cordenadas = read.readLine().split(" ");
		
			int x = Integer.parseInt(cordenadas[0]);
			int y = Integer.parseInt(cordenadas[1]);

			if (x == 0 && y == 0) break;

			String[] taula = new String[x];

			for (int i = 0; i < taula.length; i++) {
				taula[i] = read.readLine();
			}
			if (recorrerTaula(taula, x, y)) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}
	}

	public static boolean recorrerTaula(String[] plaza, int maxX, int maxY) {
		int[] dx = {0,0,1,-1};
		int[] dy = {1,-1,0,0};

		boolean[][] visitado = new boolean[maxX][maxY];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        visitado[0][0] = true;
        
        while (!queue.isEmpty()) {
            int[] actual = queue.remove();
            int x = actual[0];
			int y = actual[1];
            
            if (x == maxX - 1 && y == maxY - 1) return true; // Si arriba a l'equina inferior de la dreta retorna true

            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
				int nextY = y + dy[i];
                if (nextX >= 0 && nextX < maxX && nextY >= 0 && nextY < maxY && !visitado[nextX][nextY] && plaza[nextX].charAt(nextY) == '.') {
                    queue.add(new int[]{nextX, nextY});
                    visitado[nextX][nextY] = true;
                }
            }
        }
        return false;
	}
}