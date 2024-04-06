package src.lang.object.equals;

import java.util.Objects;

public class UserV2{
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user = (UserV2) obj;
//        return id.equals(user.id);
//    }

/*
정확한 equals 구현은 위 구현보다 복잡함.
아래 규칙을 따른다.
반사어 : 자기자신과 동등해야 함
대칭성 : 두 객체는 서로 동일해야 함
추이성 : a == b 이면서 b == c일 때 a == c 가능해야 함
일관성 : 객체 상채가 변경되지 않으면 항상 동일 값 반환
null 비교 = null 과 비교는 항상 false
 */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }
}
