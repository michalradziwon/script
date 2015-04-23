
  package gen;
  public class D_Gen104 {
  		@com.google.inject.Inject
  		public D_Gen104(D_Gen105 d_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  