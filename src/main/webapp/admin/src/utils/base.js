const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmye471/",
            name: "ssmye471",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmye471/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于SSM框架的传统服饰文化平台体验的设计与实现"
        } 
    }
}
export default base
