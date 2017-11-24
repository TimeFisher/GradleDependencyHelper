package com.abby.plugin.gradledependencyhelper.network;

import java.util.List;

public class MavenBean {

    /**
     * responseHeader : {"status":0,"QTime":0,"params":{"q":"rxjava","defType":"dismax","indent":"off","spellcheck":"true","qf":"text^20 g^5 a^10","fl":"id,g,a,latestVersion,p,ec,repositoryId,text,timestamp,versionCount","spellcheck.count":"5","sort":"score desc,timestamp desc,g asc,a asc","rows":"20","wt":"json","version":"2.2"}}
     * response : {"numFound":171,"start":0,"docs":[{"id":"io.reactivex.rxjava2:rxjava","g":"io.reactivex.rxjava2","a":"rxjava","latestVersion":"2.1.6","repositoryId":"central","p":"jar","timestamp":1509089639000,"versionCount":23,"text":["io.reactivex.rxjava2","rxjava","-javadoc.jar","-sources.jar",".jar",".pom"],"ec":["-javadoc.jar","-sources.jar",".jar",".pom"]},{"id":"io.reactivex:rxjava","g":"io.reactivex","a":"rxjava","latestVersion":"1.3.3","repositoryId":"central","p":"jar","timestamp":1508403867000,"versionCount":54,"text":["io.reactivex","rxjava","-javadoc.jar","-sources.jar",".jar",".pom"],"ec":["-javadoc.jar","-sources.jar",".jar",".pom"]},{"id":"com.elpassion.android.commons:rxjava","g":"com.elpassion.android.commons","a":"rxjava","latestVersion":"0.0.21","repositoryId":"central","p":"aar","timestamp":1501157604000,"versionCount":7,"text":["com.elpassion.android.commons","rxjava","-sources.jar","-javadoc.jar",".aar",".pom"],"ec":["-sources.jar","-javadoc.jar",".aar",".pom"]},{"id":"org.wildfly.swarm:rxjava","g":"org.wildfly.swarm","a":"rxjava","latestVersion":"1.0.0.Alpha8","repositoryId":"central","p":"jar","timestamp":1454359799000,"versionCount":3,"text":["org.wildfly.swarm","rxjava","-sources.jar",".jar",".pom"],"ec":["-sources.jar",".jar",".pom"]},{"id":"com.artemzin.rxjava:proguard-rules","g":"com.artemzin.rxjava","a":"proguard-rules","latestVersion":"1.3.3.0","repositoryId":"central","p":"aar","timestamp":1508414169000,"versionCount":31,"text":["com.artemzin.rxjava","proguard-rules",".aar",".pom"],"ec":[".aar",".pom"]},{"id":"io.opentracing.contrib:opentracing-rxjava-parent","g":"io.opentracing.contrib","a":"opentracing-rxjava-parent","latestVersion":"0.0.6","repositoryId":"central","p":"pom","timestamp":1503898973000,"versionCount":6,"text":["io.opentracing.contrib","opentracing-rxjava-parent",".pom"],"ec":[".pom"]},{"id":"net.javacrumbs.future-converter:spring-rxjava","g":"net.javacrumbs.future-converter","a":"spring-rxjava","latestVersion":"0.3.0","repositoryId":"central","p":"pom","timestamp":1430643127000,"versionCount":9,"text":["net.javacrumbs.future-converter","spring-rxjava",".pom"],"ec":[".pom"]},{"id":"net.javacrumbs.future-converter:rxjava-java8","g":"net.javacrumbs.future-converter","a":"rxjava-java8","latestVersion":"0.3.0","repositoryId":"central","p":"pom","timestamp":1430643125000,"versionCount":9,"text":["net.javacrumbs.future-converter","rxjava-java8",".pom"],"ec":[".pom"]},{"id":"com.github.akarnokd.rxjava3:rxjava3-observable","g":"com.github.akarnokd.rxjava3","a":"rxjava3-observable","latestVersion":"0.1.0","repositoryId":"central","p":"jar","timestamp":1492388946000,"versionCount":1,"text":["com.github.akarnokd.rxjava3","rxjava3-observable","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]},{"id":"com.github.akarnokd.rxjava3:rxjava3-interop","g":"com.github.akarnokd.rxjava3","a":"rxjava3-interop","latestVersion":"0.1.0","repositoryId":"central","p":"jar","timestamp":1492388891000,"versionCount":1,"text":["com.github.akarnokd.rxjava3","rxjava3-interop","-javadoc.jar","-sources.jar",".jar",".pom"],"ec":["-javadoc.jar","-sources.jar",".jar",".pom"]},{"id":"com.github.akarnokd.rxjava3:rxjava3-flowable","g":"com.github.akarnokd.rxjava3","a":"rxjava3-flowable","latestVersion":"0.1.0","repositoryId":"central","p":"jar","timestamp":1492388844000,"versionCount":1,"text":["com.github.akarnokd.rxjava3","rxjava3-flowable","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]},{"id":"com.github.akarnokd.rxjava3:rxjava3-common","g":"com.github.akarnokd.rxjava3","a":"rxjava3-common","latestVersion":"0.1.0","repositoryId":"central","p":"jar","timestamp":1492388795000,"versionCount":1,"text":["com.github.akarnokd.rxjava3","rxjava3-common","-javadoc.jar","-sources.jar",".jar",".pom"],"ec":["-javadoc.jar","-sources.jar",".jar",".pom"]},{"id":"com.kenzan.rxjava:rxjava-appdynamics","g":"com.kenzan.rxjava","a":"rxjava-appdynamics","latestVersion":"0.0.2","repositoryId":"central","p":"jar","timestamp":1476303974000,"versionCount":1,"text":["com.kenzan.rxjava","rxjava-appdynamics","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]},{"id":"com.netflix.rxjava:rxjava-swing","g":"com.netflix.rxjava","a":"rxjava-swing","latestVersion":"0.20.7","repositoryId":"central","p":"jar","timestamp":1415750077000,"versionCount":72,"text":["com.netflix.rxjava","rxjava-swing","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]},{"id":"com.netflix.rxjava:rxjava-string","g":"com.netflix.rxjava","a":"rxjava-string","latestVersion":"0.20.7","repositoryId":"central","p":"jar","timestamp":1415750074000,"versionCount":40,"text":["com.netflix.rxjava","rxjava-string","-javadoc.jar","-sources.jar",".jar",".pom"],"ec":["-javadoc.jar","-sources.jar",".jar",".pom"]},{"id":"com.netflix.rxjava:rxjava-scalaz","g":"com.netflix.rxjava","a":"rxjava-scalaz","latestVersion":"0.20.7","repositoryId":"central","p":"jar","timestamp":1415750069000,"versionCount":15,"text":["com.netflix.rxjava","rxjava-scalaz","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]},{"id":"com.netflix.rxjava:rxjava-quasar","g":"com.netflix.rxjava","a":"rxjava-quasar","latestVersion":"0.20.7","repositoryId":"central","p":"jar","timestamp":1415750065000,"versionCount":26,"text":["com.netflix.rxjava","rxjava-quasar","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]},{"id":"com.netflix.rxjava:rxjava-math","g":"com.netflix.rxjava","a":"rxjava-math","latestVersion":"0.20.7","repositoryId":"central","p":"jar","timestamp":1415750062000,"versionCount":32,"text":["com.netflix.rxjava","rxjava-math","-javadoc.jar","-sources.jar",".jar",".pom"],"ec":["-javadoc.jar","-sources.jar",".jar",".pom"]},{"id":"com.netflix.rxjava:rxjava-joins","g":"com.netflix.rxjava","a":"rxjava-joins","latestVersion":"0.20.7","repositoryId":"central","p":"jar","timestamp":1415750058000,"versionCount":24,"text":["com.netflix.rxjava","rxjava-joins","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]},{"id":"com.netflix.rxjava:rxjava-ios","g":"com.netflix.rxjava","a":"rxjava-ios","latestVersion":"0.20.7","repositoryId":"central","p":"jar","timestamp":1415750054000,"versionCount":17,"text":["com.netflix.rxjava","rxjava-ios","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]}]}
     * spellcheck : {"suggestions":[]}
     */

    private ResponseHeaderBean responseHeader;
    private ResponseBean response;
    private SpellcheckBean spellcheck;

    public ResponseHeaderBean getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ResponseHeaderBean responseHeader) {
        this.responseHeader = responseHeader;
    }

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public SpellcheckBean getSpellcheck() {
        return spellcheck;
    }

    public void setSpellcheck(SpellcheckBean spellcheck) {
        this.spellcheck = spellcheck;
    }

    public static class ResponseHeaderBean {
        /**
         * status : 0
         * QTime : 0
         * params : {"q":"rxjava","defType":"dismax","indent":"off","spellcheck":"true","qf":"text^20 g^5 a^10","fl":"id,g,a,latestVersion,p,ec,repositoryId,text,timestamp,versionCount","spellcheck.count":"5","sort":"score desc,timestamp desc,g asc,a asc","rows":"20","wt":"json","version":"2.2"}
         */

        private int status;
        private int QTime;
        private ParamsBean params;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getQTime() {
            return QTime;
        }

        public void setQTime(int QTime) {
            this.QTime = QTime;
        }

        public ParamsBean getParams() {
            return params;
        }

        public void setParams(ParamsBean params) {
            this.params = params;
        }

        public static class ParamsBean {
            /**
             * q : rxjava
             * defType : dismax
             * indent : off
             * spellcheck : true
             * qf : text^20 g^5 a^10
             * fl : id,g,a,latestVersion,p,ec,repositoryId,text,timestamp,versionCount
             * spellcheck.count : 5
             * sort : score desc,timestamp desc,g asc,a asc
             * rows : 20
             * wt : json
             * version : 2.2
             */

            private String q;
            private String defType;
            private String indent;
            private String spellcheck;
            private String qf;
            private String fl;
            private String _$SpellcheckCount191; // FIXME check this code
            private String sort;
            private String rows;
            private String wt;
            private String version;

            public String getQ() {
                return q;
            }

            public void setQ(String q) {
                this.q = q;
            }

            public String getDefType() {
                return defType;
            }

            public void setDefType(String defType) {
                this.defType = defType;
            }

            public String getIndent() {
                return indent;
            }

            public void setIndent(String indent) {
                this.indent = indent;
            }

            public String getSpellcheck() {
                return spellcheck;
            }

            public void setSpellcheck(String spellcheck) {
                this.spellcheck = spellcheck;
            }

            public String getQf() {
                return qf;
            }

            public void setQf(String qf) {
                this.qf = qf;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String get_$SpellcheckCount191() {
                return _$SpellcheckCount191;
            }

            public void set_$SpellcheckCount191(String _$SpellcheckCount191) {
                this._$SpellcheckCount191 = _$SpellcheckCount191;
            }

            public String getSort() {
                return sort;
            }

            public void setSort(String sort) {
                this.sort = sort;
            }

            public String getRows() {
                return rows;
            }

            public void setRows(String rows) {
                this.rows = rows;
            }

            public String getWt() {
                return wt;
            }

            public void setWt(String wt) {
                this.wt = wt;
            }

            public String getVersion() {
                return version;
            }

            public void setVersion(String version) {
                this.version = version;
            }
        }
    }

    public static class ResponseBean {
        /**
         * numFound : 171
         * start : 0
         * docs : [{"id":"io.reactivex.rxjava2:rxjava","g":"io.reactivex.rxjava2","a":"rxjava","latestVersion":"2.1.6","repositoryId":"central","p":"jar","timestamp":1509089639000,"versionCount":23,"text":["io.reactivex.rxjava2","rxjava","-javadoc.jar","-sources.jar",".jar",".pom"],"ec":["-javadoc.jar","-sources.jar",".jar",".pom"]},{"id":"io.reactivex:rxjava","g":"io.reactivex","a":"rxjava","latestVersion":"1.3.3","repositoryId":"central","p":"jar","timestamp":1508403867000,"versionCount":54,"text":["io.reactivex","rxjava","-javadoc.jar","-sources.jar",".jar",".pom"],"ec":["-javadoc.jar","-sources.jar",".jar",".pom"]},{"id":"com.elpassion.android.commons:rxjava","g":"com.elpassion.android.commons","a":"rxjava","latestVersion":"0.0.21","repositoryId":"central","p":"aar","timestamp":1501157604000,"versionCount":7,"text":["com.elpassion.android.commons","rxjava","-sources.jar","-javadoc.jar",".aar",".pom"],"ec":["-sources.jar","-javadoc.jar",".aar",".pom"]},{"id":"org.wildfly.swarm:rxjava","g":"org.wildfly.swarm","a":"rxjava","latestVersion":"1.0.0.Alpha8","repositoryId":"central","p":"jar","timestamp":1454359799000,"versionCount":3,"text":["org.wildfly.swarm","rxjava","-sources.jar",".jar",".pom"],"ec":["-sources.jar",".jar",".pom"]},{"id":"com.artemzin.rxjava:proguard-rules","g":"com.artemzin.rxjava","a":"proguard-rules","latestVersion":"1.3.3.0","repositoryId":"central","p":"aar","timestamp":1508414169000,"versionCount":31,"text":["com.artemzin.rxjava","proguard-rules",".aar",".pom"],"ec":[".aar",".pom"]},{"id":"io.opentracing.contrib:opentracing-rxjava-parent","g":"io.opentracing.contrib","a":"opentracing-rxjava-parent","latestVersion":"0.0.6","repositoryId":"central","p":"pom","timestamp":1503898973000,"versionCount":6,"text":["io.opentracing.contrib","opentracing-rxjava-parent",".pom"],"ec":[".pom"]},{"id":"net.javacrumbs.future-converter:spring-rxjava","g":"net.javacrumbs.future-converter","a":"spring-rxjava","latestVersion":"0.3.0","repositoryId":"central","p":"pom","timestamp":1430643127000,"versionCount":9,"text":["net.javacrumbs.future-converter","spring-rxjava",".pom"],"ec":[".pom"]},{"id":"net.javacrumbs.future-converter:rxjava-java8","g":"net.javacrumbs.future-converter","a":"rxjava-java8","latestVersion":"0.3.0","repositoryId":"central","p":"pom","timestamp":1430643125000,"versionCount":9,"text":["net.javacrumbs.future-converter","rxjava-java8",".pom"],"ec":[".pom"]},{"id":"com.github.akarnokd.rxjava3:rxjava3-observable","g":"com.github.akarnokd.rxjava3","a":"rxjava3-observable","latestVersion":"0.1.0","repositoryId":"central","p":"jar","timestamp":1492388946000,"versionCount":1,"text":["com.github.akarnokd.rxjava3","rxjava3-observable","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]},{"id":"com.github.akarnokd.rxjava3:rxjava3-interop","g":"com.github.akarnokd.rxjava3","a":"rxjava3-interop","latestVersion":"0.1.0","repositoryId":"central","p":"jar","timestamp":1492388891000,"versionCount":1,"text":["com.github.akarnokd.rxjava3","rxjava3-interop","-javadoc.jar","-sources.jar",".jar",".pom"],"ec":["-javadoc.jar","-sources.jar",".jar",".pom"]},{"id":"com.github.akarnokd.rxjava3:rxjava3-flowable","g":"com.github.akarnokd.rxjava3","a":"rxjava3-flowable","latestVersion":"0.1.0","repositoryId":"central","p":"jar","timestamp":1492388844000,"versionCount":1,"text":["com.github.akarnokd.rxjava3","rxjava3-flowable","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]},{"id":"com.github.akarnokd.rxjava3:rxjava3-common","g":"com.github.akarnokd.rxjava3","a":"rxjava3-common","latestVersion":"0.1.0","repositoryId":"central","p":"jar","timestamp":1492388795000,"versionCount":1,"text":["com.github.akarnokd.rxjava3","rxjava3-common","-javadoc.jar","-sources.jar",".jar",".pom"],"ec":["-javadoc.jar","-sources.jar",".jar",".pom"]},{"id":"com.kenzan.rxjava:rxjava-appdynamics","g":"com.kenzan.rxjava","a":"rxjava-appdynamics","latestVersion":"0.0.2","repositoryId":"central","p":"jar","timestamp":1476303974000,"versionCount":1,"text":["com.kenzan.rxjava","rxjava-appdynamics","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]},{"id":"com.netflix.rxjava:rxjava-swing","g":"com.netflix.rxjava","a":"rxjava-swing","latestVersion":"0.20.7","repositoryId":"central","p":"jar","timestamp":1415750077000,"versionCount":72,"text":["com.netflix.rxjava","rxjava-swing","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]},{"id":"com.netflix.rxjava:rxjava-string","g":"com.netflix.rxjava","a":"rxjava-string","latestVersion":"0.20.7","repositoryId":"central","p":"jar","timestamp":1415750074000,"versionCount":40,"text":["com.netflix.rxjava","rxjava-string","-javadoc.jar","-sources.jar",".jar",".pom"],"ec":["-javadoc.jar","-sources.jar",".jar",".pom"]},{"id":"com.netflix.rxjava:rxjava-scalaz","g":"com.netflix.rxjava","a":"rxjava-scalaz","latestVersion":"0.20.7","repositoryId":"central","p":"jar","timestamp":1415750069000,"versionCount":15,"text":["com.netflix.rxjava","rxjava-scalaz","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]},{"id":"com.netflix.rxjava:rxjava-quasar","g":"com.netflix.rxjava","a":"rxjava-quasar","latestVersion":"0.20.7","repositoryId":"central","p":"jar","timestamp":1415750065000,"versionCount":26,"text":["com.netflix.rxjava","rxjava-quasar","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]},{"id":"com.netflix.rxjava:rxjava-math","g":"com.netflix.rxjava","a":"rxjava-math","latestVersion":"0.20.7","repositoryId":"central","p":"jar","timestamp":1415750062000,"versionCount":32,"text":["com.netflix.rxjava","rxjava-math","-javadoc.jar","-sources.jar",".jar",".pom"],"ec":["-javadoc.jar","-sources.jar",".jar",".pom"]},{"id":"com.netflix.rxjava:rxjava-joins","g":"com.netflix.rxjava","a":"rxjava-joins","latestVersion":"0.20.7","repositoryId":"central","p":"jar","timestamp":1415750058000,"versionCount":24,"text":["com.netflix.rxjava","rxjava-joins","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]},{"id":"com.netflix.rxjava:rxjava-ios","g":"com.netflix.rxjava","a":"rxjava-ios","latestVersion":"0.20.7","repositoryId":"central","p":"jar","timestamp":1415750054000,"versionCount":17,"text":["com.netflix.rxjava","rxjava-ios","-sources.jar","-javadoc.jar",".jar",".pom"],"ec":["-sources.jar","-javadoc.jar",".jar",".pom"]}]
         */

        private int numFound;
        private int start;
        private List<DocsBean> docs;

        public int getNumFound() {
            return numFound;
        }

        public void setNumFound(int numFound) {
            this.numFound = numFound;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public List<DocsBean> getDocs() {
            return docs;
        }

        public void setDocs(List<DocsBean> docs) {
            this.docs = docs;
        }

        public static class DocsBean {
            /**
             * id : io.reactivex.rxjava2:rxjava
             * g : io.reactivex.rxjava2
             * a : rxjava
             * latestVersion : 2.1.6
             * repositoryId : central
             * p : jar
             * timestamp : 1509089639000
             * versionCount : 23
             * text : ["io.reactivex.rxjava2","rxjava","-javadoc.jar","-sources.jar",".jar",".pom"]
             * ec : ["-javadoc.jar","-sources.jar",".jar",".pom"]
             */

            private String id;
            private String g;
            private String a;
            private String latestVersion;
            private String repositoryId;
            private String p;
            private long timestamp;
            private int versionCount;
            private List<String> text;
            private List<String> ec;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getG() {
                return g;
            }

            public void setG(String g) {
                this.g = g;
            }

            public String getA() {
                return a;
            }

            public void setA(String a) {
                this.a = a;
            }

            public String getLatestVersion() {
                return latestVersion;
            }

            public void setLatestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
            }

            public String getRepositoryId() {
                return repositoryId;
            }

            public void setRepositoryId(String repositoryId) {
                this.repositoryId = repositoryId;
            }

            public String getP() {
                return p;
            }

            public void setP(String p) {
                this.p = p;
            }

            public long getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(long timestamp) {
                this.timestamp = timestamp;
            }

            public int getVersionCount() {
                return versionCount;
            }

            public void setVersionCount(int versionCount) {
                this.versionCount = versionCount;
            }

            public List<String> getText() {
                return text;
            }

            public void setText(List<String> text) {
                this.text = text;
            }

            public List<String> getEc() {
                return ec;
            }

            public void setEc(List<String> ec) {
                this.ec = ec;
            }
        }
    }

    public static class SpellcheckBean {
        private List<?> suggestions;

        public List<?> getSuggestions() {
            return suggestions;
        }

        public void setSuggestions(List<?> suggestions) {
            this.suggestions = suggestions;
        }
    }
}
