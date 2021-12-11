package compositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends IDirectory {
	
	private List<IDirectory> diretories = new ArrayList<IDirectory>();

	public Directory( String name ) {
		super(name);
	}
	
	@Override
	public void add(IDirectory diretory) {
		this.diretories.add(diretory);
	}
	
	@Override
	public void remove(int id) {
		this.diretories.remove(id);
	}
	
	@Override
	public IDirectory getChild(int id) {
		return diretories.get(id);
	}
	
	@Override
	public boolean hasChildDirectory() {
		for ( IDirectory iDirectory : diretories) {
			if (iDirectory instanceof Directory) {
				return true;
			}
		}
		return false;
	}

	public List<IDirectory> getDiretories() {
		return diretories;
	}
	
	
}
