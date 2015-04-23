
  package gen;
  public class B_Gen169 {
  		@com.google.inject.Inject
  		public B_Gen169(B_Gen170 b_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  