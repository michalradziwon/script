
  package gen;
  public class V_Gen41 {
  		@com.google.inject.Inject
  		public V_Gen41(V_Gen42 v_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  