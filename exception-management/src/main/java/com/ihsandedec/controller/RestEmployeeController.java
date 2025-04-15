package com.ihsandedec.controller;

import com.ihsandedec.dto.DtoEmployee;
import com.ihsandedec.model.RootEntity;

public interface RestEmployeeController {

	public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
