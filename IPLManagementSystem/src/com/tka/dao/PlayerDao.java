package com.tka.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;
import com.tka.utility.IplUtility;

public class PlayerDao {

	String driver = "com.mysql.cj.jdbc.Driver";
	Connection con = null;
	String url = "jdbc:mysql://localhost:3306/ipldb";
	String uname = "root";
	String pwd = "Mahek";
	Statement sta = null;
	ResultSet rs = null;

	public List<Player> getAllPlayer() {

		List<Player> db = new ArrayList<Player>();

		try {
			IplUtility.loadDriverUtility(driver);
			con = IplUtility.getConnectionUtility(url, uname, pwd);
			sta = IplUtility.createStatementUtility(con);
			String sql = "select * from ipldb.player";
			rs = IplUtility.resultSetUtility(sta, sql);

			while (rs.next()) {
				int jn = rs.getInt("jerseyNo");
				String n = rs.getString("name");
				int r = rs.getInt("runs");
				int w = rs.getInt("Wicket");
				String tn = rs.getString("teamName");
				Player p1 = new Player(jn, n, r, w, tn);
				db.add(p1);
			}

		} catch (Exception e) {
			System.out.println("Plz Check UserName or Password......");
		}
		return db;
	}

	public Player getPlayerByJerseyNo(int jn) {
		Player obj=null;
		try {
			IplUtility.loadDriverUtility(driver);
			con = IplUtility.getConnectionUtility(url, uname, pwd);
			sta = IplUtility.createStatementUtility(con);
			String sql = "select * from ipldb.player where JerseyNo=" + jn;
			rs = IplUtility.resultSetUtility(sta, sql);
			if (rs.next()) {
				int jn1 = rs.getInt("jerseyNo");
				String n = rs.getString("name");
				int r = rs.getInt("runs");
				int w = rs.getInt("Wicket");
				String tn = rs.getString("teamName");
				obj = new Player(jn1, n, r, w, tn);
			} else {
				return null;
			}

		} catch (Exception e) {
			System.out.println("Plz check Uname Or Password");
			e.printStackTrace();

		}
		return obj;
	}

	public Player deletePlayer(int jn) {
		try {
			IplUtility.loadDriverUtility(driver);
			con = IplUtility.getConnectionUtility(url, uname, pwd);
			sta = IplUtility.createStatementUtility(con);
			String sql = "delete from ipldb.player where jerseyNo=" + jn;
			int ii = IplUtility.executeUpadateUtility(sta, sql);

		} catch (Exception e) {
			System.out.println("Plz check Uname Or Password");
			e.printStackTrace();

		}
		return null;
	}

	public Player insertPlayer() {
		try {
			IplUtility.loadDriverUtility(driver);
			con = IplUtility.getConnectionUtility(url, uname, pwd);
			sta = IplUtility.createStatementUtility(con);
			String sql = "Insert into ipldb.player Values(73,'Siraj',1000,300,'RCB')";
			int ii = IplUtility.executeUpadateUtility(sta, sql);

		} catch (Exception e) {
			System.out.println("Plz check Uname Or Password");
			e.printStackTrace();

		}

		return null;
	}

	public Player updatePlayer(int jn) {
		try {
			IplUtility.loadDriverUtility(driver);
			con = IplUtility.getConnectionUtility(url, uname, pwd);
			sta = IplUtility.createStatementUtility(con);
			String sql = "update ipldb.player set name='Arjun' where jerseyNo=" + jn;
			int ii = IplUtility.executeUpadateUtility(sta, sql);
			// System.out.println(ii);

		} catch (Exception e) {
			System.out.println("Plz check Uname Or Password");
			e.printStackTrace();

		}
		return null;
	}

}
