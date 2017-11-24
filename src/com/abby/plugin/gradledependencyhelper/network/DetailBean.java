package com.abby.plugin.gradledependencyhelper.network;

import java.util.List;

public class DetailBean {
    /**
     * responseHeader : {"status":0,"QTime":1,"params":{"q":"g:\"com.jakewharton\" AND a:\"butterknife\"","core":"gav","indent":"off","fl":"id,g,a,v,p,ec,timestamp,tags","sort":"score desc,timestamp desc,g asc,a asc,v desc","rows":"20","wt":"json","version":"2.2"}}
     * response : {"numFound":38,"start":0,"docs":[{"id":"com.jakewharton:butterknife:8.8.1","g":"com.jakewharton","a":"butterknife","v":"8.8.1","p":"aar","timestamp":1502347470000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.8.0","g":"com.jakewharton","a":"butterknife","v":"8.8.0","p":"aar","timestamp":1501870774000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.7.0","g":"com.jakewharton","a":"butterknife","v":"8.7.0","p":"aar","timestamp":1499440371000,"ec":["-javadoc.jar","-sources.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.6.0","g":"com.jakewharton","a":"butterknife","v":"8.6.0","p":"aar","timestamp":1494963298000,"ec":["-javadoc.jar","-sources.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.5.1","g":"com.jakewharton","a":"butterknife","v":"8.5.1","p":"aar","timestamp":1485276942000,"ec":["-javadoc.jar","-sources.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.5.0","g":"com.jakewharton","a":"butterknife","v":"8.5.0","p":"aar","timestamp":1485232998000,"ec":["-javadoc.jar","-sources.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.4.0","g":"com.jakewharton","a":"butterknife","v":"8.4.0","p":"aar","timestamp":1472263818000,"ec":["-javadoc.jar","-sources.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.3.0","g":"com.jakewharton","a":"butterknife","v":"8.3.0","p":"aar","timestamp":1471984981000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.2.1","g":"com.jakewharton","a":"butterknife","v":"8.2.1","p":"aar","timestamp":1468290165000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.2.0","g":"com.jakewharton","a":"butterknife","v":"8.2.0","p":"aar","timestamp":1468191543000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.1.0","g":"com.jakewharton","a":"butterknife","v":"8.1.0","p":"aar","timestamp":1465939220000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.0.1","g":"com.jakewharton","a":"butterknife","v":"8.0.1","p":"aar","timestamp":1461805286000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.0.0","g":"com.jakewharton","a":"butterknife","v":"8.0.0","p":"aar","timestamp":1461603059000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:7.0.1","g":"com.jakewharton","a":"butterknife","v":"7.0.1","p":"jar","timestamp":1435706582000,"ec":["-sources.jar","-javadoc.jar",".jar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:7.0.0","g":"com.jakewharton","a":"butterknife","v":"7.0.0","p":"jar","timestamp":1435457778000,"ec":["-javadoc.jar","-sources.jar",".jar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:6.1.0","g":"com.jakewharton","a":"butterknife","v":"6.1.0","p":"jar","timestamp":1422599550000,"ec":["-javadoc.jar","-sources.jar",".jar",".pom"],"tags":["android","injection","view"]},{"id":"com.jakewharton:butterknife:6.0.0","g":"com.jakewharton","a":"butterknife","v":"6.0.0","p":"jar","timestamp":1414459817000,"ec":["-javadoc.jar","-sources.jar",".jar",".pom"],"tags":["android","injection","view"]},{"id":"com.jakewharton:butterknife:5.1.2","g":"com.jakewharton","a":"butterknife","v":"5.1.2","p":"jar","timestamp":1406962354000,"ec":["-sources.jar","-javadoc.jar",".jar",".pom"],"tags":["android","injection","view"]},{"id":"com.jakewharton:butterknife:5.1.1","g":"com.jakewharton","a":"butterknife","v":"5.1.1","p":"jar","timestamp":1403227676000,"ec":["-javadoc.jar","-sources.jar",".jar",".pom"],"tags":["android","injection","view"]},{"id":"com.jakewharton:butterknife:5.1.0","g":"com.jakewharton","a":"butterknife","v":"5.1.0","p":"jar","timestamp":1400633282000,"ec":["-javadoc.jar","-sources.jar",".jar",".pom"],"tags":["android","injection","view"]}]}
     */

    private ResponseHeaderBean responseHeader;
    private ResponseBean response;

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

    public static class ResponseHeaderBean {
        /**
         * status : 0
         * QTime : 1
         * params : {"q":"g:\"com.jakewharton\" AND a:\"butterknife\"","core":"gav","indent":"off","fl":"id,g,a,v,p,ec,timestamp,tags","sort":"score desc,timestamp desc,g asc,a asc,v desc","rows":"20","wt":"json","version":"2.2"}
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
             * q : g:"com.jakewharton" AND a:"butterknife"
             * core : gav
             * indent : off
             * fl : id,g,a,v,p,ec,timestamp,tags
             * sort : score desc,timestamp desc,g asc,a asc,v desc
             * rows : 20
             * wt : json
             * version : 2.2
             */

            private String q;
            private String core;
            private String indent;
            private String fl;
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

            public String getCore() {
                return core;
            }

            public void setCore(String core) {
                this.core = core;
            }

            public String getIndent() {
                return indent;
            }

            public void setIndent(String indent) {
                this.indent = indent;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
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
         * numFound : 38
         * start : 0
         * docs : [{"id":"com.jakewharton:butterknife:8.8.1","g":"com.jakewharton","a":"butterknife","v":"8.8.1","p":"aar","timestamp":1502347470000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.8.0","g":"com.jakewharton","a":"butterknife","v":"8.8.0","p":"aar","timestamp":1501870774000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.7.0","g":"com.jakewharton","a":"butterknife","v":"8.7.0","p":"aar","timestamp":1499440371000,"ec":["-javadoc.jar","-sources.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.6.0","g":"com.jakewharton","a":"butterknife","v":"8.6.0","p":"aar","timestamp":1494963298000,"ec":["-javadoc.jar","-sources.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.5.1","g":"com.jakewharton","a":"butterknife","v":"8.5.1","p":"aar","timestamp":1485276942000,"ec":["-javadoc.jar","-sources.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.5.0","g":"com.jakewharton","a":"butterknife","v":"8.5.0","p":"aar","timestamp":1485232998000,"ec":["-javadoc.jar","-sources.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.4.0","g":"com.jakewharton","a":"butterknife","v":"8.4.0","p":"aar","timestamp":1472263818000,"ec":["-javadoc.jar","-sources.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.3.0","g":"com.jakewharton","a":"butterknife","v":"8.3.0","p":"aar","timestamp":1471984981000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.2.1","g":"com.jakewharton","a":"butterknife","v":"8.2.1","p":"aar","timestamp":1468290165000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.2.0","g":"com.jakewharton","a":"butterknife","v":"8.2.0","p":"aar","timestamp":1468191543000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.1.0","g":"com.jakewharton","a":"butterknife","v":"8.1.0","p":"aar","timestamp":1465939220000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.0.1","g":"com.jakewharton","a":"butterknife","v":"8.0.1","p":"aar","timestamp":1461805286000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:8.0.0","g":"com.jakewharton","a":"butterknife","v":"8.0.0","p":"aar","timestamp":1461603059000,"ec":["-sources.jar","-javadoc.jar",".aar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:7.0.1","g":"com.jakewharton","a":"butterknife","v":"7.0.1","p":"jar","timestamp":1435706582000,"ec":["-sources.jar","-javadoc.jar",".jar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:7.0.0","g":"com.jakewharton","a":"butterknife","v":"7.0.0","p":"jar","timestamp":1435457778000,"ec":["-javadoc.jar","-sources.jar",".jar",".pom"],"tags":["field","android","views","binding","method"]},{"id":"com.jakewharton:butterknife:6.1.0","g":"com.jakewharton","a":"butterknife","v":"6.1.0","p":"jar","timestamp":1422599550000,"ec":["-javadoc.jar","-sources.jar",".jar",".pom"],"tags":["android","injection","view"]},{"id":"com.jakewharton:butterknife:6.0.0","g":"com.jakewharton","a":"butterknife","v":"6.0.0","p":"jar","timestamp":1414459817000,"ec":["-javadoc.jar","-sources.jar",".jar",".pom"],"tags":["android","injection","view"]},{"id":"com.jakewharton:butterknife:5.1.2","g":"com.jakewharton","a":"butterknife","v":"5.1.2","p":"jar","timestamp":1406962354000,"ec":["-sources.jar","-javadoc.jar",".jar",".pom"],"tags":["android","injection","view"]},{"id":"com.jakewharton:butterknife:5.1.1","g":"com.jakewharton","a":"butterknife","v":"5.1.1","p":"jar","timestamp":1403227676000,"ec":["-javadoc.jar","-sources.jar",".jar",".pom"],"tags":["android","injection","view"]},{"id":"com.jakewharton:butterknife:5.1.0","g":"com.jakewharton","a":"butterknife","v":"5.1.0","p":"jar","timestamp":1400633282000,"ec":["-javadoc.jar","-sources.jar",".jar",".pom"],"tags":["android","injection","view"]}]
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
             * id : com.jakewharton:butterknife:8.8.1
             * g : com.jakewharton
             * a : butterknife
             * v : 8.8.1
             * p : aar
             * timestamp : 1502347470000
             * ec : ["-sources.jar","-javadoc.jar",".aar",".pom"]
             * tags : ["field","android","views","binding","method"]
             */

            private String id;
            private String g;
            private String a;
            private String v;
            private String p;
            private long timestamp;
            private List<String> ec;
            private List<String> tags;

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

            public String getV() {
                return v;
            }

            public void setV(String v) {
                this.v = v;
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

            public List<String> getEc() {
                return ec;
            }

            public void setEc(List<String> ec) {
                this.ec = ec;
            }

            public List<String> getTags() {
                return tags;
            }

            public void setTags(List<String> tags) {
                this.tags = tags;
            }
        }
    }
}
