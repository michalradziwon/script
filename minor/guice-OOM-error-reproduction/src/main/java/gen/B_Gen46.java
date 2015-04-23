
  package gen;
  public class B_Gen46 {
  		@com.google.inject.Inject
  		public B_Gen46(B_Gen47 b_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  