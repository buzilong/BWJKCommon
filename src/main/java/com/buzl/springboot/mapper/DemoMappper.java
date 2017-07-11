package com.buzl.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.buzl.springboot.db.model.Demo;

public interface DemoMappper {
	
	@Select("select * from demo where name like CONCAT(#{name},'%' )")
	public List<Demo> likeName(String name);

	@Select("select * from demo where id = #{id}")
	public Demo getById(long id);

	@Select("select name from demo where id = #{id}")

	public String getNameById(long id);
}
