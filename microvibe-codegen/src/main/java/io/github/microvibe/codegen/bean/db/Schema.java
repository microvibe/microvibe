package io.github.microvibe.codegen.bean.db;

import java.util.Map;

import io.github.microvibe.util.castor.annotation.XComplexKey;
import io.github.microvibe.util.castor.annotation.XComplexType;
import io.github.microvibe.util.castor.annotation.XName;
import io.github.microvibe.util.collection.IgnoreCaseLinkedHashMap;

public class Schema   {

	String name;
	@XName("table")
	@XComplexType(Table.class)
	@XComplexKey("name")
	Map<String, Table> tables = new IgnoreCaseLinkedHashMap<String, Table>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Table> getTables() {
		return tables;
	}

	public void setTables(Map<String, Table> tables) {
		this.tables = tables;
	}

}
