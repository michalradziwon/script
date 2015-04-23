
  package gen;
  public class B_Gen125 {
  		@com.google.inject.Inject
  		public B_Gen125(B_Gen126 b_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  