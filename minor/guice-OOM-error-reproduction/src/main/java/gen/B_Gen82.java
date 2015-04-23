
  package gen;
  public class B_Gen82 {
  		@com.google.inject.Inject
  		public B_Gen82(B_Gen83 b_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  