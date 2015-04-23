
  package gen;
  public class O_Gen139 {
  		@com.google.inject.Inject
  		public O_Gen139(O_Gen140 o_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  