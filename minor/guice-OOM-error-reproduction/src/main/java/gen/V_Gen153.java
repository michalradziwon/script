
  package gen;
  public class V_Gen153 {
  		@com.google.inject.Inject
  		public V_Gen153(V_Gen154 v_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  