# 양방향 연결 리스트 문제(요세푸스)
import sys
input = sys.stdin.readline()
from collections import deque
new_list = []
members, n = map(int, input.split(" "))
queue = deque()
for i in range(1, members+1):
    queue.append(i)
while queue: # queue에 요소가 남아있으면
    for i in range(n-1):
        queue.append(queue.popleft()) #첫번째 수와 두번째 수를 queue의 뒤에 추가함.
    new_list.append(str(queue.popleft()))
print("<" + ", ".join(new_list) + ">")