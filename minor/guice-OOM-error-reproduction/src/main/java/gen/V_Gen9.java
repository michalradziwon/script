
  package gen;
  public class V_Gen9 {
  		@com.google.inject.Inject
  		public V_Gen9(V_Gen10 v_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  