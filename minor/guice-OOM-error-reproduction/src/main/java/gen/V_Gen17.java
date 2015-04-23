
  package gen;
  public class V_Gen17 {
  		@com.google.inject.Inject
  		public V_Gen17(V_Gen18 v_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  