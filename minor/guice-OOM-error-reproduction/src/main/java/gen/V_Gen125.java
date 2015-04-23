
  package gen;
  public class V_Gen125 {
  		@com.google.inject.Inject
  		public V_Gen125(V_Gen126 v_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  