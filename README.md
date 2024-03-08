# 数据库表结构文档生成工具

## 开发缘由

在工作中编写开发文档时，通常会涉及到数据库表结构这个部分。通常我们需要使用各类文档编辑软件新建表格，然后逐个复制和粘贴内容，但这种方式效率比较低。我之前尝试过一种没有页面的解决方案，但是在更改数据库连接信息时需要手动修改配置文件，使用起来不是很方便。    
因此，我产生了一个新的想法，希望开发一个具备页面功能的版本。这样，我们可以在页面上直接操作，避免复制和粘贴带来的低效率问题。而且，通过页面版本，我们可以方便地更改数据库连接的信息，不再需要手动修改配置文件。总体而言，这个带页面的版本将提供更加方便和高效的开发文档编写体验。
<br>
<br>

## 技术栈
### 后端
- SpringBoot 基础框架
- Apache poi 生成word文档
- itextpdf 实现生成pdf文档

### 前端
- Vue 基础框架
- Element ui 组件库
<br>
<br>


## 项目演示

**1. 数据库连接信息**

![image-20230719021014570](https://gitee.com/geqian618/resource/raw/master/images/table-structure/连接信息.png)  
<br>

**2. 文档预览**
![image-20230719021014570](https://gitee.com/geqian618/resource/raw/master/images/table-structure/文档预览.png)
<br>

**3. 选择导出列名**

![image-20230719013433699](https://gitee.com/geqian618/resource/raw/master/images/table-structure/选择列名.png)  
<br>


**4. 下载pdf文档**

![image-20230719013337074](https://gitee.com/geqian618/resource/raw/master/images/table-structure/pdf文档.png)
<br>

**5. 下载word文档**

![image-20230719013403179](https://gitee.com/geqian618/resource/raw/master/images/table-structure/word文档.png)  
<br>

**6. 下载markdown文档**

![image-20230719013403179](https://gitee.com/geqian618/resource/raw/master/images/table-structure/markdown文档.png)  
<br>
<br>




## 使用说明

**默认访问地址：http://localhost:8888/**  
<br>
<br>


## windows下载

https://github.com/2254324470/table-structure-generator/releases

