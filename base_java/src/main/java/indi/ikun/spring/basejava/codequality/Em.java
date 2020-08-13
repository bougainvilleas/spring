package indi.ikun.spring.basejava.codequality;


/**
 * 117.多使用异常，把性能问题放一边
 *
 * 异常是主逻辑的例外逻辑
 * 举个简单例子来说，
 * 比如我在马路上走（这是主逻辑），
 * 1)突然开过一辆车，我要避让（这是受检异常，必须处理），继续走着，
 * 2)突然一架飞机从我头顶飞过（非受检异常），
 *      我可以选择继续行走（不捕捉），
 *      也可以选择指责其噪音污染（捕捉，主逻辑的补充处理），再继续走着，
 * 3)突然一颗流星砸下来，这没有选择，属于错误，不能做任何处理。
 * 这样具备完整例外情景的逻辑就具备了OO的味道，
 * 任何一个事物的处理都可能产生非预期结果，
 * 问题是需要以何种手段来处理，
 * 如果不使用异常就需要依靠返回值的不同来进行处理了，这严重失去了面向对象的风格
 *
 * 使用异常还有很多优点，
 *      比如可让正常代码和异常代码分离、
 *      能快速查找问题（栈信息快照）等，
 * 但是异常有一个缺点：性能比较慢
 *
 * Java的异常处理机制确实比较慢，
 * 这个“比较慢”是相对于诸如String、Integer等对象来说的，
 * 单单从对象的创建上来说，new一个IOException会比String慢5倍，
 * 这从异常的处理机制上也可以解释：
 *      因为它要执行fillInStackTrace方法，
 *      要记录当前栈的快照，
 *      而String类则是直接申请一个内存创建对象，异常类慢一筹也就在所难免了。
 *      而且，异常类是不能缓存的，期望预先建立大量的异常对象以提高异常性能也是不现实的。
 *      异常的性能问题没有任何方案可提高，
 *      但是我们不能因为性能问题而放弃使用异常，
 * 据说，在JDK 1.6下，一个异常对象创建的时间只需要1.4毫秒左右（注意是毫秒，通常一个交易处理是在100毫秒左右），
 */
public class Em {

}

