第一次修改
在 src/main/java/com.example.demo 目录下创建一个 controller 包，在 controller 包下创建一个 HelloController 控制器，控制器中
主要主意的是 model 对象用于传递当前控制器中的数据到 html 页面中渲染，其中greeting 方法中的 return 返回需要被渲染的 html 页面的
文件名，如当前的文件名为 greeting，所以启动项目时 HelloController 控制器会访问 resources/templates 下的greeting.html,
重：注意项目中的所有 .html 文件都需要放到 templates 目录下面才能被找到 