
  package gen;
  public class V_Gen161 {
  		@com.google.inject.Inject
  		public V_Gen161(V_Gen162 v_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  