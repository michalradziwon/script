
  package gen;
  public class D_Gen31 {
  		@com.google.inject.Inject
  		public D_Gen31(D_Gen32 d_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  