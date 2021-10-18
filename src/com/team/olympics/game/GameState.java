package com.team.olympics.game;

public enum GameState {
    NOT_STARTED, ON_PROCESS, FINISHED;

    @Override
    public String toString()
    {
       switch (this)
       {
           case NOT_STARTED:
           {
               return "Game not started!";
           }
           case ON_PROCESS:
           {
               return "Game running...";
           }
           case FINISHED:
           {
               return "Game has finished.";
           }
           default:
           {
               return "";
           }
       }
    }
}
