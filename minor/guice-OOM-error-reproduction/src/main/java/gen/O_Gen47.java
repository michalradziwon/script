
  package gen;
  public class O_Gen47 {
  		@com.google.inject.Inject
  		public O_Gen47(O_Gen48 o_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  