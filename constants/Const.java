package gov.nih.nci.bento.constants;

public class Const {

    public static class ES_UNITS {
        public static final int DEFAULT_SIZE = 10;
        public static final int MAX_SIZE = 10000;
        public static final String GS_HIGHLIGHT_DELIMITER = "$";
        public static final String KEYWORD = ".keyword";
    }

    public static class ES_PARAMS {
        public static final String PAGE_SIZE = "first";
        public static final String OFFSET = "offset";
        public static final String ORDER_BY = "order_by";
        public static final String TERMS_AGGS = "terms_aggs";
        public static final String NESTED_SEARCH = "nested_search";

        public static final String SORT_DIRECTION = "sort_direction";
        public static final String CASE_IDS = "case_ids";
        public static final int AGGS_SIZE = 1000;
        public static final String INPUT = "input";
        public static final String NESTED_FILTER = "FILTER_INFO";
    }

    public static class YAML_QUERY {
        public static class FILE_NAMES_BENTO {
            public static final String SINGLE = "yaml/single_search_es.yml";
            public static final String GROUP = "yaml/facet_search_es.yml";
//            public static final String GLOBAL = "yaml/global_search_es.yml";
        }

        public static class FILTER {
            public static final String DEFAULT = "default";
            public static final String PAGINATION = "pagination";
            public static final String AGGREGATION = "aggregation";
            public static final String RANGE = "range";
            public static final String SUB_AGGREGATION = "sub_aggregation";
            public static final String NESTED = "nested";
            public static final String SUM = "sum";
        }

        public static class RESULT_TYPE {
            public static final String OBJECT_ARRAY = "object_array";
            public static final String STRING_ARRAY = "str_array";
            public static final String GROUP_COUNT = "group_count";
            public static final String NESTED_LIST = "nested_list";

            public static final String INT_TOTAL_COUNT = "int_total_count";
            public static final String NESTED = "nested";
            public static final String ARM_PROGRAM = "arm_program";
            public static final String INT = "int";
            public static class INT_METHOD {
                public static final String COUNT_BUCKET_KEY = "count_bucket_keys";
                public static final String NESTED_COUNT = "nested_count";
            }

            public static final String FLOAT = "float";
            public static class FLOAT_METHOD {
                public static final String SUM_AGG = "sum";
            }

            public static final String RANGE = "range";
            public static class RANGE_PARAMS {
                public static final String LOWER_BOUND = "lowerBound";
                public static final String UPPER_BOUND = "upperBound";
            }
        }
    }
    // consider removing this to use other projects
    public static class BENTO_FIELDS {
        public static final String SUBJECTS = "subjects";
        public static final String GROUP = "group";

        public static final String CASE_SIZE = "caseSize";
        public static final String ARM = "arm";
        public static final String SIZE = "size";
        public static final String PROGRAM = "program";
        public static final String CHILDREN = "children";
    }

    public static class BENTO_INDEX {
        public static final String SUBJECTS = "subjects";
    }
}
