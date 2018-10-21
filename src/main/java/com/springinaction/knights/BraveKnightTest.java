package com.springinaction.knights;

import com.springinaction.quests.Quest;
import static org.mockito.Mockito.*;

import com.springinaction.quests.SlayDragonQuest;
import org.junit.Test;

public class BraveKnightTest {

    @Test
    public void kinghtShouldEmarkOnQuest(){
        Quest mockQuest = mock(SlayDragonQuest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
