/* Generated By:JJTree: Do not edit this line. NegateIdent.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class NegateIdent extends SimpleNode {
  public NegateIdent(int id) {
    super(id);
  }

  public NegateIdent(CCALParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CCALParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=a81229e102101615b5ef33da27d73851 (do not edit this line) */
