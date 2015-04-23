
  package gen;
  public class V_Gen85 {
  		@com.google.inject.Inject
  		public V_Gen85(V_Gen86 v_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  