
  package gen;
  public class O_Gen130 {
  		@com.google.inject.Inject
  		public O_Gen130(O_Gen131 o_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  