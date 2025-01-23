#일단 일렬로 서있는 곳은 queue로 생각하고, 내가 1번이 아닐때 대기하는 곳은 stack의 개념으로 생각한다
#만약 stack에 들어갔는데 나보다 뒷번호가 맨 위에 존재하면 즉, stack이 비어있지 않으면 bad를 출력한다.
n = int(input())
waitingQueue = list(map(int, input().split(" ")))
waitingStack = []
Num = 1
for member in waitingQueue:
    if member == Num:
        Num += 1
    else:
        waitingStack.append(member) # 만약 기대하는 번호가 1이 아니면 일단 stack에 추가

    while waitingStack and waitingStack[-1] == Num:
        waitingStack.pop()
        Num += 1
if waitingStack:
    print("Sad")
else:
    print("Nice")