package com.minatodattebayo.gittestapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.http.ResponseEntity;
import com.vs.rappit.base.factory.InstanceFactory;
import com.minatodattebayo.gittestapp.base.controller.TableBaseController;
import com.minatodattebayo.gittestapp.service.ITableService;
import com.minatodattebayo.gittestapp.service.TableService;
import com.minatodattebayo.gittestapp.model.Table;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rest/tables/", produces = "application/json")
public class TableController extends TableBaseController<ITableService<Table>, Table> {
	private static XLogger LOGGER = XLoggerFactory.getXLogger(TableController.class);
	public TableController(TableService tableService) {
		super(tableService);
	}
}
