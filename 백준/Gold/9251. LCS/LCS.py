#dp lcs(longest common subsequence)
#2차원 테이블을 그린 후 마지막 xi와 yj의 값이 같을 때는 xi-1,yj-1에 마지막 값이 같을경우 lcs +1
#마지막 값이 서로 다를 때는 하나씩 줄여가며 xi-1과 yj비교, xi와 yj-1비교 후 max값을 xi,yj에 적기
import sys
input = sys.stdin.readline

x = input().strip()
y = input().strip()
#input()만쓰면 개행문자 \n도 포함되므로 .strip()을 써서 개행문자를 꼭 제거해주기
dp = [[0] * (len(y)+1) for _ in range(len(x)+1)]

for i in range(1,len(x)+1):
    for j in range(1,len(y)+1):
        if (x[i-1] == y[j-1]):
            dp[i][j] = dp[i-1][j-1]+1
        else:
            dp[i][j] = max(dp[i][j-1], dp[i-1][j])

print(dp[-1][-1])

