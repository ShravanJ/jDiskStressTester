# jDiskStressTester
The conceptual succesor to FileSpammer. FileSpammer was an interesting idea, however the implementation was pretty lame. So instead of trying to fix up FileSpamemr, I decided to almost completely re-write it as jDiskStressTester. 

Research
========
Here is some very unscientific data I have collected from my short term testing

     Computer  Operating System            Filesystem      Hardware                            
      A        Windows 10 Home 64-bit      NTFS            Core i7, 4GB RAM, 5400RPM Hard Drive
      B        Xubuntu 14.04 64-bit        ext4            Core 2 Dou, 2GB RAM, SATA III SSD


Computer A Results - Began testing with number of files to be generated set to 1,000,000. Disk usage, as reported by Task Manager, shot up to 99-100% after about 2 minutes of running the test and disk response time also shot up all the way to 2000 ms (which is very, very slow). Windows Explorer surprisingly stayed open and did not experience any major hang-ups. I had to cut the test short (stopped at around 200,000 files) because I was working with other applications and the computer was becoming unresponsive.


Computer B Results - Began testing with number of files to be generated set to 1,000,000. I was not monitoring disk usage on this machine as I let this one run overnight. I started testing Computer B 10 minutes after starting the test on Computer A and within 15 minutes the test on Computer B was a few hundred files ahead of A because of the faster SSD in Computer B. I started the test around 11 PM and around 9 AM the following day the terminal window that had run the test showed that it completed and was still responsive, however the file explorer window that had the folder that the files where being generated in did not. When I attempted to use the file explorer window the entire operating system became unresponsive, causing me to forcefully shut the computer down. I have yet to check if there was any data loss, but when I do I will report the findings back here.


That is pretty much it for now, I will be updating this readme as I perform more research on long term effects of using jDiskStressTester. 
