package com.levelup.lesson1.task4;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@ToString
public class Note {
    @Getter
    @NonNull
    private String value;
    @Getter
    private int changeCount=0;

    public void setValue(String value) {
        this.value = value;
        changeCount++;
    }
}
