package com.sparta.spring_prepare;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter @Setter
public class Memo {

    private final String userName;
    private String contents;
}
