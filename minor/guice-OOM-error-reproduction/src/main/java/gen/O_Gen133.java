
  package gen;
  public class O_Gen133 {
  		@com.google.inject.Inject
  		public O_Gen133(O_Gen134 o_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  