
  package gen;
  public class V_Gen55 {
  		@com.google.inject.Inject
  		public V_Gen55(V_Gen56 v_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  