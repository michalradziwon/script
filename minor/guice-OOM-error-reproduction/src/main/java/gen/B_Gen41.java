
  package gen;
  public class B_Gen41 {
  		@com.google.inject.Inject
  		public B_Gen41(B_Gen42 b_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  