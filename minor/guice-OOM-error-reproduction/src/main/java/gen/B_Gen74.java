
  package gen;
  public class B_Gen74 {
  		@com.google.inject.Inject
  		public B_Gen74(B_Gen75 b_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  