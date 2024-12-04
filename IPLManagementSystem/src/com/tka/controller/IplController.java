package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IplService;
import com.tka.utility.IplUtility;

public class IplController {
	public List<Player> getAllPlayerController() {
		IplService service = new IplService();
		List<Player> team = service.getAllPlayerService();
		return team;
	}

	public List<Player> getAllCSKPlayers() {
		IplService service = new IplService();
		List<Player> db = service.getAllCSKPlayers();
		return db;

	}

	public List<Player> getAllMIPlayers() {
		IplService service = new IplService();
		List<Player> db = service.getAllMIPlayers();
		return db;

	}

	public List<Player> getAllRCBPlayers() {
		IplService service = new IplService();
		List<Player> db = service.getAllRCBPlayers();
		return db;

	}

	public List<Player> getOneBPlayers() {
		IplService service = new IplService();
		List<Player> db = service.getOnePlayer();
		return db;

	}

	public List<Player> getPlayerByRuns() {
		IplService service = new IplService();
		List<Player> db = service.getPlayerByRuns();
		return db;

	}

	public List<Player> getAllBatters() {
		IplService service = new IplService();
		List<Player> batter = service.getAllBatters();
		return batter;

	}

	public List<Player> getAllBowler() {
		IplService service = new IplService();
		List<Player> bowler = service.getAllBowler();
		return bowler;

	}

	public List<Player> getAllAllrounder() {
		IplService service = new IplService();
		List<Player> rounder = service.getAllAllrounderPlayer();
		return rounder;

	}

	public List<Player> getRNames() {
		IplService service = new IplService();
		List<Player> names = service.getRNames();
		return names;

	}

	public Player getPlayerByJerseyNoController(int jn) {
		boolean player = IplUtility.checkJerseyNoUtility(jn);
		if (player) {
			IplService service = new IplService();
			Player ps = service.getPlayerByJerseyNoService(jn);
			return ps;
		}
		return null;
	}

	public Player deletePlayer(int jn) {
		boolean player = IplUtility.checkJerseyNoUtility(jn);
		if (player) {
			IplService service = new IplService();
			Player ps = service.deletPlayer(jn);
			return ps;
		}
		return null;
	}
	
	public Player insertPlayer() {
		IplService service = new IplService();
		Player ps = service.insertPlayer();
		return ps;
		
	}
	
	public Player updatePlayer(int jn) {
		IplService service = new IplService();
		Player ps = service.updatePlayer(jn);
		return ps;
		
	}

}
