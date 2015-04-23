
  package gen;
  public class O_Gen140 {
  		@com.google.inject.Inject
  		public O_Gen140(O_Gen141 o_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  