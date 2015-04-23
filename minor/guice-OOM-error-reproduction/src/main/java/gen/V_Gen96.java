
  package gen;
  public class V_Gen96 {
  		@com.google.inject.Inject
  		public V_Gen96(V_Gen97 v_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  