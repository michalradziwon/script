
  package gen;
  public class V_Gen86 {
  		@com.google.inject.Inject
  		public V_Gen86(V_Gen87 v_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  