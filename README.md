# ENDC

### What is ENDC ? 
- it's a tool that is designed to convert any text file to a video stream that is both mp4 format and uploadable to youtube . 
    - using this tool you can literally implement a infinite file storage glitch with youtube at it's backbone 
    - ENDC is being currently utilized in [INF_FILE_STORAGE](https://github.com/capnmav77/INF_File_Storage) as a method to encode a text file to a video 
    - ENDC also has a decoder framework baked into it which helps it to decode the downloaded video from youtube in order to get your files back 

### What does ENDC Use ? 
- ENDC uses JAVA underneath with all the required modules in the maven file 
    - it's still in it's development phase so it's not very well optimized 
    - you can get a much optimized version of this tool in [INF_FILE_STORAGE](https://github.com/capnmav77/INF_File_Storage)

### How does it work ? 
- Well let's say it's converting the input text stream to binary
- The binary is then encoded as a single frame of 720 x 1280 pixels with 4 pixels density with the binary 1's and 0's as black or white pixels
- Hence multiple such frames are generated to store all the binary information 
- these frames are then spaced out for 24 FPS and converted to a video of mp4 format


### How does the decoder work? 
- it's just reverse engineering of the encoder
- it splits the video to frames
- processess the frames by reading the pixel values of 0's or 1's and then write's the content into a binarystream
- converts the binary stream back to the text format

### Future work ? 
- [ ] need to add multi modal file input
- [ ] need to add a password for each file
- [ ] need to add the filename as a part of the videostream in order to get the filetype and the filename back as original one
- [ ] need to optimize the pipeline workflow


## How to use ? : 
```bash
    mvn clean install
```

If the above does not work then check the dependencies and try the below 

```bash
    mvn clean 
    mvn compile
```
After the above has executed successfully : 
```bash
    mvn package
```


## Finally after the Jar file has been made run it using : 
```bash
    java -jar target/gs-maven-0.1.0.jar
```

### For any additional queries and information do raise an issue and I will get back to you as soon as possible.
