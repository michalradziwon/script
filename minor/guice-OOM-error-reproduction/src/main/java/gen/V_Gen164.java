
  package gen;
  public class V_Gen164 {
  		@com.google.inject.Inject
  		public V_Gen164(V_Gen165 v_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  