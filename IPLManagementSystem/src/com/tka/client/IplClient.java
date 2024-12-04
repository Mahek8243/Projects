package com.tka.client;

import com.tka.controller.IplController;
import com.tka.entity.Player;

public class IplClient {
	public static void main(String[] args) {
		IplController controller = new IplController();

//		System.out.println("*****All Players*****");
//		List<Player> team = controller.getAllPlayerController(); // System.out.println(team);
//		for (Player player : team) {
//			System.out.println(player.getJerseyNo() + "========" + player.getName());
//		}
//
//		System.out.println("********CSK Team**********");
//		List<Player> cskteam = controller.getAllCSKPlayers();
//		for (Player player : cskteam) {
//			System.out.println(player.getName());
//		}
//
//		System.out.println("********MI Team**********");
//		List<Player> miteam = controller.getAllMIPlayers();
//		for (Player player : miteam) {
//			System.out.println(player.getName());
//		}
//
//		System.out.println("********RCB Team**********");
//		List<Player> rcbteam = controller.getAllRCBPlayers();
//		for (Player player : rcbteam) {
//			System.out.println(player.getName());
//		}
//
//		System.out.println("********Name of jersey 7 **********");
//		List<Player> jteam = controller.getOneBPlayers();
//		for (Player player : jteam) {
//			System.out.println(player.getName());
//		}
//
//		System.out.println("********Name By Runns **********");
//		List<Player> rteam = controller.getPlayerByRuns();
//		for (Player player : rteam) {
//			System.out.println(player.getName());
//		}
//
//		System.out.println("********All Batters **********");
//		List<Player> batters = controller.getAllBatters();
//		for (Player player : batters) {
//			System.out.println(player.getName() + "          " + player.getJerseyNo() + "       " + player.getRuns());
//		}
//
//		System.out.println("********All Bowler **********");
//		List<Player> bowler = controller.getAllBowler();
//		for (Player player : bowler) {
//			System.out.println(player.getName() + "          " + player.getJerseyNo() + "       " + player.getRuns());
//		}
//
//		System.out.println("********All All-rounder **********");
//		List<Player> rounder = controller.getAllAllrounder();
//		for (Player player : rounder) {
//			System.out.println(player.getName() + "        " + player.getRuns() + "         " + player.getWicket());
//		}
//
//		System.out.println("********Names Start with R **********");
//		List<Player> name = controller.getRNames();
//		for (Player player : name) {
//			System.out.println(player.getName());
//		}

		System.out.println("*****Player Name****** ");
		Player player = controller.getPlayerByJerseyNoController(45);
		System.out.println(player);

		System.out.println("***** Delete Player****** ");
		Player delete = controller.deletePlayer(1);
		System.out.println(delete);

//		System.out.println("***** Insert Player****** ");
//		Player insert = controller.insertPlayer();
//		System.out.println(insert);

		System.out.println("***** Update Player****** ");
		Player update = controller.updatePlayer(77);
		System.out.println(update);
	}

}
