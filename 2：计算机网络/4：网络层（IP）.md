### 网络层：IP

就是在网络中找到另一台计算机在哪里，是否属于同一个子网，选路和转发

##### 1：互联网的定义：

​	采用分组交换技术，使用TCP/IP协议，将不同的类型的网络互联在一起而形成覆盖全球的技术设施

- 组成互联网的基础单元：
  1. 终端
  2. 链路
  3. 路由器
  4. 交换机

##### 2：TCP/IP协议的特点

1. 漏斗模型
2. 无状态结构
3. 接口开放

##### 3：网络层

- ###### 选路

  - 路由器之间通过路由信息的交换和路由算法的执行，创建路由表，决定端到端的转发的路径过程

- ###### 转发

  - 指路由器从输入接口输入一个分组后，根据分组的目的地址查询路由表（ARP表），将分组转发到指定的输出端口的过程。此过程可能产生ICMP信息

##### 4：IP报文格式

![IP报文格式,Ip.png](https://github.com/likang315/Web-Developing/blob/master/Web%20%E7%9F%A5%E8%AF%86%E4%BD%93%E7%B3%BB/2%EF%BC%9A%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%BD%91%E7%BB%9C/4%EF%BC%9A%E7%BD%91%E7%BB%9C%E5%B1%82/IP%E6%8A%A5%E6%96%87%E6%A0%BC%E5%BC%8F,Ip.png?raw=true)

- 标示符：一个分组在传输过程中可能被分片，该字段用于标示那些分片属于同一个分组中
- 分片标志：标示该分组是否被分片传输
- 分片偏移量：重新组装一个分组时，指示分片在原组中的位置
- 协议：指明IP分组净负荷来自上层的那个协议

##### 5：IP地址

- IPv4：使用4个字节（ 32 个比特）来表示，中间用 "." 分隔

  - 构成：网络ID + 主机ID 

  - 网络ID为网段（子网），可以用子网掩码进行与运算来确定

  - ###### 特殊IP

    - | <net> | <host> | 意义     |              |
      | ----- | ------ | -------- | ------------ |
      | 全 0  | 全 0   | 本级IP   |              |
      | 任意  | 全 0   | 网络地址 | 标示一个网络 |
      | 任意  | 全 1   | 定向广播 | 指向网络上   |
      | 全 1  | 全 1   | 有限广播 | 在本地网中   |
      | 127.X | X.X    | 测试     | 环回IP       |

  - 内网多个主机可共用一个公网IP地址连接Internet，使用网络地址（NAT转换）

- IPv6：使用16 个字节（ 128个比特），写成8个16比特的无符号整数，每个整数用4个十六进制位表示，这些数之间用冒号 ":" 分开

  - 三种表示：
    1. 冒分十六进制表示法：ABCD:EF01:2345:6789:ABCD:EF01:2345:6789
       - 冒号十六进制记法允许零压缩，即一串连续的0可以用一对冒号取代 "：："
    2. 0位压缩表示法：0:0:0:0:0:0:0:1 → ::1
    3. 内嵌 IPv4 地址 示法：X:X:X:X:X:X:d.d.d.d，前96 bit采用冒分十六进制表示，而最后 32bit 地址则使用IPv4的点分十进制表示

##### 6：子网划分，ARP，无分类域间路由

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

