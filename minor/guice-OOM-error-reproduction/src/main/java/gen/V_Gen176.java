
  package gen;
  public class V_Gen176 {
  		@com.google.inject.Inject
  		public V_Gen176(V_Gen177 v_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  