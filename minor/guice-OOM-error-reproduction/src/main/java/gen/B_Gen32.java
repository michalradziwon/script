
  package gen;
  public class B_Gen32 {
  		@com.google.inject.Inject
  		public B_Gen32(B_Gen33 b_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  