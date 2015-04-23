
  package gen;
  public class O_Gen68 {
  		@com.google.inject.Inject
  		public O_Gen68(O_Gen69 o_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  