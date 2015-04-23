
  package gen;
  public class V_Gen68 {
  		@com.google.inject.Inject
  		public V_Gen68(V_Gen69 v_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  