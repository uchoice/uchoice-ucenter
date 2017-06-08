package com.uchoice.ucenter.biz;

import com.uchoice.ucenter.biz.common.Node;

/**
 * Created by ${admin} on 2017/5/30.
 */
public class NodeTest {
    public static void main(String[] args){
        NodeVo first = new NodeVo();
        first.setName("first");
        Node<NodeVo> node = new Node<>();
        node.setCurrent(first);

        NodeVo sec = new NodeVo();
        sec.setName("sec");
        Node<NodeVo> next = node.newNext();
        next.setParent(node);
        next.setCurrent(sec);
    }
}
