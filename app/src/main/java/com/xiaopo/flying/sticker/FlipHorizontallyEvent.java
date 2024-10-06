package com.xiaopo.flying.sticker;

import com.xiaopo.flying.sticker.AbstractFlipEvent;
import com.xiaopo.flying.sticker.StickerView;

/**
 * @author wupanjie
 */

public class FlipHorizontallyEvent extends AbstractFlipEvent {

  @Override @StickerView.Flip
  protected int getFlipDirection() {
    return StickerView.FLIP_HORIZONTALLY;
  }
}
