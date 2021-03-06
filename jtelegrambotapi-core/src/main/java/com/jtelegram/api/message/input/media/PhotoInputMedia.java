package com.jtelegram.api.message.input.media;

import com.jtelegram.api.message.input.file.InputFile;
import lombok.Builder;

public class PhotoInputMedia extends InputMedia {
    @Builder
    public PhotoInputMedia(InputFile media, String caption) {
        super(InputMediaType.PHOTO, media, caption);
    }
}
