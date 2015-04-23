
  package gen;
  public class V_Gen197 {
  		@com.google.inject.Inject
  		public V_Gen197(V_Gen198 v_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  