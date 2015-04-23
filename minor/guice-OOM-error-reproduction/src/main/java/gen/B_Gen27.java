
  package gen;
  public class B_Gen27 {
  		@com.google.inject.Inject
  		public B_Gen27(B_Gen28 b_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  