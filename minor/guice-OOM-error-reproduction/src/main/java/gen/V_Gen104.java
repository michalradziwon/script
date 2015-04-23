
  package gen;
  public class V_Gen104 {
  		@com.google.inject.Inject
  		public V_Gen104(V_Gen105 v_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  