#10989 이번에는 sort를 통해 정렬했더니 메모리 초과가 났다. 이 점에 유의하며 다음 문제 풀어야겠다.
#입력한 숫자에 대한 카운트를 1씩 늘리고, 카운트가 많은것부터 출력하도록 한다.
#append()는 생각보다 시간복잡도가 크다.
import sys
input = sys.stdin.readline
n = int(input())
# numList = []
# for i in range(n):
#     num = int(input())
#     numList.append(num)
# numList.sort()
numList = [0] * 10001 # 크기가 10000개가 들어갈 수 있는 배열 담기
for i in range(n):
    numList[int(input())] += 1
for i in range(10001):
    if numList[i] != 0:
        for j in range(numList[i]):
            print(i)