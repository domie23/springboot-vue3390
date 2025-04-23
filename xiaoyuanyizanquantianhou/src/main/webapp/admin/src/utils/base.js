const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoyuanyizanquantianhou/",
            name: "xiaoyuanyizanquantianhou",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoyuanyizanquantianhou/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园驿站全天候辅助取货管理系统"
        } 
    }
}
export default base
