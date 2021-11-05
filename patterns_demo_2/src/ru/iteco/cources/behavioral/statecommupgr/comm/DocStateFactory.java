package ru.iteco.cources.behavioral.statecommupgr.comm;

import ru.iteco.cources.behavioral.statecommupgr.*;

public class DocStateFactory {
    static DocumentState setState(DocState docState, Document document){
        switch (docState){
            case NEW: return new NewState(document);
            case RECONS: return new ReconsilationState(document);
            case REJECT: return new RejectState(document);
            case APPROVE: return new ApproveState(document);
            case DELETE: return new DeleteState(document);
        }
        return new NewState(document);
    }
}
