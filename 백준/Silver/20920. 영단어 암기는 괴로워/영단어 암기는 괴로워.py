#파이썬에서 딕셔너리 정렬은 다중조건임에도 람다식을 사용해 정렬할 수 있음을 기억하자.
import sys
input = sys.stdin.readline

n, k = map(int, input().rstrip().split(" "))
wordList = {}
for i in range(n):
    word = input().rstrip()
    if len(word) >= k:
        if word in wordList:
            wordList[word] +=1
        else:
            wordList[word] = 1
wordList = sorted(wordList.items(), key=lambda x : (-x[1], -len(x[0]), x[0]))
for i in wordList:
    print(i[0])
