package domain.service;

import java.util.List;
import java.util.Properties;

import domain.db.RepoInMemory;
import domain.model.ModelClass;

public class Service {
	
	private RepoInMemory repository;
	
	public Service(Properties properties) {
		// initiate databases
		repository = new RepoInMemory();
	}

	public void close() {
		// close databases
	}

	public RepoInMemory getRepository() {
		return repository;
	}

	public List<ModelClass> getModels() {
		return this.getRepository().getModels();
	}
}
