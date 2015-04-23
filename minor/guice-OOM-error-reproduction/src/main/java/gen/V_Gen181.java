
  package gen;
  public class V_Gen181 {
  		@com.google.inject.Inject
  		public V_Gen181(V_Gen182 v_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  