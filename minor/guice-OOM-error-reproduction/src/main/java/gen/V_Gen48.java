
  package gen;
  public class V_Gen48 {
  		@com.google.inject.Inject
  		public V_Gen48(V_Gen49 v_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  