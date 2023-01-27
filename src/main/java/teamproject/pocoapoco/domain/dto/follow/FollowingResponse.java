package teamproject.pocoapoco.domain.dto.follow;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import teamproject.pocoapoco.domain.dto.comment.CommentResponse;
import teamproject.pocoapoco.domain.entity.Comment;
import teamproject.pocoapoco.domain.entity.Follow;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class FollowingResponse {

    private String userId;
    private String userName;

    public static FollowingResponse of(Follow follow) {
        return FollowingResponse.builder()
                .userId(follow.getFollowedUser().getUserId())
                .userName(follow.getFollowedUser().getUsername())
                .build();
    }
}