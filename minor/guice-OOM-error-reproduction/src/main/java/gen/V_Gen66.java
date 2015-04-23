
  package gen;
  public class V_Gen66 {
  		@com.google.inject.Inject
  		public V_Gen66(V_Gen67 v_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  