
  package gen;
  public class V_Gen58 {
  		@com.google.inject.Inject
  		public V_Gen58(V_Gen59 v_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  