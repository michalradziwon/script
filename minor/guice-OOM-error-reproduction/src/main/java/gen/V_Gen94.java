
  package gen;
  public class V_Gen94 {
  		@com.google.inject.Inject
  		public V_Gen94(V_Gen95 v_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  