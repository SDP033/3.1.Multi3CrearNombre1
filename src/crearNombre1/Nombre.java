package crearNombre1;

import java.io.IOException;

public class Nombre {

	public static void main(String[] args) throws IOException {

		if (args.length == 0) {

			System.out.println(-1);
			System.exit(-1);
		} else {
			try {
				Double i = Double.parseDouble(args[0]);
				if (i % 1 != 0) {
					System.out.println(-2);
					System.exit(-2);
				} else {
					System.out.println(0);
					System.exit(0);
				}

			} catch (Exception e) {
				System.out.println("No has escrito un numero");

				System.out.println(-3);
				System.exit(-3);
			}
		}

	}

}
