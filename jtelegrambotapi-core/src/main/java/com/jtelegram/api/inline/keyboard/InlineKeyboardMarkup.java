package com.jtelegram.api.inline.keyboard;

import com.jtelegram.api.requests.message.framework.ReplyMarkup;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Getter
@Builder
public class InlineKeyboardMarkup implements ReplyMarkup {
    @Singular("keyboard")
    private List<InlineKeyboardRow> inlineKeyboard;
}
