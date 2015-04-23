
  package gen;
  public class V_Gen168 {
  		@com.google.inject.Inject
  		public V_Gen168(V_Gen169 v_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  