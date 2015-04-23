
  package gen;
  public class B_Gen83 {
  		@com.google.inject.Inject
  		public B_Gen83(B_Gen84 b_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  