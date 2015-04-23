
  package gen;
  public class B_Gen122 {
  		@com.google.inject.Inject
  		public B_Gen122(B_Gen123 b_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  