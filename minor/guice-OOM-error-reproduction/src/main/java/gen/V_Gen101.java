
  package gen;
  public class V_Gen101 {
  		@com.google.inject.Inject
  		public V_Gen101(V_Gen102 v_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  