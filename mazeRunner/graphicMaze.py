import time
from tkinter import *
from PIL import Image,ImageTk
window = Tk()

#imges
player = PhotoImage(file="player.png")
wall = PhotoImage(file="wall.png")
blank = PhotoImage(file="blank.png")

map= [[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],
     [1,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
       [1,1,1,1,1,1,1,0,1,1,1,0,1,0,1],
       [9,0,0,0,1,1,1,1,1,1,1,0,0,1,1],
       [1,1,0,0,1,1,1,0,0,0,0,0,1,1,1],
       [5,0,0,0,0,0,0,0,1,1,1,1,1,1,1]]

map2= [[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],
     [1,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
       [1,1,1,1,1,1,1,0,1,1,1,0,1,0,1],
       [9,0,0,0,1,1,1,1,1,1,1,0,0,1,1],
       [1,1,0,0,1,1,1,0,0,0,0,0,1,1,1],
       [5,0,0,0,0,0,0,0,1,1,1,1,1,1,1]]

def update():
    for y in range(0,len(map)):
        for x in range(0,len(map[y])):
            if map[y][x] == 5:
                map2[y][x] = Label(image=player).grid(column=x,row=y)
            if map[y][x] == 1:
                map2[y][x] = Label(image=wall).grid(column=x,row=y)
            if map[y][x] == 0 or map[y][x] == 2:
                map2[y][x] = Label(image=blank).grid(column=x,row=y)
update()
window.update()

map= [[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],
     [1,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
       [1,1,1,1,1,1,1,0,1,1,1,0,1,0,1],
       [9,0,0,0,1,1,1,1,1,1,1,0,0,1,1],
       [1,1,0,0,1,1,1,0,0,0,0,0,1,1,1],
       [0,5,0,0,0,0,0,0,1,1,1,1,1,1,1]]

time.sleep(1)
window.update()
update()
