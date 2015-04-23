
  package gen;
  public class V_Gen147 {
  		@com.google.inject.Inject
  		public V_Gen147(V_Gen148 v_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  