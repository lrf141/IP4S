# IP4S
Image processing simple wrapper for Scala.  
It is based on Java's ImageIO class.

# Supported format
- BMP
- GIF
- JPEG
- JPG
- PNG 
- WBMP
- bmp
- gif
- jpeg
- jpg
- png
- wbmp

# How to install

```scala
resolvers += "Maven Repository on Github" at "https://lrf141.github.io/IP4S/"
libraryDependencies ++= Seq(
"ip4s" % "ip4s_2.12" % "version"
)
```

# How to use

```scala
import ip4s.IPL
val ipl = new IPL()
var image = ipl.read("lenna.png") //get Array[Array[Pixel]]
ipl.write("lenna2.png", image)
```

# Version
* 1.0.0
  ** add read and write function
  ** get image as Array[Array[Pixel]]
  ** only argb
