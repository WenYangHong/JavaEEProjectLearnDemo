package com.hongwenyang.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.hongwenyang.dao.StudentDao;
import com.hongwenyang.domain.Student;
import com.hongwenyang.service.StudentService;
// 业务逻辑
public class StudentServiceImpl implements StudentService {

	public List<Student> findAll() throws SQLException {
		
		StudentDao studentDao = new StudentDaoImpl();
		
		return studentDao.findAll();
	}

	public void insert(Student student) throws SQLException {
		StudentDao studentDao = new StudentDaoImpl();
		
		studentDao.insert(student);
	}

	public void del(int id) throws SQLException {
		StudentDao studentDao = new StudentDaoImpl();
		
		studentDao.del(id);
	}

	public Student findFirst(int id) throws SQLException {
		StudentDao sDao = new StudentDaoImpl();
		return sDao.findFirst(id);
	}

	public void update(Student student) throws SQLException {
		StudentDao studentDao = new StudentDaoImpl();
		
		studentDao.update(student);
	}

	public void updateWithid(int id, Student student) throws SQLException {
		StudentDao studentDao = new StudentDaoImpl();
		studentDao.updateWithid(id, student);
	}

	public List<Student> findWithSearch(String name) throws SQLException {
		StudentDao studentDao = new StudentDaoImpl();
		return studentDao.findWithSearch(name);
	}

	public List<Student> findWithSearchs(String name, String gender) throws SQLException {
		StudentDao studentDao = new StudentDaoImpl();
		return studentDao.findWithSearchs(name, gender);
	}

}