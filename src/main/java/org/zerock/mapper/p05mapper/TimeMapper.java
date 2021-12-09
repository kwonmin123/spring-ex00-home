package org.zerock.mapper.p05mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	@Select("SELECT NOW()")
	public String getTime();
	
	@Select("SELECT LastName FROM Employees WHERE EmployeeID = 1")
	public String getEmployeeNameID1();
}