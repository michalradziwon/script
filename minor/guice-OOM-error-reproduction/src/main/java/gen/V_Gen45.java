
  package gen;
  public class V_Gen45 {
  		@com.google.inject.Inject
  		public V_Gen45(V_Gen46 v_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  