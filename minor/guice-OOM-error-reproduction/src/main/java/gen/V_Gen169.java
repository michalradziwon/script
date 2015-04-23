
  package gen;
  public class V_Gen169 {
  		@com.google.inject.Inject
  		public V_Gen169(V_Gen170 v_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  