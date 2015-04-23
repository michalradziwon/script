
  package gen;
  public class V_Gen49 {
  		@com.google.inject.Inject
  		public V_Gen49(V_Gen50 v_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  