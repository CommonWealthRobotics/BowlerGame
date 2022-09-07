# BowlerGame

A physics based platformer game engine built on top of BowlerStudio

# Linux Install


```
mkdir -p ~/bin/
wget https://github.com/CommonWealthRobotics/BowlerGame/releases/latest/download/BowlerGame -O ~/bin/BowlerGame
chmod +x ~/bin/BowlerGame
~/bin/BowlerGame
```

# Developer

Assumed you have set up SSH keys with GitHub

Running Ubuntu 22.04

Install

Install the binary version first, and run it. This installs java and sets up the ~/.bashrc

Once Binary application runs, then compile and run from source

```
sudo apt install npm
git clone git@github.com:CommonWealthRobotics/BowlerGame.git
cd BowlerGame
./gradlew spotlessApply
./gradlew shadowJar
java -jar build/libs/BowlerGame.jar
```
