package com.jtelegram.api.events.message;

import com.jtelegram.api.TelegramBot;
import com.jtelegram.api.message.impl.GameMessage;

public class GameMessageEvent extends MessageEvent<GameMessage> {
    public GameMessageEvent(TelegramBot bot, GameMessage message) {
        super(bot, message);
    }
}
