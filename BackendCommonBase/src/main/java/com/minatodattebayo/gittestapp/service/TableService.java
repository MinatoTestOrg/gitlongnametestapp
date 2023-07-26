package com.minatodattebayo.gittestapp.service;

import com.vs.rappit.base.acl.IPerimeterManager;
import com.minatodattebayo.gittestapp.base.service.TableBaseService;
import com.minatodattebayo.gittestapp.model.Table;
import com.minatodattebayo.gittestapp.service.TablePerimeterImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service("Table")
public class TableService extends TableBaseService<Table> implements ITableService<Table>{

		@Autowired
		private  TablePerimeterImpl  tablePerimeterImpl;

		public TableService(ChangelogService changelogService) {
		super(Table.class);	
		setChangelogService(changelogService); 
		
	}
	
	
	protected IPerimeterManager<Table> getPerimeterManager() {
		return tablePerimeterImpl;
	}
}