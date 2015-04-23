
  package gen;
  public class V_Gen51 {
  		@com.google.inject.Inject
  		public V_Gen51(V_Gen52 v_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + v_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  