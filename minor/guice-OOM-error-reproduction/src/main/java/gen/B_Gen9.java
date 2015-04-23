
  package gen;
  public class B_Gen9 {
  		@com.google.inject.Inject
  		public B_Gen9(B_Gen10 b_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  