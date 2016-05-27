package com.mx.restaurante.hibernate;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateUtils {
	
	public Logger logger = Logger.getLogger(this.getClass());
	
	private Session session;
	private Transaction tx;
	
	private void beginOperation() throws HibernateException {
		if(this.session == null || !this.session.isConnected()){
			this.session = HibernateSingleton.getSession();
			this.tx = session.beginTransaction();
		}
    }
	
	public synchronized int save(Serializable instance) {
		
		if(instance == null){
			return -1;
		}
		
		Integer id = null;

		try{
			this.beginOperation();
			id = (Integer) this.session.save(instance);
			this.tx.commit();
		}catch(Exception e){
			logger.error("save has failed", e);
			this.tx.rollback();
		}finally{
			this.session.close();
		}
		
		return id;
	}

	public synchronized void delete(Serializable instance) {
		try {
			this.beginOperation();
			this.session.delete(instance);
			this.tx.commit();
		} catch (Exception re) {
			logger.error("delete has failed", re);
			this.tx.rollback();
		}finally{
			this.session.close();
		}
	}
	
	public synchronized void update(Serializable instance) {
		try {
			this.beginOperation();
			this.session.update(instance);
			this.tx.commit();
		} catch (Exception re) {
			logger.error("update has failed", re);
			this.tx.rollback();
		}finally{
			this.session.close();
		}
		
	}
	
	public synchronized void updateList(List<Serializable> list) {
		try {
			this.beginOperation();
			for(Serializable serializable : list ){
				this.session.update(serializable);
			}
			this.tx.commit();
		} catch (Exception re) {
			logger.error("update list have failed", re);
			this.tx.rollback();
		}finally{
			this.session.close();
		}
	}
	

	public synchronized void saveList(List<Serializable> list) {
		try {
			this.beginOperation();
			for(Serializable serializable : list ){
				this.session.save(serializable);
			}		
			this.tx.commit();
		} catch (Exception re) {
			logger.error("save list have failed", re);
			this.tx.rollback();
		}finally{
			this.session.close();
		}
	}
	
	public synchronized Serializable findById(Class<?> typeClass, java.lang.Integer id) {
		Serializable record = null;
		try {
			this.beginOperation();
			record = (Serializable) this.session.get(typeClass, id);
		}finally{
//			this.session.close();
		}
		return record;
	}
	
	public synchronized Object getObject(String sql){
		Object record = null;
		
		try{
			this.beginOperation();
			Query query = this.session.createQuery(sql);
			record = query.uniqueResult();
		}finally{
			this.session.close();
		}
		
		return record;
	}
	
	public synchronized List<?> getList(String sql){
		List<?> list = null;
		
		try{
			this.beginOperation();
			Query query = this.session.createQuery(sql);
			list = query.list();
		}finally{
			this.session.close();
		}
		
		return list;
	}
	
	
	public void updateQuery(String statement){
		try{
			this.beginOperation();
			Query query = this.session.createQuery(statement);
			query.executeUpdate();
			this.tx.commit();
		}catch(Exception e){
			this.tx.rollback();
		}finally{
			this.session.close();
		}
	}
}
