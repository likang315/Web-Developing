### 应用层

------

##### 1：域名：计算机的唯一名称

   域名是需要注册的，当域名被注册后，就会被添加到大的域名注册商那里，包括被保存在 DNS 服务器的 IP 信息与域名有一种映射关系

- 虚假域名：被注册到别的域名之下的子域名

##### 2：DNS 域名系统 (Domain Name System)，提供域名到IP地址之间的解析服务，应用层协议

- DNS 服务器负责向 internet 上的其他计算机通知有关你的域名和IP地址的信息，DNS就会将域名转化成便于机器识别的IP地址
- 域名：从该节点到根节点的路径，中间用"." 连接组成的字符串
- DNS 域名服务器：采用分布式的结构，将域名空间信息存储、解析工作分布到多台域名服务器上

​	![](https://github.com/likang315/Web-Developing/blob/master/2%EF%BC%9A%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%BD%91%E7%BB%9C/%E5%BA%94%E7%94%A8%E5%B1%82/DNS.png?raw=true)

##### 3：DHCP(Dynamic Host Configuration Protocol)

- 动态主机配置协议：自动为网络中的主机分配IP地址，应用层协议
- C/S模式
  - 服务器：port：67，UDP
  - 客户端：port：68，UDP

###### 分配IP流程

1. Discover(广播)：
   - 源IP：0.0.0.0—目的IP：255.255.255.255（局域网内广播，网段内部）
   - 携带MAC地址和计算机域名
2. OFFER(广播)：
   - 所有到Discover的请求的服务器，都要返回此信息
   - 携带IP地址，子网掩码，网关
3. REQUEST(广播)：
   - 广播告知自己的选择，通知其他服务器回收IP
4. ACK（广播）：
   - 返回租用时长，已绑定状态等信息

##### 4：URL

- <protocol> :// <user>: <password>@<host>:<port>/url_path
- user，password@，port为可选值

##### 5：主要协议介绍

- ###### TCP - 传输控制协议

  - TCP 负责在数据传送之前将它们分割为 IP 包，然后在它们到达的时候将它们重组

- ###### IP - 网际协议（Internet Protocol）

  - IP 负责在因特网上发送和接收数据包

- HTTP - 超文本传输协议(Hyper Text Transfer Protocol)

  -  HTTP 用于从 web 客户端（浏览器）向 web 服务器发送请求，并从 web 服务器向 web 客户端返回内容（网页）

- HTTPS - 安全的 HTTP（HTTP Secure）

  - 作为有代表性的应用，HTTPS 会用于处理信用卡交易和其他的敏感数据

- SSL - 安全套接字层（Secure Sockets Layer）

  - SSL 协议用于为安全数据传输加密数据

- ###### FTP 负责计算机之间的文件传输

  - 端口号20、21，控制端口一般为21，而数据端口不一定是20，这和FTP的应用模式有关，如果是主动模式，应该为20，如果为被动模式，由服务器端和客户端协商而定

- NTP - 网络时间协议（Network Time Protocol）

  - NTP 用于在计算机之间同步时间（钟）

- DHCP - 动态主机配置协议（Dynamic Host Configuration Protocol）

  - DHCP 用于向网络中的计算机分配动态 IP 地址

- SNMP - 简单网络管理协议（Simple Network Management Protocol）

  - SNMP 用于计算机网络的管理

- ###### ICMP 负责网络中的错误处理【网络层】

- ###### ARP - 地址解析协议（Address Resolution Protocol）【网络层】

  - ARP：用于基于 IP 地址的计算机网卡的硬件地址

- ###### RARP - 反向地址转换协议（Reverse Address Resolution Protocol）

  - RARP：基于硬件地址来查找的 IP 地址

- BOOTP - 自举协议（Boot Protocol）

  - BOOTP 用于从网络启动计算机

- PPTP - 点对点隧道协议（Point to Point Tunneling Protocol）

  - PPTP 用于私人网络之间的连接（隧道）

 
