import time

map = [[1,1,1,1,1,1,0,1,1,1,1,0,1,0,1],
       [1,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
       [1,1,1,1,1,1,1,0,1,1,1,0,1,0,9],
       [1,1,1,0,1,1,1,1,1,1,1,0,0,1,1],
       [1,1,1,0,1,1,1,0,0,0,0,0,1,1,1],
       [5,0,0,0,0,0,0,0,1,1,1,1,1,1,1]]
        
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

print("**************Inizio ricerca****************")
drawMap()

exitCoordinates = findExit()
exitY = exitCoordinates[0]
exitX = exitCoordinates[1]
flag = False

while map[exitY][exitX] == 9:
    coordinates = findPlayer()
    y = coordinates[0]
    x = coordinates[1]

    try:
        if (map[y][x+1] == 0 or map[y][x+1] == 9) and flag != True:
            map[y][x] = 2
            map[y][x+1] = 5
            flag = True
    except IndexError:
        pass
    
    try:
        if (map[y-1][x] == 0 or map[y-1][x] == 9) and flag != True:
            map[y][x] = 2
            map[y-1][x] = 5
            flag = True
    except IndexError:
        pass
    
    try:
        
        if (map[y+1][x] == 0 or map[y+1][x] == 9) and flag != True:
            map[y][x] = 2
            map[y+1][x] = 5
            flag = True
    except IndexError:
        pass

    try:
        
        if (map[y][x-1] == 0 or map[y][x-1] == 9) and flag != True:
            map[y][x] = 2
            map[y][x-1] = 5
            flag = True
    except IndexError:
        pass
    
    if flag == False:
        map[y][x] = 3
        map[5][0] = 5
        clearPath()
        drawMap()
    else:
        flag = False
        
print("***********************Fine ricerca**********************************")
drawMap()
    
