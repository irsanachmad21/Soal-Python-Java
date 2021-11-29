e1 = float((input)("masukan nilai e1 :"))
e2 = float((input)("masukan nilai e2 :"))
e3 = float((input)("masukan nilai e3 :"))
ne1 = float((input)("masukan nilai ne1 :"))
ne2 = float((input)("masukan nilai ne2 :"))
re = (e1+e2+e3)/3
rne = (ne1+ne2)/2
if re > rne:
    print("IPA")
elif re < rne:
    print("IPS")
else:
    print("pilih jurusan")
