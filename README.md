# ShimPyoo-Android

<br>

# 커밋 및 브랜치, 이슈 규칙 (Commit, Branch, and Issue Convention)


## ✉️ 커밋 태그 설명

| 태그 이름     | 설명 |
|--------------| --- |
| **[chore]**  | 코드 수정, 내부 파일 수정 |
| **[feat]**   | 새로운 기능 구현 |
| **[fix]**    | 버그, 오류 해결 |
| **[docs]**   | 문서 수정 (예: README, WIKI 등) |
| **[style]**  | 코드 스타일 변경 (포매팅, 화이트스페이스 등) |
| **[refactor]** | 코드 리팩토링 |
| **[test]**   | 테스트 코드 추가/수정 |
| **[build]**  | 빌드 관련 파일 수정 (예: build.gradle) |
| **[perf]**   | 성능을 향상시키는 코드 변경 |
| **[ci]**     | CI 설정 파일 및 스크립트 변경 (예: GitHub Actions, CircleCI 등) |
| **[hotfix]** | 긴급 버그 수정 |

<br>

## 📌 커밋 규칙

1. **마이크로 커밋 (Micro Commit)** ✨
   - 작은 단위로 자주 커밋하기!

2. **이해하기 쉽게 작성**
   - 커밋 메시지는 명확하고 이해하기 쉽게 작성하기

3. **커밋 형식**
   - 태그. 해당 기능 설명 `예: [feat] 로그인 기능 추가`

4. **깃모지 사용**
   - 가독성을 높이기 위해 깃모지 사용하기

<br><br>

## 🌿 브랜치 규칙

1. **메인 브랜치 (main)**
   - 항상 배포 가능한 상태를 유지하기!
   - 직접 커밋하지 않기 🔥

2. **개발 브랜치 (dev)**
   - 새로운 기능과 버그 수정을 위한 기본 브랜치

3. **기능 브랜치 (feature)**
   - 새로운 기능을 개발 시 사용
   - 네이밍 규칙: `feature/기능-이름`

4. **버그 수정 브랜치 (fix)**
   - 버그를 수정할 때 사용
   - 네이밍 규칙: `fix/버그-이름`

5. **브랜치 병합**
   - PR(Pull Request)을 통해서만 병합하기
   - 테스트를 통과한 브랜치는 병합 후, 삭제 🔥

<br><br>

## 🛠️ 이슈 규칙

1. **이슈 제목**
   - 간결하고 명확하게 작성
   - 예: `로그인 페이지 버그 수정`

2. **이슈 내용**
   - 버그 재현 방법, 기대 결과, 실제 결과, 스크린샷 등을 포함하여 상세히 작성

3. **라벨 사용**
   - 이슈 유형에 따라 적절한 라벨 사용

4. **이슈 할당**
   - 담당자를 지정하기

5. **이슈 닫기**
   - 해당 이슈가 해결되면 PR과 함께 이슈 닫기
   - 이슈 닫기 메시지를 통해 해결 방법 간략히 설명
