package com.lsgaming.app1.blazingherogameofficial;

public class GameOverResult {
    OfflineGamePlay offlineGamePlay = new OfflineGamePlay();
    void calculationResult(){
        if (offlineGamePlay.blueplace1 && offlineGamePlay.blueplace2 && offlineGamePlay.blueplace3 && offlineGamePlay.blueplace4 && offlineGamePlay.blueplace5)
        {
            System.out.println("Blue player won the game");
        }

        if (offlineGamePlay.redplace1 && offlineGamePlay.redplace2 && offlineGamePlay.redplace3 && offlineGamePlay.redplace4 && offlineGamePlay.redplace5)
        {
            System.out.println("Red player won the game");

        }
    }
}
