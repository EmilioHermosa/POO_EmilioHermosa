L1 = [18, 25, 21, 19, 23]
L2 = [19, 26, 45, 33, 28]

mult = zip(L1, L2)

for i, result in enumerate(mult):
    multi = result[0] * result[1]
    print("{} {} {}".format(i, result,multi))