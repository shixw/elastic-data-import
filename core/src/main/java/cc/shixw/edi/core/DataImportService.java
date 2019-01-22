package cc.shixw.edi.core;

import cc.shixw.edi.core.common.domain.DataImportRequest;

/**
 * 数据导入服务接口
 */
public interface DataImportService {

    /**
     * 异步数据导入
     * @param request
     * @return 异步数据导入任务编号
     */
    String asyncImportData(DataImportRequest request);
}
