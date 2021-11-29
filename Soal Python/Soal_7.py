x = float(input("masukan nilai x ="))
y = float(input("masukan nilai y ="))
p = x-y
if (p > 0):
    q = x*y
    print("nilai p =", p, "dan nilai q =", q)
elif (p < 0):
    q = x/y
    print("masukan nilai p =", p, "dan nilai q =", q)
else:
    print("nilai p =", p, "dan nilai q tidak terdefinisi")
