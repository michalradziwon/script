
  package gen;
  public class V_Gen82 {
  		@com.google.inject.Inject
  		public V_Gen82(V_Gen83 v_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  