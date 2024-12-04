package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.PlayerDao;
import com.tka.entity.Player;

public class IplService {
	public List<Player> getAllPlayerService() {
		PlayerDao dao = new PlayerDao();
		List<Player> team = dao.getAllPlayer();
		return team;

	}

//CSK Team
	public List<Player> getAllCSKPlayers() {

		PlayerDao dao = new PlayerDao();
		List<Player> db = dao.getAllPlayer();
		List<Player> csk = new ArrayList<Player>();
		for (Player p1 : db) {
			if ("CSK".equals(p1.getTeamName())) {
				csk.add(p1);
			}
		}
		return csk;

	}

	// MI Team
	public List<Player> getAllMIPlayers() {

		PlayerDao dao = new PlayerDao();
		List<Player> db = dao.getAllPlayer();
		List<Player> mi = new ArrayList<Player>();
		for (Player p1 : db) {
			if ("MI".equals(p1.getTeamName())) {
				mi.add(p1);
			}
		}
		return mi;

	}

	// RCB Team
	public List<Player> getAllRCBPlayers() {

		PlayerDao dao = new PlayerDao();
		List<Player> db = dao.getAllPlayer();
		List<Player> rcb = new ArrayList<Player>();
		for (Player p1 : db) {
			if ("RCB".equals(p1.getTeamName())) {
				rcb.add(p1);
			}
		}
		return rcb;

	}

	public List<Player> getOnePlayer() {
		PlayerDao dao = new PlayerDao();
		List<Player> db = dao.getAllPlayer();
		List<Player> team = new ArrayList<Player>();
		for (Player p1 : db) {
			if (p1.getJerseyNo() == 7) {
				team.add(p1);
			}
		}
		return team;
	}

	public List<Player> getPlayerByRuns() {
		PlayerDao dao = new PlayerDao();
		List<Player> db = dao.getAllPlayer();
		List<Player> team = new ArrayList<Player>();
		for (Player p1 : db) {
			if (p1.getRuns() > 5000) {
				team.add(p1);
			}
		}
		return team;
	}

	public List<Player> getAllBatters() {
		PlayerDao dao = new PlayerDao();
		List<Player> db = dao.getAllPlayer();
		List<Player> batters = new ArrayList<Player>();
		for (Player pl : db) {
			if (pl.getRuns() >= 2000) {
				batters.add(pl);
			}
		}
		return batters;
	}

	public List<Player> getAllBowler() {
		PlayerDao dao = new PlayerDao();
		List<Player> db = dao.getAllPlayer();
		List<Player> bowler = new ArrayList<Player>();
		for (Player pl : db) {
			if (pl.getWicket() >= 100) {
				bowler.add(pl);
			}
		}
		return bowler;
	}

	public List<Player> getAllAllrounderPlayer() {
		PlayerDao dao = new PlayerDao();
		List<Player> db = dao.getAllPlayer();
		List<Player> rounder = new ArrayList<Player>();
		for (Player pl : db) {
			if (pl.getWicket() >= 100 && pl.getRuns() >= 2000) {
				rounder.add(pl);
			}
		}
		return rounder;
	}

	public List<Player> getRNames() {
		PlayerDao dao = new PlayerDao();
		List<Player> db = dao.getAllPlayer();
		List<Player> name = new ArrayList<Player>();
		for (Player pl : db) {
			if (pl.getName().startsWith("R")) {
				name.add(pl);
			}
		}
		return name;
	}

	public Player getPlayerByJerseyNoService(int jn) {
		PlayerDao dao = new PlayerDao();
		Player player = dao.getPlayerByJerseyNo(jn);
		return player;
	}

	public Player deletPlayer(int jn) {
		PlayerDao dao = new PlayerDao();
		Player player = dao.deletePlayer(jn);
		return player;
	}

	public Player insertPlayer() {
		PlayerDao dao = new PlayerDao();
		Player player = dao.insertPlayer();
		return player;
	}

	public Player updatePlayer(int jn) {
		PlayerDao dao = new PlayerDao();
		Player player = dao.updatePlayer(jn);
		return player;
	}

}
