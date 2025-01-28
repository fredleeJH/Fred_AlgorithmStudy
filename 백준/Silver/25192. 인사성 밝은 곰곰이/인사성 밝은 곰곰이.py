#파이썬에서 중복 제거는 set을 사용
#ENTER를 누르면 모든 대화는 초기화 시키기 그전에 같은 이름의 사용자가 반복되면 중복이라 어차피 Count에 포함이 안됨.
import sys
input = sys.stdin.readline
n = int(input())
chat_list = set()
count = 0
for i in range(n):
    chat = input().strip()

    if chat == 'ENTER':
        chat_list.clear()
    elif chat not in chat_list:
        count+=1
        chat_list.add(chat)

print(count)
