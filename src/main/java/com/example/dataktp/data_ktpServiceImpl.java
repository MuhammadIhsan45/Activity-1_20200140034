package com.example.dataktp;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class data_ktpServiceImpl implements data_ktpService {

	private data_ktpRepository repo;
	
	public data_ktpServiceImpl(data_ktpRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<data_ktp> getAllKtp() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}

	

}
