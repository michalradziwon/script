
  package gen;
  public class B_Gen68 {
  		@com.google.inject.Inject
  		public B_Gen68(B_Gen69 b_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  