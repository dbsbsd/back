package com.example.demo.shareapi.dto.response;

import com.example.demo.shareapi.entity.ApprovalStatus;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShareSetApprovalResponseDTO {
    private int id;

    private String title;

//    private String category; // 카테고리 받아온거 넣기

    private LocalDateTime regDate;

    private String userId;

    private List<String> imageUrl;
//    private List<Images> uploadImages;

    private String approvalDate;

    private ApprovalStatus approvalFlag;

    private int commentCount; // 댓글수
}
