package com.company;

import java.util.ArrayList;

public class FootballCoach {
    private ArrayList<String> m_activePlayers;
    private ArrayList<String> m_benchPlayers;
    private String m_playersFormation;

    public FootballCoach() {
        m_activePlayers.add("A");
        m_activePlayers.add("B");
        m_activePlayers.add("C");
        m_benchPlayers.add("P");
        m_benchPlayers.add("W");
        m_benchPlayers.add("V");

    }

    public String sendPlayerToBench(String player) {
        for (int i = 0; i < m_activePlayers.size(); i++) {
            boolean p = m_activePlayers.contains(player);
            if (p = true) {
                m_activePlayers.remove(player);
                m_benchPlayers.add(player);
            } else
                throw new InvalidCoachAction(
                        String.format("There is no player in active team", player));
        }return player;
    }

    public void sendPlayerToField(String player) {
        for (int i = 0; i < m_benchPlayers.size(); i++) {
            boolean p = m_benchPlayers.contains(player);
            if (p = true) {
                m_benchPlayers.remove(player);
                m_activePlayers.add(player);
            } else
                throw new InvalidCoachAction(
                        String.format("There is no player on the bench", player));

        }
    }

    public void changePlayerFormation ( String form){
       if (m_activePlayers.size()>=11){
           m_activePlayers.add(form);}
       else throw new NotEnougthPlayersException (String.format("Not enougth players", form));
       }
    }

