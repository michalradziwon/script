
  package gen;
  public class B_Gen47 {
  		@com.google.inject.Inject
  		public B_Gen47(B_Gen48 b_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  