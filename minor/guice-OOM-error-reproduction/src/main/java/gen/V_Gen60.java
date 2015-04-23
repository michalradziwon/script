
  package gen;
  public class V_Gen60 {
  		@com.google.inject.Inject
  		public V_Gen60(V_Gen61 v_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  