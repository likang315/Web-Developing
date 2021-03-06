### LAN、数据链路层、物理层

------

##### 1：LAN 三要素

1. 网络的拓扑结构
   - 星型网
   - 环型网
   - 总线型
2. 传输介质
   - 有线：双绞线、同轴电缆、光纤
   - 无线：红外线、无线电、电磁波
3. 介质访问控制方式
   - 随机接入
   - 令牌方式

##### 2：局域网的参考模型

- OSI最底两层
  - 数据链路层
    - LLC：逻辑链路子层
    - MAC：介质访问地址
  - 物理层

##### 3：以太网

​	采用无连接的方式，并且对数据不进行编号的局域网

###### 以太网的标准表示

- <以 Mb/s  的传输速率> <信号调制方式> <以百米为单位的单段最大长度或传输介质>
  - 10 Base 2、10 Base-T

###### 共享式以太网

​	采用总线式的网络结构，传输信号，使用**CSMA/CD介质访问控制方式**的半双工通信的以太网

- CSMA/CD：带有冲突检测的载波侦听多点访问协议
  - 侦听总线：先听后发
  - 冲突检测：边听边发
  - 冲突停止
  - 随机延迟后重发

##### 4：物理层

​	物理层又细分为：

1. PCS：物理编码子层，负责mac子层数据的编码和解码
2. PMA：物理介质连接，负责与上层的串行服务接口
3. PMD：物理介质相关，负责信号的发送和接受
4. MDI：介质相关接口，对于不同的物理介质提供接口

##### 5：数据链路层

###### LLC

​	逻辑链路控制是局域网中数据链路层的上层部分，用户的数据链路服务通过LLC子层为网络层提供统一的接口

###### MAC子层

1. MAC地址(物理地址)：用于以太网中对设备的识别和区分使用MAC地址，每张网卡都具有独一无二的物理地址
   -  格式：6 个字节，用12 个十六进制表示，用":" 分隔
   - ether：38:f9:d3:6f:1d:14，前4个字节为厂商代码，后2两个字节自行分配
2. 硬件地址类型
   1. 单播类型：一对一
   2. 多播类型：一对多
   3. 广播类型：一对全体

##### 6：MAC 帧结构

- 目的地址【6】源地址【6】长度/类型【2】数据【46-1500】FCS【4】
- FCS：帧校验序列
- 类型：用于指明数据字段是什么协议类型
- MAC帧结构大小：46-1518 字节

###### 用于同步的帧

- PRE：前导码，7个字节，均为10101010(bit)，用于唤醒接受的适配器，引导接受和发送数据建立同步
- SFD：帧开始定界符，1个字节：10101011

##### 7：Hub集线器

​	星型拓扑结构，其介入控制方式采用CSMA/CD

- 原理：当信号从集线器某端口传入时，集线器直接将此信号在其他所有的段口上转发
- 若有两个端口同时传入信号时，即产生冲突
- 只能连接同一网段的设备

##### 8：交换机、VLAN

###### 交换机：

​	具有多个端口，每个端口具有桥接功能，可以连接一个LAN或主机，其根据不同的目的地址直接进行转发至相应的端口

![](https://github.com/likang315/Web-Developing/blob/master/2%EF%BC%9A%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%BD%91%E7%BB%9C/%E7%89%A9%E7%90%86%E5%B1%82%EF%BC%8C%E6%95%B0%E9%93%BE%E5%B1%82/VLAN.png?raw=true)

