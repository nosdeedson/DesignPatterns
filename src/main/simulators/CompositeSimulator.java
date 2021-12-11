package main.simulators;

import java.util.Iterator;

import compositePattern.Directory;
import compositePattern.File;
import compositePattern.IDirectory;

public class CompositeSimulator {

	private  Directory directory;
		
	public CompositeSimulator(Directory directory) {
		this.directory = directory;
	}

	public void create() {
		
		directory.add( new File("imagem 1", "imagem"));
		
		directory.add(new Directory("fotos férias"));
		
		directory.getChild(1).add(new File("imagem 2", "imagem"));
		directory.getChild(1).add(new File("imagem 3", "imagem 1"));
		directory.getChild(1).add(new File("iamgem 4", "imagem 2"));
		
		directory.add(new Directory("documentos"));
		directory.getChild(2).add(new File("name doc 1", "artigo.doc"));
		directory.getChild(2).add(new File("name doc 2", "artigo2.doc"));
		
	}
	
	public void printNamesFiles(Directory directory) {
		for (IDirectory direc: directory.getDiretories()) {
			if( direc instanceof Directory) {
				this.printNamesFiles((Directory)direc);
				System.out.println(direc.getName());
			}else {
				System.out.println(((File)direc).getName());
				((File)direc).action();
			}
		}
	}
}
