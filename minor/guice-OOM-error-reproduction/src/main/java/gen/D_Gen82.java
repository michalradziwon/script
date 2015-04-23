
  package gen;
  public class D_Gen82 {
  		@com.google.inject.Inject
  		public D_Gen82(D_Gen83 d_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  