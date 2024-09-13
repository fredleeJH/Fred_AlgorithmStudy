#1978 소수 찾기
#원하는 숫자를 2부터 자기 자신까지 for 문을 돌려 나누는데 예를 들어 숫자가 4면 4 % 2== 0이지만 i!=j 이므로 반복문을 빠져나감.

n = int(input())
prime_number = list(map(int, input().split(" ")))
count = 0
for i in prime_number:
    for j in range(2,i+1):
        if i % j == 0:
            if i == j:
                count += 1
            break

print(count)