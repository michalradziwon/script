
  package gen;
  public class V_Gen173 {
  		@com.google.inject.Inject
  		public V_Gen173(V_Gen174 v_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  