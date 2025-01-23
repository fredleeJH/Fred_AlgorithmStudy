import sys
stackList = []
def appendStack(num):
    stackList.append(num)

def popStack():
    if stackList:
        print(stackList.pop(-1))
    else:
        print(-1)

def countStack():
    print(len(stackList))

def ifStack():
    if stackList:
        print(0)
    else:
        print(1)

def popCountStack():
    if stackList:
        print(stackList[-1])
    else:
        print(-1)

n = int(sys.stdin.readline())

for i in range(n):
    cmd = sys.stdin.readline().split()

    if cmd[0] == '1':
        appendStack(cmd[1])

    elif cmd[0] == '2':
        popStack()
        continue

    elif cmd[0] == '3':
        countStack()
        continue

    elif cmd[0] == '4':
        ifStack()
        continue

    elif cmd[0] == '5':
        popCountStack()
        continue
