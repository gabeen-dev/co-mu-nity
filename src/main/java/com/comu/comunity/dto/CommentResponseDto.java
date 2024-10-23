package com.comu.comunity.dto;

import com.comu.comunity.model.entity.Comment;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentResponseDto {
    private Long id;
    private Long memberId;
    private String name;
    private String contents;


    public CommentResponseDto(Comment comment) {
        this.id = comment.getId();
        this.memberId = comment.getMemberId();
        this.name = comment.getName();
        this.contents = comment.getContents();
    }
}