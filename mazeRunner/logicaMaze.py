import time

map = [[1,1,1,1,1,1,9,1,1,1,1,1,1,1,1],
       [1,1,1,1,0,0,0,0,0,0,0,0,1,1,1],
       [1,1,1,1,1,1,1,0,1,1,1,0,1,1,1],
       [1,1,1,0,1,1,1,1,1,1,1,0,0,0,1],
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

while map[exitY][exitX] == 9:
    coordinates = findPlayer()
    y = coordinates[0]
    x = coordinates[1]

    if x+1 < len(map[1]) and (map[y][x+1] == 0 or map[y][x+1] == 9):
        map[y][x] = 2
        map[y][x+1] = 5
    elif y-1 > 0 and (map[y-1][x] == 0 or map[y-1][x] == 9):
        map[y][x] = 2
        map[y-1][x] = 5
    elif y+1 <= len(map) and (map[y+1][x] == 0 or map[y+1][x] == 9):
        map[y][x] = 2
        map[y+1][x] = 5
    elif x-1 > 0 and (map[y][-1] == 0 or map[y+1][x] == 9):
        map[y][x] = 2
        map[y+1][x] = 5
    else:
        map[y][x] = 3
        map[5][0] = 5
        clearPath()
        drawMap()
        
print("***********************Fine ricerca**********************************")
    
    
