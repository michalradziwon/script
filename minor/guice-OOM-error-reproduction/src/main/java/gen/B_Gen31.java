
  package gen;
  public class B_Gen31 {
  		@com.google.inject.Inject
  		public B_Gen31(B_Gen32 b_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  