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
coming soon  

# How to use

```scala
import ip4s.IPL
val ipl = new IPL()
var image = ipi.read("lenna.png") //get Array[Array[]]
ipl.write("lenna2.png")
```

# Version
- 1.0.0
-- add read and write
-- get image as Array[Array[T]]
-- only argb
