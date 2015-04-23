
  package gen;
  public class V_Gen71 {
  		@com.google.inject.Inject
  		public V_Gen71(V_Gen72 v_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  