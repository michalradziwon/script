
  package gen;
  public class B_Gen133 {
  		@com.google.inject.Inject
  		public B_Gen133(B_Gen134 b_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  