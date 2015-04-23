
  package gen;
  public class V_Gen42 {
  		@com.google.inject.Inject
  		public V_Gen42(V_Gen43 v_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  