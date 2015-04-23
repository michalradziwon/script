
  package gen;
  public class V_Gen178 {
  		@com.google.inject.Inject
  		public V_Gen178(V_Gen179 v_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  