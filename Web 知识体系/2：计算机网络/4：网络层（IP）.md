## IP（网络层）

### 就是在网络中找到另一台计算机在哪里，是否属于同一个子网，选路和转发

![网络层.png](https://github.com/likang315/Web-Developing/blob/master/Web%20%E7%9F%A5%E8%AF%86%E4%BD%93%E7%B3%BB/2%EF%BC%9A%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%BD%91%E7%BB%9C/4%EF%BC%9A%E7%BD%91%E7%BB%9C%E5%B1%82/%E7%BD%91%E7%BB%9C%E5%B1%82.png?raw=true)

## IP报文，IP地址

![IP报文格式,Ip.png](https://github.com/likang315/Web-Developing/blob/master/Web%20%E7%9F%A5%E8%AF%86%E4%BD%93%E7%B3%BB/2%EF%BC%9A%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%BD%91%E7%BB%9C/4%EF%BC%9A%E7%BD%91%E7%BB%9C%E5%B1%82/IP%E6%8A%A5%E6%96%87%E6%A0%BC%E5%BC%8F,Ip.png?raw=true)

### IP：用于计算机之间的通信，无连接的通信协议，网络层

它不会占用两个正在通信的计算机之间的通信线路，降低了对网络线路的需求。每条线可以同时满足许多不同的计算机之间的通信需要，通过 IP，数据被分割为小的独立的数据包，并通过因特网在计算机之间传送，IP负责将每个包路由至它的目的地

### IPv4:使用 32 个比特(4个字节)或者 4 组 0 到 255 之间的数字来为计算机编址。

   IPv6:使用 128个比特(16 个字节),写成8个16比特的无符号整数，每个整数用4个十六进制位表示，这些数之间用冒号（:）分开
	
三种表示：
   1：冒分十六进制表示法：ABCD:EF01:2345:6789:ABCD:EF01:2345:6789
   2：0位压缩表示法：0:0:0:0:0:0:0:1 → ::1
      冒号十六进制记法允许零压缩，即一串连续的0可以用一对冒号取代 "：："

### 内嵌 IPv4 地址 示法：X:X:X:X:X:X:d.d.d.d，前96 bit采用冒分十六进制表示，而最后 32bit 地址则使用IPv4的点分十进制表示

每一个计算机必须有一个 IP 地址才能够连入因特网，并且IP是独一无二的

### 子网划分，ARP，无分类域间路由

![子网划分,ARP协议.png](https://github.com/likang315/Web-Developing/blob/master/Web%20%E7%9F%A5%E8%AF%86%E4%BD%93%E7%B3%BB/2%EF%BC%9A%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%BD%91%E7%BB%9C/4%EF%BC%9A%E7%BD%91%E7%BB%9C%E5%B1%82/%E5%AD%90%E7%BD%91%E5%88%92%E5%88%86,ARP%E5%8D%8F%E8%AE%AE.png?raw=true)

ARP协议通过**广播的形式**，给同一个子网中的每台电脑（包含对方的ip）,对方收到这个数据包，会把IP和自己的比较，若相同，则返回自己的MAC地址，否则就丢弃

需要**IP子网来划分，要不然都所有连接的电脑都广播的话**，就会造成网络阻塞

若**不处于同一个子网下，就发送给网关**，让网关转发放到目标子网中

### 互联网控制消息协议ICMP

![ICMP.png](https://github.com/likang315/Web-Developing/blob/master/Web%20%E7%9F%A5%E8%AF%86%E4%BD%93%E7%B3%BB/2%EF%BC%9A%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%BD%91%E7%BB%9C/4%EF%BC%9A%E7%BD%91%E7%BB%9C%E5%B1%82/ICMP.png?raw=true)



### IP 路由器,又称路由器

**路由选择：**当一个IP数据包从一台计算机被发送，它会到达一个IP路由器，路由器负责将这个包路由至它的目的地，或者间接地通过其他的路由器
在一个相同的通信中，一个包所经由的路径可能会和其他的包不同。而路由器负责根据通信量、网络中的错误或者其他参数来进行正确地寻址

![路由器.png](https://github.com/likang315/Web-Developing/blob/master/Web%20%E7%9F%A5%E8%AF%86%E4%BD%93%E7%B3%BB/2%EF%BC%9A%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%BD%91%E7%BB%9C/4%EF%BC%9A%E7%BD%91%E7%BB%9C%E5%B1%82/%E8%B7%AF%E7%94%B1%E5%99%A8.png?raw=true)

### 路由表，路由协议

![路由表，路由协议.png](https://github.com/likang315/Web-Developing/blob/master/Web%20%E7%9F%A5%E8%AF%86%E4%BD%93%E7%B3%BB/2%EF%BC%9A%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%BD%91%E7%BB%9C/4%EF%BC%9A%E7%BD%91%E7%BB%9C%E5%B1%82/%E8%B7%AF%E7%94%B1%E8%A1%A8%EF%BC%8C%E8%B7%AF%E7%94%B1%E5%8D%8F%E8%AE%AE.png?raw=true)



### Dikastra算法

![Dikastra.png](https://github.com/likang315/Web-Developing/blob/master/Web%20%E7%9F%A5%E8%AF%86%E4%BD%93%E7%B3%BB/2%EF%BC%9A%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%BD%91%E7%BB%9C/4%EF%BC%9A%E7%BD%91%E7%BB%9C%E5%B1%82/Dikastra.png?raw=true)

