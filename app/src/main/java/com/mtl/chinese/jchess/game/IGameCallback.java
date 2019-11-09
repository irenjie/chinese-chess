package com.mtl.chinese.jchess.game;

public interface IGameCallback {

    void postPlaySound(int soundIndex);

    void postShowMessage(String message);

    void postShowMessage(int messageId);

    void postStartThink();

    void postEndThink();
}
