#1427 소트 인사이드
#내림차순 정렬문제
num = list(map(int, input()))
num.sort(reverse=True)
for i in num:
    print(i, end="")