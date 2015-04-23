
  package gen;
  public class D_Gen68 {
  		@com.google.inject.Inject
  		public D_Gen68(D_Gen69 d_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  