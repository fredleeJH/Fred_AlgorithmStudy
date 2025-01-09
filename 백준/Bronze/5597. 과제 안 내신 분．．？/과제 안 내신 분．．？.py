#5597 과제 안 내신분..?
submitters = []
nonSubmitters = []

for i in range(28):
    n = int(input())
    submitters.append(n)

for i in range(1,31):
    if i not in submitters:
        nonSubmitters.append(i)

print(min(nonSubmitters))
print(max(nonSubmitters))