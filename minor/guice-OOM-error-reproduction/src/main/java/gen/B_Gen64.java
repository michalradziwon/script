
  package gen;
  public class B_Gen64 {
  		@com.google.inject.Inject
  		public B_Gen64(B_Gen65 b_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  