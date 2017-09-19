package daldal.store.logic;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DaldalSessionFactory {
	private static DaldalSessionFactory instance;
	private static SqlSessionFactory sqlSessionFactory;
	private static final String resource = "mybatis-config.xml";
	
	private DaldalSessionFactory() {
		
	}
	
	public static DaldalSessionFactory getInstance() {
		if(instance == null) {
			instance = new DaldalSessionFactory();
		}
		return instance;
	}
	
	public SqlSession getSession() {
		if(sqlSessionFactory == null) {
			Reader reader = null;
			try {
				reader = Resources.getResourceAsReader(resource);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		}
		
		return sqlSessionFactory.openSession();
	}

}
