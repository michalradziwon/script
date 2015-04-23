
  package gen;
  public class O_Gen132 {
  		@com.google.inject.Inject
  		public O_Gen132(O_Gen133 o_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  