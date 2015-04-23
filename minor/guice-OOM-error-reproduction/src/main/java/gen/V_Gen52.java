
  package gen;
  public class V_Gen52 {
  		@com.google.inject.Inject
  		public V_Gen52(V_Gen53 v_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  