
  package gen;
  public class V_Gen10 {
  		@com.google.inject.Inject
  		public V_Gen10(V_Gen11 v_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  