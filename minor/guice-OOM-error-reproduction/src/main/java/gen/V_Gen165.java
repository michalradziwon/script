
  package gen;
  public class V_Gen165 {
  		@com.google.inject.Inject
  		public V_Gen165(V_Gen166 v_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  