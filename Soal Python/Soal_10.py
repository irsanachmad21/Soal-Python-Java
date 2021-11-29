# program : menentukan upah per minggu
gol = input("masukan golongan 1,2,3 atau 4 : ")
JamKerja = float(input("masukan golongan(dalam jam) : "))
if (gol == '1'):
    if (JamKerja <= 40):
        upah = JamKerja*3000
    else:
        upah = 40*3000+(JamKerja-40)*2*3000
elif (gol == '2'):
    if (JamKerja <= 40):
        upah = JamKerja*3500
    else:
        upah = 40*3500+(JamKerja-40)*2*3500
elif (gol == '3'):
    if (JamKerja <= 40):
        upah = JamKerja*4000
    else:
        upah = 40*4000+(JamKerja-40)*2*4000
else:
    if (JamKerja <= 40):
        upah = JamKerja*5000
    else:
        upah = 40*5000+(JamKerja-40)*2*5000
print("upah per minggu = Rp ", upah)
