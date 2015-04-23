
  package gen;
  public class O_Gen82 {
  		@com.google.inject.Inject
  		public O_Gen82(O_Gen83 o_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  