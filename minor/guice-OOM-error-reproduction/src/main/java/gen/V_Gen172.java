
  package gen;
  public class V_Gen172 {
  		@com.google.inject.Inject
  		public V_Gen172(V_Gen173 v_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  