package view;

import java.io.IOException;

import controller.NetflixController;
import controller.INetflixController;

public class Main {

	public static void main(String[] args) {
		
		INetflixController arqCont = new NetflixController();
		String dirWin = "C:\\Windows";
		String path = "C:\\TEMP";
		String nome = "netflixSeries";
		
		try {
			arqCont.readDir(dirWin);
			arqCont.createFile(path, nome);
			arqCont.readFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
