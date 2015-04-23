
  package gen;
  public class V_Gen64 {
  		@com.google.inject.Inject
  		public V_Gen64(V_Gen65 v_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  