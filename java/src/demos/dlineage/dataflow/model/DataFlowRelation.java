
package demos.dlineage.dataflow.model;


public class DataFlowRelation extends AbstractRelation
{

	@Override
	public RelationType getRelationType( )
	{
		return RelationType.dataflow;
	}
}
