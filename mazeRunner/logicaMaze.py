import time
from tkinter import *

def update(map):
    for y in range(0,len(map)):
        for x in range(0,len(map[y])):
            if map[y][x] == 5:
                map2[y][x] = Label(image=player).grid(column=x,row=y)
            if map[y][x] == 1:
                map2[y][x] = Label(image=wall).grid(column=x,row=y)
            else:
                map2[y][x] = Label(image=blank).grid(column=x,row=y)

def findPlayer():
    for y in range(0,len(map)):
        for x in range(0,len(map[y])):
            if map[y][x] == 5:
                return (y,x)
            
def findExit():
    for y in range(0,len(map)):
        for x in range(0,len(map[y])):
            if map[y][x] == 9:
                return (y,x)
def drawMap():
    for y in range(0,len(map)):
        print(map[y])
    print("\n\n")

def clearPath():
    for y in range(0,len(map)):
        for x in range(0,len(map[y])):
            if map[y][x] == 2:
                map[y][x] = 0

def startGame():

    exitCoordinates = findExit()
    exitY = exitCoordinates[0]
    exitX = exitCoordinates[1]
    flag = False

    while map[exitY][exitX] == 9:
        #update(map)
        coordinates = findPlayer()
        y = coordinates[0]
        x = coordinates[1]

        try:
            if (map[y][x+1] == 0 or map[y][x+1] == 9) and flag != True:
                map[y][x] = 2
                map[y][x+1] = 5
                flag = True
                #update(map)
        except IndexError:
            pass
        
        try:
            if (map[y-1][x] == 0 or map[y-1][x] == 9) and flag != True:
                map[y][x] = 2
                map[y-1][x] = 5
                flag = True
                #update(map)
        except IndexError:
            pass
        
        try:
            
            if (map[y+1][x] == 0 or map[y+1][x] == 9) and flag != True:
                map[y][x] = 2
                map[y+1][x] = 5
                flag = True
                #update(map)
        except IndexError:
            pass

        try:
            
            if (map[y][x-1] == 0 or map[y][x-1] == 9) and flag != True:
                map[y][x] = 2
                map[y][x-1] = 5
                flag = True
                #update(map)
        except IndexError:
            pass
        
        if flag == False:
            map[y][x] = 3
            map[5][0] = 5
            clearPath()
            #update(map)
        else:
            flag = False
        time.sleep(0.5)
    print("***********************Fine ricerca**********************************")

map = [[1,1,1,1,1,1,0,1,1,1,1,0,1,0,1],
       [1,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
       [1,1,1,1,1,1,1,0,1,1,1,0,1,0,1],
       [9,0,0,0,1,1,1,1,1,1,1,0,0,1,1],
       [1,1,0,0,1,1,1,0,0,0,0,0,1,1,1],
       [5,0,0,0,0,0,0,0,1,1,1,1,1,1,1]]

map2 = [[1,1,1,1,1,1,0,1,1,1,1,0,1,0,1],
       [1,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
       [1,1,1,1,1,1,1,0,1,1,1,0,1,0,1],
       [9,0,0,0,1,1,1,1,1,1,1,0,0,1,1],
       [1,1,0,0,1,1,1,0,0,0,0,0,1,1,1],
       [5,0,0,0,0,0,0,0,1,1,1,1,1,1,1]]

window = Tk()
player = PhotoImage(file="player.png")
wall = PhotoImage(file="wall.png")
blank = PhotoImage(file="blank.png")

#startGame()
update(map)
