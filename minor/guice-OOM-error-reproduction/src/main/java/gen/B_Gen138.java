
  package gen;
  public class B_Gen138 {
  		@com.google.inject.Inject
  		public B_Gen138(B_Gen139 b_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  