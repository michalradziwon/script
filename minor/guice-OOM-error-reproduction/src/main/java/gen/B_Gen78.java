
  package gen;
  public class B_Gen78 {
  		@com.google.inject.Inject
  		public B_Gen78(B_Gen79 b_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  