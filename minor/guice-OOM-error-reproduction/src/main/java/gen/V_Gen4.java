
  package gen;
  public class V_Gen4 {
  		@com.google.inject.Inject
  		public V_Gen4(V_Gen5 v_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  