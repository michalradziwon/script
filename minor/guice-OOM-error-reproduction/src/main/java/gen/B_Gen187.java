
  package gen;
  public class B_Gen187 {
  		@com.google.inject.Inject
  		public B_Gen187(B_Gen188 b_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  