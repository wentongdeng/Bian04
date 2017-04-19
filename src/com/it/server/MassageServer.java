package com.it.server;

import java.util.List;

import com.it.entity.ExtendMassage;

public interface MassageServer {
	public List<ExtendMassage> getMassage();
	public void receiveMassage();
}
