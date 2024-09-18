#1010 다리놓기
#팩토리얼로 조합식을 이용해도 되지만 Dynamic Programming을 써보고 싶었다.
#DP: 앞에 계산식을 미리 배열에 저장하고 이미 저장한것은 그대로 사용하여 연산속도 증가 프로그래밍

num = int(input())
dp = [[0]* 30 for i in range(30)]#2차원 배열 생성
new_list = []
for i in range(30):
    for j in range(30):
        if i == 1:
            dp[i][j] = j
        if i == j:
            dp[i][j] = 1
        elif i < j:
            dp[i][j] = dp[i-1][j-1] + dp[i][j-1]
for i in range(num):
    west, east = map(int, input().split(" "))
    new_list.append(dp[west][east])

for i in range(num):
    print(new_list[i])
