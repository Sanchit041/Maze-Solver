/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze;

import java.util.List;

/**
 *
 * @author gupta
 */
public class Dfs {
    public static boolean searchpath(int maze[][],List<Integer> path,int x ,int y){
        if(maze[y][x]==9)
        {
            path.add(x);
            path.add(y);
            return true;
        }
        if(maze[y][x]==0)
        {
            maze[y][x]=2;
            
            int dx =-1;
            int dy =0;
            
            if(searchpath(maze,path,x+dx,y+dx))
            {
                path.add(x);
                path.add(y);
                return true;
            }
            dx=1;
            dy=0;
            if(searchpath(maze,path,x+dx,y+dy))
            {
                path.add(x);
                path.add(y);
                return true;
            }
            dx=0;
            dy=-1;
            if (searchpath(maze, path,x+dx,y+dy)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx=0;
            dy=1;
            
            if(searchpath(maze,path,x+dx,y+dy))
            {
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
        
    }
}
