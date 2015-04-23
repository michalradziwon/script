
  package gen;
  public class O_Gen122 {
  		@com.google.inject.Inject
  		public O_Gen122(O_Gen123 o_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  