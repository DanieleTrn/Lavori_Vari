from tkinter import *
from PIL import Image,ImageTk

window = Tk()

#imges
player = PhotoImage(file="player.png")
wall = PhotoImage(file="wall.png")

map = [[1,1,1,1,1,1,0,1,1,1,1,0,1,0,1],
       [1,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
       [1,1,1,1,1,1,1,0,1,1,1,0,1,0,1],
       [9,0,0,0,1,1,1,1,1,1,1,0,0,1,1],
       [1,1,0,0,1,1,1,0,0,0,0,0,1,1,1],
       [5,0,0,0,0,0,0,0,1,1,1,1,1,1,1]]

def update():
    for y in range(0,len(map)):
        for x in range(0,len(map[y])):
            if map[y][x] == 5:
                map[y][x] = Label(image=player).grid(column=x,row=y)
            if map[y][x] == 1:
                map[y][x] = Label(image=wall).grid(column=x,row=y)
                
update()
mainloop()
