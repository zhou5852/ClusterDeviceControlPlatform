package cc.bitky.clusterdeviceplatform.server.db.statistic.pressure;

import java.util.List;

import cc.bitky.clusterdeviceplatform.server.tcp.statistic.ChannelItem;

public class GroupCacheItem {
    /**
     * 通道对象集合
     */
    private List<ChannelItem> channelItems;
    /**
     * 消息数量分类统计
     */
    private MsgCount msgCount;
    /**
     * 负载正常的界限
     */
    private int normalLimit;
    /**
     * 负载异常的界限
     */
    private int exceptionLimit;
    public GroupCacheItem(List<ChannelItem> channelItems, MsgCount msgCount) {
        this.channelItems = channelItems;
        this.msgCount = msgCount;
    }

    public MsgCount getMsgCount() {
        return msgCount;
    }

    public List<ChannelItem> getChannelItems() {
        return channelItems;
    }

    /**
     * 设置前端界面报警的限定
     *
     * @param normalLimit    负载正常的界限
     * @param exceptionLimit 负载异常的界限
     */
    public void setAlarmLimit(int normalLimit, int exceptionLimit) {
        this.normalLimit = normalLimit;
        this.exceptionLimit = exceptionLimit;
    }

    public int getNormalLimit() {
        return normalLimit;
    }

    public int getExceptionLimit() {
        return exceptionLimit;
    }
}
