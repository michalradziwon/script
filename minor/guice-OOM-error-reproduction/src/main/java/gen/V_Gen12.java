
  package gen;
  public class V_Gen12 {
  		@com.google.inject.Inject
  		public V_Gen12(V_Gen13 v_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  