
  package gen;
  public class O_Gen78 {
  		@com.google.inject.Inject
  		public O_Gen78(O_Gen79 o_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  