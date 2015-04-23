
  package gen;
  public class O_Gen31 {
  		@com.google.inject.Inject
  		public O_Gen31(O_Gen32 o_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  