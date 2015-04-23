
  package gen;
  public class V_Gen191 {
  		@com.google.inject.Inject
  		public V_Gen191(V_Gen192 v_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  