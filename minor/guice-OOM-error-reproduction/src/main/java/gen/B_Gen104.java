
  package gen;
  public class B_Gen104 {
  		@com.google.inject.Inject
  		public B_Gen104(B_Gen105 b_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  