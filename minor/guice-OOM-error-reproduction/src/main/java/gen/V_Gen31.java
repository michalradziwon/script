
  package gen;
  public class V_Gen31 {
  		@com.google.inject.Inject
  		public V_Gen31(V_Gen32 v_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  