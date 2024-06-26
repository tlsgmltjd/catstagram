package com.example.catstagram.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
public class LikesId implements Serializable {
    private Long user;
    private Long cat;
}
