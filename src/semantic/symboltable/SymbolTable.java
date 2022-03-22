package semantic.symboltable;

import java.util.*;
import ast.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;

	public SymbolTable()  {
		table = new ArrayList<Map<String, Definition>>();
		table.add(new HashMap<String, Definition>());
	}

	public void set() { //nueva scope
		table.add(new HashMap<String, Definition>());
		scope++;
	}
	
	public void reset() {
		table.remove(scope);
		scope--;
	}
	
	public boolean insert(Definition definition) { //en cada nueva functionDefinition
		if (table.get(scope).containsKey(definition.getName())) return false;

		definition.setScope(scope);
		table.get(scope).put(definition.getName(), definition);

		return true;
	}
	
	public Definition find(String id) {
		for (int i = scope; i >= 0; i--) {
			if (table.get(i).containsKey(id)) return table.get(i).get(id);
		}

		return null;
	}

	public Definition findInCurrentScope(String id) {
		return table.get(scope).get(id);
	}
}

//funcdefs: insert(f) set insert(params) {
//en var access link con definition (find)
//} reset
