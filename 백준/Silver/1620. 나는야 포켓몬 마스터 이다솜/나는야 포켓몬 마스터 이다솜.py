#이번에도 시간초과가 났는데 그 이유는 파이썬에서 입력 또는 조회에서 input을 쓸 경우 시간복잡도가 증가하기때문입니다.
#strip()를 쓸때 주의하기.
# pokemons, n = map(int, input().split(" "))
# book = {}
# for i in range(pokemons):
#     pokemon = input()
#     book[i+1] = pokemon
#     book[pokemon] = i+1
# for i in range(n):
#     quiz = input()
#     if quiz.isdigit():
#         print(book[int(quiz)])
#     else:
#         print(book[quiz])
import sys
input = sys.stdin.readline
pokemons, n = map(int, input().strip().split(" "))
book = {}
for i in range(pokemons):
    pokemon = input().strip()
    book[i+1] = pokemon
    book[pokemon] = i+1
for i in range(n):
    quiz = input().strip()
    if quiz.isdigit():
        print(book[int(quiz)])
    else:
        print(book[quiz])