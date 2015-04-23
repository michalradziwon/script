
  package gen;
  public class O_Gen169 {
  		@com.google.inject.Inject
  		public O_Gen169(O_Gen170 o_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  